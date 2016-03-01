package com.github.vankain.imageloaderfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mIvUIL;
    ImageView mIvGlide;
    public final static String url = "http://desk.fd.zol-img.com.cn/g5/M00/05/02/ChMkJ1bD1HCIY1ATAA-BspTxVL8AAKTXwOOeQsAD4HK484.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIvUIL = (ImageView) findViewById(R.id.iv_uil);
        mIvGlide = (ImageView) findViewById(R.id.iv_glide);
    }

    public void loadUIL(View view){
        ImageConfigProduct configProduct = ImageLoaderUtils.getFramework()
                .createImageConfig();
        configProduct.setDefaulRes(R.mipmap.icon_pic_loding);
        configProduct.setLoadingRes(R.mipmap.icon_pic_loding);
        configProduct.setFailRes(R.mipmap.icon_pic_errow);
        ImageLoaderUtils.getFramework()
                .createImageLoader()
                .display(
                        url, mIvUIL, configProduct);
    }

    public void loadGlide(View view){
        ImageConfigProduct configProduct = ImageLoaderUtils.getFramework()
                .createImageConfig();
        configProduct.setDefaulRes(R.mipmap.icon_pic_loding);
        configProduct.setLoadingRes(R.mipmap.icon_pic_loding);
        configProduct.setFailRes(R.mipmap.icon_pic_errow);
        configProduct.setFadeIn(0);
        ImageLoaderUtils.getFramework()
                .createImageLoader()
                .display(
                        url, mIvUIL, configProduct);
    }
}
