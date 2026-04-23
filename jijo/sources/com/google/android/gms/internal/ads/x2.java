package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class x2 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10407e;

    @Override // com.google.android.gms.internal.ads.w2
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int zzb() {
        return this.f10403a;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int zzc() {
        int i10 = this.f10404b;
        if (i10 == 8) {
            return ((ik0) this.f10407e).v();
        }
        if (i10 == 16) {
            return ((ik0) this.f10407e).z();
        }
        int i11 = this.f10405c;
        this.f10405c = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f10406d & 15;
        }
        int iV = ((ik0) this.f10407e).v();
        this.f10406d = iV;
        return (iV & 240) >> 4;
    }
}
