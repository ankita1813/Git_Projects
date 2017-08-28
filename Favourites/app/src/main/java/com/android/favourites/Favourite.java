package com.android.favourites;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

/**
 * Created by ankita on 29/8/17.
 */
public class Favourite implements Parcelable{

    private String imageUrl;
    private String title;
    private String desc;
    private String type;
    private long viewCount;

    public Favourite(JSONObject jsonObject){
        if(jsonObject != null){
            imageUrl = jsonObject.optString("imageUrl");
            title = jsonObject.optString("title");
            desc = jsonObject.optString("desc");
            type = jsonObject.optString("type");
            viewCount = jsonObject.optLong("view-count");
        }
    }

    protected Favourite(Parcel in) {
        imageUrl = in.readString();
        title = in.readString();
        desc = in.readString();
        type = in.readString();
        viewCount = in.readLong();
    }

    public static final Creator<Favourite> CREATOR = new Creator<Favourite>() {
        @Override
        public Favourite createFromParcel(Parcel in) {
            return new Favourite(in);
        }

        @Override
        public Favourite[] newArray(int size) {
            return new Favourite[size];
        }
    };

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public long getViewCount() {
        return viewCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(imageUrl).append("\n")
                .append(title).append("\n")
                .append(desc).append("\n")
                .append(type).append("\n")
                .append(viewCount).append("]").append("\n\n");

        return sb.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(imageUrl);
        parcel.writeString(title);
        parcel.writeString(desc);
        parcel.writeString(type);
        parcel.writeLong(viewCount);
    }
}
