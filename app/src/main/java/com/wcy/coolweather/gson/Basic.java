package com.wcy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 臣杨 on 2017-4-20.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
