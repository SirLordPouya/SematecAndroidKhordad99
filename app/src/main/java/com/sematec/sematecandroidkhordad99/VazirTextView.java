package com.sematec.sematecandroidkhordad99;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class VazirTextView extends androidx.appcompat.widget.AppCompatTextView {

    public VazirTextView(Context context) {
        super(context);
    }

    public VazirTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface vazirTypeface = Typeface.createFromAsset(context.getAssets(), "vazir.ttf");
        this.setTypeface(vazirTypeface);
    }
}
