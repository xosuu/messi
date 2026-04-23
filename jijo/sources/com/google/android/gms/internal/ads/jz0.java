package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class jz0 extends m01 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6118b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6119d;

    public jz0(Object obj) {
        super(0);
        this.f6118b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f6119d;
    }

    @Override // com.google.android.gms.internal.ads.m01, java.util.Iterator
    public final Object next() {
        if (this.f6119d) {
            throw new NoSuchElementException();
        }
        this.f6119d = true;
        return this.f6118b;
    }
}
