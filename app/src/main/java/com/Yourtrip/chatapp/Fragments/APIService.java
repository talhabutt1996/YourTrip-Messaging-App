package com.Yourtrip.chatapp.Fragments;

import com.Yourtrip.chatapp.Notifications.MyResponse;
import com.Yourtrip.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAbaYgZlQ:APA91bFejlKRl8n2YARJbpRQOjm9rTOcZGLIFU86BG7hN4jaNOzNTXEs4B6yCTrknHGt_v2PgBi8stE6sPq1SzBdVkX_z0xXBMB3NZ0gWqLv8hUvuK58gK8IZKJsjoi1uqW4FYgdhDMM"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
