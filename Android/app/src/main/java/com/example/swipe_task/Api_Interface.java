package com.example.swipe_task;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_Interface {

    @GET("get")
    Call<List<Posts>> getPosts();
}


