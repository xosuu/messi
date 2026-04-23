package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class dl0 extends zzbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbh f3694b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final or0 f3695d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l10 f3696f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f3697h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ed0 f3698q;

    public dl0(Context context, zzbh zzbhVar, or0 or0Var, n10 n10Var, ed0 ed0Var) {
        this.f3693a = context;
        this.f3694b = zzbhVar;
        this.f3695d = or0Var;
        this.f3696f = n10Var;
        this.f3698q = ed0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        zzu.zzp();
        frameLayout.addView(n10Var.f7100k, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.f3697h = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        this.f3696f.h();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        z3.a.j("destroy must be called on the main UI thread.");
        z40 z40Var = this.f3696f.f8359c;
        z40Var.getClass();
        z40Var.I0(new mu0(null, 0));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        zzm.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        zzm.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        zzm.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
        z3.a.j("setAdSize must be called on the main UI thread.");
        l10 l10Var = this.f3696f;
        if (l10Var != null) {
            l10Var.i(this.f3697h, zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        kl0 kl0Var = this.f3695d.f7643c;
        if (kl0Var != null) {
            kl0Var.k(zzcbVar);
        }
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
    public final void zzN(boolean z9) {
        zzm.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(og ogVar) {
        zzm.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        if (!((Boolean) zzba.zzc().a(eg.Ia)).booleanValue()) {
            zzm.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        kl0 kl0Var = this.f3695d.f7643c;
        if (kl0Var != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.f3698q.b();
                }
            } catch (RemoteException e10) {
                zzm.zzf("Error in making CSI ping for reporting paid event callback", e10);
            }
            kl0Var.f6313d.set(zzdgVar);
        }
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
    public final void zzU(zzfk zzfkVar) {
        zzm.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(a4.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        l10 l10Var = this.f3696f;
        return l10Var != null && l10Var.f8358b.f4633q0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzab(zzl zzlVar) {
        zzm.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzac(zzcf zzcfVar) {
        zzm.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        zzm.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        z3.a.j("getAdSize must be called on the main UI thread.");
        return en1.N(this.f3693a, Collections.singletonList(this.f3696f.f()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.f3694b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.f3695d.f7654n;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        return this.f3696f.f8362f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        return this.f3696f.e();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final a4.a zzn() {
        return new a4.b(this.f3697h);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        return this.f3695d.f7646f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        h40 h40Var = this.f3696f.f8362f;
        if (h40Var != null) {
            return h40Var.f5205a;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        h40 h40Var = this.f3696f.f8362f;
        if (h40Var != null) {
            return h40Var.f5205a;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        z3.a.j("destroy must be called on the main UI thread.");
        z40 z40Var = this.f3696f.f8359c;
        z40Var.getClass();
        z40Var.I0(new y40(null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        z3.a.j("destroy must be called on the main UI thread.");
        z40 z40Var = this.f3696f.f8359c;
        z40Var.getClass();
        z40Var.I0(new dg(null));
    }
}
