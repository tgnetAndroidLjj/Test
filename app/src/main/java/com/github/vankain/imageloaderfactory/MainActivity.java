package com.github.vankain.imageloaderfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mIvUIL;
    ImageView mIvGlide;
    ImageView mIvPicasso;

    public int mLastFrameWorkType = 1;

//        public final static String url = "http://desk.fd.zol-img.com.cn/g5/M00/05/02/ChMkJ1bD1HCIY1ATAA-BspTxVL8AAKTXwOOeQsAD4HK484.jpg";
    public final static String url = "https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/abstract-factory/etc/abstract-factory_1.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIvUIL = (ImageView) findViewById(R.id.iv_uil);
        mIvGlide = (ImageView) findViewById(R.id.iv_glide);
    }

    public void loadUIL(View view) {
        loadPic(1);
    }

    public void loadGlide(View view) {
        loadPic(2);
    }

    public void loadPicasso(View view) {
        loadPic(3);
    }

    private void loadPic(int loadFrameworkType) {
        //清楚之前的缓存
        if (mLastFrameWorkType != loadFrameworkType) {
            ImageLoaderUtils.getFramework(mLastFrameWorkType)
                    .createImageLoader()
                    .cleanImageCache(url);
        }

        ImageConfigProduct configProduct = ImageLoaderUtils.getFramework(loadFrameworkType)
                .createImageConfig();
        configProduct.setDefaulRes(R.mipmap.icon_pic_loding);
        configProduct.setLoadingRes(R.mipmap.icon_pic_loding);
        configProduct.setFailRes(R.mipmap.icon_pic_errow);
        configProduct.setFadeIn(0);
        ImageLoaderUtils.getFramework(loadFrameworkType)
                .createImageLoader()
                .display(
                        url, mIvUIL, configProduct);
        mLastFrameWorkType = loadFrameworkType;
    }
}
