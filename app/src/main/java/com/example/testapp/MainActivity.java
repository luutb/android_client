package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import  android.graphics.Color;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testapp.Api.APIInterface;
import com.example.testapp.Api.ApiUtil;
import com.example.testapp.Model.ApiResponse;
import com.example.testapp.Model.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

  Button click_Login;
  EditText txt_user, txt_pass;
  TextView txt1;
    String user ="luutb";
    String pass ="luutb";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_user = (EditText)findViewById(R.id.txt_user);
        txt_pass = (EditText)findViewById(R.id.txt_pass);
        click_Login =(Button)findViewById(R.id.btn_login);
        String password = txt_pass.getText().toString();

        if (BuildConfig.DEBUG) {
            txt_user.setText(user);
            txt_pass.setText(pass);
        }

        click_Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                        APIInterface api = ApiUtil.getClient().create(APIInterface.class);

                        /// goi ham get user
                        User account = new User();
                        account.setAccount(txt_user.getText().toString());
                        account.setPassword(txt_user.getText().toString());
                        api.login(account).enqueue(new Callback<ApiResponse<Boolean>>() {
                            @Override
                            public void onResponse(Call<ApiResponse<Boolean>> call, Response<ApiResponse<Boolean>> response) {

                                if (response.body() != null && response.body().data != null && response.body().data == true) {
                                    Toast.makeText(MainActivity.this, "Login thanh cong", Toast.LENGTH_SHORT).show();
                                }else{
                                    Toast.makeText(MainActivity.this,"Login that bai",Toast.LENGTH_SHORT).show();
                                }
                            }

                            @Override
                            public void onFailure(Call<ApiResponse<Boolean>> call, Throwable t) {
                                Toast.makeText(MainActivity.this,"Login that bai do loi!",Toast.LENGTH_SHORT).show();
                            }
                        });
                }

        });




    }
}
