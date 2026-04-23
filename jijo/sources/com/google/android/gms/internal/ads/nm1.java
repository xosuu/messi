package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class nm1 extends j30 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f7321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7323o;

    @Override // com.google.android.gms.internal.ads.e30
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f7320l);
        this.f7323o += (long) (iMin / this.f5787b.f3821d);
        this.f7320l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f7320l <= 0) {
            int i11 = i10 - iMin;
            int length = (this.f7322n + i11) - this.f7321m.length;
            ByteBuffer byteBufferD = d(length);
            int iMax = Math.max(0, Math.min(length, this.f7322n));
            byteBufferD.put(this.f7321m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i11));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferD.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i12 = i11 - iMax2;
            int i13 = this.f7322n - iMax;
            this.f7322n = i13;
            byte[] bArr = this.f7321m;
            System.arraycopy(bArr, iMax, bArr, 0, i13);
            byteBuffer.get(this.f7321m, this.f7322n, i12);
            this.f7322n += i12;
            byteBufferD.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final e20 c(e20 e20Var) throws zzcs {
        if (e20Var.f3820c != 2) {
            throw new zzcs(e20Var);
        }
        this.f7319k = true;
        return (this.f7317i == 0 && this.f7318j == 0) ? e20.f3817e : e20Var;
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final void e() {
        if (this.f7319k) {
            this.f7319k = false;
            int i10 = this.f7318j;
            int i11 = this.f5787b.f3821d;
            this.f7321m = new byte[i10 * i11];
            this.f7320l = this.f7317i * i11;
        }
        this.f7322n = 0;
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final void f() {
        if (this.f7319k) {
            int i10 = this.f7322n;
            if (i10 > 0) {
                this.f7323o += (long) (i10 / this.f5787b.f3821d);
            }
            this.f7322n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final void g() {
        this.f7321m = yn0.f10949f;
    }

    @Override // com.google.android.gms.internal.ads.j30, com.google.android.gms.internal.ads.e30
    public final ByteBuffer zzb() {
        int i10;
        if (super.zzh() && (i10 = this.f7322n) > 0) {
            d(i10).put(this.f7321m, 0, this.f7322n).flip();
            this.f7322n = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.j30, com.google.android.gms.internal.ads.e30
    public final boolean zzh() {
        return super.zzh() && this.f7322n == 0;
    }
}
