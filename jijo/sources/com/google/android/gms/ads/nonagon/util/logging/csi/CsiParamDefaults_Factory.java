package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.jh1;
import com.google.android.gms.internal.ads.qh1;

/* JADX INFO: loaded from: classes.dex */
public final class CsiParamDefaults_Factory implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f2433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f2434b;

    public CsiParamDefaults_Factory(qh1 qh1Var, qh1 qh1Var2) {
        this.f2433a = qh1Var;
        this.f2434b = qh1Var2;
    }

    public static CsiParamDefaults_Factory create(qh1 qh1Var, qh1 qh1Var2) {
        return new CsiParamDefaults_Factory(qh1Var, qh1Var2);
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.f2433a.zzb(), (VersionInfoParcel) this.f2434b.zzb());
    }
}
