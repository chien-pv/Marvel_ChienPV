package com.fstyle.androidtrainning.screen.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.fstyle.androidtrainning.R;
import com.fstyle.androidtrainning.data.model.CharacterItem;
import com.fstyle.androidtrainning.databinding.CharacterMainBinding;
import com.fstyle.androidtrainning.screen.BaseActivity;
import com.fstyle.androidtrainning.utils.Constant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private static final String TAG = MainActivity.class.getName();

    private MainCharacterViewModel mViewModel;
    private List<CharacterItem> characters = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        characters = getIntent().getParcelableArrayListExtra(Constant.ARGUMENT_LIST_CHARACTER);
        MainAdapter mainAdapter = new MainAdapter(this, (characters));
        mViewModel = new MainCharacterViewModel(mainAdapter);
        CharacterMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.character_main);
        binding.setViewModel(mViewModel);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_favorite) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
