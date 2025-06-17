package com.gufengjie.leiting.converter;

import com.gufengjie.leiting.entity.note.Note;
import com.gufengjie.leiting.entity.note.NoteCreateVo;
import com.gufengjie.leiting.entity.note.NoteVo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class NoteConverter {

    public static Note toNote(NoteCreateVo noteCreateVo) {
        Note note = new Note();
        BeanUtils.copyProperties(noteCreateVo, note);

        return note;
    }

    public static NoteVo toNoteVo(Note note) {
        NoteVo noteVo = new NoteVo();
        BeanUtils.copyProperties(note, noteVo);

        return noteVo;
    }

    public static List<NoteVo> toNoteVoList(List<Note> noteList) {
        List<NoteVo> noteVoList = new ArrayList<>();
        for (Note note : noteList) {
            NoteVo noteVo = toNoteVo(note);
            noteVoList.add(noteVo);
        }

        return noteVoList;
    }

}
