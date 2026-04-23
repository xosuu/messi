package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: loaded from: classes.dex */
public final class hl extends pb implements jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnH5AdsEventListener f5337a;

    public hl(OnH5AdsEventListener onH5AdsEventListener) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        this.f5337a = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        qb.b(parcel);
        zzb(string);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jl
    public final void zzb(String str) {
        this.f5337a.onH5AdsEvent(str);
    }
}
