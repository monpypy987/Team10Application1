package com.bas.team10application.Service;

import com.bas.team10application.SendQuick;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by asada boomtham on 30/4/2560.
 */

public interface OPPMsService {

    @FormUrlEncoded
    @POST("application/views/stm/jsonChecklogin/Checklogin.php")
    Call<SendQuick> sendData(@Field("Username") String Username,
                             @Field("Password") String Password);
}
