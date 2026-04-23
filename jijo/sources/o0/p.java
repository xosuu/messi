package o0;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f16053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f16054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f16055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16057e;

    public p(View view) {
        this.f16055c = view;
    }

    public final boolean a(float f10, float f11, boolean z9) {
        ViewParent viewParentF;
        if (!this.f16056d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return a1.a(viewParentF, this.f16055c, f10, f11, z9);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentF);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentF;
        if (!this.f16056d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return a1.b(viewParentF, this.f16055c, f10, f11);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentF);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentF;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f16056d || (viewParentF = f(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f16055c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f16057e == null) {
                this.f16057e = new int[2];
            }
            iArr3 = this.f16057e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f16055c;
        if (viewParentF instanceof q) {
            ((q) viewParentF).c(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                a1.c(viewParentF, view2, i10, i11, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentF);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentF;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f16056d || (viewParentF = f(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f16055c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f16057e == null) {
                this.f16057e = new int[2];
            }
            int[] iArr4 = this.f16057e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f16055c;
        if (viewParentF instanceof r) {
            ((r) viewParentF).d(view2, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (viewParentF instanceof q) {
                ((q) viewParentF).e(view2, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    a1.d(viewParentF, view2, i10, i11, i12, i13);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentF);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 == 0) {
            return this.f16053a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f16054b;
    }

    public final boolean g(int i10) {
        return f(i10) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.g(r8)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r6.f16056d
            if (r0 == 0) goto L54
            android.view.View r0 = r6.f16055c
            android.view.ViewParent r2 = r0.getParent()
            r3 = r0
        L13:
            if (r2 == 0) goto L54
            boolean r4 = r2 instanceof o0.q
            if (r4 == 0) goto L21
            r5 = r2
            o0.q r5 = (o0.q) r5
            boolean r5 = r5.f(r3, r0, r7, r8)
            goto L27
        L21:
            if (r8 != 0) goto L48
            boolean r5 = o0.a1.f(r2, r3, r0, r7)     // Catch: java.lang.AbstractMethodError -> L45
        L27:
            if (r5 == 0) goto L48
            if (r8 == 0) goto L31
            if (r8 == r1) goto L2e
            goto L33
        L2e:
            r6.f16054b = r2
            goto L33
        L31:
            r6.f16053a = r2
        L33:
            if (r4 == 0) goto L3b
            o0.q r2 = (o0.q) r2
            r2.a(r3, r0, r7, r8)
            goto L44
        L3b:
            if (r8 != 0) goto L44
            o0.a1.e(r2, r3, r0, r7)     // Catch: java.lang.AbstractMethodError -> L41
            goto L44
        L41:
            java.util.Objects.toString(r2)
        L44:
            return r1
        L45:
            java.util.Objects.toString(r2)
        L48:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L4f
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L4f:
            android.view.ViewParent r2 = r2.getParent()
            goto L13
        L54:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.p.h(int, int):boolean");
    }

    public final void i(int i10) {
        ViewParent viewParentF = f(i10);
        if (viewParentF != null) {
            boolean z9 = viewParentF instanceof q;
            View view = this.f16055c;
            if (z9) {
                ((q) viewParentF).b(view, i10);
            } else if (i10 == 0) {
                try {
                    a1.g(viewParentF, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentF);
                }
            }
            if (i10 == 0) {
                this.f16053a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f16054b = null;
            }
        }
    }
}
