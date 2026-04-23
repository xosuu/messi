package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ca1 implements hw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw0 f3241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3242b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f3243d = Uri.EMPTY;

    public ca1(hw0 hw0Var) {
        this.f3241a = hw0Var;
        Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void a(va1 va1Var) {
        va1Var.getClass();
        this.f3241a.a(va1Var);
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) {
        int iB = this.f3241a.b(i10, bArr, i11);
        if (iB != -1) {
            this.f3242b += (long) iB;
        }
        return iB;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) {
        this.f3243d = iz0Var.f5730a;
        Collections.emptyMap();
        hw0 hw0Var = this.f3241a;
        long jG = hw0Var.g(iz0Var);
        Uri uriZzc = hw0Var.zzc();
        uriZzc.getClass();
        this.f3243d = uriZzc;
        hw0Var.zze();
        return jG;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        return this.f3241a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        this.f3241a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Map zze() {
        return this.f3241a.zze();
    }
}
