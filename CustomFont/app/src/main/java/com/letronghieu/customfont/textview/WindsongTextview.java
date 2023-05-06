package com.letronghieu.customfont.textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class WindsongTextview extends AppCompatTextView {
    public WindsongTextview(@NonNull Context context) {
        super(context);
        setFontTextview();
    }

    public WindsongTextview(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontTextview();
    }

    public WindsongTextview(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontTextview();
    }
    private void  setFontTextview(){
        Typeface typeface = Utils.getWindsongTypeface(getContext());
        setTypeface(typeface);
    }
}
