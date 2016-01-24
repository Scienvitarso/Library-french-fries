package com.fsantana.frenchfries;

import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.Display;

import  com.fsantana.frenchfries.Activitys.*;
import com.fsantana.frenchfries.ImageRatio.ImageViewRatioFourThree;
import com.fsantana.frenchfries.ImageRatio.ImageViewRatioOneOne;
import com.fsantana.frenchfries.ImageRatio.ImageViewRatioSixTeenNine;
import com.fsantana.frenchfries.ImageRatio.ImageViewRatioThreeFour;
import com.fsantana.frenchfries.ImageRatio.ImageViewRatioThreeTwo;
import com.fsantana.frenchfries.ImageRatio.ImageViewRatioTwoThree;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * @Brief Teste das imagens views customizadas com apect ratio diferenciados
 *
 * Todos os testes são na orientação Landscape
 * os aspect Ratio testados são os seguintes
 * 16:9
 * 3:2
 * 4:3
 * 1:1
 * 3:4
 * 2:3
 *
 * formula para o calculo Height = width / Aspect Ratio ou  Width = Height * Aspect Ratio
 * onde: Aspect Ratio é uma fração. exemplo 16:9 = 16/9
 *
 * @see <a href=http://www.google.com/design/spec/layout/metrics-keylines.html#metrics-keylines-ratio-keylines> Aspect Ratio Metrics</a>
 * Created by fsantana on 10/01/16.
 */
@RunWith(AndroidJUnit4.class)
public class ImageViewRatioLandScapeTest {


    private int getHeightRatio (int width, int numerator, int denominator) {
        return width * denominator / numerator;
    }


    @Rule
    public ActivityTestRule<ImageViewTestActivity> mActivityActivityTestRule =
            new ActivityTestRule<>(ImageViewTestActivity.class);

    private ImageViewTestActivity mImageViewTest;


    @Before
    public void setUp() throws InterruptedException {
        mImageViewTest = mActivityActivityTestRule.getActivity();
        mImageViewTest.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Thread.sleep(1000);
    }


    /**
     * Test para verficar se os atribudos width e height da View respeitam o Ratio 4:3
     */
    @Test
    public void testImageViewRatioFourThree () {
        //get display info
        Display display = mImageViewTest.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        //set x and y pixels
        int widthDisplay = point.x;

        ImageViewRatioFourThree imageViewRatioFourThree = (ImageViewRatioFourThree)
                mImageViewTest.findViewById(R.id.imageview_ratio_four_three);
        //test width
        assertThat(imageViewRatioFourThree.getWidth(), is(equalTo(widthDisplay)));
        //test height
        assertThat(imageViewRatioFourThree.getHeight(),
                is(equalTo(getHeightRatio(widthDisplay,4,3))));
    }


    /**
     * Test para verficar se os atribudos width e height da View respeitam o Ratio 1:1
     */
    @Test
    public void testImageViewRatioOneOne () {
        //get display info
        Display display = mImageViewTest.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        //set x and y pixels
        int widthDisplay = point.x;

        ImageViewRatioOneOne imageViewRatioFourThree = (ImageViewRatioOneOne)
                mImageViewTest.findViewById(R.id.imageview_ratio_one_one);
        //test width
        assertThat(imageViewRatioFourThree.getWidth(), is(equalTo(widthDisplay)));
        //test height
        assertThat(imageViewRatioFourThree.getHeight(),
                is(equalTo(getHeightRatio(widthDisplay,1,1))));
    }


    /**
     * Test para verficar se os atribudos width e height da View respeitam o Ratio 16:9
     */
    @Test
    public void testImageViewRatioSixTeenNine () {
        //get display info
        Display display = mImageViewTest.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        //set x and y pixels
        int widthDisplay = point.x;

        ImageViewRatioSixTeenNine imageViewRatioFourThree = (ImageViewRatioSixTeenNine)
                mImageViewTest.findViewById(R.id.imageview_ratio_sixteen_nine);
        //test width
        assertThat(imageViewRatioFourThree.getWidth(), is(equalTo(widthDisplay)));
        //test height
        assertThat(imageViewRatioFourThree.getHeight(),
                is(equalTo(getHeightRatio(widthDisplay,16,9))));
    }


     /**
     * Test para verficar se os atribudos width e height da View respeitam o Ratio 3:4
     */
    @Test
    public void testImageViewRatioThreeFour () {
        //get display info
        Display display = mImageViewTest.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        //set x and y pixels
        int widthDisplay = point.x;

        ImageViewRatioThreeFour imageViewRatioFourThree = (ImageViewRatioThreeFour)
                mImageViewTest.findViewById(R.id.imageview_ratio_three_four);
        //test width
        assertThat(imageViewRatioFourThree.getWidth(), is(equalTo(widthDisplay)));
        //test height
        assertThat(imageViewRatioFourThree.getHeight(),
                is(equalTo(getHeightRatio(widthDisplay,3,4))));
    }


     /**
     * Test para verficar se os atribudos width e height da View respeitam o Ratio 3:2
     */
    @Test
    public void testImageViewRatioThreeTwo () {
        //get display info
        Display display = mImageViewTest.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        //set x and y pixels
        int widthDisplay = point.x;

        ImageViewRatioThreeTwo imageViewRatioFourThree = (ImageViewRatioThreeTwo)
                mImageViewTest.findViewById(R.id.imageview_ratio_three_two);
        //test width
        assertThat(imageViewRatioFourThree.getWidth(), is(equalTo(widthDisplay)));
        //test height
        assertThat(imageViewRatioFourThree.getHeight(),
                is(equalTo(getHeightRatio(widthDisplay,3,2))));
    }


    /**
     * Test para verficar se os atribudos width e height da View respeitam o Ratio 2:3
     */
    @Test
    public void testImageViewRatioeTwoThree () {
        //get display info
        Display display = mImageViewTest.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        //set x and y pixels
        int widthDisplay = point.x;

        ImageViewRatioTwoThree imageViewRatioFourThree = (ImageViewRatioTwoThree)
                mImageViewTest.findViewById(R.id.imageview_ratio_two_three);
        //test width
        assertThat(imageViewRatioFourThree.getWidth(), is(equalTo(widthDisplay)));
        //test height
        assertThat(imageViewRatioFourThree.getHeight(),
                is(equalTo(getHeightRatio(widthDisplay, 2, 3))));
    }
}
