package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ne1 extends oe1 {
    public ne1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.oe1
    public final void A0(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray(j10, bArr, (int) j11, (int) j12);
    }

    @Override // com.google.android.gms.internal.ads.oe1
    public final void B0(Object obj, long j10, boolean z9) {
        if (pe1.f7871h) {
            pe1.c(obj, j10, z9 ? (byte) 1 : (byte) 0);
        } else {
            pe1.d(obj, j10, z9 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.oe1
    public final void C0(Object obj, long j10, byte b10) {
        if (pe1.f7871h) {
            pe1.c(obj, j10, b10);
        } else {
            pe1.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.oe1
    public final void D0(Object obj, long j10, double d10) {
        ((Unsafe) this.f7565a).putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.oe1
    public final void E0(Object obj, long j10, float f10) {
        ((Unsafe) this.f7565a).putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.oe1
    public final boolean F0(long j10, Object obj) {
        return pe1.f7871h ? pe1.t(j10, obj) : pe1.u(j10, obj);
    }

    @Override // com.google.android.gms.internal.ads.oe1
    public final byte v0(long j10) {
        return Memory.peekByte(j10);
    }

    @Override // com.google.android.gms.internal.ads.oe1
    public final double x0(long j10, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f7565a).getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.oe1
    public final float z0(long j10, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f7565a).getInt(obj, j10));
    }
}
