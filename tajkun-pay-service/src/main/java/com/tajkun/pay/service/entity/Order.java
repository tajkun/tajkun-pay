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
 * @create: 2020-08-05 14:35
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "pay_order")
public class Order {

    @TableId(value = "id")
    private String id ;
    @TableField(value = "product_name")
    private String productName;
    @TableField(value = "merchant_order_no")
    private String merchantOrderNo;
    @TableField(value = "order_amount")
    private BigDecimal orderAmount;
    @TableField(value = "merchant_name")
    private String merchantName;
    @TableField(value = "merchant_no")
    private String merchantNo;
    @TableField(value = "order_time")
    private Date orderTime;
    @TableField(value = "order_ip")
    private String orderIp;
    @TableField(value = "user_no")
    private String userNo;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "cancel_reason")
    private String cancelReason;
    @TableField(value = "order_period")
    private int orderPeriod;
    @TableField(value = "remark")
    private String remark;
    @TableField(value = "pay_success_time")
    private Date paySuccessTime;
    @TableField(value = "is_refund")
    private Boolean refund;
    @TableField(value = "refund_times")
    private int refundTimes;
    @TableField(value = "success_refund_amount")
    private BigDecimal successRefundAmount;
    @TableField(value = "status")
    private int status;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "edit_time")
    private Date editTime;

}