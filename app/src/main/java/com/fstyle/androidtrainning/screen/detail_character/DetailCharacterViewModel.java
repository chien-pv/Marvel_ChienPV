package com.fstyle.androidtrainning.screen.detail_character;

import com.fstyle.androidtrainning.data.model.CharacterItem;
import com.fstyle.androidtrainning.screen.BaseViewModel;
import com.fstyle.androidtrainning.utils.rx.BaseSchedulerProvider;

/**
 * Created by framgia on 22/12/2017.
 */

public class DetailCharacterViewModel extends BaseViewModel {
    private CharacterItem mCharacter;

    @Override
    public void setSchedulerProvider(BaseSchedulerProvider schedulerProvider) {

    }

    public DetailCharacterViewModel(CharacterItem character) {
        mCharacter = character;
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
}
