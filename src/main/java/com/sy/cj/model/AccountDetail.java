package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 账户资金明细表(AccountDetail)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDetail implements Serializable {
    private static final long serialVersionUID = 372288984288844885L;
    
    private Long id;
    /**
    * 关联用户账户表
    */
    private Long accountId;
    /**
    * 记录入账或出账日期
    */
    private Date accountDate;
    /**
    * 入账
    */
    private Double moneyIn;
    /**
    * 出账
    */
    private Double moneyOut;
    /**
    * 0充值,1提现,2消费,3收益
    */
    private Integer type;
    /**
    * 交易方账户
    */
    private String otherAcountId;




}