package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Counter2 extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score2);

    }

    public void addScoreTeamA(View v){
        TextView score =(TextView)findViewById(R.id.textView25);
        int i1 = Integer.parseInt(score.getText().toString());
        int i2 = Integer.parseInt(v.getTag().toString());
        score.setText(Integer.toString(i1+i2));

    }
    public void addScoreTeamB(View v){
        TextView score =(TextView)findViewById(R.id.textView26);
        int i1 = Integer.parseInt(score.getText().toString());
        int i2 = Integer.parseInt(v.getTag().toString());
        score.setText(Integer.toString(i1+i2));

    }
    public void Reset(View v){
        TextView score1 =(TextView)findViewById(R.id.textView25);
        score1.setText("0");
        TextView score2 =(TextView)findViewById(R.id.textView26);
        score2.setText("0");
    }
}