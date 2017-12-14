package com.fstyle.androidtrainning.utils.navigator;

import android.support.annotation.IntDef;

@IntDef({ ActivityTransition.NONE, ActivityTransition.START, ActivityTransition.FINISH })
@interface ActivityTransition {
    int NONE = 0x00;
    int START = 0x01;
    int FINISH = 0x02;
}
