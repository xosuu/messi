package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ip0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f5670a;

    public ip0(Context context) {
        this.f5670a = rr.q(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        return ((Boolean) zzba.zzc().a(eg.Xa)).booleanValue() ? tc1.d0(new gm0(4)) : tc1.d0(new gn0(3, this));
    }
}
