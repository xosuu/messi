package m1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15663a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f15664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f15665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f15668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0 f15669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearInterpolator f15670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DecelerateInterpolator f15671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PointF f15672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DisplayMetrics f15673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15677o;

    public y(Context context) {
        z0 z0Var = new z0();
        z0Var.f15683d = -1;
        z0Var.f15685f = false;
        z0Var.f15680a = 0;
        z0Var.f15681b = 0;
        z0Var.f15682c = Integer.MIN_VALUE;
        z0Var.f15684e = null;
        this.f15669g = z0Var;
        this.f15670h = new LinearInterpolator();
        this.f15671i = new DecelerateInterpolator();
        this.f15674l = false;
        this.f15676n = 0;
        this.f15677o = 0;
        this.f15673k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public float b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int c(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f15674l) {
            this.f15675m = b(this.f15673k);
            this.f15674l = true;
        }
        return (int) Math.ceil(fAbs * this.f15675m);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.y.d(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.view.View r10, m1.b1 r11, m1.z0 r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.y.e(android.view.View, m1.b1, m1.z0):void");
    }

    public final void f() {
        if (this.f15667e) {
            this.f15667e = false;
            this.f15677o = 0;
            this.f15676n = 0;
            this.f15672j = null;
            this.f15664b.f1059o0.f15410a = -1;
            this.f15668f = null;
            this.f15663a = -1;
            this.f15666d = false;
            p0 p0Var = this.f15665c;
            if (p0Var.f15589e == this) {
                p0Var.f15589e = null;
            }
            this.f15665c = null;
            this.f15664b = null;
        }
    }
}
