package com.gufengjie.leiting.api;

import com.gufengjie.leiting.entity.message.MessageCreateVo;
import com.gufengjie.leiting.entity.message.MessageUpdateVo;
import com.gufengjie.leiting.entity.message.MessageVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api("留言板Api")
@RequestMapping("/v1")
public interface MessageApi {

    @ApiOperation("创建留言")
    @RequestMapping(value = "/message", method = RequestMethod.POST)
    MessageVo create(@ApiParam("创建留言实体") @RequestBody MessageCreateVo messageCreateVo);

    @ApiOperation("管理员回复留言")
    @RequestMapping(value = "/message/{message_id}", method = RequestMethod.PUT)
    MessageUpdateVo reply(@ApiParam("回复留言") @RequestBody MessageUpdateVo messageUpdateVo,
                          @PathVariable("message_id") Long messageId);

    @ApiOperation("根据id删除留言")
    @RequestMapping(value = "/message/{message_id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("message_id") Long messageId);
}
