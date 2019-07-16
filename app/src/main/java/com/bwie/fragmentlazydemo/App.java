package com.bwie.fragmentlazydemo;

import android.app.Application;
import android.app.IntentService;
import android.content.Context;

public class App extends Application {


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

    }

    @Override
    public void onCreate() {
        super.onCreate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //freco初始化
                initFresco();

                //bugly初始化


                //leakcanary初始化

                //高德地图初始化
                initGd();
            }
        }).start();


    }

    private void initGd() {

    }

    private void initFresco() {

    }
}
