package com.yuehao.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext app = SpringApplication.run(ProducerApplication.class, args);
        Sender sender = app.getBean(Sender.class);
        sender.sendMessage();


        while (true) {
            sender.sendMessage();
            Thread.sleep(200);
        }
    }
}
