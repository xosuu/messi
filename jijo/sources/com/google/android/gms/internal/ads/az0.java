package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class az0 extends bz0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f2844d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f2845f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bz0 f2846h;

    public az0(bz0 bz0Var, int i10, int i11) {
        this.f2846h = bz0Var;
        this.f2844d = i10;
        this.f2845f = i11;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int c() {
        return this.f2846h.d() + this.f2844d + this.f2845f;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int d() {
        return this.f2846h.d() + this.f2844d;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        en1.a0(i10, this.f2845f);
        return this.f2846h.get(i10 + this.f2844d);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final Object[] h() {
        return this.f2846h.h();
    }

    @Override // com.google.android.gms.internal.ads.bz0, java.util.List
    /* JADX INFO: renamed from: i */
    public final bz0 subList(int i10, int i11) {
        en1.J0(i10, i11, this.f2845f);
        int i12 = this.f2844d;
        return this.f2846h.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2845f;
    }
}
