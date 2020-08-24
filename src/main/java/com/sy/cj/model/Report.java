package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员人数报表(Report)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report implements Serializable {
    private static final long serialVersionUID = -55361689670309349L;
    
    private Long id;
    /**
    * 相应会员类型对应的人数
    */
    private Integer usernum;
    /**
    * 关联角色表
    */
    private Long roleid;
    /**
    * 会员类型
    */
    private String rolename;
    
    private Date createtime;




}