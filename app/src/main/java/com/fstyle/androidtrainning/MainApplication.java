package com.fstyle.androidtrainning;

import android.app.Application;

import com.fstyle.androidtrainning.data.source.remote.MarvelRemote;

import retrofit2.Retrofit;

public class MainApplication extends Application {
    private static Retrofit mMarvelRemote;
    @Override
    public void onCreate() {
        super.onCreate();
        if (mMarvelRemote == null) {
            mMarvelRemote = MarvelRemote.createRetrofit();
        }
    }

    public static Retrofit getMarvel() {
        return mMarvelRemote;
    }

}
