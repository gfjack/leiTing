package com.gufengjie.leiting.entity.mark;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel("积分更新表")
@Data
public class MarkUpdateVo {

    @ApiModelProperty("用户id")
    @NotBlank(message = "用户id不能为空")
    private Long userId;

    @ApiModelProperty("增加分数为true, 减少为false")
    @NotBlank(message = "不能为空")
    private boolean addOrMinus;

    @ApiModelProperty("更新分数")
    @NotBlank(message = "更新分数不能为空")
    private Long updateMark;

}
