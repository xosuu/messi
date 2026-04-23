package w1;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q {
    public static final String[] K = {"android:visibility:visibility", "android:visibility:parent"};
    public int J;

    public h(int i10) {
        this.J = 3;
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.J = i10;
    }

    public static void H(x xVar) {
        int visibility = xVar.f18148b.getVisibility();
        HashMap map = xVar.f18147a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = xVar.f18148b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w1.g0 J(w1.x r8, w1.x r9) {
        /*
            w1.g0 r0 = new w1.g0
            r0.<init>()
            r1 = 0
            r0.f18099a = r1
            r0.f18100b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f18147a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f18101c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f18103e = r6
            goto L33
        L2f:
            r0.f18101c = r3
            r0.f18103e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f18147a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f18102d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f18104f = r2
            goto L56
        L52:
            r0.f18102d = r3
            r0.f18104f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f18101c
            int r9 = r0.f18102d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f18103e
            android.view.ViewGroup r4 = r0.f18104f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f18100b = r1
            r0.f18099a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f18100b = r2
            r0.f18099a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f18104f
            if (r8 != 0) goto L81
            r0.f18100b = r1
            r0.f18099a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f18103e
            if (r8 != 0) goto L9f
            r0.f18100b = r2
            r0.f18099a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f18102d
            if (r8 != 0) goto L95
            r0.f18100b = r2
            r0.f18099a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f18101c
            if (r8 != 0) goto L9f
            r0.f18100b = r1
            r0.f18099a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.h.J(w1.x, w1.x):w1.g0");
    }

    public final ObjectAnimator I(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        y.f18150a.z(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, y.f18151b, f11);
        objectAnimatorOfFloat.addListener(new m1.n(view));
        a(new g(this, 0, view));
        return objectAnimatorOfFloat;
    }

    @Override // w1.q
    public final void d(x xVar) {
        H(xVar);
    }

    @Override // w1.q
    public final void g(x xVar) {
        H(xVar);
        xVar.f18147a.put("android:fade:transitionAlpha", Float.valueOf(y.f18150a.y(xVar.f18148b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022e  */
    @Override // w1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r23, w1.x r24, w1.x r25) {
        /*
            Method dump skipped, instruction units count: 747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.h.k(android.view.ViewGroup, w1.x, w1.x):android.animation.Animator");
    }

    @Override // w1.q
    public final /* bridge */ /* synthetic */ String[] p() {
        return K;
    }

    @Override // w1.q
    public final boolean r(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f18147a.containsKey("android:visibility:visibility") != xVar.f18147a.containsKey("android:visibility:visibility")) {
            return false;
        }
        g0 g0VarJ = J(xVar, xVar2);
        if (g0VarJ.f18099a) {
            return g0VarJ.f18101c == 0 || g0VarJ.f18102d == 0;
        }
        return false;
    }
}
