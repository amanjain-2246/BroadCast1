package com.exam.ravi.broadcast1;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    MyBroadCastReceiver mrcv; // within Java file
    IntentFilter ift;  // within Java file
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrcv = new MyBroadCastReceiver();  // within Java file
        ift=new IntentFilter("MY_ACT");  // within Java file
    }

    @Override                          //within Java file
    protected void onResume() {
        super.onResume();
       //registerReceiver(mrcv,ift);
    }

    @Override                       //within Java file
    protected void onPause() {
        super.onPause();
       // unregisterReceiver(mrcv);
    }
    public void sendB(View v)
    {
       //  i=new Intent(this,MyBroadCastReceiver.class);
         i=new Intent("MY_ACT");
        i.putExtra("name", "some value from BroadCast");
        sendBroadcast(i);
    }

}
