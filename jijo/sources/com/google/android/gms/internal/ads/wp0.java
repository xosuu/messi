package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class wp0 extends zzbt implements zzp, mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gy f10274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10275b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10277f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tp0 f10278h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sp0 f10279q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final VersionInfoParcel f10280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ed0 f10281t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b10 f10283v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g10 f10284w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicBoolean f10276d = new AtomicBoolean();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10282u = -1;

    public wp0(gy gyVar, Context context, String str, tp0 tp0Var, sp0 sp0Var, VersionInfoParcel versionInfoParcel, ed0 ed0Var) {
        this.f10274a = gyVar;
        this.f10275b = context;
        this.f10277f = str;
        this.f10278h = tp0Var;
        this.f10279q = sp0Var;
        this.f10280s = versionInfoParcel;
        this.f10281t = ed0Var;
        sp0Var.f8942q.set(this);
    }

    public final synchronized void u1(int i10) {
        try {
            if (this.f10276d.compareAndSet(false, true)) {
                this.f10279q.j();
                b10 b10Var = this.f10283v;
                if (b10Var != null) {
                    zzu.zzb().e(b10Var);
                }
                if (this.f10284w != null) {
                    long jElapsedRealtime = -1;
                    if (this.f10282u != -1) {
                        ((y3.b) zzu.zzB()).getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.f10282u;
                    }
                    this.f10284w.d(i10, jElapsedRealtime);
                }
                zzx();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        z3.a.j("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(zzq zzqVar) {
        z3.a.j("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(uc ucVar) {
        this.f10279q.f8938b.set(ucVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        this.f10278h.f9231u.f7366i = zzwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z9) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(nq nqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z9) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(og ogVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(pq pqVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(es esVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(zzfk zzfkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(a4.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.f10278h.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.xg r0 = com.google.android.gms.internal.ads.jh.f5942d     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.k()     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.la     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.cg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            r0 = 1
            goto L28
        L24:
            r0 = 0
            goto L28
        L26:
            r6 = move-exception
            goto L8c
        L28:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.f10280s     // Catch: java.lang.Throwable -> L26
            int r2 = r2.clientJarVersion     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.xf r3 = com.google.android.gms.internal.ads.eg.ma     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L26
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L26
            if (r2 < r3) goto L40
            if (r0 != 0) goto L45
        L40:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            z3.a.j(r0)     // Catch: java.lang.Throwable -> L26
        L45:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L26
            android.content.Context r0 = r5.f10275b     // Catch: java.lang.Throwable -> L26
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzH(r0)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L67
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L55
            goto L67
        L55:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r6)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.sp0 r6 = r5.f10279q     // Catch: java.lang.Throwable -> L26
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.en1.u0(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.t(r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r1
        L67:
            boolean r0 = r5.zzZ()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L6f
            monitor-exit(r5)
            return r1
        L6f:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            r5.f10276d = r0     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.vp0 r0 = new com.google.android.gms.internal.ads.vp0     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.tp0 r1 = r5.f10278h     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r5.f10277f     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.jp0 r3 = new com.google.android.gms.internal.ads.jp0     // Catch: java.lang.Throwable -> L26
            r4 = 25
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r1.b(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8c:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wp0.zzab(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzac(zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        if (this.f10284w != null) {
            ((y3.b) zzu.zzB()).getClass();
            this.f10282u = SystemClock.elapsedRealtime();
            int i10 = this.f10284w.f4761k;
            if (i10 > 0) {
                b10 b10Var = new b10((ScheduledExecutorService) ((zy) this.f10274a).f11344e.zzb(), zzu.zzB());
                this.f10283v = b10Var;
                b10Var.b(i10, new up0(this, 1));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdt() {
        g10 g10Var = this.f10284w;
        if (g10Var != null) {
            ((y3.b) zzu.zzB()).getClass();
            g10Var.d(1, SystemClock.elapsedRealtime() - this.f10282u);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            u1(2);
            return;
        }
        if (i11 == 1) {
            u1(4);
        } else if (i11 != 2) {
            u1(6);
        } else {
            u1(3);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final a4.a zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.f10277f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        z3.a.j("destroy must be called on the main UI thread.");
        g10 g10Var = this.f10284w;
        if (g10Var != null) {
            g10Var.b();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        z3.a.j("pause must be called on the main UI thread.");
    }
}
