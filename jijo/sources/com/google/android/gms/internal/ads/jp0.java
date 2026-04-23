package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.nonagon.signalgeneration.zzan;
import com.google.android.gms.ads.nonagon.signalgeneration.zzap;
import com.google.android.gms.common.ConnectionResult;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class jp0 implements r7, v3.c, tu, MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback, k21, s60, zzm, jd, zf0, j80, ay, x11, fq0, pl0, mq0, k4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6060b;

    public /* synthetic */ jp0(int i10, Object obj) {
        this.f6059a = i10;
        this.f6060b = obj;
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        switch (this.f6059a) {
            case 9:
                ((f30) this.f6060b).f4372f.h(false);
                break;
            case 13:
                if (((Boolean) zzba.zzc().a(eg.I4)).booleanValue()) {
                    zzu.zzo().i("omid native display exp", th);
                }
                break;
            case 17:
                break;
            default:
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
                break;
        }
    }

    public final void J(long j10) {
        tl0 tl0Var = new tl0("creation");
        tl0Var.f9185a = Long.valueOf(j10);
        tl0Var.f9187d = "nativeObjectNotCreated";
        L(tl0Var);
    }

    public final void L(tl0 tl0Var) {
        String strE = tl0.e(tl0Var);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching AFMA event on publisher webview: ".concat(strE));
        ((jl) this.f6060b).zzb(strE);
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        switch (this.f6059a) {
            case 9:
                ((f30) this.f6060b).f4372f.h(true);
                return;
            case 13:
                try {
                    fx fxVar = (fx) ((List) obj).get(0);
                    if (fxVar != null) {
                        ia0 ia0Var = (ia0) this.f6060b;
                        ia0Var.getClass();
                        ia0Var.f5550d.execute(new mx(fxVar, 4));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e10) {
                    if (((Boolean) zzba.zzc().a(eg.I4)).booleanValue()) {
                        zzu.zzo().i("omid native display exp", e10);
                        return;
                    }
                    return;
                }
            case 17:
                ((vf0) this.f6060b).f9837c.b((kr0) obj);
                return;
            case 19:
                try {
                    ((rs0) this.f6060b).zza((SQLiteDatabase) obj);
                    return;
                } catch (Exception e11) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e11.getMessage())));
                    return;
                }
            default:
                g10 g10Var = (g10) obj;
                synchronized (((wp0) this.f6060b)) {
                    try {
                        g10 g10Var2 = ((wp0) this.f6060b).f10284w;
                        if (g10Var2 != null) {
                            g10Var2.b();
                        }
                        wp0 wp0Var = (wp0) this.f6060b;
                        wp0Var.f10284w = g10Var;
                        fx fxVar2 = g10Var.f4760j;
                        if (fxVar2 != null) {
                            fxVar2.f0(wp0Var);
                        }
                        wp0 wp0Var2 = (wp0) this.f6060b;
                        wp0Var2.f10279q.k(new h10(g10Var, wp0Var2, wp0Var2.f10279q, wp0Var2.f10281t));
                        g10Var.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // k4.c
    public final void b(Exception exc) {
        android.support.v4.media.b bVar = (android.support.v4.media.b) this.f6060b;
        bVar.getClass();
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((cv0) bVar.f95c).b(2025, -1L, exc);
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void h(boolean z9, Context context, s40 s40Var) throws zzdgw {
        fi0 fi0Var = (fi0) this.f6060b;
        try {
            ((vr0) fi0Var.f4535b).c(z9);
            vr0 vr0Var = (vr0) fi0Var.f4535b;
            vr0Var.getClass();
            try {
                vr0Var.f9963a.W(new a4.b(context));
            } catch (Throwable th) {
                throw new zzffn(th);
            }
        } catch (zzffn e10) {
            throw new zzdgw(e10.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final bz j(lq0 lq0Var) {
        return ((yq0) this.f6060b).a(lq0Var);
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void k(rf rfVar) {
        rfVar.e((ve) this.f6060b);
    }

    @Override // com.google.android.gms.internal.ads.zf0
    public final n5.a n(zzbvb zzbvbVar) {
        return ((sg0) ((eh1) ((tl0) this.f6060b).f9188f).zzb()).u1(zzbvbVar, Binder.getCallingUid());
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdClosed.");
        try {
            ((wn) this.f6060b).zzf();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public final void onAdFailedToShow(AdError adError) {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdFailedToShow.");
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            ((wn) this.f6060b).E(adError.zza());
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdLeftApplication.");
        try {
            ((wn) this.f6060b).zzn();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdOpened.");
        try {
            ((wn) this.f6060b).zzp();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onVideoComplete.");
        try {
            ((wn) this.f6060b).zzu();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onVideoPause.");
        try {
            ((wn) this.f6060b).b();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onVideoPlay.");
        try {
            ((wn) this.f6060b).zzx();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called reportAdClicked.");
        try {
            ((wn) this.f6060b).zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called reportAdImpression.");
        try {
            ((wn) this.f6060b).zzm();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // v3.c
    public final void t(ConnectionResult connectionResult) {
        synchronized (((bd) this.f6060b).f2988c) {
            Object obj = this.f6060b;
            ((bd) obj).f2991f = null;
            bd bdVar = (bd) obj;
            if (bdVar.f2989d != null) {
                bdVar.f2989d = null;
            }
            ((bd) obj).f2988c.notifyAll();
        }
    }

    public final void z(int i10, boolean z9) {
        if (z9) {
            ((f.x0) this.f6060b).c(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.r7
    /* JADX INFO: renamed from: zza */
    public final File mo7zza() {
        return (File) this.f6060b;
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdg() {
        r50 r50Var = ((kc0) this.f6060b).f6253g;
        synchronized (r50Var) {
            try {
                if (!r50Var.f8416t) {
                    ScheduledFuture scheduledFuture = r50Var.f8417u;
                    if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                        r50Var.f8414q = -1L;
                    } else {
                        r50Var.f8417u.cancel(false);
                        long j10 = r50Var.f8412f;
                        ((y3.b) r50Var.f8411d).getClass();
                        r50Var.f8414q = j10 - SystemClock.elapsedRealtime();
                    }
                    ScheduledFuture scheduledFuture2 = r50Var.f8418v;
                    if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                        r50Var.f8415s = -1L;
                    } else {
                        r50Var.f8418v.cancel(false);
                        long j11 = r50Var.f8413h;
                        ((y3.b) r50Var.f8411d).getClass();
                        r50Var.f8415s = j11 - SystemClock.elapsedRealtime();
                    }
                    r50Var.f8416t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdh() {
        r50 r50Var = ((kc0) this.f6060b).f6253g;
        synchronized (r50Var) {
            try {
                if (r50Var.f8416t) {
                    if (r50Var.f8414q > 0 && r50Var.f8417u.isCancelled()) {
                        r50Var.L0(r50Var.f8414q);
                    }
                    if (r50Var.f8415s > 0 && r50Var.f8418v.isCancelled()) {
                        r50Var.M0(r50Var.f8415s);
                    }
                    r50Var.f8416t = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ jp0(int i10, Object obj, int i11) {
        this.f6059a = i10;
        this.f6060b = obj;
    }

    @Override // com.google.android.gms.internal.ads.tu, com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        int i10 = this.f6059a;
        Object obj2 = this.f6060b;
        switch (i10) {
            case 4:
                ym ymVar = (ym) obj2;
                ymVar.getClass();
                if (((lm) obj).f6659a.f7407a.A()) {
                    ymVar.f10937i = 1;
                }
                break;
            case 5:
                nu.f7387e.execute(new vm(this, 0, (lm) obj));
                break;
            case 10:
                ((o50) obj).h(((m50) obj2).f6869b.f4609e0);
                break;
            case 12:
                ((fl) obj).e0((zzbvz) obj2);
                break;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                ((uc) obj).Z0((rc) obj2);
                break;
            default:
                ts0 ts0Var = (ts0) obj2;
                ((ys0) obj).a(ts0Var.f9283b);
                break;
        }
    }

    public /* synthetic */ jp0(d60 d60Var) {
        this.f6059a = 11;
        this.f6060b = d60Var;
    }

    public jp0(String[] strArr) {
        this.f6059a = 1;
        this.f6060b = strArr;
    }

    public jp0() {
        this.f6059a = 7;
        this.f6060b = new f.x0();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(String str) {
        z3.a.j("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Adapter called onAdFailedToShow.");
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            ((wn) this.f6060b).l(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.x11
    /* JADX INFO: renamed from: zza */
    public final n5.a mo2zza() {
        lo0 lo0Var = (lo0) this.f6060b;
        zy zyVar = ((zy) lo0Var.f6681f).f11340c;
        tl0 tl0Var = new tl0();
        tl0Var.f9187d = lo0Var.f6679d;
        nr0 nr0Var = new nr0();
        nr0Var.f7360c = "adUnitId";
        nr0Var.f7358a = lo0Var.f6680e.f7644d;
        nr0Var.f7359b = new zzq();
        nr0Var.f7376s = true;
        tl0Var.f9185a = nr0Var.a();
        z30 z30Var = new z30(tl0Var);
        zzan zzanVar = new zzan();
        zzanVar.zza(lo0Var.f6676a);
        zzap zzapVarZzb = zzanVar.zzb();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        tp1.h0(zzapVarZzb, zzap.class);
        h21 h21Var = (h21) tc1.r0(h21.r(new pz(zyVar, zzapVarZzb, z30Var).zzb()), ((Long) zzba.zzc().a(eg.f4140t6)).longValue(), TimeUnit.MILLISECONDS, lo0Var.f6678c);
        b3 b3Var = new b3(12);
        p21 p21Var = lo0Var.f6677b;
        return tc1.P(tc1.o0(h21Var, b3Var, p21Var), Exception.class, new b3(13), p21Var);
    }

    @Override // com.google.android.gms.internal.ads.ay, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: zza */
    public final void mo1zza() {
        switch (this.f6059a) {
            case 16:
                L(new tl0("initialize"));
                return;
            case sf.zzm /* 21 */:
                ((fx) this.f6060b).zzaa();
                return;
            default:
                synchronized (((wp0) this.f6060b)) {
                    ((wp0) this.f6060b).f10284w = null;
                    break;
                }
                return;
        }
    }
}
