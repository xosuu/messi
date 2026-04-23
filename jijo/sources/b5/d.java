package b5;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1335a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1336b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1337c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1338d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f1339e = {R.attr.state_enabled, R.attr.state_pressed};

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return g0.a.d(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f1339e, 0));
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z9 = false;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z9 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z10 = true;
            }
        }
        return z9 && z10;
    }
}
