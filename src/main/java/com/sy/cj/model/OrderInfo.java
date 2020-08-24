package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单表(OrderInfo)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo implements Serializable {
    private static final long serialVersionUID = 577446649279596292L;
    
    private Long id;
    /**
    * 订单编号
    */
    private String ordercode;
    /**
    * 订单总价
    */
    private Object orderprice;
    /**
    * 订单时间
    */
    private Date createtime;
    /**
    * 创建者
    */
    private String createby;
    /**
    * 修改时间
    */
    private Date lastupdatetime;
    /**
    * 1已支付,0失效订单,2未支付
    */
    private Integer status;
    /**
    * 关联用户表
    */
    private Long userid;




}