package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class mc1 extends b4.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f6900d = Logger.getLogger(mc1.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6901e = pe1.f7868e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nc1 f6902c;

    public static int L0(int i10, rd1 rd1Var, ge1 ge1Var) {
        int iS0 = s0(i10 << 3);
        return ((vb1) rd1Var).a(ge1Var) + iS0 + iS0;
    }

    public static int q0(rd1 rd1Var, ge1 ge1Var) {
        int iA = ((vb1) rd1Var).a(ge1Var);
        return s0(iA) + iA;
    }

    public static int r0(String str) {
        int length;
        try {
            length = re1.c(str);
        } catch (qe1 unused) {
            length = str.getBytes(ed1.f3910a).length;
        }
        return s0(length) + length;
    }

    public static int s0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int t0(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public abstract void A0(int i10, long j10);

    public abstract void B0(long j10);

    public abstract void C0(int i10, int i11);

    public abstract void D0(int i10);

    public abstract void E0(int i10, rd1 rd1Var, ge1 ge1Var);

    public abstract void F0(int i10, String str);

    public abstract void G0(int i10, int i11);

    public abstract void H0(int i10, int i11);

    public abstract void I0(int i10);

    public abstract void J0(int i10, long j10);

    public abstract void K0(long j10);

    public final void u0(String str, qe1 qe1Var) throws zzgxa {
        f6900d.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) qe1Var);
        byte[] bytes = str.getBytes(ed1.f3910a);
        try {
            int length = bytes.length;
            I0(length);
            Y(0, bytes, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(e10);
        }
    }

    public abstract void v0(byte b10);

    public abstract void w0(int i10, boolean z9);

    public abstract void x0(int i10, ec1 ec1Var);

    public abstract void y0(int i10, int i11);

    public abstract void z0(int i10);
}
