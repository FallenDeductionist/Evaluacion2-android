package com.fallendeductionist.evaluacion2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExampleResult implements Parcelable {

    private int mImageResource;
    private String mText1;
    private String mText2;
    private String mText3;
    private String mText4;


    public ExampleResult(int imageResource, String text1, String text2, String text3, String text4){
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        mText3 = text3;
        mText4 = text4;
    }



    protected ExampleResult(Parcel in) {
        mImageResource = in.readInt();
        mText1 = in.readString();
        mText2 = in.readString();
        mText3 = in.readString();
        mText4 = in.readString();
    }

    public static final Creator<ExampleResult> CREATOR = new Creator<ExampleResult>() {
        @Override
        public ExampleResult createFromParcel(Parcel in) {
            return new ExampleResult(in);
        }

        @Override
        public ExampleResult[] newArray(int size) {
            return new ExampleResult[size];
        }
    };

    public int getImageResource() {
        return mImageResource;
    }

    public String getText1() {
        return mText1;
    }

    public String getText2() { return mText2; }

    public String getText3() { return mText3; }

    public String getText4() { return mText4; }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResource);
        dest.writeString(mText1);
        dest.writeString(mText2);
        dest.writeString(mText3);
        dest.writeString(mText4);
    }
}