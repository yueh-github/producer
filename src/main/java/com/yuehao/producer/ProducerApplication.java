package com.yuehao.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ProducerApplication {

    private static Executor exectors =
            new ThreadPoolExecutor(5, 50, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5000));


    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProducerApplication.class, args);
//        Thread tp1 = new Thread(new PartitionThread("test_02"));
//        tp1.start();
//
//        Thread tp2 = new Thread(new PartitionThread("test_02"));
//        tp2.start();

        for (int i = 0; i < 100; i++)
            exectors.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("~~~~~~~~: " + Thread.currentThread().getName());
                }
            });
    }
}
