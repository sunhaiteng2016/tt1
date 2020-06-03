package com.boniu.onlyuuid;

import android.content.Context;

import com.bun.miitmdid.core.JLibrary;

public class UUid {
    public static  void init(Context context){
        try {
            JLibrary.InitEntry(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
