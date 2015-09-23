package com.woods.myoa.model;

/**
 * Created by HuangLei on 2015/9/22.
 *
 * 用户
 */
public class User {

    /** 用户名 */
    private String name;

    /** 年龄 **/
    private Integer age;

    /** 获取用户名 */
    public String getName() {
        return name;
    }

    /** 设置用户名 */
    public void setName(String name) {
        this.name = name;
    }

    /** 年龄 **/
    public Integer getAge() {
        return age;
    }

    /** 年龄 **/
    public void setAge(Integer age) {
        this.age = age;
    }
}
