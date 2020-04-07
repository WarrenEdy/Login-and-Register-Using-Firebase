package com.example.cancomsaassessment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //This method will be executed once timer is finished after 4 seconds
                Intent i = new Intent(SplashScreenActivity.this, LoginUserActivity.class);
                startActivity(i);
                finish();
            }
        },4000);
    }
}
