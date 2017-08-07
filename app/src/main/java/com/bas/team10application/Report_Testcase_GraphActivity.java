package com.bas.team10application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.bas.team10application.Service.DAO.Project2Dao;
import com.bas.team10application.Service.Service;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Report_Testcase_GraphActivity extends AppCompatActivity {

    private Service service;
    private BarChart BarchartDF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report__testcase__graph);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.51.4.17/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(Service.class);

        service.select_defect().enqueue(new Callback<Project2Dao>() {
            @Override
            public void onResponse(Call<Project2Dao> call, Response<Project2Dao> response) {


                if (response.isSuccessful()) {
                    Log.d("ontest: ","ture");
                    Log.d("bas", response.body().getDefect().get(0).getDf_pj_id());
                } else {
                    Log.d("ontest: ","fales");
                }
             Log.d("bas", response.body().getDefect().get(0).getDf_pj_id());

                BarchartDF = (BarChart) findViewById(R.id.BarchartDF);
                final ArrayList<BarEntry> entries = new ArrayList<>();

//                entries.add(new BarEntry(1, 0.5f));
//                entries.add(new BarEntry(2, 0.5f));
//                entries.add(new BarEntry(3, 0.5f));

                for(int i =0 ;i<  response.body().getDefect().size(); i++){
                    entries.add(new BarEntry(i + 1, Float.parseFloat(response.body().getDefect().get(i).getDf_id())));
                }
             /*   entries.add(new BarEntry(2, Float.parseFloat(response.body().getDefect().get(1).getPj_end_date())));
                entries.add(new BarEntry(3, Float.parseFloat(response.body().getDefect().get(0).getPj_code())));*/

                BarDataSet barDataSet = new BarDataSet(entries, "###");
                barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
                BarData barData = new BarData(barDataSet);
                BarchartDF.setData(barData);
                BarchartDF.animateXY(3000,5000);
            }

            @Override
            public void onFailure(Call<Project2Dao> call, Throwable t) {
                Log.d("bas1","Error");
            }
        });
    }
}
