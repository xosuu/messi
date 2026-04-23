package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ScheduledFuture f2986a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s9 f2987b = new s9(6, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2988c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cd f2989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f2990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public dd f2991f;

    public static /* bridge */ /* synthetic */ void c(bd bdVar) {
        synchronized (bdVar.f2988c) {
            try {
                cd cdVar = bdVar.f2989d;
                if (cdVar == null) {
                    return;
                }
                if (cdVar.isConnected() || bdVar.f2989d.isConnecting()) {
                    bdVar.f2989d.disconnect();
                }
                bdVar.f2989d = null;
                bdVar.f2991f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbae a(zzbah zzbahVar) {
        synchronized (this.f2988c) {
            if (this.f2991f == null) {
                return new zzbae();
            }
            try {
                if (this.f2989d.p()) {
                    dd ddVar = this.f2991f;
                    Parcel parcelM = ddVar.m();
                    qb.c(parcelM, zzbahVar);
                    Parcel parcelT = ddVar.t(parcelM, 2);
                    zzbae zzbaeVar = (zzbae) qb.a(parcelT, zzbae.CREATOR);
                    parcelT.recycle();
                    return zzbaeVar;
                }
                dd ddVar2 = this.f2991f;
                Parcel parcelM2 = ddVar2.m();
                qb.c(parcelM2, zzbahVar);
                Parcel parcelT2 = ddVar2.t(parcelM2, 1);
                zzbae zzbaeVar2 = (zzbae) qb.a(parcelT2, zzbae.CREATOR);
                parcelT2.recycle();
                return zzbaeVar2;
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call into cache service.", e10);
                return new zzbae();
            }
        }
    }

    public final synchronized cd b(rk0 rk0Var, jp0 jp0Var) {
        return new cd(this.f2990e, zzu.zzt().zzb(), rk0Var, jp0Var, 0);
    }

    public final void d(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f2988c) {
            try {
                if (this.f2990e != null) {
                    return;
                }
                this.f2990e = context.getApplicationContext();
                if (((Boolean) zzba.zzc().a(eg.M3)).booleanValue()) {
                    e();
                } else {
                    if (((Boolean) zzba.zzc().a(eg.L3)).booleanValue()) {
                        zzu.zzb().c(new ad(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f2988c) {
            try {
                if (this.f2990e != null && this.f2989d == null) {
                    cd cdVarB = b(new rk0(2, this), new jp0(3, this));
                    this.f2989d = cdVarB;
                    cdVarB.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }
}
