package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;

/* JADX INFO: loaded from: classes.dex */
public final class ch0 implements e50, n40 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f3277d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f3278f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f3279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gh0 f3280b;

    public ch0(gh0 gh0Var, zzj zzjVar) {
        this.f3280b = gh0Var;
        this.f3279a = zzjVar;
    }

    public final void a(boolean z9) {
        int i10;
        int iIntValue;
        if (((Boolean) zzba.zzc().a(eg.B5)).booleanValue() && !this.f3279a.zzS()) {
            Object obj = f3277d;
            synchronized (obj) {
                i10 = f3278f;
                iIntValue = ((Integer) zzba.zzc().a(eg.C5)).intValue();
            }
            if (i10 < iIntValue) {
                gh0 gh0Var = this.f3280b;
                gh0Var.getClass();
                tc1.u0(gh0Var.f4920d.d(new Bundle()), new f.x0(gh0Var, z9), nu.f7388f);
                synchronized (obj) {
                    f3278f++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final void t(zze zzeVar) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        a(true);
    }
}
