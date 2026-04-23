package g5;

import c2.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(18, 0);
        this.f13845f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    @Override // c2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.google.android.material.tabs.TabLayout r8, android.view.View r9, android.view.View r10, float r11, android.graphics.drawable.Drawable r12) {
        /*
            r7 = this;
            int r0 = r7.f13845f
            switch(r0) {
                case 0: goto L59;
                default: goto L5;
            }
        L5:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lc
            goto Ld
        Lc:
            r9 = r10
        Ld:
            android.graphics.RectF r8 = c2.n.e(r8, r9)
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            if (r1 >= 0) goto L2b
            android.view.animation.LinearInterpolator r1 = m4.a.f15740a
            int r1 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r1 > 0) goto L1d
            goto L3b
        L1d:
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 < 0) goto L23
        L21:
            r9 = 0
            goto L3b
        L23:
            float r11 = r11 - r10
            float r11 = r11 / r0
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r11 = r11 * r10
            float r9 = r9 + r11
            goto L3b
        L2b:
            android.view.animation.LinearInterpolator r2 = m4.a.f15740a
            if (r1 > 0) goto L30
            goto L21
        L30:
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 < 0) goto L35
            goto L3b
        L35:
            float r11 = r11 - r0
            float r11 = r11 / r0
            float r11 = r11 * r9
            float r9 = r11 + r10
        L3b:
            float r10 = r8.left
            int r10 = (int) r10
            android.graphics.Rect r11 = r12.getBounds()
            int r11 = r11.top
            float r8 = r8.right
            int r8 = (int) r8
            android.graphics.Rect r0 = r12.getBounds()
            int r0 = r0.bottom
            r12.setBounds(r10, r11, r8, r0)
            r8 = 1132396544(0x437f0000, float:255.0)
            float r9 = r9 * r8
            int r8 = (int) r9
            r12.setAlpha(r8)
            return
        L59:
            android.graphics.RectF r9 = c2.n.e(r8, r9)
            android.graphics.RectF r8 = c2.n.e(r8, r10)
            float r10 = r9.left
            float r0 = r8.left
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L82
            double r10 = (double) r11
            double r10 = r10 * r5
            double r10 = r10 / r3
            double r3 = java.lang.Math.cos(r10)
            double r1 = r1 - r3
            float r0 = (float) r1
            double r10 = java.lang.Math.sin(r10)
            float r10 = (float) r10
            goto L91
        L82:
            double r10 = (double) r11
            double r10 = r10 * r5
            double r10 = r10 / r3
            double r3 = java.lang.Math.sin(r10)
            float r0 = (float) r3
            double r10 = java.lang.Math.cos(r10)
            double r1 = r1 - r10
            float r10 = (float) r1
        L91:
            float r11 = r9.left
            int r11 = (int) r11
            float r1 = r8.left
            int r1 = (int) r1
            int r11 = m4.a.a(r0, r11, r1)
            android.graphics.Rect r0 = r12.getBounds()
            int r0 = r0.top
            float r9 = r9.right
            int r9 = (int) r9
            float r8 = r8.right
            int r8 = (int) r8
            int r8 = m4.a.a(r10, r9, r8)
            android.graphics.Rect r9 = r12.getBounds()
            int r9 = r9.bottom
            r12.setBounds(r11, r0, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.m(com.google.android.material.tabs.TabLayout, android.view.View, android.view.View, float, android.graphics.drawable.Drawable):void");
    }
}
