package com.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolMain {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        for(int i = 1;i<21;i++){
            pool.submit(new ThreadRunner(i,0));
        }
        pool.shutdown();
    }
}
