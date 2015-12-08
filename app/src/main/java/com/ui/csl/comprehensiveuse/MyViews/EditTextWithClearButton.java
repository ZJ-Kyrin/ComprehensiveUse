package com.ui.csl.comprehensiveuse.MyViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.ui.csl.comprehensiveuse.R;

/**
 * @author chenshenglong
 * @since 2015/9/23
 */
public class EditTextWithClearButton extends LinearLayout {
    private EditText editText;
    private ImageButton imgBtn;

    public EditTextWithClearButton(Context context) {
        super(context);
    }

    public EditTextWithClearButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    private void init(Context context, AttributeSet attributeSet) {

        View view = LayoutInflater.from(context).inflate(R.layout.edit_with_clear, this, true);
        editText = (EditText) findViewById(R.id.et_clear);
        imgBtn = (ImageButton) findViewById(R.id.img_btn);

        imgBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (charSequence.length() > 0) {
                    imgBtn.setVisibility(View.VISIBLE);
                } else {
                    imgBtn.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        //将属性值设置到控件中去
        TypedArray array = context.obtainStyledAttributes(attributeSet, R.styleable.EditTextWithClearButton);
        CharSequence hint = array.getText(R.styleable.EditTextWithClearButton_hint);
        CharSequence text = array.getText(R.styleable.EditTextWithClearButton_text);
        if (text != null && !TextUtils.isEmpty(text.toString().trim())) {
            editText.setText(text);
            //设置光标位置
            editText.setSelection(text.length());
            this.imgBtn.setVisibility(View.VISIBLE);
        } else {
            if (hint != null && !TextUtils.isEmpty(hint.toString().trim())) {
                editText.setHint(hint);
            }
        }
        array.recycle();
    }

    /**
     * 获得输入的值
     *
     * @return
     */
    public String getText() {
        return this.editText.getText().toString();
    }

    /**
     * 设置值
     *
     * @param text
     */
    public void setText(String text) {
        this.editText.setText(text);
    }

    /**
     * 设置默认值
     *
     * @param hint
     */
    public void setHint(String hint) {
        this.editText.setHint(hint);
    }

    /**
     * 获得输入框控件
     *
     * @return
     */
    public EditText getEditText() {
        return this.editText;
    }

    /**
     * 获得消除按钮
     *
     * @return
     */
    public ImageButton getClearImageButton() {
        return this.imgBtn;
    }


}
