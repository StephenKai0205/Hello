package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void jumpTemperature(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,temperature.class);
        startActivity(intent);

    }
    public void jumpCounter(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,counter.class);
        startActivity(intent);

    }
    public void jumpCalculater(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,calculater.class);
        startActivity(intent);

    }
}