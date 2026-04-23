package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class gl0 extends zzbt implements p50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yp0 f4947b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4948d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kl0 f4949f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzq f4950h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nr0 f4951q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final VersionInfoParcel f4952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ed0 f4953t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l10 f4954u;

    public gl0(Context context, zzq zzqVar, String str, yp0 yp0Var, kl0 kl0Var, VersionInfoParcel versionInfoParcel, ed0 ed0Var) {
        this.f4946a = context;
        this.f4947b = yp0Var;
        this.f4950h = zzqVar;
        this.f4948d = str;
        this.f4949f = kl0Var;
        this.f4951q = yp0Var.f10996w;
        this.f4952s = versionInfoParcel;
        this.f4953t = ed0Var;
        yp0Var.f10993t.H0(this, yp0Var.f10987b);
    }

    public final synchronized void u1(zzq zzqVar) {
        nr0 nr0Var = this.f4951q;
        nr0Var.f7359b = zzqVar;
        nr0Var.f7374q = this.f4950h.zzn;
    }

    public final synchronized boolean v1(zzl zzlVar) {
        try {
            if (w1()) {
                z3.a.j("loadAd must be called on the main UI thread.");
            }
            zzu.zzp();
            if (!zzt.zzH(this.f4946a) || zzlVar.zzs != null) {
                tp1.I(this.f4946a, zzlVar.zzf);
                return this.f4947b.b(zzlVar, this.f4948d, null, new aa(20, this));
            }
            zzm.zzg("Failed to load the ad because app ID is missing.");
            kl0 kl0Var = this.f4949f;
            if (kl0Var != null) {
                kl0Var.t(en1.u0(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w1() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.xg r0 = com.google.android.gms.internal.ads.jh.f5944f
            java.lang.Object r0 = r0.k()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.la
            com.google.android.gms.internal.ads.cg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r6.f4952s
            int r3 = r3.clientJarVersion
            com.google.android.gms.internal.ads.xf r4 = com.google.android.gms.internal.ads.eg.ma
            com.google.android.gms.internal.ads.cg r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gl0.w1():boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
        z3.a.j("recordManualImpression must be called on the main UI thread.");
        l10 l10Var = this.f4954u;
        if (l10Var != null) {
            l10Var.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.xg r0 = com.google.android.gms.internal.ads.jh.f5946h     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.k()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.ha     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.cg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r4.f4952s     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.xf r1 = com.google.android.gms.internal.ads.eg.na     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.cg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L56
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            z3.a.j(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.l10 r0 = r4.f4954u     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L54
            com.google.android.gms.internal.ads.z40 r0 = r0.f8359c     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.mu0 r1 = new com.google.android.gms.internal.ads.mu0     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L38
            r0.I0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)
            return
        L56:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gl0.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        if (w1()) {
            z3.a.j("setAdListener must be called on the main UI thread.");
        }
        ml0 ml0Var = this.f4947b.f10990h;
        synchronized (ml0Var) {
            ml0Var.f7002a = zzbeVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        if (w1()) {
            z3.a.j("setAdListener must be called on the main UI thread.");
        }
        this.f4949f.f6311a.set(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        z3.a.j("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(zzq zzqVar) {
        z3.a.j("setAdSize must be called on the main UI thread.");
        this.f4951q.f7359b = zzqVar;
        this.f4950h = zzqVar;
        l10 l10Var = this.f4954u;
        if (l10Var != null) {
            l10Var.i(this.f4947b.f10991q, zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        if (w1()) {
            z3.a.j("setAppEventListener must be called on the main UI thread.");
        }
        this.f4949f.k(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(uc ucVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
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
        try {
            if (w1()) {
                z3.a.j("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f4951q.f7362e = z9;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(og ogVar) {
        z3.a.j("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f4947b.f10992s = ogVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        if (w1()) {
            z3.a.j("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdgVar.zzf()) {
                this.f4953t.b();
            }
        } catch (RemoteException e10) {
            zzm.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f4949f.f6313d.set(zzdgVar);
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
        try {
            if (w1()) {
                z3.a.j("setVideoOptions must be called on the main UI thread.");
            }
            this.f4951q.f7361d = zzfkVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(a4.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        l10 l10Var = this.f4954u;
        if (l10Var != null) {
            if (l10Var.f8358b.f4633q0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.f4947b.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzab(zzl zzlVar) {
        u1(this.f4950h);
        return v1(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzac(zzcf zzcfVar) {
        z3.a.j("setCorrelationIdProvider must be called on the main UI thread");
        this.f4951q.f7378u = zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        z3.a.j("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzq zzg() {
        z3.a.j("getAdSize must be called on the main UI thread.");
        l10 l10Var = this.f4954u;
        if (l10Var != null) {
            return en1.N(this.f4946a, Collections.singletonList(l10Var.f()));
        }
        return this.f4951q.f7359b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.f4949f.j();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        zzcb zzcbVar;
        kl0 kl0Var = this.f4949f;
        synchronized (kl0Var) {
            zzcbVar = (zzcb) kl0Var.f6312b.get();
        }
        return zzcbVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        l10 l10Var;
        if (((Boolean) zzba.zzc().a(eg.f3962c6)).booleanValue() && (l10Var = this.f4954u) != null) {
            return l10Var.f8362f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        z3.a.j("getVideoController must be called from the main thread.");
        l10 l10Var = this.f4954u;
        if (l10Var == null) {
            return null;
        }
        return l10Var.e();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final a4.a zzn() {
        if (w1()) {
            z3.a.j("getAdFrame must be called on the main UI thread.");
        }
        return new a4.b(this.f4947b.f10991q);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.f4948d;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        h40 h40Var;
        l10 l10Var = this.f4954u;
        if (l10Var == null || (h40Var = l10Var.f8362f) == null) {
            return null;
        }
        return h40Var.f5205a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        h40 h40Var;
        l10 l10Var = this.f4954u;
        if (l10Var == null || (h40Var = l10Var.f8362f) == null) {
            return null;
        }
        return h40Var.f5205a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.xg r0 = com.google.android.gms.internal.ads.jh.f5943e     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.k()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.ia     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.cg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.f4952s     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.xf r1 = com.google.android.gms.internal.ads.eg.na     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.cg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L55
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            z3.a.j(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.l10 r0 = r3.f4954u     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L53
            com.google.android.gms.internal.ads.z40 r0 = r0.f8359c     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.y40 r1 = new com.google.android.gms.internal.ads.y40     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            r0.I0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L53:
            monitor-exit(r3)
            return
        L55:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gl0.zzx():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.xg r0 = com.google.android.gms.internal.ads.jh.f5945g     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.k()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.ja     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.cg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.f4952s     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.xf r1 = com.google.android.gms.internal.ads.eg.na     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.cg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L55
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            z3.a.j(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.l10 r0 = r3.f4954u     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L53
            com.google.android.gms.internal.ads.z40 r0 = r0.f8359c     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.dg r1 = new com.google.android.gms.internal.ads.dg     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            r0.I0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L53:
            monitor-exit(r3)
            return
        L55:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gl0.zzz():void");
    }
}
