package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f15029b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static v f15030c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u2 f15031a;

    public static synchronized v a() {
        try {
            if (f15030c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15030c;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        return u2.h(i10, mode);
    }

    public static synchronized void d() {
        if (f15030c == null) {
            v vVar = new v();
            f15030c = vVar;
            vVar.f15031a = u2.d();
            f15030c.f15031a.l(new u());
        }
    }

    public static void e(Drawable drawable, q3 q3Var, int[] iArr) {
        PorterDuff.Mode mode = u2.f15016h;
        int[] state = drawable.getState();
        int[] iArr2 = r1.f14985a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z9 = q3Var.f14979b;
            if (z9 || q3Var.f14978a) {
                PorterDuffColorFilter porterDuffColorFilterH = null;
                ColorStateList colorStateList = z9 ? (ColorStateList) q3Var.f14980c : null;
                PorterDuff.Mode mode2 = q3Var.f14978a ? (PorterDuff.Mode) q3Var.f14981d : u2.f15016h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilterH = u2.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilterH);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f15031a.f(context, i10);
    }
}
