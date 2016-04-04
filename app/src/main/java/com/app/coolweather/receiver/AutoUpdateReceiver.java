package com.app.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.app.coolweather.service.AutoUpdateService;

/**
 * Created by 李直气壮 on 2016/4/4.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
