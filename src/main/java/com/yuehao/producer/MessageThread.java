package com.yuehao.producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by yuehao on 2017/8/24.
 */
public class MessageThread implements Runnable {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private Gson gson = new GsonBuilder().create();

    private String topic;

//    @Autowired
//    private KafkaTemplate kafkaTemplate;

    @Autowired
    private Sender sender;

//    private Gson gson = new GsonBuilder().create();

    public MessageThread(String topic) {
        this.topic = topic;
        this.sender = (Sender) BeanTools.getBean(Sender.class);

    }

    @Override
    public void run() {
        for (Long i = 0l; i < 100000; i++) {
            try {
                Thread.sleep(500);
                Message message = new Message();
                message.setTopic(topic);
                message.setId(i);
                message.setMsg(topic + ":" + "frist kafka message " + " number:" + i);
                message.setDate(new Date());
                logger.info("{}", "存储message" + gson.toJson(message));
//            kafkaTemplate.send(topic, message.getMsg(), gson.toJson(message));
                sender.sendMessage(message);
            } catch (Exception ex) {

            }
        }
    }
}
