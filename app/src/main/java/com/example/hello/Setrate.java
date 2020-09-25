package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Setrate extends AppCompatActivity {
    TextView out;

    EditText edit1;
    EditText edit2;
    EditText edit3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setrate);
        EditText input1 = findViewById(R.id.editTextTextPersonName6);
        String str1 = input1.getText().toString();
        EditText input2 = findViewById(R.id.editTextTextPersonName5);

        String str2 = input1.getText().toString();
        EditText input3 = findViewById(R.id.editTextTextPersonName);
        String str3 = input1.getText().toString();
        //out = (TextView) findViewById(R.id.textView5);
        edit1 = (EditText) findViewById(R.id.editTextTextPersonName6);
        edit2 = (EditText) findViewById(R.id.editTextTextPersonName5);
        edit3 = (EditText) findViewById(R.id.editTextTextPersonName);
}
    public void setrate(View v){
        String str1 = edit1.getText().toString();
        Double d = Double.parseDouble(str1);
        d=d*1.8+32;
        out.setText("结果为："+ d);

    }



}