package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be0 f5579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc0 f5580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5581c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5582d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5583e;

    public ie0(be0 be0Var, qc0 qc0Var) {
        this.f5579a = be0Var;
        this.f5580b = qc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[Catch: all -> 0x001a, LOOP:0: B:15:0x003c->B:17:0x0042, LOOP_END, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0012, B:11:0x001c, B:12:0x0034, B:14:0x0036, B:15:0x003c, B:17:0x0042, B:18:0x0050), top: B:22:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONArray a() {
        /*
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = r6.f5581c
            monitor-enter(r1)
            boolean r2 = r6.f5583e     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L36
            com.google.android.gms.internal.ads.be0 r2 = r6.f5579a     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r2.f2998b     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            java.util.ArrayList r2 = r2.a()     // Catch: java.lang.Throwable -> L1a
            r6.b(r2)     // Catch: java.lang.Throwable -> L1a
            goto L36
        L1a:
            r0 = move-exception
            goto L52
        L1c:
            j3.s r2 = new j3.s     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.be0 r3 = r6.f5579a     // Catch: java.lang.Throwable -> L1a
            r3.getClass()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.vm r4 = new com.google.android.gms.internal.ads.vm     // Catch: java.lang.Throwable -> L1a
            r5 = 27
            r4.<init>(r3, r5, r2)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.qu r2 = r3.f3001e     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.Executor r3 = r3.f3006j     // Catch: java.lang.Throwable -> L1a
            r2.a(r4, r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L51
        L36:
            java.util.ArrayList r2 = r6.f5582d     // Catch: java.lang.Throwable -> L1a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1a
        L3c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L50
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.he0 r3 = (com.google.android.gms.internal.ads.he0) r3     // Catch: java.lang.Throwable -> L1a
            org.json.JSONObject r3 = r3.a()     // Catch: java.lang.Throwable -> L1a
            r0.put(r3)     // Catch: java.lang.Throwable -> L1a
            goto L3c
        L50:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
        L51:
            return r0
        L52:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ie0.a():org.json.JSONArray");
    }

    public final void b(List list) {
        zzbra zzbraVar;
        pc0 pc0VarA;
        pc0 pc0VarA2;
        zzbra zzbraVar2;
        synchronized (this.f5581c) {
            try {
                if (this.f5583e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbkv zzbkvVar = (zzbkv) it.next();
                    String string = (!((Boolean) zzba.zzc().a(eg.f4169w8)).booleanValue() || (pc0VarA2 = this.f5580b.a(zzbkvVar.f11500a)) == null || (zzbraVar2 = pc0VarA2.f7855c) == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzbraVar2.toString();
                    String str = string;
                    boolean z9 = ((Boolean) zzba.zzc().a(eg.f4179x8)).booleanValue() && (pc0VarA = this.f5580b.a(zzbkvVar.f11500a)) != null && pc0VarA.f7856d;
                    ArrayList arrayList = this.f5582d;
                    String str2 = zzbkvVar.f11500a;
                    pc0 pc0VarA3 = this.f5580b.a(str2);
                    String string2 = (pc0VarA3 == null || (zzbraVar = pc0VarA3.f7854b) == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzbraVar.toString();
                    arrayList.add(new he0(zzbkvVar.f11501b ? 1 : 0, zzbkvVar.f11502d, str2, str, string2, zzbkvVar.f11503f, z9));
                }
                this.f5583e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
