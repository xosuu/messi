package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzbu f10830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzdx f10833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppOpenAd.AppOpenAdLoadCallback f10835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pn f10836g = new pn();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzp f10837h = zzp.zza;

    public yc(Context context, String str, zzdx zzdxVar, int i10, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f10831b = context;
        this.f10832c = str;
        this.f10833d = zzdxVar;
        this.f10834e = i10;
        this.f10835f = appOpenAdLoadCallback;
    }

    public final void a() {
        zzdx zzdxVar = this.f10833d;
        String str = this.f10832c;
        Context context = this.f10831b;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbu zzbuVarZzd = zzay.zza().zzd(context, zzq.zzb(), str, this.f10836g);
            this.f10830a = zzbuVarZzd;
            if (zzbuVarZzd != null) {
                int i10 = this.f10834e;
                if (i10 != 3) {
                    this.f10830a.zzI(new zzw(i10));
                }
                zzdxVar.zzq(jCurrentTimeMillis);
                this.f10830a.zzH(new nc(this.f10835f, str));
                this.f10830a.zzab(this.f10837h.zza(context, zzdxVar));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }
}
