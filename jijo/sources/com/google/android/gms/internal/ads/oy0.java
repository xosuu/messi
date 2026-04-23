package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class oy0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7701b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7702d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy0 f7703f;

    public oy0(qy0 qy0Var) {
        this.f7703f = qy0Var;
        this.f7700a = qy0Var.f8329h;
        this.f7701b = qy0Var.isEmpty() ? -1 : 0;
        this.f7702d = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7701b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object py0Var;
        qy0 qy0Var = this.f7703f;
        if (qy0Var.f8329h != this.f7700a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f7701b;
        this.f7702d = i10;
        my0 my0Var = (my0) this;
        int i11 = my0Var.f7076h;
        qy0 qy0Var2 = my0Var.f7077q;
        switch (i11) {
            case 0:
                Object obj = qy0.f8324v;
                py0Var = qy0Var2.b()[i10];
                break;
            case 1:
                py0Var = new py0(qy0Var2, i10);
                break;
            default:
                Object obj2 = qy0.f8324v;
                py0Var = qy0Var2.c()[i10];
                break;
        }
        int i12 = this.f7701b + 1;
        if (i12 >= qy0Var.f8330q) {
            i12 = -1;
        }
        this.f7701b = i12;
        return py0Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        qy0 qy0Var = this.f7703f;
        if (qy0Var.f8329h != this.f7700a) {
            throw new ConcurrentModificationException();
        }
        en1.M0("no calls to next() since the last call to remove()", this.f7702d >= 0);
        this.f7700a += 32;
        qy0Var.remove(qy0Var.b()[this.f7702d]);
        this.f7701b--;
        this.f7702d = -1;
    }
}
