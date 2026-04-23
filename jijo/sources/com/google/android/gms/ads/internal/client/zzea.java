package com.google.android.gms.ads.internal.client;

import a4.a;
import a4.b;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.zb;
import j3.p;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn f2009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzp f2010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f2011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VideoController f2012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f2013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zza f2014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdListener f2015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AdSize[] f2016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AppEventListener f2017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zzbu f2018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VideoOptions f2019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ViewGroup f2021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OnPaidEventListener f2024p;

    public zzea(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzp.zza, 0);
    }

    public static zzq a(Context context, AdSize[] adSizeArr, int i10) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        zzqVar.zzj = i10 == 1;
        return zzqVar;
    }

    public final boolean zzA() {
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                return zzbuVar.zzY();
            }
            return false;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final boolean zzB() {
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                return zzbuVar.zzZ();
            }
            return false;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final AdSize[] zzC() {
        return this.f2016h;
    }

    public final AdListener zza() {
        return this.f2015g;
    }

    public final AdSize zzb() {
        zzq zzqVarZzg;
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null && (zzqVarZzg = zzbuVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzqVarZzg.zze, zzqVarZzg.zzb, zzqVarZzg.zza);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
        AdSize[] adSizeArr = this.f2016h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.f2024p;
    }

    public final ResponseInfo zzd() {
        zzdn zzdnVarZzk = null;
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzdnVarZzk = zzbuVar.zzk();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zza(zzdnVarZzk);
    }

    public final VideoController zzf() {
        return this.f2012d;
    }

    public final VideoOptions zzg() {
        return this.f2019k;
    }

    public final AppEventListener zzh() {
        return this.f2017i;
    }

    public final zzdq zzi() {
        zzbu zzbuVar = this.f2018j;
        if (zzbuVar != null) {
            try {
                return zzbuVar.zzl();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbu zzbuVar;
        if (this.f2020l == null && (zzbuVar = this.f2018j) != null) {
            try {
                this.f2020l = zzbuVar.zzr();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
        return this.f2020l;
    }

    public final void zzk() {
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzx();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8 A[Catch: RemoteException -> 0x00d6, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d6, blocks: (B:28:0x00a5, B:30:0x00ab, B:32:0x00b9, B:34:0x00cb, B:37:0x00d8), top: B:52:0x00a5, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(com.google.android.gms.ads.internal.client.zzdx r14) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzea.zzm(com.google.android.gms.ads.internal.client.zzdx):void");
    }

    public final void zzn() {
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzz();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzo() {
        if (this.f2011c.getAndSet(true)) {
            return;
        }
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzA();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzp() {
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzB();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzq(zza zzaVar) {
        try {
            this.f2014f = zzaVar;
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzr(AdListener adListener) {
        this.f2015g = adListener;
        this.f2013e.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.f2016h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(AdSize... adSizeArr) {
        ViewGroup viewGroup = this.f2021m;
        this.f2016h = adSizeArr;
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzF(a(viewGroup.getContext(), this.f2016h, this.f2022n));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
        viewGroup.requestLayout();
    }

    public final void zzu(String str) {
        if (this.f2020l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f2020l = str;
    }

    public final void zzv(AppEventListener appEventListener) {
        try {
            this.f2017i = appEventListener;
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzG(appEventListener != null ? new zb(appEventListener) : null);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzw(boolean z9) {
        this.f2023o = z9;
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzN(z9);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.f2024p = onPaidEventListener;
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.f2019k = videoOptions;
        try {
            zzbu zzbuVar = this.f2018j;
            if (zzbuVar != null) {
                zzbuVar.zzU(videoOptions == null ? null : new zzfk(videoOptions));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final boolean zzz(zzbu zzbuVar) {
        try {
            a aVarZzn = zzbuVar.zzn();
            if (aVarZzn == null || ((View) b.a0(aVarZzn)).getParent() != null) {
                return false;
            }
            this.f2021m.addView((View) b.a0(aVarZzn));
            this.f2018j = zzbuVar;
            return true;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public zzea(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, zzp.zza, i10);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z9) {
        this(viewGroup, attributeSet, z9, zzp.zza, 0);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z9, int i10) {
        this(viewGroup, attributeSet, z9, zzp.zza, i10);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z9, zzp zzpVar, int i10) {
        zzq zzqVarZze;
        this.f2009a = new pn();
        this.f2012d = new VideoController();
        this.f2013e = new p(this);
        this.f2021m = viewGroup;
        this.f2010b = zzpVar;
        this.f2018j = null;
        this.f2011c = new AtomicBoolean(false);
        this.f2022n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                this.f2016h = zzyVar.zzb(z9);
                this.f2020l = zzyVar.zza();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVarZzb = zzay.zzb();
                    AdSize adSize = this.f2016h[0];
                    if (adSize.equals(AdSize.INVALID)) {
                        zzqVarZze = zzq.zze();
                    } else {
                        zzq zzqVar = new zzq(context, adSize);
                        zzqVar.zzj = i10 == 1;
                        zzqVarZze = zzqVar;
                    }
                    zzfVarZzb.zzn(viewGroup, zzqVarZze, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                zzay.zzb().zzm(viewGroup, new zzq(context, AdSize.BANNER), e10.getMessage(), e10.getMessage());
            }
        }
    }
}
