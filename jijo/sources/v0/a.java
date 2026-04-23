package v0;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.k;
import p0.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f17671b;

    public a(b bVar) {
        this.f17671b = bVar;
    }

    @Override // androidx.fragment.app.k
    public final g a(int i10) {
        return new g(AccessibilityNodeInfo.obtain(this.f17671b.p(i10).f16195a));
    }

    @Override // androidx.fragment.app.k
    public final g c(int i10) {
        b bVar = this.f17671b;
        int i11 = i10 == 2 ? bVar.f17682k : bVar.f17683l;
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // androidx.fragment.app.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(int r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            v0.b r0 = r6.f17671b
            android.view.View r1 = r0.f17680i
            r2 = -1
            if (r7 == r2) goto L64
            r9 = 1
            if (r8 == r9) goto L5f
            r2 = 2
            if (r8 == r2) goto L5a
            r2 = 64
            r3 = 0
            r4 = 65536(0x10000, float:9.1835E-41)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r2) goto L2f
            r2 = 128(0x80, float:1.8E-43)
            if (r8 == r2) goto L1f
            boolean r7 = r0.q(r7, r8)
            goto L6a
        L1f:
            int r8 = r0.f17682k
            if (r8 != r7) goto L2c
            r0.f17682k = r5
            r1.invalidate()
            r0.w(r7, r4)
            goto L2d
        L2c:
            r9 = 0
        L2d:
            r7 = r9
            goto L6a
        L2f:
            android.view.accessibility.AccessibilityManager r8 = r0.f17679h
            boolean r2 = r8.isEnabled()
            if (r2 == 0) goto L2c
            boolean r8 = r8.isTouchExplorationEnabled()
            if (r8 != 0) goto L3e
            goto L2c
        L3e:
            int r8 = r0.f17682k
            if (r8 == r7) goto L2c
            if (r8 == r5) goto L4e
            r0.f17682k = r5
            android.view.View r2 = r0.f17680i
            r2.invalidate()
            r0.w(r8, r4)
        L4e:
            r0.f17682k = r7
            r1.invalidate()
            r8 = 32768(0x8000, float:4.5918E-41)
            r0.w(r7, r8)
            goto L2d
        L5a:
            boolean r7 = r0.j(r7)
            goto L6a
        L5f:
            boolean r7 = r0.v(r7)
            goto L6a
        L64:
            java.util.WeakHashMap r7 = o0.v0.f16075a
            boolean r7 = o0.d0.j(r1, r8, r9)
        L6a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.a.g(int, int, android.os.Bundle):boolean");
    }
}
