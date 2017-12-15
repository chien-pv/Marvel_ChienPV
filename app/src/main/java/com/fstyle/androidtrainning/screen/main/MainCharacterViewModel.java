package com.fstyle.androidtrainning.screen.main;

import com.fstyle.androidtrainning.data.model.CharacterItem;
import com.fstyle.androidtrainning.screen.BaseRecyclerViewAdapter;
import com.fstyle.androidtrainning.screen.BaseViewModel;
import com.fstyle.androidtrainning.utils.rx.BaseSchedulerProvider;

public class MainCharacterViewModel extends BaseViewModel
        implements BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<CharacterItem> {

    private MainAdapter mAdapter;

    public MainCharacterViewModel(MainAdapter adapter) {
        mAdapter = adapter;
        mAdapter.setItemClickListener(this);
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
}
