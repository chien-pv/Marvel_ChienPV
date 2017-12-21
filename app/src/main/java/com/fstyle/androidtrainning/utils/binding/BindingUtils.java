package com.fstyle.androidtrainning.utils.binding;

import android.databinding.BindingAdapter;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.fstyle.androidtrainning.R;
import com.squareup.picasso.Picasso;

public final class BindingUtils {

    private BindingUtils() {
        // No-op
    }

    /**
     * setErrorMessage for TextInputLayout
     */
    @BindingAdapter({ "errorText" })
    public static void setErrorMessage(TextInputLayout view, String errorMessage) {
        view.setError(errorMessage);
    }

    /**
     * setAdapter For RecyclerView
     */
    @BindingAdapter({ "recyclerAdapter" })
    public static void setAdapterForRecyclerView(RecyclerView recyclerView,
            RecyclerView.Adapter adapter) {
        recyclerView.setAdapter(adapter);
    }

    @BindingAdapter({"app:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .placeholder(R.drawable.favorites)
                .into(view);
    }
}
