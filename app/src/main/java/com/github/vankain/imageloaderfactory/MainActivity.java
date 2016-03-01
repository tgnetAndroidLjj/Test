package com.github.vankain.imageloaderfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mIvUIL;
    public final static String url = "https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/abstract-factory/etc/abstract-factory_1.png";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIvUIL = (ImageView) findViewById(R.id.iv_uil);
    }

    public void loadUIL(View view){
        ImageConfigProduct configProduct = ImageLoaderUtils.getFramework()
                .createImageConfig();
        configProduct.setDefaulRes(R.mipmap.guide7_bg);
        configProduct.setLoadingRes(R.mipmap.guide8_bg);
        configProduct.setFailRes(R.mipmap.guide5_bg);
        ImageLoaderUtils.getFramework()
                .createImageLoader()
                .display(
                        url, mIvUIL, configProduct);
    }
}
