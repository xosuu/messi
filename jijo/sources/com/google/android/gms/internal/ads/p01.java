package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class p01 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7758b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(InputStream inputStream, long j10, int i10) {
        super(inputStream);
        this.f7757a = i10;
        if (i10 == 1) {
            super(inputStream);
            this.f7758b = j10;
            return;
        }
        this.f7759d = -1L;
        inputStream.getClass();
        en1.F0("limit must be non-negative", j10 >= 0);
        this.f7758b = j10;
    }

    private final synchronized void a(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f7759d = this.f7758b;
    }

    private final synchronized void c() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f7759d == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f7758b = this.f7759d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f7757a) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f7758b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        switch (this.f7757a) {
            case 0:
                a(i10);
                return;
            default:
                super.mark(i10);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f7757a) {
            case 0:
                if (this.f7758b == 0) {
                    return -1;
                }
                int i10 = ((FilterInputStream) this).in.read();
                if (i10 != -1) {
                    this.f7758b--;
                }
                return i10;
            default:
                int i11 = super.read();
                if (i11 != -1) {
                    this.f7759d++;
                }
                return i11;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        switch (this.f7757a) {
            case 0:
                c();
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        switch (this.f7757a) {
            case 0:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f7758b));
                this.f7758b -= jSkip;
                return jSkip;
            default:
                return super.skip(j10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        switch (this.f7757a) {
            case 0:
                long j10 = this.f7758b;
                if (j10 == 0) {
                    return -1;
                }
                int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
                if (i12 != -1) {
                    this.f7758b -= (long) i12;
                }
                return i12;
            default:
                int i13 = super.read(bArr, i10, i11);
                if (i13 != -1) {
                    this.f7759d += (long) i13;
                }
                return i13;
        }
    }
}
