package com.example.denialserviceapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class PUser implements Parcelable {
    public static final Creator<PUser> CREATOR = new Creator<PUser>() {
        @Override
        public PUser createFromParcel(Parcel in) {
            return new PUser(in);
        }

        @Override
        public PUser[] newArray(int size) {
            return new PUser[size];
        }
    };
    private String username;
    private String passwd;
    private transient int number;

    protected PUser(Parcel in) {
        username = in.readString();
        passwd = in.readString();
    }

    public PUser() {
    }

    public PUser(String username, String passwd, int number) {
        this.username = username;
        this.passwd = passwd;
        this.number = number;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(passwd);
    }

    @Override
    public int describeContents() {
        return 0;
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
