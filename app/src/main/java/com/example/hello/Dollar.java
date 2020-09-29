package com.example.hello;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dollar extends AppCompatActivity {
    TextView out;
    EditText edit;
    double dollar;
    double euro;
    double won;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dollar);

       // dollar = 0.1465;
     //   euro = 0.1259;
      //  won = 171.7179;


    }
    public void exchange(View v){
        out = (TextView) findViewById(R.id.textView5);
        edit = (EditText) findViewById(R.id.EditTextTextPersonName2);
        SharedPreferences sp = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        dollar = sp.getFloat("dollar_rate",0.1465f);
        euro= sp.getFloat("euro_rate",0.1259f);
        won = sp.getFloat("won_rate",171.7179f);
        Intent intent = getIntent();
        if(v.getId()==R.id.button3){
            Double d = Double.parseDouble(edit.getText().toString());
            out.setText("结果为："+d*dollar);
        }else if(v.getId()==R.id.button5){
            Double d = Double.parseDouble(edit.getText().toString());
            out.setText("结果为："+d*euro);

        }else if(v.getId()==R.id.button7){
            Double d = Double.parseDouble(edit.getText().toString());
            out.setText("结果为："+d*won);

        }
    }
    public void dollarrate(View v){
       String str = edit.getText().toString();
       Double d = Double.parseDouble(str);
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
        Intent intent = new Intent(this,Setrate.class);
       // Bundle bdl = new Bundle();
       // startActivity(intent);
        //startActivityForResult(intent,0);


        //bdl.putDouble("key_dollar",dollar);
        //bdl.putDouble("key_euro",euro);
       // bdl.putDouble("key_won",won);
       // intent.putExtras(bdl);
        startActivityForResult(intent,0);

    }
   // protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
   //     super.onActivityResult(requestCode, resultCode, data);
   //     if(requestCode==0&&resultCode==0){
    //        Bundle bd = data.getExtras();
    //        dollar=bd.getDouble("key_dollar",0);
   //        euro=bd.getDouble("key_euro",0);
  //         won=bd.getDouble("key_won",0);

   //     }
    //}
}