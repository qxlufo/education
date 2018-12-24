package com.quxl.education.common.returnModel;

import lombok.Data;

import java.io.Serializable;

/**
 * 页面返回操作是否成功信息
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.common
 * @date:2018/12/20
 */
@Data
public class ResultSet  implements Serializable {
    public static final String SUCCESSCODE = "1";
    public static final String ERRORCODE = "0";
    public static final String SUCCESSSIGN = "success";
    public static final String ERRORSIGN = "error";
    /**返回code值*/
    private String code;

    private String sign;

    private String message;

    public ResultSet() {
    }

    public ResultSet(String code, String sign, String message) {
        this.code = code;
        this.sign = sign;
        this.message = message;
    }
}
