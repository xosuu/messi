package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class km1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f6332d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f6333e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f6334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6336c;

    public static final void b(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z9) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z9 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        long j11 = i11;
        en1.H0(j11, "out of range: %s", (j11 >> 8) == 0);
        byteBuffer.put((byte) j11);
    }

    public final void a(wf1 wf1Var, List list) {
        int length;
        int i10;
        ByteBuffer byteBuffer = wf1Var.f10171e;
        byteBuffer.getClass();
        if (byteBuffer.limit() - wf1Var.f10171e.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f6335b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = wf1Var.f10171e;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.f6335b == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i13 += length + 44;
        } else {
            length = 0;
        }
        if (this.f6334a.capacity() < i13) {
            this.f6334a = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f6334a.clear();
        }
        ByteBuffer byteBuffer3 = this.f6334a;
        if (this.f6335b == 2) {
            if (bArr != null) {
                b(byteBuffer3, 0L, 0, 1, true);
                int length2 = bArr.length;
                i10 = iPosition;
                long j10 = length2;
                en1.H0(j10, "out of range: %s", (j10 >> 8) == 0);
                byteBuffer3.put((byte) j10);
                byteBuffer3.put(bArr);
                int i14 = length2 + 28;
                byteBuffer3.putInt(22, yn0.m(byteBuffer3.arrayOffset(), i14, 0, byteBuffer3.array()));
                byteBuffer3.position(i14);
            } else {
                i10 = iPosition;
                byteBuffer3.put(f6332d);
            }
            byteBuffer3.put(f6333e);
        } else {
            i10 = iPosition;
        }
        int iB = this.f6336c + ((int) ((y3.c.B(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
        this.f6336c = iB;
        b(byteBuffer3, iB, this.f6335b, i12, false);
        for (int i15 = 0; i15 < i12; i15++) {
            if (i11 >= 255) {
                byteBuffer3.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer3.put((byte) i11);
                i11 = 0;
            }
        }
        for (int i16 = i10; i16 < iLimit; i16++) {
            byteBuffer3.put(byteBuffer2.get(i16));
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.f6335b == 2) {
            byteBuffer3.putInt(length + 66, yn0.m(byteBuffer3.arrayOffset() + length + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
        } else {
            byteBuffer3.putInt(22, yn0.m(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
        }
        this.f6335b++;
        this.f6334a = byteBuffer3;
        wf1Var.d();
        wf1Var.e(this.f6334a.remaining());
        wf1Var.f10171e.put(this.f6334a);
        wf1Var.f();
    }
}
