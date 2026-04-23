package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class ic1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jc1 f5562b;

    public static int c(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long d(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static fc1 e(byte[] bArr, int i10, int i11, boolean z9) {
        fc1 fc1Var = new fc1(bArr, i10, i11);
        try {
            fc1Var.i(i11);
            return fc1Var;
        } catch (zzgyn e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract double f();

    public abstract float g();

    public abstract int h();

    public abstract int i(int i10);

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract long r();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract cc1 v();

    public abstract String w();

    public abstract String x();

    public abstract void y();

    public abstract void z(int i10);
}
