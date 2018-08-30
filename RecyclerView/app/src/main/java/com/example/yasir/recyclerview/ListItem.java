package com.example.yasir.recyclerview;

/**
 * Created by Yasir on 8/29/2018.
 */

public class ListItem {
    private String mHeading;
    private String mDesc;

    public String getmHeading() {
        return mHeading;
    }

    public String getmDesc() {
        return mDesc;
    }

    public ListItem(String mHeading, String mDesc) {

        this.mHeading = mHeading;
        this.mDesc = mDesc;
    }
}
