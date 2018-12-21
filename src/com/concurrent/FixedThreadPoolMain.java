package com.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolMain {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);//有一个固定大小的线程池

        for(int i = 1;i<21;i++){
            pool.submit(new ThreadRunner(i,2));
        }

        pool.shutdown();
    }
}
