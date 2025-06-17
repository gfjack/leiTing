package com.gufengjie.leiting.controller;

import com.gufengjie.leiting.api.MessageApi;
import com.gufengjie.leiting.entity.message.MessageCreateVo;
import com.gufengjie.leiting.entity.message.MessageUpdateVo;
import com.gufengjie.leiting.entity.message.MessageVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("留言板Api")
@RequestMapping("/v1")
@RestController
public class MessageController implements MessageApi {
    @Override
    public MessageVo create(MessageCreateVo messageCreateVo) {
        return null;
    }

    @Override
    public MessageUpdateVo reply(MessageUpdateVo messageUpdateVo, Long messageId) {
        return null;
    }

    @Override
    public void delete(Long messageId) {

    }

    @Override
    public List<MessageVo> get() {
        return List.of();
    }
}
