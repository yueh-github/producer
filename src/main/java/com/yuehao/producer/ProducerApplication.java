package com.yuehao.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProducerApplication.class, args);
        Thread tp1 = new Thread(new MessageThread("test_01"));
        tp1.start();

        Thread tp2 = new Thread(new MessageThread("test_02"));
        tp2.start();
    }
}
