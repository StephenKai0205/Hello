package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dollar extends AppCompatActivity {
    TextView out;
    EditText edit;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dollar);
        EditText input = findViewById(R.id.EditTextTextPersonName2);
        String str = input.getText().toString();
        out = (TextView) findViewById(R.id.textView4);
        edit = (EditText) findViewById(R.id.EditTextTextPersonName2);
    }
    public void exchange(View v){
        if(v.getId()==R.id.button3){
            Double d = Double.parseDouble(edit.getText().toString());
            out.setText(""+d*1);
        }else if(v.getId()==R.id.button5){
            Double d = Double.parseDouble(edit.getText().toString());
            out.setText(""+d*2);

        }else if(v.getId()==R.id.button7){
            Double d = Double.parseDouble(edit.getText().toString());
            out.setText(""+d*3);

        }
    }
    public void dollarrate(View v){
        String str = edit.getText().toString();
        Double d = Double.parseDouble(str);
        d=d*1.8+32;
        out.setText("结果为："+ d);

    }
    public void eurorate(View v){
        String str = edit.getText().toString();
        Double d = Double.parseDouble(str);
        d=d*1.8+32;
        out.setText("结果为："+ d);

    }
    public void wonrate(View v){
        String str = edit.getText().toString();
        Double d = Double.parseDouble(str);
        d=d*1.8+32;
        out.setText("结果为："+ d);

    }
    public void jumpsetrate(View v){
        Intent intent = new Intent();
        intent.setClass(Dollar.this, Setrate.class);
        startActivity(intent);

    }

}