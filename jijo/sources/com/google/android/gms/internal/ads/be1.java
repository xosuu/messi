package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class be1 extends m01 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee1 f3014b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m01 f3015d;

    public be1(fe1 fe1Var) {
        super(1);
        this.f3014b = new ee1(fe1Var);
        this.f3015d = b();
    }

    @Override // com.google.android.gms.internal.ads.m01
    public final byte a() {
        m01 m01Var = this.f3015d;
        if (m01Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = m01Var.a();
        if (!this.f3015d.hasNext()) {
            this.f3015d = b();
        }
        return bA;
    }

    public final ac1 b() {
        ee1 ee1Var = this.f3014b;
        if (ee1Var.hasNext()) {
            return new ac1(ee1Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3015d != null;
    }
}
