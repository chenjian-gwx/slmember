package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限表(AuFunction)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuFunction implements Serializable {
    private static final long serialVersionUID = -94534685765763990L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 功能编码
    */
    private String funcCode;
    /**
    * 功能名称
    */
    private String funcName;
    /**
    * 功能URL
    */
    private String funcUrl;
    
    private Long parentId;
    /**
    * 创建时间
    */
    private Date creationTime;




}