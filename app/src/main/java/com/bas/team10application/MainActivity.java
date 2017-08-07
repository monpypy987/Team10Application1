package com.bas.team10application;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bas.team10application.Service.OPPMsService;
import com.bas.team10application.Service.Service;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private OPPMsService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.51.4.17/TSP57/ISERL/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(OPPMsService.class);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = etUsername.getText().toString();
                String Password = etPassword.getText().toString();
                service.sendData(Username, Password).enqueue(new Callback<SendQuick>() {
                    @Override
                    public void onResponse(Call<SendQuick> call, Response<SendQuick> response) {
                        CharSequence text_result = response.body().result;
                        final int chk = Integer.parseInt(text_result.toString());
                        int duration = Toast.LENGTH_SHORT;
                        //Toast toast = Toast.makeText(context, text, duration);
                        //toast.show();

                        if (chk == 1) {
                            Toast toast = Toast.makeText(getApplicationContext(), "LOGIN SUCCESS", Toast.LENGTH_SHORT);
                            toast.show();

                            Intent intent = new Intent(MainActivity.this,ProjectActivity.class);
                            MainActivity.this.startActivity(intent);

                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                            builder.setMessage("LOGIN FAIL")
                                    .setNegativeButton("Retry", null)
                                    .create()
                                    .show();

                        }
                    }

                    @Override
                    public void onFailure(Call<SendQuick> call, Throwable t) {

                    }
                });
            }
        });

        getSupportActionBar().hide();
    }
}



