package com.exam.ravi.broadcast1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Ravi Godara on 2/16/2017.
 */
public class MyBroadCastRec extends BroadcastReceiver     //within Java file
{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Hello Dear",Toast.LENGTH_LONG).show();
    }
}