package com.example.project;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class RecyclerViewSpacing extends RecyclerView.ItemDecoration {

    private int spacingRight;
    private int spacingBottom;

    public RecyclerViewSpacing(int spacingRight, int spacingBottom) {
        this.spacingRight = spacingRight;
        this.spacingBottom = spacingBottom;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.right = spacingRight;
        outRect.bottom = spacingBottom;
    }
}
