package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.us;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzfb implements Runnable {
    public final /* synthetic */ us zza;

    @Override // java.lang.Runnable
    public final void run() {
        us usVar = this.zza;
        if (usVar != null) {
            try {
                usVar.zze(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
