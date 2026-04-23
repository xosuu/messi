package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class uq extends pb implements rt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ QueryInfoGenerationCallback f9571a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f9571a = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            qb.b(parcel);
        } else if (i10 == 2) {
            String string = parcel.readString();
            qb.b(parcel);
            zzb(string);
        } else {
            if (i10 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) qb.a(parcel, Bundle.CREATOR);
            qb.b(parcel);
            t1(string2, bundle, string3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rt
    public final void t1(String str, Bundle bundle, String str2) {
        this.f9571a.onSuccess(new QueryInfo(new zzem(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.rt
    public final void zzb(String str) {
        this.f9571a.onFailure(str);
    }
}
