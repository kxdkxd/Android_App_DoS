package com.example.denialserviceapp.entity;

import java.io.Serializable;

public class SUser implements Serializable {
    private static final long serialVersionUID = 1;
    private String username;
    private String passwd;
    private transient int number;

    public SUser() {
    }

    public SUser(String username, String passwd, int number) {
        this.username = username;
        this.passwd = passwd;
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", number=" + number +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
