package com.fstyle.androidtrainning.screen.main;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.fstyle.androidtrainning.R;
import com.fstyle.androidtrainning.data.model.CharacterItem;
import com.fstyle.androidtrainning.databinding.ItemCharacterBinding;
import com.fstyle.androidtrainning.screen.BaseRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by framgia on 15/12/2017.
 */

public class MainAdapter extends BaseRecyclerViewAdapter<MainAdapter.ItemViewHolder> {

    private List<CharacterItem> mCharacters;
    private BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<CharacterItem>
            mItemClickListener;

    protected MainAdapter(@NonNull Context context, List<CharacterItem> characters) {
        super(context);
        mCharacters = new ArrayList<>();
        if (characters == null) {
            return;
        }
        mCharacters.addAll(characters);
    }

    @Override
    public MainAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemCharacterBinding binding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_character, parent, false);
        return new ItemViewHolder(binding, mItemClickListener);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.bind(mCharacters.get(position));
    }

    @Override
    public int getItemCount() {
        return mCharacters.size();
    }

    public void setItemClickListener(OnRecyclerViewItemClickListener<CharacterItem>
                                             itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    /**
     * ItemViewHolder
     */
    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private ItemCharacterBinding mBinding;
        private BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<CharacterItem>
                mItemClickListener;

        ItemViewHolder(ItemCharacterBinding binding,
                       BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<CharacterItem>
                               listener) {
            super(binding.getRoot());
            mBinding = binding;
            mItemClickListener = listener;
        }

        public void bind(CharacterItem character) {
            mBinding.setViewModel(new ItemViewModel(character, mItemClickListener));
            mBinding.executePendingBindings();
        }
    }
}
