package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class tl extends pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu f9184a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(qu quVar) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f9184a = quVar;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) qb.a(parcel, ParcelFileDescriptor.CREATOR);
        qb.b(parcel);
        this.f9184a.b(parcelFileDescriptor);
        return true;
    }
}
