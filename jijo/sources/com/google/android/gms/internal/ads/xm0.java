package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class xm0 implements to0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f10607k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g30 f10612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yr0 f10613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final or0 f10614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzj f10615h = zzu.zzo().d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cd0 f10616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k30 f10617j;

    public xm0(Context context, String str, String str2, g30 g30Var, yr0 yr0Var, or0 or0Var, cd0 cd0Var, k30 k30Var, long j10) {
        this.f10608a = context;
        this.f10609b = str;
        this.f10610c = str2;
        this.f10612e = g30Var;
        this.f10613f = yr0Var;
        this.f10614g = or0Var;
        this.f10616i = cd0Var;
        this.f10617j = k30Var;
        this.f10611d = j10;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        Bundle bundle = new Bundle();
        cd0 cd0Var = this.f10616i;
        cd0Var.f3253a.put("seq_num", this.f10609b);
        if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue()) {
            ((y3.b) zzu.zzB()).getClass();
            cd0Var.a("tsacc", String.valueOf(System.currentTimeMillis() - this.f10611d));
            zzu.zzp();
            cd0Var.a("foreground", true != zzt.zzG(this.f10608a) ? "1" : "0");
        }
        if (((Boolean) zzba.zzc().a(eg.X4)).booleanValue()) {
            this.f10612e.a(this.f10614g.f7644d);
            bundle.putAll(this.f10613f.a());
        }
        return tc1.d0(new wm0(this, 0, bundle));
    }
}
