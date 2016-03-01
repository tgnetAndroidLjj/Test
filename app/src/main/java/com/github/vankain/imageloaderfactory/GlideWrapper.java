package com.github.vankain.imageloaderfactory;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

/**
 * Created by Administrator on 2016/3/1.
 */
public class GlideWrapper {
    private static GlideWrapper sDefaultInstance;
    private Context mContext;

    public GlideWrapper(Context context) {
        mContext = context;
    }

    public static GlideWrapper init(Context context) {
        if (sDefaultInstance == null) {
            sDefaultInstance = new GlideWrapper(context);
        }
        return sDefaultInstance;
    }


    public static GlideWrapper getDefalt() {
        if (sDefaultInstance == null) {
            throw new RuntimeException(
                    "Must be call init(Context) befor!");
        }
        return sDefaultInstance;
    }


    public RequestManager getGlide(){
        return Glide.with(mContext);
    }

}
