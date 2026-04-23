package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class lm1 extends j30 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f6667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f6670q;

    @Override // com.google.android.gms.internal.ads.e30
    public final void b(ByteBuffer byteBuffer) {
        int iLimit;
        int i10;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f5792g.hasRemaining()) {
            if (this.f6664k != 0) {
                tc1.W(this.f6668o < this.f6667n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > 1024) {
                        int i11 = this.f6662i;
                        iLimit = (iPosition2 / i11) * i11;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i12 = this.f6668o;
                int i13 = this.f6669p;
                int i14 = i12 + i13;
                int length = this.f6667n.length;
                if (i14 < length) {
                    i10 = length - i14;
                } else {
                    i14 = i13 - (length - i12);
                    i10 = i12 - i14;
                }
                int iMin = Math.min(iPosition3, i10);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f6667n, i14, iMin);
                int i15 = this.f6669p + iMin;
                this.f6669p = i15;
                tc1.W(i15 <= this.f6667n.length);
                boolean z9 = iLimit < iLimit2 && iPosition3 < i10;
                i(z9);
                if (z9) {
                    this.f6664k = 0;
                    this.f6666m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f6667n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & 255)) > 1024) {
                        int i16 = this.f6662i;
                        iPosition = ((iLimit4 / i16) * i16) + i16;
                        break;
                    }
                    iLimit4 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f6664k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    d(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final e20 c(e20 e20Var) throws zzcs {
        if (e20Var.f3820c == 2) {
            return e20Var.f3818a == -1 ? e20.f3817e : e20Var;
        }
        throw new zzcs(e20Var);
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final void e() {
        if (zzg()) {
            e20 e20Var = this.f5787b;
            int i10 = e20Var.f3819b;
            int i11 = i10 + i10;
            this.f6662i = i11;
            int i12 = ((((int) ((100000 * ((long) e20Var.f3818a)) / 1000000)) / 2) / i11) * i11;
            int i13 = i12 + i12;
            if (this.f6667n.length != i13) {
                this.f6667n = new byte[i13];
                this.f6670q = new byte[i13];
            }
        }
        this.f6664k = 0;
        this.f6665l = 0L;
        this.f6666m = 0;
        this.f6668o = 0;
        this.f6669p = 0;
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final void f() {
        if (this.f6669p > 0) {
            i(true);
            this.f6666m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final void g() {
        this.f6663j = false;
        byte[] bArr = yn0.f10949f;
        this.f6667n = bArr;
        this.f6670q = bArr;
    }

    public final int h(int i10) {
        int length = ((((int) ((2000000 * ((long) this.f5787b.f3818a)) / 1000000)) - this.f6666m) * this.f6662i) - (this.f6667n.length >> 1);
        tc1.W(length >= 0);
        int iMin = (int) Math.min((i10 * 0.2f) + 0.5f, length);
        int i11 = this.f6662i;
        return (iMin / i11) * i11;
    }

    public final void i(boolean z9) {
        int i10;
        int length;
        int i11 = this.f6669p;
        int length2 = this.f6667n.length;
        if (i11 != length2) {
            if (!z9) {
                return;
            } else {
                z9 = true;
            }
        }
        if (this.f6666m == 0) {
            if (z9) {
                j(i11, 3);
                length = i11;
            } else {
                tc1.W(i11 >= (length2 >> 1));
                length = this.f6667n.length >> 1;
                j(length, 0);
            }
            i10 = length;
        } else {
            int i12 = length2 >> 1;
            int i13 = i11 - i12;
            if (z9) {
                int iH = h(i13) + (this.f6667n.length >> 1);
                j(iH, 2);
                int i14 = i12 + i13;
                i10 = iH;
                length = i14;
            } else {
                int iH2 = h(i13);
                j(iH2, 1);
                i10 = iH2;
                length = i13;
            }
        }
        boolean z10 = length % this.f6662i == 0;
        String strG = fb1.g("bytesConsumed is not aligned to frame size: %s", length);
        if (!z10) {
            throw new IllegalStateException(strG);
        }
        tc1.W(i11 >= i10);
        this.f6669p -= length;
        int i15 = this.f6668o + length;
        this.f6668o = i15;
        this.f6668o = i15 % this.f6667n.length;
        int i16 = this.f6666m;
        int i17 = this.f6662i;
        this.f6666m = (i10 / i17) + i16;
        this.f6665l += (long) ((length - i10) / i17);
    }

    public final void j(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            return;
        }
        tc1.K(this.f6669p >= i10);
        if (i11 == 2) {
            int i13 = this.f6668o;
            int i14 = this.f6669p;
            int i15 = i13 + i14;
            byte[] bArr = this.f6667n;
            int length = bArr.length;
            if (i15 <= length) {
                System.arraycopy(bArr, i15 - i10, this.f6670q, 0, i10);
            } else {
                int i16 = i14 - (length - i13);
                if (i16 >= i10) {
                    System.arraycopy(bArr, i16 - i10, this.f6670q, 0, i10);
                } else {
                    int i17 = i10 - i16;
                    System.arraycopy(bArr, length - i17, this.f6670q, 0, i17);
                    System.arraycopy(this.f6667n, 0, this.f6670q, i17, i16);
                }
            }
        } else {
            int i18 = this.f6668o;
            int i19 = i18 + i10;
            byte[] bArr2 = this.f6667n;
            int length2 = bArr2.length;
            if (i19 <= length2) {
                System.arraycopy(bArr2, i18, this.f6670q, 0, i10);
            } else {
                int i20 = length2 - i18;
                System.arraycopy(bArr2, i18, this.f6670q, 0, i20);
                System.arraycopy(this.f6667n, 0, this.f6670q, i20, i10 - i20);
            }
        }
        tc1.Q("sizeToOutput is not aligned to frame size: " + i10, i10 % this.f6662i == 0);
        tc1.W(this.f6668o < this.f6667n.length);
        byte[] bArr3 = this.f6670q;
        tc1.Q(fb1.g("byteOutput size is not aligned to frame size ", i10), i10 % this.f6662i == 0);
        if (i11 != 3) {
            for (int i21 = 0; i21 < i10; i21 += 2) {
                int i22 = i21 + 1;
                int i23 = (bArr3[i22] << 8) | (bArr3[i21] & 255);
                if (i11 == 0) {
                    i12 = ((((i21 * 1000) / (i10 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i12 = 10;
                    if (i11 == 2) {
                        i12 = 10 + (((90000 * i21) / (i10 - 1)) / 1000);
                    }
                }
                int i24 = (i23 * i12) / 100;
                if (i24 >= 32767) {
                    bArr3[i21] = -1;
                    bArr3[i22] = 127;
                } else if (i24 <= -32768) {
                    bArr3[i21] = 0;
                    bArr3[i22] = -128;
                } else {
                    bArr3[i21] = (byte) (i24 & 255);
                    bArr3[i22] = (byte) (i24 >> 8);
                }
            }
        }
        d(i10).put(bArr3, 0, i10).flip();
    }

    @Override // com.google.android.gms.internal.ads.j30, com.google.android.gms.internal.ads.e30
    public final boolean zzg() {
        return super.zzg() && this.f6663j;
    }
}
