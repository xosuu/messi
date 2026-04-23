package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f14490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f14494f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c0 f14497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f14498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f14499k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14495g = 8388611;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z f14500l = new z(this);

    public b0(int i10, int i11, Context context, View view, o oVar, boolean z9) {
        this.f14489a = context;
        this.f14490b = oVar;
        this.f14494f = view;
        this.f14491c = z9;
        this.f14492d = i10;
        this.f14493e = i11;
    }

    public final y a() {
        y i0Var;
        if (this.f14498j == null) {
            Context context = this.f14489a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            a0.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.w)) {
                i0Var = new i(this.f14489a, this.f14494f, this.f14492d, this.f14493e, this.f14491c);
            } else {
                Context context2 = this.f14489a;
                o oVar = this.f14490b;
                i0Var = new i0(this.f14492d, this.f14493e, context2, this.f14494f, oVar, this.f14491c);
            }
            i0Var.o(this.f14490b);
            i0Var.u(this.f14500l);
            i0Var.q(this.f14494f);
            i0Var.j(this.f14497i);
            i0Var.r(this.f14496h);
            i0Var.s(this.f14495g);
            this.f14498j = i0Var;
        }
        return this.f14498j;
    }

    public final boolean b() {
        y yVar = this.f14498j;
        return yVar != null && yVar.a();
    }

    public void c() {
        this.f14498j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f14499k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z9, boolean z10) {
        y yVarA = a();
        yVarA.v(z10);
        if (z9) {
            int i12 = this.f14495g;
            View view = this.f14494f;
            WeakHashMap weakHashMap = v0.f16075a;
            if ((Gravity.getAbsoluteGravity(i12, o0.e0.d(view)) & 7) == 5) {
                i10 -= this.f14494f.getWidth();
            }
            yVarA.t(i10);
            yVarA.w(i11);
            int i13 = (int) ((this.f14489a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            yVarA.f14624a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        yVarA.e();
    }
}
