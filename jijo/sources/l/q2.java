package l;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends k2 implements l2 {
    public static final Method Q;
    public l2 P;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Q = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // l.l2
    public final void c(k.o oVar, k.r rVar) {
        l2 l2Var = this.P;
        if (l2Var != null) {
            l2Var.c(oVar, rVar);
        }
    }

    @Override // l.l2
    public final void g(k.o oVar, MenuItem menuItem) {
        l2 l2Var = this.P;
        if (l2Var != null) {
            l2Var.g(oVar, menuItem);
        }
    }

    @Override // l.k2
    public final x1 q(Context context, boolean z9) {
        p2 p2Var = new p2(context, z9);
        p2Var.setHoverListener(this);
        return p2Var;
    }
}
