package com.fsantana.frenchfries.ImageRatio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by fsantana on 06/01/16.
 */
public class ImageViewRatioSixTeenNine extends ImageView {
    public ImageViewRatioSixTeenNine(Context context) {
        super(context);
    }

    public ImageViewRatioSixTeenNine(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewRatioSixTeenNine(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("NewApi")
    public ImageViewRatioSixTeenNine(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int sixTeenNine = MeasureSpec.getSize(widthMeasureSpec) * 9 / 16;
        int sixTeenNineSpec = MeasureSpec.makeMeasureSpec(sixTeenNine, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, sixTeenNineSpec);
    }

}
