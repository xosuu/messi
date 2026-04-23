package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f3703a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f3704b = new Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3706d;

    public final synchronized int a() {
        return this.f3706d;
    }

    public final synchronized Object b() {
        if (this.f3706d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object c(long j10) {
        Object objF;
        objF = null;
        while (this.f3706d > 0 && j10 - this.f3703a[this.f3705c] >= 0) {
            objF = f();
        }
        return objF;
    }

    public final synchronized void d(long j10, Object obj) {
        try {
            if (this.f3706d > 0) {
                if (j10 <= this.f3703a[((this.f3705c + r0) - 1) % this.f3704b.length]) {
                    e();
                }
            }
            int length = this.f3704b.length;
            if (this.f3706d >= length) {
                int i10 = length + length;
                long[] jArr = new long[i10];
                Object[] objArr = new Object[i10];
                int i11 = this.f3705c;
                int i12 = length - i11;
                System.arraycopy(this.f3703a, i11, jArr, 0, i12);
                System.arraycopy(this.f3704b, this.f3705c, objArr, 0, i12);
                int i13 = this.f3705c;
                if (i13 > 0) {
                    System.arraycopy(this.f3703a, 0, jArr, i12, i13);
                    System.arraycopy(this.f3704b, 0, objArr, i12, this.f3705c);
                }
                this.f3703a = jArr;
                this.f3704b = objArr;
                this.f3705c = 0;
            }
            int i14 = this.f3705c;
            int i15 = this.f3706d;
            Object[] objArr2 = this.f3704b;
            int length2 = (i14 + i15) % objArr2.length;
            this.f3703a[length2] = j10;
            objArr2[length2] = obj;
            this.f3706d = i15 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f3705c = 0;
        this.f3706d = 0;
        Arrays.fill(this.f3704b, (Object) null);
    }

    public final Object f() {
        tc1.W(this.f3706d > 0);
        Object[] objArr = this.f3704b;
        int i10 = this.f3705c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f3705c = (i10 + 1) % objArr.length;
        this.f3706d--;
        return obj;
    }
}
