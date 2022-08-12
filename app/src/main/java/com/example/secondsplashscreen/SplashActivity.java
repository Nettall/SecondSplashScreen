package com.example.secondsplashscreen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    public static final String CStarts = "numOfStarts";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SharedPreferences sp =  getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        int numOfStarts = sp.getInt(CStarts,0);
        numOfStarts++;
        editor.putInt(CStarts,numOfStarts);
        editor.apply();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(CStarts,numOfStarts);
        startActivity(intent);
        finish();
    }
}