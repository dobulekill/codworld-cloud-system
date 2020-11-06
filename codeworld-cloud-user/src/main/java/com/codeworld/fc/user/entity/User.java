package com.codeworld.fc.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * ClassName User
 * Description �û�������
 * Author Lenovo
 * Date 2020/11/4
 * Version 1.0
**/
@Data
@ApiModel("�û�������")
public class User {

    @ApiModelProperty("����Id")
    private Long userId;

    @ApiModelProperty("�û���")
    private String userName;

    @ApiModelProperty("�û�����")
    private String userEmail;

    @ApiModelProperty("�û��ֻ�")
    private String userPhone;

    @ApiModelProperty("�û�״̬")
    private Integer userStatus;

    @ApiModelProperty("����ʱ��")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("����ʱ��")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}
