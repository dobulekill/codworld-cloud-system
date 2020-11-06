package com.codeworld.fc.role.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * ClassName Role
 * Description ��ɫ������
 * Author Lenovo
 * Date 2020/11/4
 * Version 1.0
**/
@Data
@ApiModel("��ɫ������")
public class Role {

    @ApiModelProperty("��ɫ����Id")
    private Long roleId;

    @ApiModelProperty("��ɫ����")
    private String roleCode;

    @ApiModelProperty("��ɫ����")
    private String roleName;

    @ApiModelProperty("��ɫ����")
    private String roleRemarks;

    @ApiModelProperty("����ʱ��")
    @JsonFormat(pattern = "yyyy-MM-dd HH:ss:mm",timezone = "GTM+8")
    private Date createTime;

    @ApiModelProperty("����ʱ��")
    @JsonFormat(pattern = "yyyy-MM-dd HH:ss:mm",timezone = "GTM+8")
    private Date updateTime;
}
