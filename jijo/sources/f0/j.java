package f0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
        return resources.getDrawable(i10, theme);
    }

    public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
        return resources.getDrawableForDensity(i10, i11, theme);
    }
}
