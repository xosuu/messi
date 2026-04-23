package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ac1 extends m01 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2657b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2658d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ec1 f2659f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(ec1 ec1Var) {
        super(1);
        this.f2659f = ec1Var;
        this.f2657b = 0;
        this.f2658d = ec1Var.f();
    }

    @Override // com.google.android.gms.internal.ads.m01
    public final byte a() {
        int i10 = this.f2657b;
        if (i10 >= this.f2658d) {
            throw new NoSuchElementException();
        }
        this.f2657b = i10 + 1;
        return this.f2659f.d(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2657b < this.f2658d;
    }
}
