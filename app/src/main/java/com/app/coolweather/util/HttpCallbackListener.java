package com.app.coolweather.util;

/**
 * Created by 李直气壮 on 2016/3/30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
