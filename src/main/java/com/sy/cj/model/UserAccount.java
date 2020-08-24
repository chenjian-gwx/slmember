package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 金钱账户表(UserAccount)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount implements Serializable {
    private static final long serialVersionUID = 220071330718024686L;
    
    private Long id;
    /**
    * 关联用户表
    */
    private Long userId;
    /**
    * 账户余额
    */
    private Double balance;
    
    private Date createTime;
    
    private Date lastUpdateTime;
    
    private String createBy;
    /**
    * 0锁定,1锁定
    */
    private Integer status;



}