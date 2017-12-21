package com.fstyle.androidtrainning.screen.main;

import android.util.Log;

import com.fstyle.androidtrainning.MainApplication;
import com.fstyle.androidtrainning.data.model.CharacterItem;
import com.fstyle.androidtrainning.data.source.remote.api.response.MarvelResponse;
import com.fstyle.androidtrainning.data.source.remote.api.service.APIService;
import com.fstyle.androidtrainning.screen.BaseRecyclerViewAdapter;
import com.fstyle.androidtrainning.screen.BaseViewModel;
import com.fstyle.androidtrainning.utils.rx.BaseSchedulerProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class MainCharacterViewModel extends BaseViewModel
        implements BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<CharacterItem> {

    private MainAdapter mAdapter;

    public MainCharacterViewModel(MainAdapter mainAdapter) {
        mAdapter = mainAdapter;
        mAdapter.setItemClickListener(this);
        fetchListHeroes();
    }

    @Override
    public void onItemRecyclerViewClick(CharacterItem item) {

    }

    public MainAdapter getAdapter() {
        return mAdapter;
    }

    @Override
    public void setSchedulerProvider(BaseSchedulerProvider schedulerProvider) {

    }


    private void fetchListHeroes() {
        APIService apiService = MainApplication.getMarvel().create(APIService.class);
        Call<MarvelResponse> call = apiService.getListHeroes();
        call.enqueue(new Callback<MarvelResponse>() {
            @Override
            public void onResponse(Call<MarvelResponse> call, Response<MarvelResponse> response) {
                List<CharacterItem> characterItems = response.body().getData().getResults();
                mAdapter.updateData(characterItems);
            }

            @Override
            public void onFailure(Call<MarvelResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}
