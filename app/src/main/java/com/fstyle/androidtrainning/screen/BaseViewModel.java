package com.fstyle.androidtrainning.screen;

import android.databinding.BaseObservable;
import com.fstyle.androidtrainning.utils.rx.BaseSchedulerProvider;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * BaseViewModel
 */
public abstract class BaseViewModel extends BaseObservable {
    private final CompositeSubscription mCompositeSubscription;

    public BaseViewModel() {
        mCompositeSubscription = new CompositeSubscription();
    }

    public void onStart() {
    }

    public void onStop() {
        stopSubscriptions();
    }

    public void startSubscriber(Subscription subscription) {
        mCompositeSubscription.add(subscription);
    }

    private void stopSubscriptions() {
        mCompositeSubscription.clear();
    }

    public abstract void setSchedulerProvider(BaseSchedulerProvider schedulerProvider);
}
