package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        AlarmManager aManager=(AlarmManager)getSystemService(Service.ALARM_SERVICE);
        Intent intent=new Intent();
        // 启动一个名为getRate的Activity 来获取汇率
        intent.setClass(this, getRate.class);
        // 设置定时任务，这里使用绝对时间，即使休眠也提醒，程序启动后过一天会启动新的Activity，在这里配置一年的任务
        int cou = 0;
        for (cou=0; cou<365;cou++){
            PendingIntent pi=
                    PendingIntent.getActivity(this, cou, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            aManager.set
                    (AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+1000*cou, pi);
        }

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