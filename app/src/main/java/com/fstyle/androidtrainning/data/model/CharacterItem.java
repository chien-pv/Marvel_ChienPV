package com.fstyle.androidtrainning.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by framgia on 15/12/2017.
 */

public class CharacterItem extends BaseModel implements Parcelable{
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("modified")
    @Expose
    private String modified;

    public CharacterItem(Integer id, String name, String description, String modified) {
        this.name = name;
        this.description = description;
        this.modified = modified;
    }

    protected CharacterItem(Parcel in) {
        name = in.readString();
        description = in.readString();
        modified = in.readString();
    }

    public static final Parcelable.Creator<CharacterItem> CREATOR =
            new Parcelable.Creator<CharacterItem>() {
        @Override
        public CharacterItem createFromParcel(Parcel in) {
            return new CharacterItem(in);
        }

        @Override
        public CharacterItem[] newArray(int size) {
            return new CharacterItem[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeString(modified);
    }
}
