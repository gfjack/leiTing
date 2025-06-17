package com.gufengjie.leiting.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel("Po基类")
public class BasePo implements Serializable {

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新人")
    private String updateBy;

    @ApiModelProperty("更新时间")
    private Date updateTime;

//    @PrePersist
//    protected void onPirePersist() {
//        if(null == createBy) {
//            this.createBy = SecurityContextHolder.getContext().getAuthentication().getName();
//        }
//        if (null == createTime) {
//            this.createTime = new Date();
//        }
//        this.updateBy = this.createBy;
//        this.updateTime = this.createTime;
//    }
//
//    @PreUpdate
//    protected void onPreUpdate() {
//        this.updateBy = SecurityContextHolder.getContext().getAuthentication().getName();
//        this.updateTime = new Date();
//    }
}
