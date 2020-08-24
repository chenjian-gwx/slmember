package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 购买会员订单明细表(OrderUser)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderUser implements Serializable {
    private static final long serialVersionUID = 968015900125193384L;
    
    private Long id;
    /**
    * 关联订单表
    */
    private Long orderinfoid;
    /**
    * 会员类型
    */
    private String rolename;
    /**
    * 会员价格
    */
    private Object roleprice;
    /**
    * 关联角色表
    */
    private Long roleid;
    
    private String createby;
    
    private Date createdatetime;




}