package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.databinding.ActivityMainBinding;
import com.google.android.gms.ads.AdRequest;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Для использования этого биндинга в каждом активити или фрагменте нужно сначала
        //так его инициализировать
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //А в этот метод передать корень
        setContentView(binding.getRoot());

        //ОБращаться можно к любой вьюшке по ее ID
        binding.startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent categoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(categoryIntent);

            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        binding.adView.loadAd(adRequest);
    }}

