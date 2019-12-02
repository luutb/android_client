package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Toast;

import static com.example.testapp.R.id.layout_main;

public class HomeActivity extends AppCompatActivity {

    LinearLayout layout_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        layout_main = (LinearLayout)findViewById(R.id.layout_main);

        layout_main.setOnClickListener(new View.OnClickListener()
      {
          @Override
          public void onClick(View v){

                  Intent i = new Intent(HomeActivity.this,MainActivity.class);
                  HomeActivity.this.startActivity(i);
                  Toast.makeText(getApplicationContext(),"Reasdds", Toast.LENGTH_SHORT).show();

          }

      });
    }
}
