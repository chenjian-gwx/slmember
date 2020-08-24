package com.sy.cj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表(AuUser)实体类
 *
 * @author makejava
 * @since 2020-08-24 13:10:43
 */

@Entity
@Table(name = "AU_USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuUser implements Serializable {
    private static final long serialVersionUID = -56468461492024412L;
    /**
    * 主键ID
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
    * 登录账号
    */
    private String username;
    /**
    * 登录密码（初始密码为证件号码后六位）
    */
    private String password;
    /**
    * 二级密码（初始密码为证件号码后六位）
    */
    private String password2;
    /**
    * 用户真实姓名
    */
    private String realName;
    /**
    * 性别
    */
    private String sex;
    /**
    * 生日
    */
    private Date birthday;
    /**
    * 证件类型id,来源于数据字典表 data_dictionary 中
typeCode =’CARD_TYPE’的 valueId
    */
    private String cardType;
    /**
    * 证件类型名称,来源于数据字典表 data_dictionary 中
typeCode =’CARD_TYPE’的 valueName
    */
    private String cardTypename;
    /**
    * 证件号码
    */
    private String idCard;
    /**
    * 收货国家
    */
    private String country;
    /**
    * 手机
    */
    private String mobile;
    /**
    * email
    */
    private String email;
    /**
    * 收获地址
    */
    private String userAddress;
    /**
    * 邮编
    */
    private String postcode;
    /**
    * 注册时间
    */

    private Date createTime;
    /**
    * 推荐人id（默认为当前登录用户id）
    */
    private Long referId;
    /**
    * 推荐人编码（默认为当前登录用户loginCode）
    */
    private String referCode;
    /**
    * 所属角色ID
    */
    private Long roleId;
    /**
    * 所属角色名称
    */
    private String roleName;
    /**
    * 是否启用（1、启用2、未启用）
    */
    private Integer isStart;
    /**
    * 最新更新时间
    */
    private Date lastUpdateTime;
    /**
    * 最后登录时间
    */
    private Date lastLoginTime;
    /**
    * 开户卡号
    */
    private String bankAccount;
    /**
    * 开户行
    */
    private String bankName;
    /**
    * 开户人
    */
    private String accountHolder;
    /**
    * 身份证照片存放路径
    */
    private String idCardPicPath;
    /**
    * 银行卡照片存放路径
    */
    private String bankPicPath;




}