package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 销售额报表(Report2)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report2 implements Serializable {
    private static final long serialVersionUID = -34618901466709845L;
    
    private Long id;
    /**
    * 销售额度
    */
    private Double totalmoney;
    
    private Date createtime;
    /**
    * 0会员销售,1商品销售
    */
    private Integer type;




}