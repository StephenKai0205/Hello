package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private  static  final String TAG = "MainActivity";
    TextView out;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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