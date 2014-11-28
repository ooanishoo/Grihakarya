/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grihakarya.entities;

import java.sql.Date;

/**
 *
 * @author Rashna
 */
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String email;
    private Date addedDate;
    private Date loginDate;
    private Boolean status;

    public User() {
    }

    public User(Integer userId, String userName, String password, String email, Date addedDate, Date loginDate, Boolean status) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.addedDate = addedDate;
        this.loginDate = loginDate;
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email + ", addedDate=" + addedDate + ", loginDate=" + loginDate + ", status=" + status + '}';
    }
    
    
    
            
}
