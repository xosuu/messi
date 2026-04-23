package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kf0 extends of0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f6275t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Executor f6276u;

    public kf0(Context context, mu muVar, int i10) {
        this.f6274s = i10;
        if (i10 != 1) {
            this.f6275t = context;
            this.f6276u = muVar;
            this.f7571q = new cd(context, zzu.zzt().zzb(), this, this, 2);
        } else {
            this.f6275t = context;
            this.f6276u = muVar;
            this.f7571q = new cd(context, zzu.zzt().zzb(), this, this, 2);
        }
    }

    private final void c() {
        synchronized (this.f7567b) {
            try {
                if (!this.f7569f) {
                    this.f7569f = true;
                    try {
                        try {
                            this.f7571q.o().O(this.f7570h, new mf0(this));
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f7566a.c(new zzdyp(1));
                        }
                    } catch (Throwable th) {
                        zzu.zzo().i("RemoteAdRequestClientTask.onConnected", th);
                        this.f7566a.c(new zzdyp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final qu e(zzbvb zzbvbVar) {
        synchronized (this.f7567b) {
            try {
                if (this.f7568d) {
                    return this.f7566a;
                }
                this.f7568d = true;
                this.f7570h = zzbvbVar;
                this.f7571q.checkAvailabilityAndConnect();
                this.f7566a.a(new yd0(1, this), nu.f7388f);
                of0.b(this.f6275t, this.f7566a, this.f6276u);
                return this.f7566a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final n5.a d(zzbvb zzbvbVar) {
        qu quVar;
        switch (this.f6274s) {
            case 0:
                return e(zzbvbVar);
            default:
                synchronized (this.f7567b) {
                    try {
                        if (this.f7568d) {
                            quVar = this.f7566a;
                        } else {
                            this.f7568d = true;
                            this.f7570h = zzbvbVar;
                            this.f7571q.checkAvailabilityAndConnect();
                            this.f7566a.a(new yd0(2, this), nu.f7388f);
                            of0.b(this.f6275t, this.f7566a, this.f6276u);
                            quVar = this.f7566a;
                        }
                    } finally {
                    }
                }
                return quVar;
        }
    }

    @Override // v3.b
    public final void r(Bundle bundle) {
        switch (this.f6274s) {
            case 0:
                c();
                return;
            default:
                synchronized (this.f7567b) {
                    try {
                        if (!this.f7569f) {
                            this.f7569f = true;
                            try {
                                this.f7571q.o().v0(this.f7570h, new mf0(this));
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f7566a.c(new zzdyp(1));
                            } catch (Throwable th) {
                                zzu.zzo().i("RemoteSignalsClientTask.onConnected", th);
                                this.f7566a.c(new zzdyp(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // v3.c
    public final void t(ConnectionResult connectionResult) {
        qu quVar = this.f7566a;
        switch (this.f6274s) {
            case 0:
                zzm.zze("Cannot connect to remote service, fallback to local instance.");
                quVar.c(new zzdyp(1));
                break;
            default:
                zzm.zze("Disconnected from remote ad request service.");
                quVar.c(new zzdyp(1));
                break;
        }
    }
}
