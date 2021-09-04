package com.reshadev.mybucketlist;

import androidx.annotation.DrawableRes;

public class Project {
    String title;
    String description;
    int image;

    public Project(String title, String description,@DrawableRes int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }
}
//Used by in the adapter