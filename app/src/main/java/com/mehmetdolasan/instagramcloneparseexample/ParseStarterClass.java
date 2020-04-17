package com.mehmetdolasan.instagramcloneparseexample;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("qPJ2aJb6vh1tNJYm6FxaXdoOd5oclfa5X8x4WlZ9")
                .clientKey("g13DTcIW1SzCvArfPQXKJOjtc03oUxzQPP3KYn98")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
