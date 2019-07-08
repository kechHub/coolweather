package com.example.kech.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        Log.d("TAG1","这里");
        if(prefs.getString("weather",null)!=null){
            Log.d("TAG1","这里1");
            Intent intent=new Intent(this,WeatherActivity.class);
            Log.d("TAG1","这里2");
            startActivity(intent);
            finish();
        }
    }
}
