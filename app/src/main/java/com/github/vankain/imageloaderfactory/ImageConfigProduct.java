package com.github.vankain.imageloaderfactory;

/**
 * Created by Administrator on 2016/2/29.
 */
public interface ImageConfigProduct {
    void setDefaulRes(int defaulRes);
    void setLoadingRes(int loadingRes);
    void setFailRes(int failRes);
    void setsupportMemoryCache(boolean flag);
    void setsupportDiskCache(boolean flag);
    Object get();
}
