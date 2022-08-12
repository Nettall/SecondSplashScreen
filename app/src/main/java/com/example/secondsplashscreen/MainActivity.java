package com.example.secondsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int numOfStarts = getIntent().getExtras().getInt(SplashActivity.CStarts);
        if(numOfStarts == 3){
            Toast.makeText(this,"Текст", Toast.LENGTH_SHORT).show();
        }
    }
}