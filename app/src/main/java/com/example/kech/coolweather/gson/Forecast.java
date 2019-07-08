package com.example.kech.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temprature temprature;
    @SerializedName("cond")
    public More more;
    public class Temprature{

        public String max;

        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
