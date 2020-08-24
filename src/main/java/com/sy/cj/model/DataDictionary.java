package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 数据字典(DataDictionary)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataDictionary implements Serializable {
    private static final long serialVersionUID = 956402072516026001L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 类型编码
    */
    private String typecode;
    /**
    * 类型名称
    */
    private String typename;
    /**
    * 类型值ID
    */
    private Integer valueid;
    /**
    * 类型值Name
    */
    private String valuename;




}