package com.wcy.coolweather.gson;

/**
 * Created by 臣杨 on 2017-4-20.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
