package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class sl1 extends j30 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f8920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f8921j;

    @Override // com.google.android.gms.internal.ads.e30
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f8921j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferD = d(((iLimit - iPosition) / this.f5787b.f3821d) * this.f5788c.f3821d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferD.putShort(byteBuffer.getShort(i10 + i10 + iPosition));
            }
            iPosition += this.f5787b.f3821d;
        }
        byteBuffer.position(iLimit);
        byteBufferD.flip();
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final e20 c(e20 e20Var) throws zzcs {
        int[] iArr = this.f8920i;
        if (iArr == null) {
            return e20.f3817e;
        }
        if (e20Var.f3820c != 2) {
            throw new zzcs(e20Var);
        }
        int length = iArr.length;
        int i10 = e20Var.f3819b;
        boolean z9 = i10 != length;
        int i11 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i11 >= length2) {
                return z9 ? new e20(e20Var.f3818a, length2, 2) : e20.f3817e;
            }
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new zzcs(e20Var);
            }
            z9 |= i12 != i11;
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final void e() {
        this.f8921j = this.f8920i;
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final void g() {
        this.f8921j = null;
        this.f8920i = null;
    }
}
