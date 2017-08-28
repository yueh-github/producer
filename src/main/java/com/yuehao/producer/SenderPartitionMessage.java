package com.yuehao.producer;

import org.springframework.stereotype.Component;

/**
 * Created by yuehao on 2017/8/25.
 */
@Component
public class SenderPartitionMessage extends Sender {

    @Override
    public void sendMessage(Message message) {
//        template.send(message.getTopic(), 1, message.getMsg(), gson.toJson(message));
        template.send(message.getTopic(), "hao_key", gson.toJson(message));
    }
}
