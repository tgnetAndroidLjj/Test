package com.github.vankain.imageloaderfactory;

import android.content.Context;

import java.io.File;

/**
 * Created by Administrator on 2016/2/29.
 */
public class ImageLoaderUtils {
    public static void init(Context context, File file, boolean debug){
//            if() 写在配置文件，根据不同的配置创建不同的图片加载器
        // 初始化图片加载器模块
        ImageLoaderWrapper.initDefault(context, file,
                debug);
        GlideWrapper.init(context);
    }

    public static ImageFrameworkFactory getFramework(){
//        if(type == 1){
            return new UILFraworkFactory();
//        } else {
//            return new GlideFrameworkFactory();
//        }
    }

}
