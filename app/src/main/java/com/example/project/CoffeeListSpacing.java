package com.example.project;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class CoffeeListSpacing extends RecyclerView.ItemDecoration {

    private int bottomSpacing;

    public CoffeeListSpacing(int bottomSpacing) {
        this.bottomSpacing = bottomSpacing;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.bottom = bottomSpacing;
    }
}
