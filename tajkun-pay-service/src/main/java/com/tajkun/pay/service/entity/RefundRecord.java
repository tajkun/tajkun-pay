package com.tajkun.pay.service.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: tajkun-pay
 * @description:
 * @author: Jiakun
 * @create: 2020-08-05 15:15
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "pay_refund_record")
public class RefundRecord {

    @TableId(value = "id")
    private String id;
    @TableField(value = "merchant_order_no")
    private String merchantOrderNo;
    @TableField(value = "merchant_name")
    private String merchantName;
    @TableField(value = "merchant_no")
    private String merchantNo;
    @TableField(value = "product_name")
    private String productName;
    @TableField(value = "refund_amount")
    private BigDecimal refundAmount;
    @TableField(value = "refund_order_no")
    private String refundOrderNo;
    @TableField(value = "refund_status")
    private int refundStatus;
    @TableField(value = "refund_request_time")
    private Date refundRequestTime;
    @TableField(value = "refund_success_time")
    private Date refundSuccessTime;
    @TableField(value = "request_apply_user_no")
    private String requestApplyUserNo;
    @TableField(value = "request_apply_user_name")
    private String requestApplyUserName;
    @TableField(value = "refund_reason")
    private String refundReason;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "edit_time")
    private Date editTime;

}