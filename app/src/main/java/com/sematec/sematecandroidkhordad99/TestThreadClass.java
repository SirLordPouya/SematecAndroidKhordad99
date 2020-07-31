package com.sematec.sematecandroidkhordad99;

public class TestThreadClass extends Thread {

    @Override
    public void run() {
        // heavy work
        System.out.println(Thread.currentThread().getName());
    }
}
