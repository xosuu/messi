package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class y90 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i90 f10802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v90 f10803b;

    public y90(i90 i90Var, v90 v90Var) {
        this.f10802a = i90Var;
        this.f10803b = v90Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0001, B:6:0x0008, B:10:0x001c, B:23:0x0068, B:25:0x0070, B:15:0x0031, B:19:0x0046, B:22:0x005a), top: B:32:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.i90 r0 = r6.f10802a     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            if (r0 != 0) goto L8
            goto L7b
        L8:
            float r0 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L2b
            float r2 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> L2b
            r3 = -1
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L42
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L2d
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L2b
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2b
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2b
            r3 = 1
            goto L68
        L2b:
            r7 = move-exception
            goto L7d
        L2d:
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L40
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L2b
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2b
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2b
            r3 = 2
            goto L68
        L40:
            r7 = 0
            goto L68
        L42:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L56
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L2b
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2b
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2b
            r3 = 8
            goto L68
        L56:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L40
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L2b
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2b
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2b
            r3 = 4
        L68:
            com.google.android.gms.internal.ads.i90 r8 = r6.f10802a     // Catch: java.lang.Throwable -> L2b
            int r8 = r8.p()     // Catch: java.lang.Throwable -> L2b
            if (r3 != r8) goto L7b
            com.google.android.gms.internal.ads.i90 r8 = r6.f10802a     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.v90 r9 = r6.f10803b     // Catch: java.lang.Throwable -> L2b
            android.widget.FrameLayout r9 = r9.f9803d     // Catch: java.lang.Throwable -> L2b
            r8.d(r9, r7)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r1
        L7b:
            monitor-exit(r6)
            return r1
        L7d:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y90.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
