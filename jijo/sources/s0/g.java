package s0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnTouchListener {
    public static final int D = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public final ListView C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f16641b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f16642d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.activity.e f16643f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f16644h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f16645q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f16646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f16647t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f16648u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f16649v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f16650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16651x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16652y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16653z;

    public g(ListView listView) {
        a aVar = new a();
        aVar.f16635e = Long.MIN_VALUE;
        aVar.f16637g = -1L;
        aVar.f16636f = 0L;
        this.f16640a = aVar;
        this.f16641b = new AccelerateInterpolator();
        this.f16644h = new float[]{0.0f, 0.0f};
        this.f16645q = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f16648u = new float[]{0.0f, 0.0f};
        this.f16649v = new float[]{0.0f, 0.0f};
        this.f16650w = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f16642d = listView;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f16650w;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f16649v;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f16646s = 1;
        float[] fArr3 = this.f16645q;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f16644h;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f16648u;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f16647t = D;
        aVar.f16631a = 500;
        aVar.f16632b = 500;
        this.C = listView;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f16644h
            r0 = r0[r4]
            float[] r1 = r3.f16645q
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            android.view.animation.AccelerateInterpolator r6 = r3.f16641b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L2e
        L26:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r5 = r6.getInterpolation(r5)
        L2e:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L38
        L37:
            r5 = 0
        L38:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3d
            goto L5c
        L3d:
            float[] r0 = r3.f16648u
            r0 = r0[r4]
            float[] r1 = r3.f16649v
            r1 = r1[r4]
            float[] r2 = r3.f16650w
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L54
            float r5 = r5 * r0
            float r2 = b(r5, r1, r4)
            goto L5c
        L54:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r2 = -r4
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.g.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f16646s;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                return f10 >= 0.0f ? 1.0f - (f10 / f11) : (this.A && i10 == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        }
        if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.B
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.e()
            goto L7c
        L1a:
            r7.f16653z = r2
            r7.f16651x = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f16642d
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            s0.a r9 = r7.f16640a
            r9.f16633c = r0
            r9.f16634d = r8
            boolean r8 = r7.A
            if (r8 != 0) goto L7c
            boolean r8 = r7.f()
            if (r8 == 0) goto L7c
            androidx.activity.e r8 = r7.f16643f
            if (r8 != 0) goto L60
            androidx.activity.e r8 = new androidx.activity.e
            r9 = 5
            r8.<init>(r9, r7)
            r7.f16643f = r8
        L60:
            r7.A = r2
            r7.f16652y = r2
            boolean r8 = r7.f16651x
            if (r8 != 0) goto L75
            int r8 = r7.f16647t
            if (r8 <= 0) goto L75
            androidx.activity.e r9 = r7.f16643f
            long r5 = (long) r8
            java.util.WeakHashMap r8 = o0.v0.f16075a
            o0.d0.n(r4, r9, r5)
            goto L7a
        L75:
            androidx.activity.e r8 = r7.f16643f
            r8.run()
        L7a:
            r7.f16651x = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.g.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i10 = 0;
        if (this.f16652y) {
            this.A = false;
            return;
        }
        a aVar = this.f16640a;
        aVar.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f16635e);
        int i12 = aVar.f16632b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f16639i = i10;
        aVar.f16638h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f16637g = jCurrentAnimationTimeMillis;
    }

    public final boolean f() {
        ListView listView;
        int count;
        a aVar = this.f16640a;
        float f10 = aVar.f16634d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f16633c);
        if (iAbs == 0 || (count = (listView = this.C).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i10 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i10 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
