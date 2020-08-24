package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 购物车中商品信息表(CartGoods)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartGoods implements Serializable {
    private static final long serialVersionUID = 490277173014309521L;
    
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
    * 购物车ID,关联购物车表
    */
    private Long cartid;
    /**
    * 0表示无货,1表示有货
    */
    private Integer flag;
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




}