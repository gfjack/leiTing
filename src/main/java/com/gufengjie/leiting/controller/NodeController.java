package com.gufengjie.leiting.controller;

import com.gufengjie.leiting.api.NoteApi;
import com.gufengjie.leiting.entity.note.NoteCreateVo;
import com.gufengjie.leiting.entity.note.NoteUpdateVo;
import com.gufengjie.leiting.entity.note.NoteVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Api("公告api")
@RequestMapping(value = "/v1")
@RestController
public class NodeController implements NoteApi {
    @Override
    public NoteVo saveNote(NoteCreateVo noteCreateVo) {
        return null;
    }

    @Override
    public void delete(Long noteId) {

    }

    @Override
    public NoteVo update(Long noteId, NoteUpdateVo noteUpdateVo) {
        return null;
    }

    @Override
    public List<NoteVo> get() {
        return List.of();
    }

    @Override
    public NoteVo search(Date date) {
        return null;
    }
}
