package com.gufengjie.leiting.converter;

import com.gufengjie.leiting.entity.message.Message;
import com.gufengjie.leiting.entity.message.MessageCreateVo;
import com.gufengjie.leiting.entity.message.MessageVo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class MessageConverter {

    public static Message toMessage(MessageCreateVo messageCreateVo) {
        Message message = new Message();
        BeanUtils.copyProperties(messageCreateVo, message);

        return message;
    }

    public static MessageVo toMessageVo(Message message) {
        MessageVo messageVo = new MessageVo();
        BeanUtils.copyProperties(message, messageVo);

        return messageVo;
    }

    public static List<MessageVo> toMessageVoList(List<Message> messageList) {
        List<MessageVo> messageVoList = new ArrayList<>();
        for (Message message : messageList) {
            MessageVo messageVo = toMessageVo(message);
            messageVoList.add(messageVo);
        }
        return messageVoList;
    }

}
