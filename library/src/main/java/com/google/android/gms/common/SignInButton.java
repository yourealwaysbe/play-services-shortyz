
package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;

public class SignInButton extends FrameLayout {
    public SignInButton(Context context, AttributeSet as) {
        super(context, as);
        LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
                                                LayoutParams.WRAP_CONTENT);
        TextView notAvailable = new TextView(context);
        notAvailable.setLayoutParams(lparams);
        notAvailable.setText("Not available");
        addView(notAvailable);
    }
}
