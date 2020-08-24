package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色权限关联表(AuAuthority)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuAuthority implements Serializable {
    private static final long serialVersionUID = 454026789526921965L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 角色ID
    */
    private Long roleId;
    /**
    * 功能ID
    */
    private Long functionId;
    /**
    * 创建时间
    */
    private Date creationTime;
    /**
    * 创建者
    */
    private String createdBy;



}