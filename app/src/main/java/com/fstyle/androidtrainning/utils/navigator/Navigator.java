package com.fstyle.androidtrainning.utils.navigator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Patterns;

public class Navigator {

    @NonNull
    private Activity mActivity;
    @NonNull
    private Fragment mFragment;

    public Navigator(@NonNull Activity activity) {
        mActivity = activity;
    }

    public Navigator(@NonNull Fragment fragment) {
        mFragment = fragment;
        mActivity = fragment.getActivity();
    }

    private void startActivity(@NonNull Intent intent) {
        mActivity.startActivity(intent);
        setActivityTransactionAnimation(ActivityTransition.START);
    }

    public void startActivity(@NonNull Class<? extends Activity> clazz) {
        Intent intent = new Intent(mActivity, clazz);
        startActivity(intent);
    }

    public void startActivity(@NonNull Class<? extends Activity> clazz, Bundle args) {
        Intent intent = new Intent(mActivity, clazz);
        intent.putExtras(args);
        startActivity(intent);
    }

    public void startActivityAtRoot(@NonNull Class<? extends Activity> clazz) {
        Intent intent = new Intent(mActivity, clazz);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void startActivityForResult(@NonNull Intent intent, int requestCode) {
        mActivity.startActivityForResult(intent, requestCode);
        setActivityTransactionAnimation(ActivityTransition.START);
    }

    public void startActivityForResult(@NonNull Class<? extends Activity> clazz, Bundle args,
                                       int requestCode) {
        Intent intent = new Intent(mActivity, clazz);
        intent.putExtras(args);
        startActivityForResult(intent, requestCode);
    }

    public void finishActivity() {
        mActivity.finish();
        setActivityTransactionAnimation(ActivityTransition.FINISH);
    }

    public void finishActivityWithResult(Intent intent, int resultCode) {
        mActivity.setResult(resultCode, intent);
        finishActivity();
    }

    public void openUrl(String url) {
        if (TextUtils.isEmpty(url) || !Patterns.WEB_URL.matcher(url).matches()) {
            return;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url));
        startActivity(intent);
    }

    // Fragment

    /**
     * Go to next fragment which nested inside current fragment
     *
     * @param fragment new child fragment
     */
    public void goNextChildFragment(@IdRes int containerViewId, Fragment fragment,
                                    boolean addToBackStack, int animation, String tag) {
        FragmentTransaction transaction = mFragment.getChildFragmentManager().beginTransaction();
        setFragmentTransactionAnimation(transaction, animation);
        if (addToBackStack) {
            transaction.addToBackStack(fragment.getClass().getSimpleName());
        }
        transaction.replace(containerViewId, fragment, tag);
        transaction.commitAllowingStateLoss();
        mFragment.getChildFragmentManager().executePendingTransactions();
    }

    /**
     * Always keep 1 fragment in container
     *
     * @return true if fragment stack has pop
     */
    public boolean goBackChildFragment() {
        boolean isShowPrevious = mFragment.getChildFragmentManager().getBackStackEntryCount() > 1;
        if (isShowPrevious) {
            mFragment.getChildFragmentManager().popBackStackImmediate();
        }
        return isShowPrevious;
    }

    private void setFragmentTransactionAnimation(FragmentTransaction transaction,
            @NavigateAnim int animation) {
    }

    private void setActivityTransactionAnimation(@ActivityTransition int animation) {
    }
}
