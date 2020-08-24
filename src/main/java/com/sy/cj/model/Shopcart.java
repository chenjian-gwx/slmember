package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 购物车(Shopcart)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shopcart implements Serializable {
    private static final long serialVersionUID = 412877934069268968L;
    
    private Long id;
    /**
    * 关联用户名
    */
    private Long userid;
    /**
    * 购物车中商品总价
    */
    private Object totalprice;
    /**
    * 创建人,读自用户表
    */
    private String createby;
    /**
    * 最后修改时间
    */
    private Date lastupdatetime;
    /**
    * 创建时间
    */
    private Date createtime;



}