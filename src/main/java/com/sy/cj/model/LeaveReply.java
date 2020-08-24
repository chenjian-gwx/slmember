package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (LeaveReply)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveReply implements Serializable {
    private static final long serialVersionUID = 614428548690242204L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 留言ID（主表）
    */
    private Long messageid;
    /**
    * 回复内容
    */
    private String replycontent;
    /**
    * 回复人
    */
    private String createdby;
    /**
    * 回复时间
    */
    private Date createtime;




}