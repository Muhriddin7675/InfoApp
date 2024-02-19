package com.example.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SpleshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(this,ListActivtyInfo.class));
            finish();
            },1_000);

    }
}