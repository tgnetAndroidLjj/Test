package com.github.vankain.imageloaderfactory;

import android.content.Context;

import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2016/3/1.
 */
public class PicassoWrapper {
    private static PicassoWrapper sDefaultInstance;
    private Context mContext;

    public PicassoWrapper(Context context) {
        mContext = context;
    }

    public static PicassoWrapper init(Context context) {
        if (sDefaultInstance == null) {
            sDefaultInstance = new PicassoWrapper(context);
        }
        return sDefaultInstance;
    }


    public static PicassoWrapper getDefalt() {
        if (sDefaultInstance == null) {
            throw new RuntimeException(
                    "Must be call init(Context) befor!");
        }
        return sDefaultInstance;
    }


    public Picasso getPicasso(){
        Picasso.with(mContext).setIndicatorsEnabled(true);
        return Picasso.with(mContext);
    }

}
