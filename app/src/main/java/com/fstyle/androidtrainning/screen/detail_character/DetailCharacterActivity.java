package com.fstyle.androidtrainning.screen.detail_character;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.fstyle.androidtrainning.R;
import com.fstyle.androidtrainning.data.model.CharacterItem;
import com.fstyle.androidtrainning.databinding.DetailCharacterBinding;
import com.fstyle.androidtrainning.screen.BaseActivity;

import static com.fstyle.androidtrainning.utils.Constant.ARGUMENT_CHARACTER;

/**
 * Created by framgia on 22/12/2017.
 */

public class DetailCharacterActivity extends BaseActivity {
    private DetailCharacterViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CharacterItem item = (CharacterItem) getIntent().getSerializableExtra(ARGUMENT_CHARACTER);
        mViewModel = new DetailCharacterViewModel(item);
        DetailCharacterBinding binding =
                DataBindingUtil.setContentView(this, R.layout.detail_character);

        binding.setViewModel(mViewModel);
    }
}
