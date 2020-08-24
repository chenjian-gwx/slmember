package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 咨讯表(Information)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Information implements Serializable {
    private static final long serialVersionUID = -46174610152480727L;
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
    * 发布状态（0、未发布 1、发布）默认为发布
    */
    private Integer state;
    /**
    * 发布人
    */
    private String publisher;
    /**
    * 发布时间
    */
    private Date publishtime;
    /**
    * 附件类型ID
    */
    private Integer typeid;
    /**
    * 附件类型NAME
    */
    private String typename;
    /**
    * 附件名称
    */
    private String filename;
    /**
    * 附件存放路径
    */
    private String filepath;
    /**
    * 附件大小
    */
    private Object filesize;
    /**
    * 上传时间
    */
    private Date uploadtime;


}