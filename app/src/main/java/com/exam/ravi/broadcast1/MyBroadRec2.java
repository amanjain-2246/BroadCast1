package com.exam.ravi.broadcast1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Ravi on 1/26/2016.
 */
public class MyBroadRec2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Received Broadcast message IN 2" + intent.getStringExtra("name"), Toast.LENGTH_LONG).show();
    }
}
