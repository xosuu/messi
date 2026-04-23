package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dc1 extends OutputStream {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f3614q = new byte[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3617d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3619h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3615a = NotificationCompat.FLAG_HIGH_PRIORITY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3616b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f3618f = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];

    public final synchronized ec1 a() {
        try {
            int i10 = this.f3619h;
            byte[] bArr = this.f3618f;
            if (i10 >= bArr.length) {
                this.f3616b.add(new cc1(this.f3618f));
                this.f3618f = f3614q;
            } else if (i10 > 0) {
                this.f3616b.add(new cc1(Arrays.copyOf(bArr, i10)));
            }
            this.f3617d += this.f3619h;
            this.f3619h = 0;
        } catch (Throwable th) {
            throw th;
        }
        return ec1.p(this.f3616b);
    }

    public final void c(int i10) {
        this.f3616b.add(new cc1(this.f3618f));
        int length = this.f3617d + this.f3618f.length;
        this.f3617d = length;
        this.f3618f = new byte[Math.max(this.f3615a, Math.max(i10, length >>> 1))];
        this.f3619h = 0;
    }

    public final String toString() {
        int i10;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i10 = this.f3617d + this.f3619h;
        }
        objArr[1] = Integer.valueOf(i10);
        return String.format("<ByteString.Output@%s size=%d>", objArr);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f3619h == this.f3618f.length) {
                c(1);
            }
            byte[] bArr = this.f3618f;
            int i11 = this.f3619h;
            this.f3619h = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f3618f;
        int length = bArr2.length;
        int i12 = this.f3619h;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f3619h += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        c(i14);
        System.arraycopy(bArr, i10 + i13, this.f3618f, 0, i14);
        this.f3619h = i14;
    }
}
