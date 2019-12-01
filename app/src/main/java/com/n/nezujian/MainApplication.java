package com.n.nezujian;

import android.app.Application;

import com.n.componentlib.AppCompat;
import com.n.componentlib.AppConfig;

public class MainApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        for (String component: AppConfig.COMPONENTS){
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof AppCompat){
                    ((AppCompat)object).initializa(this);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
