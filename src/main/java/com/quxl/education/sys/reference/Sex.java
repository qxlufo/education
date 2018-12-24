package com.quxl.education.sys.reference;

/**
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.reference
 * @date:2018/12/8
 */
public enum Sex {
    男("1", "男"), 女("2", "女");

    private String key;
    private String value;

    private Sex(String key) {
        this(key, null);
    }

    private Sex(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return (null == value) ? name() : value;
    }

    public Object getObject() {
        return this;
    }

    public String toString() {
        return key;
    };

}
