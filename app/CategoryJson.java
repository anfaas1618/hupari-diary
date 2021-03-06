
package com.example.huparidiary;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryJson {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("name")
    @Expose
    private String name;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
