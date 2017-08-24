package com.yuehao.producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by yuehao on 2017/8/24.
 */

@Component
public class Sender {

    @Autowired
    private KafkaTemplate template;
    private Gson gson = new GsonBuilder().create();


    public void sendMessage() {
        Message message = new Message();
        message.setId(1000000L);
        message.setMsg("frist message kafka");
        message.setDate(new Date());
        template.send("test_01", message.getMsg(), gson.toJson(message));
    }
}
