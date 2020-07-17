package com.sematec.sematecandroidkhordad99;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TestBroadcastReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_broadcast_receiver);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.sematec.sematecandroidkhordad99.CUSTOM_BROADCAST");
                intent.putExtra("driverName", "ali");
                sendBroadcast(intent);
            }
        });
        TestBroadcastReceiver receiver = new TestBroadcastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        filter.addAction("com.sematec.sematecandroidkhordad99.CUSTOM_BROADCAST");
        registerReceiver(receiver, filter);

    }
}