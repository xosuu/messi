package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class pk1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Random f7905h = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tk1 f7909d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7911f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv f7906a = new hv();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu f7907b = new vu();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f7908c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wv f7910e = wv.f10355a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7912g = -1;

    public final synchronized String a(wv wvVar, jo1 jo1Var) {
        return e(wvVar.n(jo1Var.f6052a, this.f7907b).f9970c, jo1Var).f7599a;
    }

    public final synchronized void b(ek1 ek1Var) {
        tk1 tk1Var;
        try {
            String str = this.f7911f;
            if (str != null) {
                ok1 ok1Var = (ok1) this.f7908c.get(str);
                ok1Var.getClass();
                f(ok1Var);
            }
            Iterator it = this.f7908c.values().iterator();
            while (it.hasNext()) {
                ok1 ok1Var2 = (ok1) it.next();
                it.remove();
                if (ok1Var2.f7603e && (tk1Var = this.f7909d) != null) {
                    ((sk1) tk1Var).a(ek1Var, ok1Var2.f7599a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x0022, B:16:0x002e, B:18:0x0034, B:20:0x0040, B:22:0x0046, B:15:0x0029, B:27:0x0050, B:29:0x005c, B:30:0x0060, B:32:0x0065, B:34:0x006b, B:36:0x0080, B:37:0x00aa, B:39:0x00ae, B:40:0x00b0, B:42:0x00ba, B:44:0x00be, B:46:0x00cd, B:49:0x00d4), top: B:56:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x0022, B:16:0x002e, B:18:0x0034, B:20:0x0040, B:22:0x0046, B:15:0x0029, B:27:0x0050, B:29:0x005c, B:30:0x0060, B:32:0x0065, B:34:0x006b, B:36:0x0080, B:37:0x00aa, B:39:0x00ae, B:40:0x00b0, B:42:0x00ba, B:44:0x00be, B:46:0x00cd, B:49:0x00d4), top: B:56:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(com.google.android.gms.internal.ads.ek1 r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pk1.c(com.google.android.gms.internal.ads.ek1):void");
    }

    public final synchronized void d(ek1 ek1Var, int i10) {
        try {
            this.f7909d.getClass();
            Iterator it = this.f7908c.values().iterator();
            while (it.hasNext()) {
                ok1 ok1Var = (ok1) it.next();
                if (ok1Var.a(ek1Var)) {
                    it.remove();
                    if (ok1Var.f7603e) {
                        if (ok1Var.f7599a.equals(this.f7911f)) {
                            f(ok1Var);
                        }
                        ((sk1) this.f7909d).a(ek1Var, ok1Var.f7599a);
                    }
                }
            }
            g(ek1Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.ok1 e(int r17, com.google.android.gms.internal.ads.jo1 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.HashMap r3 = r0.f7908c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.ads.ok1 r8 = (com.google.android.gms.internal.ads.ok1) r8
            long r9 = r8.f7601c
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L52
            int r9 = r8.f7600b
            if (r1 != r9) goto L52
            if (r2 == 0) goto L52
            com.google.android.gms.internal.ads.pk1 r9 = r8.f7605g
            java.util.HashMap r10 = r9.f7908c
            java.lang.String r13 = r9.f7911f
            java.lang.Object r10 = r10.get(r13)
            com.google.android.gms.internal.ads.ok1 r10 = (com.google.android.gms.internal.ads.ok1) r10
            if (r10 == 0) goto L45
            long r13 = r10.f7601c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L45
            goto L4a
        L45:
            long r9 = r9.f7912g
            r13 = 1
            long r13 = r13 + r9
        L4a:
            long r9 = r2.f6055d
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 < 0) goto L52
            r8.f7601c = r9
        L52:
            com.google.android.gms.internal.ads.jo1 r9 = r8.f7602d
            if (r2 != 0) goto L5b
            int r10 = r8.f7600b
            if (r1 != r10) goto L16
            goto L7e
        L5b:
            long r13 = r2.f6055d
            if (r9 != 0) goto L6c
            boolean r10 = r18.b()
            if (r10 != 0) goto L16
            long r11 = r8.f7601c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L7e
        L6c:
            long r10 = r9.f6055d
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 != 0) goto L16
            int r10 = r2.f6053b
            int r11 = r9.f6053b
            if (r10 != r11) goto L16
            int r10 = r2.f6054c
            int r11 = r9.f6054c
            if (r10 != r11) goto L16
        L7e:
            long r10 = r8.f7601c
            r12 = -1
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L98
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 >= 0) goto L8b
            goto L98
        L8b:
            if (r12 != 0) goto L16
            int r10 = com.google.android.gms.internal.ads.yn0.f10944a
            com.google.android.gms.internal.ads.jo1 r10 = r7.f7602d
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r7 = r8
            goto L16
        L98:
            r7 = r8
            r5 = r10
            goto L16
        L9c:
            if (r7 != 0) goto Lb6
            r4 = 12
            byte[] r4 = new byte[r4]
            java.util.Random r5 = com.google.android.gms.internal.ads.pk1.f7905h
            r5.nextBytes(r4)
            r5 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            com.google.android.gms.internal.ads.ok1 r5 = new com.google.android.gms.internal.ads.ok1
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
            return r5
        Lb6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pk1.e(int, com.google.android.gms.internal.ads.jo1):com.google.android.gms.internal.ads.ok1");
    }

    public final void f(ok1 ok1Var) {
        long j10 = ok1Var.f7601c;
        if (j10 != -1) {
            this.f7912g = j10;
        }
        this.f7911f = null;
    }

    public final void g(ek1 ek1Var) {
        jo1 jo1Var;
        boolean zO = ek1Var.f4223b.o();
        HashMap map = this.f7908c;
        if (zO) {
            String str = this.f7911f;
            if (str != null) {
                ok1 ok1Var = (ok1) map.get(str);
                ok1Var.getClass();
                f(ok1Var);
                return;
            }
            return;
        }
        ok1 ok1Var2 = (ok1) map.get(this.f7911f);
        int i10 = ek1Var.f4224c;
        jo1 jo1Var2 = ek1Var.f4225d;
        this.f7911f = e(i10, jo1Var2).f7599a;
        c(ek1Var);
        if (jo1Var2 == null || !jo1Var2.b()) {
            return;
        }
        long j10 = jo1Var2.f6055d;
        if (ok1Var2 != null && ok1Var2.f7601c == j10 && (jo1Var = ok1Var2.f7602d) != null && jo1Var.f6053b == jo1Var2.f6053b && jo1Var.f6054c == jo1Var2.f6054c) {
            return;
        }
        e(i10, new jo1(j10, jo1Var2.f6052a));
    }
}
