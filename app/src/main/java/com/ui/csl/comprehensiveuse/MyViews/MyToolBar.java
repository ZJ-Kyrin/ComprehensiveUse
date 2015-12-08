package com.ui.csl.comprehensiveuse.MyViews;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @author chenshenglong
 * @since 2015/9/24
 */
public class MyToolBar extends Toolbar {

    private static final String TAG = "MyToolBar";

    public MyToolBar(Context context) {
        super(context);
    }

    public MyToolBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyToolBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        boolean handler = super.onTouchEvent(ev);

        return handler;
    }
}
