package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ez0 extends vy0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f4343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4344e;

    @Override // com.google.android.gms.internal.ads.vy0
    public final /* bridge */ /* synthetic */ vy0 b(Object obj) {
        g(obj);
        return this;
    }

    public final void g(Object obj) {
        obj.getClass();
        if (this.f4343d != null) {
            int i10 = fz0.i(this.f10007b);
            Object[] objArr = this.f4343d;
            if (i10 <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iR = tp1.r(iHashCode);
                while (true) {
                    int i11 = iR & length;
                    Object[] objArr2 = this.f4343d;
                    Object obj2 = objArr2[i11];
                    if (obj2 == null) {
                        objArr2[i11] = obj;
                        this.f4344e += iHashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iR = i11 + 1;
                    }
                }
            }
        }
        this.f4343d = null;
        a(obj);
    }

    public final void h(Iterable iterable) {
        iterable.getClass();
        if (this.f4343d == null) {
            c(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
    }

    public final fz0 i() {
        fz0 fz0VarM;
        int i10 = this.f10007b;
        if (i10 == 0) {
            return c01.f3144v;
        }
        if (i10 == 1) {
            Object obj = this.f10006a[0];
            Objects.requireNonNull(obj);
            return new j01(obj);
        }
        if (this.f4343d == null || fz0.i(i10) != this.f4343d.length) {
            fz0VarM = fz0.m(this.f10007b, this.f10006a);
            this.f10007b = fz0VarM.size();
        } else {
            int i11 = this.f10007b;
            Object[] objArrCopyOf = this.f10006a;
            int length = objArrCopyOf.length;
            if (i11 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            fz0VarM = new c01(this.f4344e, r8.length - 1, this.f10007b, objArrCopyOf, this.f4343d);
        }
        this.f10008c = true;
        this.f4343d = null;
        return fz0VarM;
    }
}
