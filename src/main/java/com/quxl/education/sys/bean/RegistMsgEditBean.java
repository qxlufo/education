package com.quxl.education.sys.bean;

import lombok.Data;

/**
 * 用于保存注册页面返回的信息
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.bean
 * @date:2018/12/12
 */
@Data
public class RegistMsgEditBean {

    /**姓名*/
    private String xm;
    /**性别*/
    private String xb;
    /**登录账号*/
    private String dlzh;
    /**密码*/
    private String mm;
    /**身份证号码*/
    private String sfzhm;
    /**手机号码*/
    private String sjhm;
    /**住址*/
    private String zz;
}
