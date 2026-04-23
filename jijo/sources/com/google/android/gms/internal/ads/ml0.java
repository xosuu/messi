package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class ml0 implements zza, q70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzbe f7002a;

    @Override // com.google.android.gms.internal.ads.q70
    public final synchronized void L() {
        zzbe zzbeVar = this.f7002a;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e10) {
                zzm.zzk("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final synchronized void V() {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zzbe zzbeVar = this.f7002a;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e10) {
                zzm.zzk("Remote Exception at onAdClicked.", e10);
            }
        }
    }
}
