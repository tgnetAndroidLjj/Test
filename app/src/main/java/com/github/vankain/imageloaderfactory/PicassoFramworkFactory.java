package com.github.vankain.imageloaderfactory;

/**
 * Created by Administrator on 2016/3/2.
 */
public class PicassoFramworkFactory implements ImageFrameworkFactory {
    @Override
    public ImageLoaderProduct createImageLoader() {
        return new PicassoLoaderProduct();
    }

    @Override
    public ImageConfigProduct createImageConfig() {
        return new PicassoConfigProduct();
    }
}
