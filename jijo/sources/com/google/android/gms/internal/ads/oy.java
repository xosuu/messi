package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzen;

/* JADX INFO: loaded from: classes.dex */
public final class oy implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f7699a;

    public oy(jy jyVar) {
        this.f7699a = jyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        zzen liteSdkVersion;
        com.google.android.gms.ads.internal.client.zzcl zzclVar = (com.google.android.gms.ads.internal.client.zzcl) ur0.S(((jy) this.f7699a).a()).f9601d;
        if (zzclVar != null) {
            try {
                liteSdkVersion = zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
                liteSdkVersion = null;
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.zzb();
        }
        return null;
    }
}
