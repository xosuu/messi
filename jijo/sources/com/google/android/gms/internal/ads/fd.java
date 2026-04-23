package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4477b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4478d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4479f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4480h;

    public /* synthetic */ fd(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4476a = i10;
        this.f4477b = obj;
        this.f4478d = obj2;
        this.f4479f = obj3;
        this.f4480h = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbae zzbaeVar;
        int i10 = this.f4476a;
        Object obj = this.f4480h;
        Object obj2 = this.f4479f;
        Object obj3 = this.f4478d;
        Object obj4 = this.f4477b;
        switch (i10) {
            case 0:
                ur0 ur0Var = (ur0) obj4;
                cd cdVar = (cd) obj3;
                qu quVar = (qu) obj;
                try {
                    dd ddVarQ = cdVar.q();
                    zzbah zzbahVar = (zzbah) obj2;
                    if (cdVar.p()) {
                        Parcel parcelM = ddVarQ.m();
                        qb.c(parcelM, zzbahVar);
                        Parcel parcelT = ddVarQ.t(parcelM, 2);
                        zzbaeVar = (zzbae) qb.a(parcelT, zzbae.CREATOR);
                        parcelT.recycle();
                    } else {
                        Parcel parcelM2 = ddVarQ.m();
                        qb.c(parcelM2, zzbahVar);
                        Parcel parcelT2 = ddVarQ.t(parcelM2, 1);
                        zzbaeVar = (zzbae) qb.a(parcelT2, zzbae.CREATOR);
                        parcelT2.recycle();
                    }
                    if (!zzbaeVar.e()) {
                        quVar.c(new RuntimeException("No entry contents."));
                        l7.d((l7) ur0Var.f9602f);
                        return;
                    }
                    gd gdVar = new gd(ur0Var, zzbaeVar.c());
                    int i11 = gdVar.read();
                    if (i11 == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    gdVar.unread(i11);
                    quVar.b(new id(gdVar, zzbaeVar.d(), zzbaeVar.g(), zzbaeVar.b(), zzbaeVar.f()));
                    return;
                } catch (RemoteException e10) {
                    e = e10;
                    zzm.zzh("Unable to obtain a cache service instance.", e);
                    quVar.c(e);
                    l7.d((l7) ur0Var.f9602f);
                    return;
                } catch (IOException e11) {
                    e = e11;
                    zzm.zzh("Unable to obtain a cache service instance.", e);
                    quVar.c(e);
                    l7.d((l7) ur0Var.f9602f);
                    return;
                }
            case 1:
                ep epVar = (ep) obj4;
                Throwable th = (Throwable) obj3;
                if (((Boolean) zzba.zzc().a(eg.u9)).booleanValue()) {
                    n00 n00Var = (n00) epVar.f4271f;
                    n00Var.f7095i = cr.c(n00Var.f7087a);
                    ((n00) epVar.f4271f).f7095i.e("AttributionReporting.registerSourceAndPingClickUrl", th);
                } else {
                    n00 n00Var2 = (n00) epVar.f4271f;
                    n00Var2.f7094h = cr.a(n00Var2.f7087a);
                    ((n00) epVar.f4271f).f7094h.e("AttributionReportingSampled.registerSourceAndPingClickUrl", th);
                }
                ((vt0) obj2).a((String) obj, null);
                return;
            default:
                yj0 yj0Var = ((fk0) obj4).f4569d;
                yj0.c((kr0) obj3, (fr0) obj2, (fi0) obj);
                return;
        }
    }
}
