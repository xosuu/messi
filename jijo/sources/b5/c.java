package b5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import d0.f;
import g4.a0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static Drawable b(Context context, int i10) {
        ColorStateList colorStateListC;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i10, i10, i10, i10);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        TypedValue typedValueU = a0.u(context, R.attr.gu);
        if (typedValueU != null) {
            int i11 = typedValueU.resourceId;
            colorStateListC = i11 != 0 ? f.c(context, i11) : ColorStateList.valueOf(typedValueU.data);
        } else {
            colorStateListC = null;
        }
        if (colorStateListC != null) {
            colorStateListValueOf = colorStateListC;
        }
        return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
    }
}
