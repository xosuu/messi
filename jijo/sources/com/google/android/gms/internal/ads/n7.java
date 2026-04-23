package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f7184c = o7.f7522a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7185a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7186b = false;

    public final synchronized void a(long j10, String str) {
        if (this.f7186b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f7185a.add(new m7(j10, str, SystemClock.elapsedRealtime()));
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    public final synchronized void b(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            r9.f7186b = r0     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r1 = r9.f7185a     // Catch: java.lang.Throwable -> L7d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            r4 = 0
            if (r1 != 0) goto L11
            r7 = r2
            goto L2c
        L11:
            java.util.ArrayList r1 = r9.f7185a     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.m7 r1 = (com.google.android.gms.internal.ads.m7) r1     // Catch: java.lang.Throwable -> L7d
            long r5 = r1.f6882c     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r1 = r9.f7185a     // Catch: java.lang.Throwable -> L7d
            int r7 = r1.size()     // Catch: java.lang.Throwable -> L7d
            int r7 = r7 + (-1)
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.m7 r1 = (com.google.android.gms.internal.ads.m7) r1     // Catch: java.lang.Throwable -> L7d
            long r7 = r1.f6882c     // Catch: java.lang.Throwable -> L7d
            long r7 = r7 - r5
        L2c:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L31
            goto L7f
        L31:
            java.util.ArrayList r1 = r9.f7185a     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.m7 r1 = (com.google.android.gms.internal.ads.m7) r1     // Catch: java.lang.Throwable -> L7d
            long r1 = r1.f6882c     // Catch: java.lang.Throwable -> L7d
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L7d
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L7d
            r5[r4] = r6     // Catch: java.lang.Throwable -> L7d
            r5[r0] = r10     // Catch: java.lang.Throwable -> L7d
            java.lang.String r10 = "(%-4d ms) %s"
            com.google.android.gms.internal.ads.o7.b(r10, r5)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r10 = r9.f7185a     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L7d
        L51:
            boolean r5 = r10.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.m7 r5 = (com.google.android.gms.internal.ads.m7) r5     // Catch: java.lang.Throwable -> L7d
            long r6 = r5.f6882c     // Catch: java.lang.Throwable -> L7d
            long r1 = r6 - r1
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L7d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L7d
            r8[r4] = r1     // Catch: java.lang.Throwable -> L7d
            long r1 = r5.f6881b     // Catch: java.lang.Throwable -> L7d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L7d
            r8[r0] = r1     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r5.f6880a     // Catch: java.lang.Throwable -> L7d
            r8[r3] = r1     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = "(+%-4d) [%2d] %s"
            com.google.android.gms.internal.ads.o7.b(r1, r8)     // Catch: java.lang.Throwable -> L7d
            r1 = r6
            goto L51
        L7d:
            r10 = move-exception
            goto L81
        L7f:
            monitor-exit(r9)
            return
        L81:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n7.b(java.lang.String):void");
    }

    public final void finalize() {
        if (this.f7186b) {
            return;
        }
        b("Request on the loose");
        o7.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
