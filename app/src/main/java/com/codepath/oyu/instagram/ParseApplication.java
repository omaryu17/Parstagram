package com.codepath.oyu.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Vr3YLF44EKgx6mVe7JfjkYlnnYEvxNWsKIAxt1N8")
                .clientKey("YjX1rIemzwM4DckkfXdQf9x7O5Vlwde1a2F8whFf")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
