package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Temperature extends AppCompatActivity {
    TextView out;
    EditText edit;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);
        TextView tv = findViewById(R.id.textView4);
        tv.setText("Hello android");
        EditText input = findViewById(R.id.EditTextTextPersonName2);
        String str = input.getText().toString();
        out = (TextView) findViewById(R.id.textView5);
        edit = (EditText) findViewById(R.id.EditTextTextPersonName2);
    }
    public void btn(View v){
        String str = edit.getText().toString();
        Double d = Double.parseDouble(str);
        d=d*1.8+32;
        out.setText("结果为："+ d);

    }



}