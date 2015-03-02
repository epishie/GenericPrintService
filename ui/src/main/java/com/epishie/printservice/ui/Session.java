package com.epishie.printservice.ui;

import android.app.Application;

import com.epishie.printservice.ui.di.component.Dagger_SessionComponent;
import com.epishie.printservice.ui.di.component.SessionComponent;

public class Session extends Application {

    private SessionComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mComponent = Dagger_SessionComponent.create();
    }

    public SessionComponent getComponent() {
        return mComponent;
    }
}
