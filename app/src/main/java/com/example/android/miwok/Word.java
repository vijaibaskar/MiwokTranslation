package com.example.android.miwok;

/**
 * Created by sathyajb on 6/9/18.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranlation, String miwokTranslation){
        mDefaultTranslation = defaultTranlation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }


}
