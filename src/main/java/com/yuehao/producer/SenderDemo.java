//package com.yuehao.producer;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
///**
// * Created by yuehao on 2017/8/24.
// */
//
//@Component
//public class Sender {
//
//    @Autowired
//    private KafkaTemplate template;
//    private Gson gson = new GsonBuilder().create();
//
//
//    public void sendMessage(Message message) {
//        template.send(message.getTopic(), message.getMsg(), gson.toJson(message));
//    }
//
//    private static int getNumber() {
//        int[] arr = {0, 1};
//        int index = (int) (Math.random() * arr.length);
//        int rand = arr[index];
//        return rand;
//    }
//}
//
//
//
//
//
