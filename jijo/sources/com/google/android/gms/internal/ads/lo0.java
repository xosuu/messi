package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class lo0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p21 f6677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f6678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f6679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final or0 f6680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gy f6681f;

    public lo0(mu muVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, or0 or0Var, gy gyVar) {
        this.f6677b = muVar;
        this.f6678c = scheduledExecutorService;
        this.f6676a = str;
        this.f6679d = context;
        this.f6680e = or0Var;
        this.f6681f = gyVar;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        return (!((Boolean) zzba.zzc().a(eg.f4130s6)).booleanValue() || this.f6680e.f7658r) ? tc1.d0(new dm0(null, 3)) : tc1.k0(new jp0(23, this), this.f6677b);
    }
}
