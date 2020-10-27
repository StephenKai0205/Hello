package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getRate extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_get_rate);
        Thread t =new Thread();
        t.start();


    }

    @Override
    public void run() {
        String TAG = "testList";
        Log.i(TAG, "run:zhu1466()...................");

        List<String> list2 =  new ArrayList<String>();

        //处理数据实验
        String url2 = "http://www.usd-cny.com/bankofchina.htm";

        Document doc = null;
        try {
            doc = Jsoup.connect(url2).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.i(TAG,
                "run: " + doc.title());
        Elements tables = doc.getElementsByTag("table");
        Element table6 = tables.get(0);
        //获取TD中的数据
        Elements tds = table6.getElementsByTag("td");
        //将获取数据存入文件中
        SharedPreferences sp =
                getSharedPreferences("rateFromNet", Activity.MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();

        for(int i=0;i<tds.size();i+=6){
            Element td1 = tds.get(i);
            Element td2 = tds.get(i+5);
            String str1 = td1.text();
            String val = td2.text();
            Log.i(TAG,
                    "run: " + str1 + "==>" + val);
            float v = 100f / Float.parseFloat(val);
            list2.add(str1 + "==>" + val);
            //数据存储
            ed.putFloat(str1, Float.valueOf(val));
            //获取数据并返回……
        }
        ed.commit();
        Log.i(TAG,"currentTime:"+System.currentTimeMillis());

    }
}