package com.n.minecomponent;

import android.app.Application;

import com.n.componentlib.AppCompat;
import com.n.componentlib.ServiceFactory;

public class MineApplication extends Application  implements AppCompat {

    @Override
    public void onCreate() {
        super.onCreate();
    }
    private static Application application;
    private static Application getApplication(){
        return  application;
    };
    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setmMineService(new MineService());
    }
}
