package com.gufengjie.leiting.api;

import com.gufengjie.leiting.entity.mark.MarkSearchVo;
import com.gufengjie.leiting.entity.mark.MarkUpdateVo;
import com.gufengjie.leiting.entity.mark.MarkVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * 分数Api
 */
@Api("分数Api")
@RequestMapping("/v1")
public interface MarkApi {

    @ApiOperation("获取某一用户分数")
    @RequestMapping(value = "/mark/actions/search", method = RequestMethod.POST)
    MarkVo getMark(@ApiParam("用户搜索实体") @Valid @RequestBody MarkSearchVo markSearchVo);

    @ApiOperation("更新某一用户分数，仅限管理员")
    @RequestMapping(value = "/mark/{user_id}/actions.update", method = RequestMethod.PUT)
    MarkVo update(@ApiParam("用户更新实体") @Valid @RequestBody MarkUpdateVo markUpdateVo,
                  @ApiParam("用户id") @PathVariable("user_id") Long userId);

    @ApiOperation("根据用户id获取用户分数")
    @RequestMapping(value = "/mark/{user_id}", method = RequestMethod.GET)
    MarkVo getOne(@ApiParam("用户id") @PathVariable("user_id") Long userId);
}
