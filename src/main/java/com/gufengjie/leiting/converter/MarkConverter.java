package com.gufengjie.leiting.converter;

import com.gufengjie.leiting.entity.mark.Mark;
import com.gufengjie.leiting.entity.mark.MarkUpdateVo;
import com.gufengjie.leiting.entity.mark.MarkVo;
import org.springframework.beans.BeanUtils;

public class MarkConverter {

    public static Mark toMark(MarkUpdateVo markUpdateVo) {
        Mark mark = new Mark();
        BeanUtils.copyProperties(markUpdateVo, mark);

        return mark;
    }

    public static MarkVo toMarkVo(Mark mark) {
        MarkVo markVo = new MarkVo();
        BeanUtils.copyProperties(mark, markVo);

        return markVo;
    }

}
