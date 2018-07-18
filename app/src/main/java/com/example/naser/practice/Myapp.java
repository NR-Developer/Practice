package com.example.naser.practice;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class Myapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //  Font
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("IRANSansMobile.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build() );
    }

    }


