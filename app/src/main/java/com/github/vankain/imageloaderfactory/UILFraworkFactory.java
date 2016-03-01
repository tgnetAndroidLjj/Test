package com.github.vankain.imageloaderfactory;

/**
 * Created by Administrator on 2016/2/29.
 */
public class UILFraworkFactory implements ImageFrameworkFactory {
    @Override
    public ImageLoaderProduct createImageLoader() {
        return new UILLoaderProduct();
    }

    @Override
    public ImageConfigProduct createImageConfig(){
        return new UILConfigProduct();
    }
}
