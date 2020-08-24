package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 把该表数据放ES中(GoodsInfo)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsInfo implements Serializable {
    private static final long serialVersionUID = -67522903657488219L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 商品编码
    */
    private String goodssn;
    /**
    * 商品名称
    */
    private String goodsname;
    /**
    * 商品规格
    */
    private String goodsformat;
    /**
    * 市场价
    */
    private Object marketprice;
    /**
    * 优惠价格
    */
    private Object realprice;
    /**
    * 状态（1、上架、2、下架）
    */
    private Integer state;
    /**
    * 商品说明
    */
    private String note;
    /**
    * 库存数量
    */
    private Integer num;
    /**
    * 单位
    */
    private String unit;
    /**
    * 创建时间
    */
    private Date createtime;
    /**
    * 最后更新时间
    */
    private Date lastupdatetime;
    /**
    * 创建人
    */
    private String createdby;




}