package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色表(AuRole)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Entity
@Table(name = "AU_ROLE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuRole implements Serializable {
    private static final long serialVersionUID = -77461004296314005L;
    /**
    * 主键ID
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
    * 角色编码
    */
    private String roleCode;
    /**
    * 角色名称
    */
    private String roleName;
    /**
    * 创建日期
    */
    private Date createDate;
    /**
    * 是否启用（0、未启用1、启用）
    */
    private Integer isStart;
    /**
    * 创建者
    */
    private String createBy;




}