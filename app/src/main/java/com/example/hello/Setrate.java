package com.example.hello;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
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


        edit1 = (EditText) findViewById(R.id.editTextTextPersonName6);
        edit2 = (EditText) findViewById(R.id.editTextTextPersonName5);
        edit3 = (EditText) findViewById(R.id.editTextTextPersonName);
        SharedPreferences sp = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        double dollar = sp.getFloat("dollar_rate",0.1465f);
        double euro= sp.getFloat("euro_rate",0.1259f);
        double won = sp.getFloat("won_rate",171.7179f);
     //   Intent intent = getIntent();
    //    Bundle bundle =intent.getExtras();
     //   double dollar =bundle.getDouble("key_dollar",0.1);
    //    double euro =bundle.getDouble("key_euro",0.1);
    //    double won =bundle.getDouble("key_won",0.1);
        edit1.setText(dollar+"");
        edit2.setText(euro+"");
        edit3.setText(won+"");
}

    public void getrate(View v){
        edit1 = (EditText) findViewById(R.id.editTextTextPersonName6);
        edit2 = (EditText) findViewById(R.id.editTextTextPersonName5);
        edit3 = (EditText) findViewById(R.id.editTextTextPersonName);
        Intent intent = new Intent(this,Dollar.class);
        Bundle bdl = new Bundle();
        String str1 = edit1.getText().toString();
        String str2 = edit2.getText().toString();
        String str3 = edit3.getText().toString();
     //   bdl.putDouble("key_dollar",Double.parseDouble(str1));
     //   bdl.putDouble("key_euro",Double.parseDouble(str2));
     //   bdl.putDouble("key_won",Double.parseDouble(str3));
     //   intent.putExtras(bdl);
      //  setResult(0,intent);
     //   finish();
        SharedPreferences sp = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor =sp.edit();
        editor.putFloat("dollar_rate",Float.parseFloat(str1));
        editor.putFloat("euro_rate",Float.parseFloat(str2));
        editor.putFloat("won_rate",Float.parseFloat(str3));
        editor.apply();
        finish();


    }



}