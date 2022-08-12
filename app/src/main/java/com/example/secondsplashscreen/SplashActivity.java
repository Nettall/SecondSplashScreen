package com.example.secondsplashscreen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    public static final String CStarts = "CountStarts";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SharedPreferences sp =  getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        int CountStarts = sp.getInt(CStarts,0);
        CountStarts++;
        editor.putInt(CStarts,CountStarts);
        editor.apply();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(CStarts,CountStarts);
        startActivity(intent);
        finish();
    }
}