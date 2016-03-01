package com.github.vankain.imageloaderfactory;

/**
 * Created by Administrator on 2016/2/29.
 */
public interface ImageFrameworkFactory {
    ImageLoaderProduct createImageLoader();
    ImageConfigProduct createImageConfig();
}
