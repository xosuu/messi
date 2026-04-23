package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class br0 extends ms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yq0 f3083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wq0 f3084b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3085d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lr0 f3086f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f3087h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final VersionInfoParcel f3088q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y9 f3089s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ed0 f3090t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public bc0 f3091u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3092v = ((Boolean) zzba.zzc().a(eg.f4153v0)).booleanValue();

    public br0(String str, yq0 yq0Var, Context context, wq0 wq0Var, lr0 lr0Var, VersionInfoParcel versionInfoParcel, y9 y9Var, ed0 ed0Var) {
        this.f3085d = str;
        this.f3083a = yq0Var;
        this.f3084b = wq0Var;
        this.f3086f = lr0Var;
        this.f3087h = context;
        this.f3088q = versionInfoParcel;
        this.f3089s = y9Var;
        this.f3090t = ed0Var;
    }

    public final synchronized void u1(zzl zzlVar, us usVar, int i10) {
        try {
            boolean z9 = false;
            if (((Boolean) jh.f5949k.k()).booleanValue()) {
                if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                    z9 = true;
                }
            }
            if (this.f3088q.clientJarVersion < ((Integer) zzba.zzc().a(eg.ma)).intValue() || !z9) {
                z3.a.j("#008 Must be called on the main UI thread.");
            }
            this.f3084b.f10296d.set(usVar);
            zzu.zzp();
            if (zzt.zzH(this.f3087h) && zzlVar.zzs == null) {
                zzm.zzg("Failed to load the ad because app ID is missing.");
                this.f3084b.t(en1.u0(4, null, null));
                return;
            }
            if (this.f3091u != null) {
                return;
            }
            vp0 vp0Var = new vp0();
            yq0 yq0Var = this.f3083a;
            yq0Var.f11013t.f7372o.f1331b = i10;
            yq0Var.b(zzlVar, this.f3085d, vp0Var, new aa(25, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final Bundle zzb() {
        z3.a.j("#008 Must be called on the main UI thread.");
        bc0 bc0Var = this.f3091u;
        return bc0Var != null ? bc0Var.b() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final zzdn zzc() {
        bc0 bc0Var;
        if (((Boolean) zzba.zzc().a(eg.f3962c6)).booleanValue() && (bc0Var = this.f3091u) != null) {
            return bc0Var.f8362f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final ks zzd() {
        z3.a.j("#008 Must be called on the main UI thread.");
        bc0 bc0Var = this.f3091u;
        if (bc0Var != null) {
            return bc0Var.f2980q;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final synchronized String zze() {
        h40 h40Var;
        bc0 bc0Var = this.f3091u;
        if (bc0Var == null || (h40Var = bc0Var.f8362f) == null) {
            return null;
        }
        return h40Var.f5205a;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final synchronized void zzf(zzl zzlVar, us usVar) {
        u1(zzlVar, usVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final synchronized void zzg(zzl zzlVar, us usVar) {
        u1(zzlVar, usVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final synchronized void zzh(boolean z9) {
        z3.a.j("setImmersiveMode must be called on the main UI thread.");
        this.f3092v = z9;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzi(zzdd zzddVar) {
        wq0 wq0Var = this.f3084b;
        if (zzddVar == null) {
            wq0Var.f10295b.set(null);
        } else {
            wq0Var.f10295b.set(new ar0(this, zzddVar, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzj(zzdg zzdgVar) {
        z3.a.j("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.f3090t.b();
            }
        } catch (RemoteException e10) {
            zzm.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f3084b.f10301t.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzk(qs qsVar) {
        z3.a.j("#008 Must be called on the main UI thread.");
        this.f3084b.f10297f.set(qsVar);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final synchronized void zzl(zzbwu zzbwuVar) {
        z3.a.j("#008 Must be called on the main UI thread.");
        lr0 lr0Var = this.f3086f;
        lr0Var.f6695a = zzbwuVar.f11591a;
        lr0Var.f6696b = zzbwuVar.f11592b;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final synchronized void zzm(a4.a aVar) {
        zzn(aVar, this.f3092v);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final synchronized void zzn(a4.a aVar, boolean z9) {
        z3.a.j("#008 Must be called on the main UI thread.");
        if (this.f3091u == null) {
            zzm.zzj("Rewarded can not be shown before loaded");
            this.f3084b.a(en1.u0(9, null, null));
            return;
        }
        if (((Boolean) zzba.zzc().a(eg.f4136t2)).booleanValue()) {
            this.f3089s.f10801b.zzn(new Throwable().getStackTrace());
        }
        this.f3091u.c((Activity) a4.b.a0(aVar), z9);
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final boolean zzo() {
        z3.a.j("#008 Must be called on the main UI thread.");
        bc0 bc0Var = this.f3091u;
        return (bc0Var == null || bc0Var.f2983t) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final void zzp(vs vsVar) {
        z3.a.j("#008 Must be called on the main UI thread.");
        this.f3084b.f10299q.set(vsVar);
    }
}
