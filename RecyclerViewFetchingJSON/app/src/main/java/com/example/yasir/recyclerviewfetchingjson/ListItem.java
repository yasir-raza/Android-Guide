package com.example.yasir.recyclerviewfetchingjson;

/**
 * Created by Yasir on 8/29/2018.
 */

public class ListItem {
    private String mHeading;
    private String mDesc;
    private String imageUrl;

    public String getmHeading() {
        return mHeading;
    }

    public String getmDesc() {
        return mDesc;
    }

    public String getImageUrl() {return imageUrl;}

    public ListItem(String mHeading, String mDesc, String imageUrl) {

        this.mHeading = mHeading;
        this.mDesc = mDesc;
        this.imageUrl = imageUrl;
    }
}
