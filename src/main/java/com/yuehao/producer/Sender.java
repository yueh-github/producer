package com.yuehao.producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Created by yuehao on 2017/8/25.
 */
public abstract class Sender {

    @Autowired
    protected KafkaTemplate template;
    protected Gson gson = new GsonBuilder().create();

    public void sendMessage(Message message) {
        template.send(message.getTopic(), message.getMsg(), gson.toJson(message));
    }
}
