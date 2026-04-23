package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class i10 implements qx0, k21, su, SignalCallbacks, MediationRewardedAdCallback, s60, yx, zf0, jd, q20, fq0, pl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5456b;

    public i10() {
        this.f5455a = 24;
    }

    private final void c() {
        synchronized (((ep) this.f5456b)) {
        }
    }

    private final void e(Object obj) {
        kr0 kr0Var = (kr0) obj;
        if (((Boolean) zzba.zzc().a(eg.B5)).booleanValue()) {
            ((hf0) this.f5456b).f5275e.f(((hr0) kr0Var.f6383b.f10631d).f5375f);
            dh0 dh0Var = ((hf0) this.f5456b).f5275e;
            long j10 = ((hr0) kr0Var.f6383b.f10631d).f5376g;
            synchronized (dh0Var.f3666h) {
                dh0Var.f3661c = j10;
            }
        }
    }

    private final void f(Object obj) {
        synchronized (((ep) this.f5456b)) {
            ((ep) this.f5456b).f4271f = ((r20) obj).f8362f;
            ((r20) obj).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        switch (this.f5455a) {
            case 5:
                zzu.zzo().i("DefaultGmsgHandlers.attributionReportingManager", th);
                break;
            case 11:
                ((AtomicInteger) ((f.h0) this.f5456b).f12846b).set(-1);
                break;
            case 13:
            case 14:
                break;
            case 19:
                if (((Boolean) zzba.zzc().a(eg.B5)).booleanValue()) {
                    Matcher matcher = hf0.f5270h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        ((hf0) this.f5456b).f5275e.f(Integer.parseInt(matcher.group(1)));
                    }
                }
                break;
            default:
                try {
                    ((nr) this.f5456b).p(zzbb.zzb(th));
                } catch (RemoteException e10) {
                    zze.zzb("Ad service can't call client", e10);
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        switch (this.f5455a) {
            case 5:
                fx fxVar = (fx) this.f5456b;
                new zzbw(fxVar.getContext(), fxVar.zzn().afmaVersion, (String) obj).zzb();
                return;
            case 11:
                ((AtomicInteger) ((f.h0) this.f5456b).f12846b).set(1);
                return;
            case 13:
                s00 s00Var = (s00) this.f5456b;
                String str = (String) obj;
                qr0 qr0Var = s00Var.f8749t;
                ut0 ut0Var = s00Var.f8748s;
                kr0 kr0Var = s00Var.f8746h;
                fr0 fr0Var = s00Var.f8747q;
                qr0Var.c(true == zzu.zzo().a(((s00) this.f5456b).f8742a) ? 2 : 1, ut0Var.b(kr0Var, fr0Var, false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, str, fr0Var.f4604c));
                return;
            case 14:
                ((r30) this.f5456b).f8372a.zza();
                return;
            case 19:
                e(obj);
                return;
            case sf.zzm /* 21 */:
                try {
                    ((nr) this.f5456b).h((ParcelFileDescriptor) obj);
                    return;
                } catch (RemoteException e10) {
                    zze.zzb("Ad service can't call client", e10);
                    return;
                }
            case 26:
                f(obj);
                return;
            default:
                synchronized (((cr0) this.f5456b)) {
                    try {
                        ((cr0) this.f5456b).f3404f = (bc0) obj;
                        if (((Boolean) zzba.zzc().a(eg.f4004g3)).booleanValue()) {
                            ((bc0) obj).f2982s.f7038a = ((cr0) this.f5456b).f3403d;
                        }
                        ((cr0) this.f5456b).f3404f.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public final void b(i7 i7Var, zzapq zzapqVar) {
        i7Var.zzm("post-error");
        ((c7) ((Executor) this.f5456b)).f3224a.post(new l0.a(i7Var, new l7(zzapqVar), null, 12, 0));
    }

    public final void d(i7 i7Var, l7 l7Var, vm vmVar) {
        i7Var.zzq();
        i7Var.zzm("post-response");
        ((c7) ((Executor) this.f5456b)).f3224a.post(new l0.a(i7Var, l7Var, vmVar, 12, 0));
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void k(rf rfVar) {
        lf lfVar = (lf) ((sf) rfVar.f9462b).K().o();
        ge geVar = (ge) this.f5456b;
        lfVar.d();
        mf.A((mf) lfVar.f9462b, geVar);
        rfVar.d();
        sf.D((sf) rfVar.f9462b, (mf) lfVar.b());
    }

    @Override // com.google.android.gms.internal.ads.zf0
    public final n5.a n(zzbvb zzbvbVar) {
        return ((sg0) ((eh1) ((tl0) this.f5456b).f9188f).zzb()).x1(zzbvbVar.f11581t);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdClosed.");
        try {
            ((wn) this.f5456b).zzf();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToShow.");
        zzm.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            ((wn) this.f5456b).E(adError.zza());
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdOpened.");
        try {
            ((wn) this.f5456b).zzp();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            ((dp) this.f5456b).H(adError.zza());
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            ((dp) this.f5456b).a(str);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onUserEarnedReward.");
        try {
            ((wn) this.f5456b).t0(new zs(rewardItem));
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onVideoComplete.");
        try {
            ((wn) this.f5456b).zzu();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onVideoStart.");
        try {
            ((wn) this.f5456b).J();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called reportAdClicked.");
        try {
            ((wn) this.f5456b).zze();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called reportAdImpression.");
        try {
            ((wn) this.f5456b).zzm();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        switch (this.f5455a) {
            case 15:
                ((u40) obj).a(en1.u0(12, ((zzdgw) this.f5456b).getMessage(), null));
                break;
            case 16:
                ((u50) obj).J((zzbvb) this.f5456b);
                break;
            case 25:
                Pair pair = (Pair) this.f5456b;
                ((zzcb) obj).zzc((String) pair.first, (String) pair.second);
                break;
            case 27:
                ((zzdg) obj).zze((zzs) this.f5456b);
                break;
            default:
                as asVar = (as) this.f5456b;
                ds dsVar = (ds) ((es) obj);
                Parcel parcelM = dsVar.m();
                qb.e(parcelM, asVar);
                dsVar.a0(parcelM, 5);
                break;
        }
    }

    public /* synthetic */ i10(int i10, Object obj) {
        this.f5455a = i10;
        this.f5456b = obj;
    }

    public /* synthetic */ i10(int i10, Object obj, int i11) {
        this.f5455a = i10;
        this.f5456b = obj;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            ((dp) this.f5456b).zzf(str);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    public i10(Handler handler) {
        this.f5455a = 2;
        this.f5456b = new c7(handler);
    }

    public i10(UUID uuid) {
        this.f5455a = 1;
        this.f5456b = uuid;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToShow.");
        zzm.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            ((wn) this.f5456b).l(str);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final com.google.android.gms.ads.internal.client.zzdq mo3zza() throws zzffn {
        vr0 vr0Var = (vr0) this.f5456b;
        vr0Var.getClass();
        try {
            return vr0Var.f9963a.zzh();
        } catch (Throwable th) {
            throw new zzffn(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final Object mo3zza() {
        return ((SharedPreferences) this.f5456b).getString("app_settings_json", "{}");
    }

    @Override // com.google.android.gms.internal.ads.su, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: zza */
    public final void mo1zza() {
        switch (this.f5455a) {
            case 7:
                ((tm) this.f5456b).f9192d.r();
                return;
            case 8:
                ((qu) this.f5456b).c(new zzbnd("Cannot get Javascript Engine"));
                return;
            case 26:
                c();
                return;
            default:
                synchronized (((cr0) this.f5456b)) {
                    ((cr0) this.f5456b).f3404f = null;
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void zza(boolean z9, int i10, String str, String str2) {
        ((ed) this.f5456b).d();
    }
}
