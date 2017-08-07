package com.bas.team10application.Service;

import com.bas.team10application.SendQuick;
import com.bas.team10application.Service.DAO.Project2Dao;
import com.bas.team10application.Service.DAO.ProjectDao;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by BassAye on 17/5/2560.
 */

public interface Service {

        @GET("TSP57/ISERL/application/views/stm/test_report/service1.php")
        Call<Project2Dao> select_defect();

        @GET("/TSP57/ISERL/application/views/stm/defect_log/android/service2.php")
        Call<ProjectDao> select_project();

        @FormUrlEncoded
        @POST("/TSP57/ISERL/application/views/stm/jsonChecklogin/Checklogin.php")
        Call<SendQuick> sendData(@Field("Username") String Username,
                                 @Field("Password") String Password);
    }


