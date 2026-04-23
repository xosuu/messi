package p4;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import o0.e0;
import o0.v0;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16250c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f16251d;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f16251d = swipeDismissBehavior;
    }

    @Override // t3.i
    public final int e(View view, int i10) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = v0.f16075a;
        boolean z9 = e0.d(view) == 1;
        int i11 = this.f16251d.f11761d;
        if (i11 == 0) {
            if (z9) {
                width = this.f16249b - view.getWidth();
                width2 = this.f16249b;
            } else {
                width = this.f16249b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 != 1) {
            width = this.f16249b - view.getWidth();
            width2 = view.getWidth() + this.f16249b;
        } else if (z9) {
            width = this.f16249b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f16249b - view.getWidth();
            width2 = this.f16249b;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // t3.i
    public final int f(View view, int i10) {
        return view.getTop();
    }

    @Override // t3.i
    public final int m(View view) {
        return view.getWidth();
    }

    @Override // t3.i
    public final void r(View view, int i10) {
        this.f16250c = i10;
        this.f16249b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f16251d;
            swipeDismissBehavior.f11760c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f11760c = false;
        }
    }

    @Override // t3.i
    public final void s(int i10) {
        this.f16251d.getClass();
    }

    @Override // t3.i
    public final void t(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f16251d;
        float f10 = width * swipeDismissBehavior.f11763f;
        float width2 = view.getWidth() * swipeDismissBehavior.f11764g;
        float fAbs = Math.abs(i10 - this.f16249b);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    @Override // t3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f16250c = r11
            int r11 = r9.getWidth()
            r0 = 0
            r1 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f16251d
            r3 = 0
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 == 0) goto L39
            java.util.WeakHashMap r5 = o0.v0.f16075a
            int r5 = o0.e0.d(r9)
            if (r5 != r1) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            int r6 = r2.f11761d
            r7 = 2
            if (r6 != r7) goto L21
            goto L53
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L67
            goto L53
        L2a:
            if (r4 <= 0) goto L67
            goto L53
        L2d:
            if (r6 != r1) goto L67
            if (r5 == 0) goto L34
            if (r4 <= 0) goto L67
            goto L53
        L34:
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L67
            goto L53
        L39:
            int r4 = r9.getLeft()
            int r5 = r8.f16249b
            int r4 = r4 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r2.f11762e
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r4 = java.lang.Math.abs(r4)
            if (r4 < r5) goto L67
        L53:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L62
            int r10 = r9.getLeft()
            int r0 = r8.f16249b
            if (r10 >= r0) goto L60
            goto L62
        L60:
            int r0 = r0 + r11
            goto L6a
        L62:
            int r10 = r8.f16249b
            int r0 = r10 - r11
            goto L6a
        L67:
            int r0 = r8.f16249b
            r1 = 0
        L6a:
            v0.e r10 = r2.f11758a
            int r11 = r9.getTop()
            boolean r10 = r10.p(r0, r11)
            if (r10 == 0) goto L80
            androidx.lifecycle.j0 r10 = new androidx.lifecycle.j0
            r10.<init>(r2, r9, r1)
            java.util.WeakHashMap r11 = o0.v0.f16075a
            o0.d0.m(r9, r10)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.u(android.view.View, float, float):void");
    }

    @Override // t3.i
    public final boolean y(View view, int i10) {
        int i11 = this.f16250c;
        return (i11 == -1 || i11 == i10) && this.f16251d.s(view);
    }
}
