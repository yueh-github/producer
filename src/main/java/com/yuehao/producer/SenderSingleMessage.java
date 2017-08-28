package com.yuehao.producer;

import org.springframework.stereotype.Component;

/**
 * Created by yuehao on 2017/8/25.
 */
@Component
public class SenderSingleMessage extends Sender {

    @Override
    public void sendMessage(Message message) {
        super.sendMessage(message);
    }
}
