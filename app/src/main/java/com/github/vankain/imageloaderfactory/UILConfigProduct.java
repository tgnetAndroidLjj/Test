package com.github.vankain.imageloaderfactory;

/**
 * Created by Administrator on 2016/2/29.
 */
public class UILConfigProduct implements ImageConfigProduct {
    //default true
    public boolean supportMemoryCache;
    public boolean supportDiskCache;
    public int defaulRes;
    public int loadingRes;
    public int failRes;

    public UILConfigProduct() {
        this.supportMemoryCache = true;
        this.supportDiskCache = true;
        this.loadingRes = 0;
        this.failRes = 0;
    }

    @Override
    public void setDefaulRes(int defaulRes) {
        this.defaulRes = defaulRes;
    }

    @Override
    public void setLoadingRes(int loadingRes) {
        this.loadingRes = loadingRes;
    }

    @Override
    public void setFailRes(int failRes) {
        this.failRes = failRes;
    }

    @Override
    public void setsupportMemoryCache(boolean flag) {
        this.supportMemoryCache = flag;
    }

    @Override
    public void setsupportDiskCache(boolean flag) {
        this.supportDiskCache = flag;
    }

    @Override
    public Object get() {
        ImageLoaderWrapper.DisplayConfig config = new ImageLoaderWrapper.DisplayConfig.Builder().build();
        config.loadFailImageRes = this.loadingRes;
        config.loadFailImageRes = this.failRes;
        config.stubImageRes = this.defaulRes;
        config.supportMemoryCache = this.supportMemoryCache;
        config.supportDiskCache = this.supportDiskCache;
        return config;
    }
}
