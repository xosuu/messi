package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class mm1 extends j30 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f7008i = Float.floatToIntBits(Float.NaN);

    public static void h(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f7008i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferD;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f5787b.f3820c;
        if (i11 == 21) {
            byteBufferD = d((i10 / 3) * 4);
            while (iPosition < iLimit) {
                h(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferD);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferD = d(i10);
            while (iPosition < iLimit) {
                int i12 = byteBuffer.get(iPosition) & 255;
                int i13 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                h(i12 | i13 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferD);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferD = d((i10 / 3) * 4);
            while (iPosition < iLimit) {
                h(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferD = d(i10);
            while (iPosition < iLimit) {
                int i14 = byteBuffer.get(iPosition + 3) & 255;
                int i15 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                h(i14 | i15 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferD);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final e20 c(e20 e20Var) throws zzcs {
        int i10 = yn0.f10944a;
        int i11 = e20Var.f3820c;
        if (i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736) {
            return new e20(e20Var.f3818a, e20Var.f3819b, 4);
        }
        if (i11 == 4) {
            return e20.f3817e;
        }
        throw new zzcs(e20Var);
    }
}
