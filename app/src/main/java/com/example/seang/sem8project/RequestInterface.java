package com.example.seang.sem8project;

import com.example.seang.sem8project.models.ServerRequest;
import com.example.seang.sem8project.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface RequestInterface {

    @POST("PHPfiles/")
    Call<ServerResponse> operation(@Body ServerRequest request);
}
