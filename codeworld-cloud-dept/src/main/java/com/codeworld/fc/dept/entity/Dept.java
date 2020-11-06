package com.codeworld.fc.dept.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * ClassName Dept
 * Description ���Ż�����
 * Author Lenovo
 * Date 2020/11/4
 * Version 1.0
**/
@Data
@ApiModel("���Ż�����")
public class Dept {

    @ApiModelProperty("��������Id")
    private Long id;

    @ApiModelProperty("�ϼ�����Id")
    private Long parentId;

    @ApiModelProperty("��������")
    private String title;

    @ApiModelProperty("����")
    private String type;

    @ApiModelProperty("���ż��")
    private String remarks;

    @ApiModelProperty("����")
    private Integer sortNo;

    @ApiModelProperty("����ʱ��")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("����ʱ��")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

}
