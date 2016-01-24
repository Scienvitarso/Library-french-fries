package com.fsantana.frenchfries.ImageRatio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by fsantana on 06/01/16.
 */
public class ImageViewRatioThreeFour extends ImageView {
    public ImageViewRatioThreeFour(Context context) {
        super(context);
    }

    public ImageViewRatioThreeFour(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewRatioThreeFour(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("NewApi")
    public ImageViewRatioThreeFour(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeFour = MeasureSpec.getSize(widthMeasureSpec) * 4 / 3;
        int threeFourSpec = MeasureSpec.makeMeasureSpec(threeFour, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threeFourSpec);
    }
}
