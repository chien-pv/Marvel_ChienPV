package com.fstyle.androidtrainning.screen.main;

import android.databinding.BaseObservable;
import android.view.View;
import com.fstyle.androidtrainning.data.model.CharacterItem;
import com.fstyle.androidtrainning.screen.BaseRecyclerViewAdapter;

public class ItemViewModel  extends BaseObservable {
    private CharacterItem mCharacter;
    private BaseRecyclerViewAdapter
            .OnRecyclerViewItemClickListener<CharacterItem> mItemClickListener;

    public ItemViewModel(CharacterItem character,
                         BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<CharacterItem>
                                 listener) {
        mCharacter = character;
        mItemClickListener = listener;
    }

    public String getName() {
        return mCharacter.getName();
    }

    public String getDescription() {
        return mCharacter.getDescription();
    }

    public String getImageUrl() {
        return mCharacter.getThumbnail().getPath() + "." + mCharacter.getThumbnail().getExtension();
    }

    public void onItemClicked(View view) {
        if (mItemClickListener == null) {
            return;
        }
        mItemClickListener.onItemRecyclerViewClick(view, mCharacter);
    }

}
