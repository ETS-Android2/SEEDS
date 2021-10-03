package com.tako.seeds.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAGvKssBE:APA91bGasmHpZMjimgSOeTeS0zLn1Hx7-0c64yA_-OUdHxMHC0BGlKa7wVJI-xAcQ4GKbqm_et8_ho8y4EA6XDbqy4cZMNjJn55v2v6Qfm5-62One3J_s_9Hj9DlmKcj-eUnYa79DdZm"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
