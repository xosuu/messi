package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class zg1 implements Iterator, Closeable, z7 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c8 f11233s = new c8("eof ", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w7 f11234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zv f11235b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y7 f11236d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11237f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11238h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f11239q = new ArrayList();

    static {
        q7.b.v(zg1.class);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final y7 next() {
        y7 y7VarA;
        y7 y7Var = this.f11236d;
        if (y7Var != null && y7Var != f11233s) {
            this.f11236d = null;
            return y7Var;
        }
        zv zvVar = this.f11235b;
        if (zvVar == null || this.f11237f >= this.f11238h) {
            this.f11236d = f11233s;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zvVar) {
                this.f11235b.f11328a.position((int) this.f11237f);
                y7VarA = ((v7) this.f11234a).a(this.f11235b, this);
                this.f11237f = this.f11235b.c();
            }
            return y7VarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        y7 y7Var = this.f11236d;
        c8 c8Var = f11233s;
        if (y7Var == c8Var) {
            return false;
        }
        if (y7Var != null) {
            return true;
        }
        try {
            this.f11236d = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f11236d = c8Var;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11239q;
            if (i10 >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i10 > 0) {
                sb.append(";");
            }
            sb.append(((y7) arrayList.get(i10)).toString());
            i10++;
        }
    }
}
