package com.fsantana.frenchfries.ImageRatio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by fsantana on 06/01/16.
 */
public class ImageViewRatioTwoThree extends ImageView {
    public ImageViewRatioTwoThree(Context context) {
        super(context);
    }

    public ImageViewRatioTwoThree(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewRatioTwoThree(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("NewApi")
    public ImageViewRatioTwoThree(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int twoTrhee = MeasureSpec.getSize(widthMeasureSpec) * 3 / 2;
        int twoTrheeSpec = MeasureSpec.makeMeasureSpec(twoTrhee, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, twoTrheeSpec);
    }
}
