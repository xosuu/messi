package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class tx0 extends m01 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9301b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9302d;

    public tx0(int i10, int i11) {
        super(0);
        en1.j0(i11, i10);
        this.f9301b = i10;
        this.f9302d = i11;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        b(obj);
        throw null;
    }

    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object d(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9302d < this.f9301b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9302d > 0;
    }

    @Override // com.google.android.gms.internal.ads.m01, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9302d;
        this.f9302d = i10 + 1;
        return d(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9302d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9302d - 1;
        this.f9302d = i10;
        return d(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9302d - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}
