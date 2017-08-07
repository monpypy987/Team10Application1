package com.bas.team10application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bas.team10application.Adapter.ProjectAdapter;
import com.bas.team10application.Service.DAO.ProjectDao;
import com.bas.team10application.Service.DAO.TestDAO;
import com.bas.team10application.Service.Service;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProjectActivity extends AppCompatActivity {

    private LinearLayout CodeProject;
    private Service service;
    private TestDAO testDAO;
    private ArrayList<TestDAO> mtestDAO;
    ArrayList<String> listItems = new ArrayList<>();
    ArrayAdapter<String> adapter;
    // adapter
    private RecyclerView.LayoutManager mLayoutParam;
    private ProjectAdapter projectRecyclerAdapter;
    private RecyclerView rv_project;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        CodeProject = (LinearLayout) findViewById(R.id.CodeProject);
        rv_project = (RecyclerView) findViewById(R.id.rv_project);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.51.4.17")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(Service.class);
        CodeProject.setOnClickListener(onClickLoginListener2);
        final ArrayList<ProjectDao.DefectBean> DefectBean = new ArrayList<>();
        final ProjectDao projectDao1 = new ProjectDao();
        service.select_project().enqueue(new Callback<ProjectDao>() {
            @Override
            public void onResponse(Call<ProjectDao> call, Response<ProjectDao> response) {
                for (ProjectDao.DefectBean a : response.body().getDefect()) {
                    Log.d("test",""+ a.getPj_name());
                    DefectBean.add(a);
                }
                projectDao1.setDefect(DefectBean);

                rv_project.setHasFixedSize(true);
                mLayoutParam = new LinearLayoutManager(ProjectActivity.this);
                rv_project.setLayoutManager(mLayoutParam);

                projectRecyclerAdapter = new ProjectAdapter(ProjectActivity.this, projectDao1);
                rv_project.setAdapter(projectRecyclerAdapter);

            }

            @Override
            public void onFailure(Call<ProjectDao> call, Throwable throwable) {

            }
        });
    }
        private View.OnClickListener onClickLoginListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuReportActivity.class);

                intent.putExtra("data", mtestDAO);
                startActivity(intent);
            }
        };
        private View.OnClickListener onClickLoginListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(), MenuReportActivity.class);

                intent.putExtra("data", mtestDAO);
                startActivity(intent);
        }
    };
}

