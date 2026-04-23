package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class pc extends pb implements xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FullScreenContentCallback f7852a;

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            zzf();
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
            qb.b(parcel);
            zzd(zzeVar);
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f7852a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f7852a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f7852a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f7852a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f7852a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
