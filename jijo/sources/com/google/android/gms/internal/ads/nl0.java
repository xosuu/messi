package com.google.android.gms.internal.ads;

import android.app.Activity;
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

/* JADX INFO: loaded from: classes.dex */
public final class nl0 extends zzbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzq f7298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7299b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uq0 f7300d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7301f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final VersionInfoParcel f7302h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kl0 f7303q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wq0 f7304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y9 f7305t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ed0 f7306u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z70 f7307v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7308w = ((Boolean) zzba.zzc().a(eg.f4153v0)).booleanValue();

    public nl0(Context context, zzq zzqVar, String str, uq0 uq0Var, kl0 kl0Var, wq0 wq0Var, VersionInfoParcel versionInfoParcel, y9 y9Var, ed0 ed0Var) {
        this.f7298a = zzqVar;
        this.f7301f = str;
        this.f7299b = context;
        this.f7300d = uq0Var;
        this.f7303q = kl0Var;
        this.f7304s = wq0Var;
        this.f7302h = versionInfoParcel;
        this.f7305t = y9Var;
        this.f7306u = ed0Var;
    }

    public final synchronized boolean u1() {
        z70 z70Var = this.f7307v;
        if (z70Var != null) {
            if (!z70Var.f11173n.f2886b.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        z3.a.j("resume must be called on the main UI thread.");
        z70 z70Var = this.f7307v;
        if (z70Var != null) {
            z40 z40Var = z70Var.f8359c;
            z40Var.getClass();
            z40Var.I0(new mu0(null, 0));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        z3.a.j("setAdListener must be called on the main UI thread.");
        this.f7303q.f6311a.set(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        z3.a.j("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        z3.a.j("setAppEventListener must be called on the main UI thread.");
        this.f7303q.k(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(uc ucVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
        this.f7303q.f6315h.set(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z9) {
        z3.a.j("setImmersiveMode must be called on the main UI thread.");
        this.f7308w = z9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(nq nqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z9) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(og ogVar) {
        z3.a.j("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f7300d.f9577q = ogVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        z3.a.j("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.f7306u.b();
            }
        } catch (RemoteException e10) {
            zzm.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f7303q.f6313d.set(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(pq pqVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(es esVar) {
        this.f7304s.f10298h.set(esVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfk zzfkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(a4.a aVar) {
        if (this.f7307v == null) {
            zzm.zzj("Interstitial can not be shown before loaded.");
            this.f7303q.a(en1.u0(9, null, null));
            return;
        }
        if (((Boolean) zzba.zzc().a(eg.f4136t2)).booleanValue()) {
            this.f7305t.f10801b.zzn(new Throwable().getStackTrace());
        }
        this.f7307v.b((Activity) a4.b.a0(aVar), this.f7308w);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        z3.a.j("showInterstitial must be called on the main UI thread.");
        if (this.f7307v == null) {
            zzm.zzj("Interstitial can not be shown before loaded.");
            this.f7303q.a(en1.u0(9, null, null));
        } else {
            if (((Boolean) zzba.zzc().a(eg.f4136t2)).booleanValue()) {
                this.f7305t.f10801b.zzn(new Throwable().getStackTrace());
            }
            this.f7307v.b(null, this.f7308w);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.f7300d.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzaa() {
        z3.a.j("isLoaded must be called on the main UI thread.");
        return u1();
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
            com.google.android.gms.internal.ads.xg r0 = com.google.android.gms.internal.ads.jh.f5947i     // Catch: java.lang.Throwable -> L26
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
            goto L90
        L28:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.f7302h     // Catch: java.lang.Throwable -> L26
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
            android.content.Context r0 = r5.f7299b     // Catch: java.lang.Throwable -> L26
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzH(r0)     // Catch: java.lang.Throwable -> L26
            r2 = 0
            if (r0 == 0) goto L67
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L67
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r6)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.kl0 r6 = r5.f7303q     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L8e
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.en1.u0(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.t(r0)     // Catch: java.lang.Throwable -> L26
            goto L8e
        L67:
            boolean r0 = r5.u1()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L8e
            android.content.Context r0 = r5.f7299b     // Catch: java.lang.Throwable -> L26
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.tp1.I(r0, r1)     // Catch: java.lang.Throwable -> L26
            r5.f7307v = r2     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.uq0 r0 = r5.f7300d     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r5.f7301f     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.ads.internal.client.zzq r2 = r5.f7298a     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.rq0 r3 = new com.google.android.gms.internal.ads.rq0     // Catch: java.lang.Throwable -> L26
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.aa r2 = new com.google.android.gms.internal.ads.aa     // Catch: java.lang.Throwable -> L26
            r4 = 21
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r0.b(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8e:
            monitor-exit(r5)
            return r1
        L90:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nl0.zzab(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzac(zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        z3.a.j("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.f7303q.j();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        zzcb zzcbVar;
        kl0 kl0Var = this.f7303q;
        synchronized (kl0Var) {
            zzcbVar = (zzcb) kl0Var.f6312b.get();
        }
        return zzcbVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        z70 z70Var;
        if (((Boolean) zzba.zzc().a(eg.f3962c6)).booleanValue() && (z70Var = this.f7307v) != null) {
            return z70Var.f8362f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final a4.a zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.f7301f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        h40 h40Var;
        z70 z70Var = this.f7307v;
        if (z70Var == null || (h40Var = z70Var.f8362f) == null) {
            return null;
        }
        return h40Var.f5205a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        h40 h40Var;
        z70 z70Var = this.f7307v;
        if (z70Var == null || (h40Var = z70Var.f8362f) == null) {
            return null;
        }
        return h40Var.f5205a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        z3.a.j("destroy must be called on the main UI thread.");
        z70 z70Var = this.f7307v;
        if (z70Var != null) {
            z40 z40Var = z70Var.f8359c;
            z40Var.getClass();
            z40Var.I0(new y40(null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.f7303q.f6314f.set(zzbkVar);
        zzab(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        z3.a.j("pause must be called on the main UI thread.");
        z70 z70Var = this.f7307v;
        if (z70Var != null) {
            z40 z40Var = z70Var.f8359c;
            z40Var.getClass();
            z40Var.I0(new dg(null));
        }
    }
}
