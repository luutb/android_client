package com.example.testapp.Model;

import com.google.gson.annotations.SerializedName;

public class ApiResponse<T> {
    @SerializedName("error")
    public int errorCode;
    @SerializedName("message")
    public String message;
    @SerializedName("data")
    public T  data;
}
