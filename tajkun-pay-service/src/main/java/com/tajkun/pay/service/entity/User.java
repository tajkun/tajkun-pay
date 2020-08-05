package com.tajkun.pay.service.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: tajkun-pay
 * @description:
 * @author: Jiakun
 * @create: 2020-08-05 13:50
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "pay_user")
public class User {

    @TableId(value = "id")
    private String id;
    @TableField(value = "user_no")
    private String userNo;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "mobile")
    private String mobile;
    @TableField(value = "password")
    private String password;
    @TableField(value = "pay_pwd")
    private String payPwd;
    @TableField(value = "balance")
    private BigDecimal balance;
    @TableField(value = "gender")
    private int status;
    @TableField(value = "gender")
    private int gender;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "edit_time")
    private Date editTime;


}