package com.sematec.sematecandroidkhordad99;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TestThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        TestThreadClass ttc = new TestThreadClass();
        ttc.start();

        TestRunnableClass runnableClass = new TestRunnableClass();
        Thread thread = new Thread(runnableClass);
        thread.start();
    }
}