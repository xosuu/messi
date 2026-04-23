package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl1 f2542b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2543d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2544f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2546q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2547s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f2545h = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2541a = new byte[NotificationCompat.FLAG_BUBBLE];

    static {
        vg.a("media3.extractor");
    }

    public a0(hw0 hw0Var, long j10, long j11) {
        this.f2542b = hw0Var;
        this.f2544f = j10;
        this.f2543d = j11;
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) throws EOFException, InterruptedIOException {
        int i12 = this.f2547s;
        int iN = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f2545h, 0, bArr, i10, iMin);
            p(iMin);
            iN = iMin;
        }
        if (iN == 0) {
            iN = n(bArr, i10, i11, 0, true);
        }
        if (iN != -1) {
            this.f2544f += (long) iN;
        }
        return iN;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void c(int i10) {
        i(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void d(int i10) {
        j(i10);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void e(int i10, byte[] bArr, int i11) {
        m(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void f(int i10, byte[] bArr, int i11) {
        h(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final boolean h(byte[] bArr, int i10, int i11, boolean z9) {
        int iMin;
        int i12 = this.f2547s;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f2545h, 0, bArr, i10, iMin);
            p(iMin);
        }
        int iN = iMin;
        while (iN < i11 && iN != -1) {
            iN = n(bArr, i10, i11, iN, z9);
        }
        if (iN != -1) {
            this.f2544f += (long) iN;
        }
        return iN != -1;
    }

    public final boolean i(int i10, boolean z9) {
        o(i10);
        int iN = this.f2547s - this.f2546q;
        while (iN < i10) {
            iN = n(this.f2545h, this.f2546q, i10, iN, z9);
            if (iN == -1) {
                return false;
            }
            this.f2547s = this.f2546q + iN;
        }
        this.f2546q += i10;
        return true;
    }

    public final void j(int i10) {
        int iMin = Math.min(this.f2547s, i10);
        p(iMin);
        int iN = iMin;
        while (iN < i10 && iN != -1) {
            iN = n(this.f2541a, -iN, Math.min(i10, iN + NotificationCompat.FLAG_BUBBLE), iN, false);
        }
        if (iN != -1) {
            this.f2544f += (long) iN;
        }
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final int k(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f2547s, 1);
        p(iMin);
        if (iMin == 0) {
            iMin = n(this.f2541a, 0, Math.min(1, NotificationCompat.FLAG_BUBBLE), 0, true);
        }
        if (iMin != -1) {
            this.f2544f += (long) iMin;
        }
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final int l(int i10, byte[] bArr, int i11) throws EOFException, InterruptedIOException {
        int iMin;
        o(i11);
        int i12 = this.f2547s;
        int i13 = this.f2546q;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = n(this.f2545h, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f2547s += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f2545h, this.f2546q, bArr, i10, iMin);
        this.f2546q += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final boolean m(byte[] bArr, int i10, int i11, boolean z9) {
        if (!i(i11, z9)) {
            return false;
        }
        System.arraycopy(this.f2545h, this.f2546q - i11, bArr, i10, i11);
        return true;
    }

    public final int n(byte[] bArr, int i10, int i11, int i12, boolean z9) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iB = this.f2542b.b(i10 + i12, bArr, i11 - i12);
        if (iB != -1) {
            return i12 + iB;
        }
        if (i12 == 0 && z9) {
            return -1;
        }
        throw new EOFException();
    }

    public final void o(int i10) {
        int i11 = this.f2546q + i10;
        int length = this.f2545h.length;
        if (i11 > length) {
            this.f2545h = Arrays.copyOf(this.f2545h, Math.max(65536 + i11, Math.min(length + length, i11 + 524288)));
        }
    }

    public final void p(int i10) {
        int i11 = this.f2547s - i10;
        this.f2547s = i11;
        this.f2546q = 0;
        byte[] bArr = this.f2545h;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f2545h = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final long zzd() {
        return this.f2543d;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final long zze() {
        return this.f2544f + ((long) this.f2546q);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final long zzf() {
        return this.f2544f;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void zzj() {
        this.f2546q = 0;
    }
}
