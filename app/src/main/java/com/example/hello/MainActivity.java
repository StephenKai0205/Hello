package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void jumpTemperature(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Temperature.class);
        startActivity(intent);

    }
    public void jumpCounter(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Counter.class);
        startActivity(intent);

    }
    public void jumpCalculater(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Calculater.class);
        startActivity(intent);

    }
    public void jumpCounter2(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Counter2.class);
        startActivity(intent);

    }
    public void jumpdollar(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Dollar.class);
        startActivity(intent);

    }
}