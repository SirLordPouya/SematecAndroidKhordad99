package com.sematec.sematecandroidkhordad99;

public class TestRunnableClass implements Runnable {
    @Override
    public void run() {
        // heavy work
        System.out.println(Thread.currentThread().getName());
    }
}
