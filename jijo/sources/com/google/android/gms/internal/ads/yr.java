package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class yr extends pb implements as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11021b;

    public yr(String str, int i10) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f11020a = str;
        this.f11021b = i10;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f11020a);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f11021b);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof yr)) {
            yr yrVar = (yr) obj;
            if (b7.u.i(this.f11020a, yrVar.f11020a) && b7.u.i(Integer.valueOf(this.f11021b), Integer.valueOf(yrVar.f11021b))) {
                return true;
            }
        }
        return false;
    }
}
