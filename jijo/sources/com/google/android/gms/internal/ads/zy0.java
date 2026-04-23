package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zy0 extends tx0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bz0 f11379f;

    public zy0(int i10, bz0 bz0Var) {
        super(bz0Var.size(), i10);
        this.f11379f = bz0Var;
    }

    @Override // com.google.android.gms.internal.ads.tx0
    public final Object d(int i10) {
        return this.f11379f.get(i10);
    }
}
