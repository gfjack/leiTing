package com.gufengjie.leiting.api;

import com.gufengjie.leiting.entity.note.NoteCreateVo;
import com.gufengjie.leiting.entity.note.NoteUpdateVo;
import com.gufengjie.leiting.entity.note.NoteVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 公告Api
 */
@Api("公告api")
@RequestMapping(value = "/v1")
public interface NoteApi {

    @ApiOperation("创建公告， 仅限管理员")
    @RequestMapping(value = "/note", method = RequestMethod.POST)
    NoteVo saveNote(@ApiParam("创建公告实体") @Valid @RequestBody NoteCreateVo noteCreateVo);

    @ApiOperation("删除公告，仅限管理员")
    @RequestMapping(value = "/note/{note_id}", method = RequestMethod.DELETE)
    void delete(@ApiParam("公告id") @PathVariable("note_id") Long noteId);

    @ApiOperation("更新公告，仅限管理员")
    @RequestMapping(value = "/note/{note_id}/actions/update", method = RequestMethod.PUT)
    NoteVo update(@ApiParam("公告id") @PathVariable("note_id") Long noteId,
                  @ApiParam("公告更新实体") @Valid @RequestBody NoteUpdateVo noteUpdateVo);

    @ApiOperation("获取所有公告")
    @RequestMapping(value = "/note", method = RequestMethod.GET)
    List<NoteVo> get();

    @ApiOperation("根据日期查询某一公告")
    @RequestMapping(value = "/note/search", method = RequestMethod.POST)
    NoteVo search(@ApiParam("日期") @RequestBody Date date);
}
