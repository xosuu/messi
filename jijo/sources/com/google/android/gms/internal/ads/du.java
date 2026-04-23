package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class du implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3747b;

    public /* synthetic */ du(int i10, Object obj) {
        this.f3746a = i10;
        this.f3747b = obj;
    }

    private final Long a() {
        long j10;
        uw uwVar = (uw) this.f3747b;
        uwVar.getClass();
        bd bdVarZzc = zzu.zzc();
        zzbah zzbahVar = uwVar.f9635y;
        synchronized (bdVarZzc.f2988c) {
            try {
                j10 = -2;
                if (bdVarZzc.f2991f != null) {
                    if (bdVarZzc.f2989d.p()) {
                        try {
                            dd ddVar = bdVarZzc.f2991f;
                            Parcel parcelM = ddVar.m();
                            qb.c(parcelM, zzbahVar);
                            Parcel parcelT = ddVar.t(parcelM, 3);
                            long j11 = parcelT.readLong();
                            parcelT.recycle();
                            j10 = j11;
                        } catch (RemoteException e10) {
                            zzm.zzh("Unable to call into cache service.", e10);
                        }
                    }
                }
            } finally {
            }
        }
        return Long.valueOf(j10);
    }

    private final dm0 b() {
        cm0 cm0Var = (cm0) this.f3747b;
        cm0Var.getClass();
        String strEncodeToString = null;
        int i10 = 0;
        if (((Boolean) zzba.zzc().a(eg.f4158v6)).booleanValue() && "requester_type_2".equals(zzq.zzc(cm0Var.f3338c.f7644d))) {
            cc1 cc1Var = ec1.f3903b;
            dc1 dc1Var = new dc1();
            try {
                en1.h0(ep.g(tp1.y(r61.f8428b.a())), new mx0(dc1Var));
            } catch (IOException | GeneralSecurityException e10) {
                zze.zza("Failed to generate key".concat(e10.toString()));
                zzu.zzo().i("CryptoUtils.generateKey", e10);
            }
            strEncodeToString = Base64.encodeToString(dc1Var.a().b(), 11);
            synchronized (dc1Var) {
                dc1Var.f3616b.clear();
                dc1Var.f3617d = 0;
                dc1Var.f3619h = 0;
            }
        }
        return new dm0(strEncodeToString, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.wn0 c() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f3747b
            com.google.android.gms.internal.ads.am0 r0 = (com.google.android.gms.internal.ads.am0) r0
            java.lang.Object r1 = r0.f2735c
            com.google.android.gms.internal.ads.le0 r1 = (com.google.android.gms.internal.ads.le0) r1
            com.google.android.gms.internal.ads.wn0 r8 = new com.google.android.gms.internal.ads.wn0
            monitor-enter(r1)
            com.google.android.gms.internal.ads.xf r2 = com.google.android.gms.internal.ads.eg.f3942a8     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.cg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r3.a(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L5a
            boolean r2 = r1.f()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L24
            goto L5a
        L24:
            long r2 = r1.f6594q     // Catch: java.lang.Throwable -> L4a
            y3.a r4 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L4a
            y3.b r4 = (y3.b) r4     // Catch: java.lang.Throwable -> L4a
            r4.getClass()     // Catch: java.lang.Throwable -> L4a
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4a
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L4c
            java.lang.String r2 = "{}"
            r1.f6592o = r2     // Catch: java.lang.Throwable -> L4a
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.f6594q = r2     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = ""
            monitor-exit(r1)
        L48:
            r3 = r2
            goto L5e
        L4a:
            r0 = move-exception
            goto L96
        L4c:
            java.lang.String r2 = r1.f6592o     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "{}"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5a
            java.lang.String r2 = r1.f6592o     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r1)
            goto L48
        L5a:
            java.lang.String r2 = ""
            monitor-exit(r1)
            goto L48
        L5e:
            boolean r4 = r1.g()
            com.google.android.gms.ads.internal.util.zzay r1 = com.google.android.gms.ads.internal.zzu.zzs()
            boolean r5 = r1.zzl()
            java.lang.Object r0 = r0.f2735c
            com.google.android.gms.internal.ads.le0 r0 = (com.google.android.gms.internal.ads.le0) r0
            org.json.JSONObject r1 = r0.f6593p
            r2 = 0
            r6 = 1
            if (r1 == 0) goto L76
            r1 = 1
            goto L77
        L76:
            r1 = 0
        L77:
            long r9 = r0.f6600w
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.f4160v8
            com.google.android.gms.internal.ads.cg r7 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r7.a(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            r7 = 1
            goto L90
        L8f:
            r7 = 0
        L90:
            r2 = r8
            r6 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        L96:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.du.c():com.google.android.gms.internal.ads.wn0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x04f6, code lost:
    
        if (r0.contains("banner") == false) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0393 A[Catch: IOException -> 0x0368, TryCatch #2 {IOException -> 0x0368, blocks: (B:119:0x0325, B:121:0x034e, B:123:0x0360, B:127:0x036d, B:132:0x0393, B:133:0x03b8, B:141:0x03c5, B:143:0x03d7, B:145:0x03ef, B:147:0x03f8, B:152:0x041e, B:154:0x043a, B:156:0x0467, B:158:0x0479, B:150:0x040c, B:140:0x03c4, B:130:0x0381, B:135:0x03bb, B:136:0x03bf), top: B:405:0x0325, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041e A[Catch: IOException -> 0x0368, TryCatch #2 {IOException -> 0x0368, blocks: (B:119:0x0325, B:121:0x034e, B:123:0x0360, B:127:0x036d, B:132:0x0393, B:133:0x03b8, B:141:0x03c5, B:143:0x03d7, B:145:0x03ef, B:147:0x03f8, B:152:0x041e, B:154:0x043a, B:156:0x0467, B:158:0x0479, B:150:0x040c, B:140:0x03c4, B:130:0x0381, B:135:0x03bb, B:136:0x03bf), top: B:405:0x0325, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021c  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:325:0x087e -> B:327:0x088a). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instruction units count: 2644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.du.call():java.lang.Object");
    }
}
