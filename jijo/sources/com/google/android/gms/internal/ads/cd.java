package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzg;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class cd extends zzc {
    public final /* synthetic */ int E;

    /* JADX WARN: Illegal instructions before constructor call */
    public cd(Context context, Looper looper, v3.b bVar, v3.c cVar, int i10) {
        this.E = i10;
        if (i10 == 1) {
            int i11 = zr.f11315a;
            Context applicationContext = context.getApplicationContext();
            super(applicationContext == null ? context : applicationContext, looper, 166, bVar, cVar);
        } else if (i10 != 2) {
            int i12 = zr.f11315a;
            Context applicationContext2 = context.getApplicationContext();
            super(applicationContext2 == null ? context : applicationContext2, looper, 123, bVar, cVar);
        } else {
            int i13 = zr.f11315a;
            Context applicationContext3 = context.getApplicationContext();
            super(applicationContext3 == null ? context : applicationContext3, looper, 8, bVar, cVar);
        }
    }

    @Override // v3.f
    public final IInterface d(IBinder iBinder) {
        switch (this.E) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return iInterfaceQueryLocalInterface instanceof dd ? (dd) iInterfaceQueryLocalInterface : new dd(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return iInterfaceQueryLocalInterface2 instanceof sl ? (sl) iInterfaceQueryLocalInterface2 : new sl(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return iInterfaceQueryLocalInterface3 instanceof ir ? (ir) iInterfaceQueryLocalInterface3 : new hr(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }
    }

    @Override // v3.f
    public final Feature[] getApiFeatures() {
        switch (this.E) {
            case 0:
                return zzg.zzb;
            default:
                return super.getApiFeatures();
        }
    }

    @Override // v3.f
    public final String h() {
        switch (this.E) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // v3.f
    public final String i() {
        switch (this.E) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    public final sl n() {
        return (sl) super.getService();
    }

    public final ir o() {
        return (ir) super.getService();
    }

    public final boolean p() {
        Feature[] availableFeatures = getAvailableFeatures();
        if (((Boolean) zzba.zzc().a(eg.G1)).booleanValue()) {
            Feature feature = zzg.zza;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (!b7.u.i(availableFeatures[i10], feature)) {
                    i10++;
                } else if (i10 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final dd q() {
        return (dd) super.getService();
    }
}
