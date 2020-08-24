package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (LeaveMessage)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveMessage implements Serializable {
    private static final long serialVersionUID = 243582427229771632L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 留言用户code
    */
    private String createdby;
    /**
    * 留言编码
    */
    private String messagecode;
    /**
    * 留言标题
    */
    private String messagetitle;
    /**
    * 留言内容
    */
    private String messagecontent;
    /**
    * 状态（1、已回复0、未回复）
    */
    private Integer state;
    /**
    * 留言时间
    */
    private Date createtime;



}