package com.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ThreadRunner implements Runnable{
    private final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss.SSS");

    private int num;
    private int timeout;
    public ThreadRunner(int num,int timeout){
        this.num = num;
        this.timeout = timeout;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":当前时间："+format.format(new Date())+",运行中,"+num);
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
