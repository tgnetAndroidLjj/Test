package com.github.vankain.imageloaderfactory;

/**
 * Created by Administrator on 2016/2/29.
 */
public class GlideFrameworkFactory implements ImageFrameworkFactory {

    @Override
    public ImageLoaderProduct createImageLoader() {
        return new GlideLoaderProduct();
    }

    @Override
    public ImageConfigProduct createImageConfig() {
        return new GlideConfigProduct();
    }
}
