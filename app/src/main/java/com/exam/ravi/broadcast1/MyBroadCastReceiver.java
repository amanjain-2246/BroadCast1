package com.exam.ravi.broadcast1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Received Broadcast IN 1" + intent.getStringExtra("name"), Toast.LENGTH_LONG).show();
    }
}
