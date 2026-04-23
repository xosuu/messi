package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class rf0 extends of0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f8586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8587t;

    @Override // v3.b
    public final void r(Bundle bundle) {
        synchronized (this.f7567b) {
            try {
                if (!this.f7569f) {
                    this.f7569f = true;
                    try {
                        int i10 = this.f8587t;
                        if (i10 == 2) {
                            this.f7571q.o().W0(this.f7570h, new mf0(this));
                        } else if (i10 == 3) {
                            this.f7571q.o().G(this.f8586s, new mf0(this));
                        } else {
                            this.f7566a.c(new zzdyp(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f7566a.c(new zzdyp(1));
                    } catch (Throwable th) {
                        zzu.zzo().i("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                        this.f7566a.c(new zzdyp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v3.c
    public final void t(ConnectionResult connectionResult) {
        zzm.zze("Cannot connect to remote service, fallback to local instance.");
        this.f7566a.c(new zzdyp(1));
    }
}
