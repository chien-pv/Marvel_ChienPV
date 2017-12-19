package com.fstyle.androidtrainning.data.source.remote.api.service;


import com.fstyle.androidtrainning.data.source.remote.api.response.MarvelResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("/v1/public/characters?apikey=7a4ee917fb53941ccc691445dac51ef7&"
            + "hash=d68af7429d2507d9bd9e21af20b412f2&ts=1513072715795")
    Call<MarvelResponse> getListHeroes();
}
