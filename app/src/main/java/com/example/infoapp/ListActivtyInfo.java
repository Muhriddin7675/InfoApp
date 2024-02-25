package com.example.infoapp;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class ListActivtyInfo extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LottieAnimationView animationView = findViewById(R.id.animationView);
        animationView.setAnimation("exit_animation.json");
        animationView.playAnimation();

        animationView.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Chiqish")
                    .setMessage("Siz info programming ilovadan chiqmoqchimisiz ?")
                    .setNegativeButton("Yo'q", (dialog, which) -> {
                    })
                    .setPositiveButton("Ha", (dialog, which) -> {
                        finish();
                    }).create().show();
        });

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                new AlertDialog.Builder(ListActivtyInfo.this)
                        .setTitle("Chiqish")
                        .setMessage("Siz info programming ilovadan chiqmoqchimisiz ?")
                        .setNegativeButton("Yo'q", (dialog, which) -> {
                        })
                        .setPositiveButton("Ha", (dialog, which) -> {
                            finish();
                        }).create().show();
            }
        };

        this.getOnBackPressedDispatcher().addCallback(this, callback);

        findViewById(R.id.info).setOnClickListener(v -> {
            startActivity(new Intent(this, InfoActivity.class));
        });
        findViewById(R.id.lineBook1).setOnClickListener(v -> openDetailActivity(0));
        findViewById(R.id.lineBook2).setOnClickListener(v -> openDetailActivity(1));
        findViewById(R.id.lineBook3).setOnClickListener(v -> openDetailActivity(2));
        findViewById(R.id.lineBook4).setOnClickListener(v -> openDetailActivity(3));
        findViewById(R.id.lineBook5).setOnClickListener(v -> openDetailActivity(4));
        findViewById(R.id.lineBook6).setOnClickListener(v -> openDetailActivity(5));
        findViewById(R.id.lineBook7).setOnClickListener(v -> openDetailActivity(6));
        findViewById(R.id.lineBook8).setOnClickListener(v -> openDetailActivity(7));
        findViewById(R.id.lineBook9).setOnClickListener(v -> openDetailActivity(8));
        findViewById(R.id.lineBook10).setOnClickListener(v -> openDetailActivity(9));
        findViewById(R.id.lineBook11).setOnClickListener(v -> openDetailActivity(10));
        findViewById(R.id.lineBook12).setOnClickListener(v -> openDetailActivity(11));
        findViewById(R.id.lineBook13).setOnClickListener(v -> openDetailActivity(12));
        findViewById(R.id.lineBook14).setOnClickListener(v -> openDetailActivity(13));
        findViewById(R.id.lineBook15).setOnClickListener(v -> openDetailActivity(14));
    }

    private void openDetailActivity(int put) {
        Intent intent = new Intent(ListActivtyInfo.this, DetailActivty.class);
        intent.putExtra("PUT", put);
        startActivity(intent);
    }
}