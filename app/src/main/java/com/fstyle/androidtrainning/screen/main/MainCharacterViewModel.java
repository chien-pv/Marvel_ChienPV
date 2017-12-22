package com.fstyle.androidtrainning.screen.main;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.fstyle.androidtrainning.MainApplication;
import com.fstyle.androidtrainning.data.model.CharacterItem;
import com.fstyle.androidtrainning.data.source.remote.api.response.MarvelResponse;
import com.fstyle.androidtrainning.data.source.remote.api.service.APIService;
import com.fstyle.androidtrainning.screen.BaseRecyclerViewAdapter;
import com.fstyle.androidtrainning.screen.BaseViewModel;
import com.fstyle.androidtrainning.screen.detail_character.DetailCharacterActivity;
import com.fstyle.androidtrainning.utils.navigator.Navigator;
import com.fstyle.androidtrainning.utils.rx.BaseSchedulerProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;
import static com.fstyle.androidtrainning.utils.Constant.ARGUMENT_CHARACTER;

public class MainCharacterViewModel extends BaseViewModel
        implements BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<CharacterItem> {

    private MainAdapter mAdapter;
    private Navigator mNavigator;

    public MainCharacterViewModel(MainAdapter mainAdapter) {
        mAdapter = mainAdapter;
        mAdapter.setItemClickListener(this);
        fetchListHeroes();
    }

    @Override
    public void onItemRecyclerViewClick(View view, CharacterItem item) {
        Context context = view.getContext();
        Intent intent = new Intent(context, DetailCharacterActivity.class);
        intent.putExtra(ARGUMENT_CHARACTER, item);
        context.startActivity(intent);
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
