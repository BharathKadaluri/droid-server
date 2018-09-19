package com.nineleaps.driodserver.driodserver.models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class UserLoginModel {

    @JsonProperty("username")
    private String userName;
    private String password;

    public UserLoginModel() {
    }

    public UserLoginModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
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
}
