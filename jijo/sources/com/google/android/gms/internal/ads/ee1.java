package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ee1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f3917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cc1 f3918b;

    public ee1(ec1 ec1Var) {
        if (!(ec1Var instanceof fe1)) {
            this.f3917a = null;
            this.f3918b = (cc1) ec1Var;
            return;
        }
        fe1 fe1Var = (fe1) ec1Var;
        ArrayDeque arrayDeque = new ArrayDeque(fe1Var.f4511s);
        this.f3917a = arrayDeque;
        arrayDeque.push(fe1Var);
        ec1 ec1Var2 = fe1Var.f4508f;
        while (ec1Var2 instanceof fe1) {
            fe1 fe1Var2 = (fe1) ec1Var2;
            this.f3917a.push(fe1Var2);
            ec1Var2 = fe1Var2.f4508f;
        }
        this.f3918b = (cc1) ec1Var2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cc1 next() {
        cc1 cc1Var;
        cc1 cc1Var2 = this.f3918b;
        if (cc1Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f3917a;
            cc1Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            ec1 ec1Var = ((fe1) arrayDeque.pop()).f4509h;
            while (ec1Var instanceof fe1) {
                fe1 fe1Var = (fe1) ec1Var;
                arrayDeque.push(fe1Var);
                ec1Var = fe1Var.f4508f;
            }
            cc1Var = (cc1) ec1Var;
        } while (cc1Var.f() == 0);
        this.f3918b = cc1Var;
        return cc1Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3918b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
