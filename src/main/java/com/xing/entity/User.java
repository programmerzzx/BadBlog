package com.xing.entity;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_register
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private Date gmtRegister;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.level
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    private Integer level;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uid
     *
     * @return the value of user.uid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uid
     *
     * @param uid the value for user.uid
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_register
     *
     * @return the value of user.gmt_register
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public Date getGmtRegister() {
        return gmtRegister;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_register
     *
     * @param gmtRegister the value for user.gmt_register
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setGmtRegister(Date gmtRegister) {
        this.gmtRegister = gmtRegister;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.level
     *
     * @return the value of user.level
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.level
     *
     * @param level the value for user.level
     *
     * @mbg.generated Sun Sep 03 20:13:49 CST 2017
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}