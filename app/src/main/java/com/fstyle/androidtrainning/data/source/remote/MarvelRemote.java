package com.fstyle.androidtrainning.data.source.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by framgia on 19/12/2017.
 */

public abstract class MarvelRemote {
    public static Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("http://gateway.marvel.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
