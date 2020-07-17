package com.sematec.sematecandroidkhordad99;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction() == "com.sematec.sematecandroidkhordad99.CUSTOM_BROADCAST") {
            String driverName = intent.getStringExtra("driverName");
            Toast.makeText(context, "Driver Name Is: " + driverName, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Airplane mode changed!", Toast.LENGTH_SHORT).show();
        }
    }
}
