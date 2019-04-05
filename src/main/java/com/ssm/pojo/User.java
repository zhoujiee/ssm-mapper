package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_user")
public class User {
    /**
     * 用户编号,唯一
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 获取用户编号,唯一
     *
     * @return id - 用户编号,唯一
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户编号,唯一
     *
     * @param id 用户编号,唯一
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return name - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码
     *
     * @return pwd - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}