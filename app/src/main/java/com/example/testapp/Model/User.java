package com.example.testapp.Model;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("account")
    public String account;
    @SerializedName("password")
    public String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
