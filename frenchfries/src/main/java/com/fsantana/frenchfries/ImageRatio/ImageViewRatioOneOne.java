package com.fsantana.frenchfries.ImageRatio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by fsantana on 06/01/16.
 */
public class ImageViewRatioOneOne extends ImageView {
    public ImageViewRatioOneOne(Context context) {
        super(context);
    }

    public ImageViewRatioOneOne(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewRatioOneOne(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("NewApi")
    public ImageViewRatioOneOne(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
