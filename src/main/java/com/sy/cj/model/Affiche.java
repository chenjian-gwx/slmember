package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 公告表(Affiche)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Affiche implements Serializable {
    private static final long serialVersionUID = 587611320308783470L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 标题
    */
    private String title;
    /**
    * 内容
    */
    private String content;
    /**
    * 发布人
    */
    private String publisher;
    /**
    * 发布时间
    */
    private Date publishTime;
    /**
    * 生效时间
    */
    private Date startTime;
    /**
    * 失效时间
    */
    private Date endTime;




}