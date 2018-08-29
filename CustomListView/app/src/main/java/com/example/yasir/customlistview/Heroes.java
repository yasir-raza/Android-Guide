package com.example.yasir.customlistview;

/**
 * Created by Yasir on 8/28/2018.
 */

public class Heroes {
        int image;
        String title,subTitle;

        public Heroes(int image, String title, String subTitle) {
            this.image = image;
            this.title = title;
            this.subTitle = subTitle;
        }

        public int getImage() {
            return image;
        }

        public String getTitle() {
            return title;
        }

        public String getSubTitle() {
            return subTitle;
        }
}
