package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rx f8308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8309b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8310d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f8311f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8312h;

    public /* synthetic */ qx(rx rxVar, int i10, int i11, boolean z9, boolean z10) {
        this.f8308a = rxVar;
        this.f8309b = i10;
        this.f8310d = i11;
        this.f8311f = z9;
        this.f8312h = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        boolean z9;
        boolean z10;
        zzdt zzdtVar;
        zzdt zzdtVar2;
        zzdt zzdtVar3;
        rx rxVar = this.f8308a;
        int i11 = this.f8309b;
        int i12 = this.f8310d;
        boolean z11 = this.f8311f;
        boolean z12 = this.f8312h;
        synchronized (rxVar.f8706b) {
            try {
                boolean z13 = rxVar.f8711s;
                if (z13 || i12 != 1) {
                    i10 = i12;
                    z9 = false;
                } else {
                    i12 = 1;
                    i10 = 1;
                    z9 = true;
                }
                boolean z14 = i11 != i12;
                if (z14 && i10 == 1) {
                    z10 = true;
                    i10 = 1;
                } else {
                    z10 = false;
                }
                boolean z15 = z14 && i10 == 2;
                boolean z16 = z14 && i10 == 3;
                rxVar.f8711s = z13 || z9;
                if (z9) {
                    try {
                        zzdt zzdtVar4 = rxVar.f8710q;
                        if (zzdtVar4 != null) {
                            zzdtVar4.zzi();
                        }
                    } catch (RemoteException e10) {
                        zzm.zzl("#007 Could not call remote method.", e10);
                    }
                }
                if (z10 && (zzdtVar3 = rxVar.f8710q) != null) {
                    zzdtVar3.zzh();
                }
                if (z15 && (zzdtVar2 = rxVar.f8710q) != null) {
                    zzdtVar2.zzg();
                }
                if (z16) {
                    zzdt zzdtVar5 = rxVar.f8710q;
                    if (zzdtVar5 != null) {
                        zzdtVar5.zze();
                    }
                    rxVar.f8705a.b();
                }
                if (z11 != z12 && (zzdtVar = rxVar.f8710q) != null) {
                    zzdtVar.zzf(z12);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
