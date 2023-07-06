package com.example.denialserviceattack;

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

    public PUser() {
    }

    protected PUser(Parcel in) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
