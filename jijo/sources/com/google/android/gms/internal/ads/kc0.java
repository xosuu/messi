package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;

/* JADX INFO: loaded from: classes.dex */
public final class kc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9 f6248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ug f6249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f6250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zza f6251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kd f6252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r50 f6253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh0 f6254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pr0 f6255i;

    public kc0(Context context, y9 y9Var, ug ugVar, VersionInfoParcel versionInfoParcel, zza zzaVar, kd kdVar, r50 r50Var, qh0 qh0Var, pr0 pr0Var) {
        this.f6247a = context;
        this.f6248b = y9Var;
        this.f6249c = ugVar;
        this.f6250d = versionInfoParcel;
        this.f6251e = zzaVar;
        this.f6252f = kdVar;
        this.f6253g = r50Var;
        this.f6254h = qh0Var;
        this.f6255i = pr0Var;
    }

    public final nx a(zzq zzqVar, fr0 fr0Var, hr0 hr0Var) {
        b4.c cVarA = b4.c.a(zzqVar);
        String str = zzqVar.zza;
        jp0 jp0Var = new jp0(14, this);
        qh0 qh0Var = this.f6254h;
        pr0 pr0Var = this.f6255i;
        zza zzaVar = this.f6251e;
        kd kdVar = this.f6252f;
        y9 y9Var = this.f6248b;
        ug ugVar = this.f6249c;
        return lx.a(this.f6247a, this.f6250d, zzaVar, jp0Var, cVarA, y9Var, kdVar, ugVar, qh0Var, fr0Var, hr0Var, pr0Var, str, false, false);
    }
}
