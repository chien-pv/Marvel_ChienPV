package com.fstyle.androidtrainning.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by framgia on 15/12/2017.
 */

public class CharacterList {
    public CharacterList(List<Character> items) {
        this.items = items;
    }

    @SerializedName("total_count")
    @Expose
    private int totalCount;

    @SerializedName("items")
    @Expose
    private List<Character> items = new ArrayList<>();

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Character> getItems() {
        return items;
    }

    public void setItems(List<Character> items) {
        this.items = items;
    }
}
