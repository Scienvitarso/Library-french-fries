package com.fsantana.frenchfries.ImageRatio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by fsantana on 06/01/16.
 */
public class ImageViewRatioFourThree extends ImageView {
    public ImageViewRatioFourThree(Context context) {
        super(context);
    }

    public ImageViewRatioFourThree(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewRatioFourThree(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @SuppressLint("NewApi")
    public ImageViewRatioFourThree(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int fourThree = MeasureSpec.getSize(widthMeasureSpec) * 3 / 4;
        int fourThreeSpec = MeasureSpec.makeMeasureSpec(fourThree, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, fourThreeSpec);
    }
}
