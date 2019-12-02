package com.example.testapp.Api;

import com.example.testapp.Model.ApiResponse;
import com.example.testapp.Model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {
    @GET("/api/User")
        public Call<List<String>> getListUsers();
    @GET ("api/User/{id}")
        public Call<ApiResponse<User>> getUser(@Query("id") int id);

    @POST("api/Users/login")
    public Call<ApiResponse<Boolean>> login(@Body User user);



}
