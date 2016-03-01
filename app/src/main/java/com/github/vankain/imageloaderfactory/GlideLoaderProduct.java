package com.github.vankain.imageloaderfactory;

import android.widget.ImageView;

/**
 * Created by Administrator on 2016/3/1.
 */
public class GlideLoaderProduct implements ImageLoaderProduct {
    @Override
    public void display(String imageUri, ImageView imageView) {
        GlideWrapper.getDefalt()
                .getGlide()
                .load(imageUri)
                .centerCrop()
                .into(imageView);
    }

    @Override
    public void display(String imageUrl, ImageView imageView, ImageConfigProduct config) {
        GlideConfigProduct mConfig = (GlideConfigProduct) config.get();
        GlideWrapper.getDefalt()
                .getGlide()
                .load(imageUrl)
                .centerCrop()
                .override(400, 400) // resizes the image to these dimensions (in pixel)
                .placeholder(mConfig.loadingRes) // can also be a drawable
                .error(mConfig.failRes) // will be displayed if the image cannot be loaded
                .crossFade(mConfig.duration)
                .into(imageView);
    }

    @Override
    public void cleanImageCache(String imageUrl) {

    }
}
