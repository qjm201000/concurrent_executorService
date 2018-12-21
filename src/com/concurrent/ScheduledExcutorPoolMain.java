package com.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExcutorPoolMain {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);//线程池

        // 从现在开始5秒钟之后，每隔10秒钟执行一次ThreadRunner
        pool.scheduleAtFixedRate(new ThreadRunner(2,3), 5,10, TimeUnit.SECONDS);

        // 从现在开始5秒钟之后，每隔10秒钟执行一次job2
        pool.scheduleWithFixedDelay(new ThreadRunner(3,3), 5, 10, TimeUnit.SECONDS);

        /**
         * ScheduleAtFixedRate 每次执行时间为上一次任务开始起向后推一个时间间隔，
         *                     即每次执行时间为 :initialDelay, initialDelay+period, initialDelay+2*period, …；
         * ScheduleWithFixedDelay 每次执行时间为上一次任务结束起向后推一个时间间隔，
         *                     即每次执行时间为：initialDelay, initialDelay+executeTime+delay, initialDelay+2*executeTime+2*delay
         *
         * ScheduleAtFixedRate 是基于固定时间间隔进行任务调度，
         * ScheduleWithFixedDelay 取决于每次任务执行的时间长短，是基于不固定时间间隔进行任务调度
         */
    }
}
