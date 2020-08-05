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
 * @create: 2020-08-05 14:12
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "pay_merchant")
public class Merchant {

    @TableId(value = "id")
    private String id;
    @TableField(value = "app_id")
    private String appId;
    @TableField(value = "app_public_key")
    private String appPublicKey;
    @TableField(value = "app_private_key")
    private String appPrivateKey;
    @TableField(value = "merchant_name")
    private String merchantName;
    @TableField(value = "merchant_no")
    private String merchantNo;
    @TableField(value = "address")
    private String address;
    @TableField(value = "mobile")
    private String mobile;
    @TableField(value = "password")
    private String password;
    @TableField(value = "balance")
    private BigDecimal balance;
    @TableField(value = "status")
    private int status;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "edit_time")
    private Date editTime;
}