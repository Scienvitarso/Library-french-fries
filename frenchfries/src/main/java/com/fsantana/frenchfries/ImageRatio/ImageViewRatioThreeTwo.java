package com.fsantana.frenchfries.ImageRatio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by fsantana on 06/01/16.
 *
 */
public class ImageViewRatioThreeTwo extends ImageView {

    public ImageViewRatioThreeTwo(Context context) {
        super(context);
    }

    public ImageViewRatioThreeTwo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewRatioThreeTwo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("NewApi")
    public ImageViewRatioThreeTwo(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threetwo = MeasureSpec.getSize(widthMeasureSpec) * 2 / 3;
        int threetwoSpec = MeasureSpec.makeMeasureSpec(threetwo, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threetwoSpec);
    }
}
