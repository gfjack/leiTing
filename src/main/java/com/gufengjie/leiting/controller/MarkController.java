package com.gufengjie.leiting.controller;

import com.gufengjie.leiting.api.MarkApi;
import com.gufengjie.leiting.entity.mark.MarkSearchVo;
import com.gufengjie.leiting.entity.mark.MarkUpdateVo;
import com.gufengjie.leiting.entity.mark.MarkVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("分数Api")
@RequestMapping("/v1")
@RestController
public class MarkController implements MarkApi {
    @Override
    public MarkVo getMark(MarkSearchVo markSearchVo) {
        return null;
    }

    @Override
    public MarkVo update(MarkUpdateVo markUpdateVo, Long userId) {
        return null;
    }

    @Override
    public MarkVo getOne(Long userId) {
        return null;
    }
}
