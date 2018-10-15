package com.smtel.sample;

import android.app.Application;

import com.smtel.sample.di.AppComponent;

public class AppAplication extends Application {

    private static AppComponent component;
    private static AppAplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
//        component = DaggerAppComponent
//                .builder()
//                .commonModule(new CommonModule())
//                .connectionModule(new ConnectionModule())
//                .build();

    }

    public static AppComponent getComponent() {
        return component;
    }

    public static AppAplication getInstance() {
        return instance;
    }
}
