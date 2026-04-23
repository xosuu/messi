package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rj0 implements k21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr0 f8610b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr0 f8611d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8612f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut0 f8613h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kr0 f8614q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ tj0 f8615s;

    public rj0(tj0 tj0Var, long j10, hr0 hr0Var, fr0 fr0Var, String str, ut0 ut0Var, kr0 kr0Var) {
        this.f8609a = j10;
        this.f8610b = hr0Var;
        this.f8611d = fr0Var;
        this.f8612f = str;
        this.f8613h = ut0Var;
        this.f8614q = kr0Var;
        this.f8615s = tj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.k21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(java.lang.Throwable r17) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rj0.E(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        ((y3.b) this.f8615s.f9171a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8609a;
        synchronized (this.f8615s) {
            try {
                tj0 tj0Var = this.f8615s;
                if (tj0Var.f9175e) {
                    tj0Var.f9172b.d(this.f8610b, this.f8611d, 0, null, jElapsedRealtime);
                }
                tj0 tj0Var2 = this.f8615s;
                if (tj0Var2.f9177g) {
                    return;
                }
                if (tj0.h(tj0Var2, this.f8611d)) {
                    ((sj0) this.f8615s.f9174d.get(this.f8611d)).f8880d = jElapsedRealtime;
                } else {
                    LinkedHashMap linkedHashMap = this.f8615s.f9174d;
                    fr0 fr0Var = this.f8611d;
                    linkedHashMap.put(fr0Var, new sj0(this.f8612f, fr0Var.f4611f0, 0, jElapsedRealtime, null));
                }
                this.f8615s.f9176f.d(this.f8611d, jElapsedRealtime, null, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
