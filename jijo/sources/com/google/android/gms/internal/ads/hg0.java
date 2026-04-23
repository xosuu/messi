package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class hg0 extends lg0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AbstractSafeParcelable f5280u;

    public hg0(Context context, ScheduledExecutorService scheduledExecutorService, int i10) {
        this.f5279t = i10;
        if (i10 != 1) {
            this.f6610h = context;
            this.f6611q = zzu.zzt().zzb();
            this.f6612s = scheduledExecutorService;
        } else {
            this.f6610h = context;
            this.f6611q = zzu.zzt().zzb();
            this.f6612s = scheduledExecutorService;
        }
    }

    private final synchronized void c() {
        if (this.f6608d) {
            return;
        }
        this.f6608d = true;
        try {
            this.f6609f.n().i0((zzbug) this.f5280u, new kg0(this));
        } catch (RemoteException unused) {
            this.f6606a.c(new zzdyp(1));
        } catch (Throwable th) {
            zzu.zzo().i("RemoteAdsServiceProxyClientTask.onConnected", th);
            this.f6606a.c(th);
        }
    }

    private final synchronized void d() {
        if (this.f6608d) {
            return;
        }
        this.f6608d = true;
        try {
            this.f6609f.n().z((zzbuc) this.f5280u, new kg0(this));
        } catch (RemoteException unused) {
            this.f6606a.c(new zzdyp(1));
        } catch (Throwable th) {
            zzu.zzo().i("RemoteAdsServiceSignalClientTask.onConnected", th);
            this.f6606a.c(th);
        }
    }

    @Override // v3.b
    public final void m(int i10) {
        qu quVar = this.f6606a;
        switch (this.f5279t) {
            case 1:
                String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
                zzm.zze(str);
                quVar.c(new zzdyp(1, str));
                break;
            default:
                String str2 = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
                zzm.zze(str2);
                quVar.c(new zzdyp(1, str2));
                break;
        }
    }

    @Override // v3.b
    public final synchronized void r(Bundle bundle) {
        switch (this.f5279t) {
            case 0:
                c();
                return;
            default:
                d();
                return;
        }
    }
}
