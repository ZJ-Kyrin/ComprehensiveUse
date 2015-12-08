package com.ui.csl.comprehensiveuse.MyViews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * @author chenshenglong
 * @since 2015/10/16
 */
public class ClearEditText extends EditText {

    //删除图标
    private Drawable mClearDrawable;

    public ClearEditText(Context context) {
        super(context);
    }

    public ClearEditText(Context context, AttributeSet attrs, int defStyleAttr, Drawable mClearDrawable) {
        super(context, attrs, defStyleAttr);
        this.mClearDrawable = mClearDrawable;
    }
}
