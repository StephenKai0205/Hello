package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Counter extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);

    }

    public void addScore(View v){
        TextView score =(TextView)findViewById(R.id.textView6);
        int i1 = Integer.parseInt(score.getText().toString());
        int i2 = Integer.parseInt(v.getTag().toString());
        score.setText(Integer.toString(i1+i2));

    }
    public void Reset(View v){
        TextView score =(TextView)findViewById(R.id.textView6);
        score.setText("0");
    }
}