package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 购买商品订单明细表(OrderGoods)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderGoods implements Serializable {
    private static final long serialVersionUID = 963314347451523043L;
    
    private Long id;
    /**
    * 商品编号,关联商品表
    */
    private Long goodsid;
    /**
    * 商品名字
    */
    private String goodsname;
    /**
    * 商品价格
    */
    private Object goodsprice;
    /**
    * 商品数量
    */
    private Integer goodsnum;
    /**
    * 创建人
    */
    private String createby;
    /**
    * 创建时间
    */
    private Date createtime;
    /**
    * 修改时间
    */
    private Date lastupdatetime;
    /**
    * 关联订单表
    */
    private Long orderinfoid;




}