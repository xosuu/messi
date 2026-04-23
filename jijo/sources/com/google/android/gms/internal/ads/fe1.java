package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class fe1 extends ec1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f4506t = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4507d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ec1 f4508f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ec1 f4509h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4510q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4511s;

    public fe1(ec1 ec1Var, ec1 ec1Var2) {
        this.f4508f = ec1Var;
        this.f4509h = ec1Var2;
        int iF = ec1Var.f();
        this.f4510q = iF;
        this.f4507d = ec1Var2.f() + iF;
        this.f4511s = Math.max(ec1Var.h(), ec1Var2.h()) + 1;
    }

    public static int s(int i10) {
        int[] iArr = f4506t;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final byte c(int i10) {
        ec1.r(i10, this.f4507d);
        return d(i10);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final byte d(int i10) {
        int i11 = this.f4510q;
        return i10 < i11 ? this.f4508f.d(i10) : this.f4509h.d(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ec1)) {
            return false;
        }
        ec1 ec1Var = (ec1) obj;
        int iF = ec1Var.f();
        int i10 = this.f4507d;
        if (i10 != iF) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        int i11 = this.f3904a;
        int i12 = ec1Var.f3904a;
        if (i11 != 0 && i12 != 0 && i11 != i12) {
            return false;
        }
        ee1 ee1Var = new ee1(this);
        cc1 cc1VarA = ee1Var.next();
        ee1 ee1Var2 = new ee1(ec1Var);
        cc1 cc1VarA2 = ee1Var2.next();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int iF2 = cc1VarA.f() - i13;
            int iF3 = cc1VarA2.f() - i14;
            int iMin = Math.min(iF2, iF3);
            if (!(i13 == 0 ? cc1VarA.t(cc1VarA2, i14, iMin) : cc1VarA2.t(cc1VarA, i13, iMin))) {
                return false;
            }
            i15 += iMin;
            if (i15 >= i10) {
                if (i15 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iF2) {
                i13 = 0;
                cc1VarA = ee1Var.next();
            } else {
                i13 += iMin;
                cc1VarA = cc1VarA;
            }
            if (iMin == iF3) {
                cc1VarA2 = ee1Var2.next();
                i14 = 0;
            } else {
                i14 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final int f() {
        return this.f4507d;
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final void g(int i10, int i11, int i12, byte[] bArr) {
        int i13 = i10 + i12;
        ec1 ec1Var = this.f4508f;
        int i14 = this.f4510q;
        if (i13 <= i14) {
            ec1Var.g(i10, i11, i12, bArr);
            return;
        }
        ec1 ec1Var2 = this.f4509h;
        if (i10 >= i14) {
            ec1Var2.g(i10 - i14, i11, i12, bArr);
            return;
        }
        int i15 = i14 - i10;
        ec1Var.g(i10, i11, i15, bArr);
        ec1Var2.g(0, i11 + i15, i12 - i15, bArr);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final int h() {
        return this.f4511s;
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final boolean i() {
        return this.f4507d >= s(this.f4511s);
    }

    @Override // com.google.android.gms.internal.ads.ec1, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new be1(this);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final int j(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ec1 ec1Var = this.f4508f;
        int i14 = this.f4510q;
        if (i13 <= i14) {
            return ec1Var.j(i10, i11, i12);
        }
        ec1 ec1Var2 = this.f4509h;
        if (i11 >= i14) {
            return ec1Var2.j(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return ec1Var2.j(ec1Var.j(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final ec1 k(int i10, int i11) {
        int i12 = this.f4507d;
        int iN = ec1.n(i10, i11, i12);
        if (iN == 0) {
            return ec1.f3903b;
        }
        if (iN == i12) {
            return this;
        }
        ec1 ec1Var = this.f4508f;
        int i13 = this.f4510q;
        if (i11 <= i13) {
            return ec1Var.k(i10, i11);
        }
        ec1 ec1Var2 = this.f4509h;
        if (i10 < i13) {
            return new fe1(ec1Var.k(i10, ec1Var.f()), ec1Var2.k(0, i11 - i13));
        }
        return ec1Var2.k(i10 - i13, i11 - i13);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final ic1 l() {
        cc1 cc1Var;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f4511s);
        arrayDeque.push(this);
        ec1 ec1Var = this.f4508f;
        while (ec1Var instanceof fe1) {
            fe1 fe1Var = (fe1) ec1Var;
            arrayDeque.push(fe1Var);
            ec1Var = fe1Var.f4508f;
        }
        cc1 cc1Var2 = (cc1) ec1Var;
        while (true) {
            if (!(cc1Var2 != null)) {
                int i10 = 0;
                int iRemaining = 0;
                for (ByteBuffer byteBuffer : arrayList) {
                    iRemaining += byteBuffer.remaining();
                    i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
                }
                if (i10 == 2) {
                    return new gc1(arrayList, iRemaining);
                }
                fd1 fd1Var = new fd1();
                fd1Var.f4483a = arrayList.iterator();
                fd1Var.f4485d = 0;
                for (ByteBuffer byteBuffer2 : arrayList) {
                    fd1Var.f4485d++;
                }
                fd1Var.f4486f = -1;
                if (!fd1Var.c()) {
                    fd1Var.f4484b = ed1.f3912c;
                    fd1Var.f4486f = 0;
                    fd1Var.f4487h = 0;
                    fd1Var.f4491u = 0L;
                }
                return new hc1(fd1Var);
            }
            if (cc1Var2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    cc1Var = null;
                    break;
                }
                ec1 ec1Var2 = ((fe1) arrayDeque.pop()).f4509h;
                while (ec1Var2 instanceof fe1) {
                    fe1 fe1Var2 = (fe1) ec1Var2;
                    arrayDeque.push(fe1Var2);
                    ec1Var2 = fe1Var2.f4508f;
                }
                cc1Var = (cc1) ec1Var2;
                if (cc1Var.f() != 0) {
                    break;
                }
            }
            arrayList.add(ByteBuffer.wrap(cc1Var2.f3252d, cc1Var2.s(), cc1Var2.f()).asReadOnlyBuffer());
            cc1Var2 = cc1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final void m(b4.f fVar) {
        this.f4508f.m(fVar);
        this.f4509h.m(fVar);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    /* JADX INFO: renamed from: o */
    public final m01 iterator() {
        return new be1(this);
    }
}
