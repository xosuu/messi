package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes.dex */
public final class zs extends pb implements ks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11318b;

    public zs(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f11317a);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f11318b);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ks
    public final int zze() {
        return this.f11318b;
    }

    @Override // com.google.android.gms.internal.ads.ks
    public final String zzf() {
        return this.f11317a;
    }

    public zs(String str, int i10) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f11317a = str;
        this.f11318b = i10;
    }
}
