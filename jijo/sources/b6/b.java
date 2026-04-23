package b6;

import java.io.InputStream;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1361b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1362d;

    public b(a aVar, boolean z9) {
        this.f1360a = aVar;
        this.f1362d = z9;
    }

    @Override // java.io.InputStream
    public final int available() {
        int iH;
        if (this.f1361b) {
            return 0;
        }
        a aVar = this.f1360a;
        c cVar = aVar.f1343b;
        boolean z9 = this.f1362d;
        cVar.getClass();
        synchronized (aVar) {
            iH = (z9 ? aVar.f1346e : aVar.f1345d).h();
        }
        if (iH > 0) {
            return iH;
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        int iR;
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0 || i10 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        if (this.f1361b) {
            return -1;
        }
        a aVar = this.f1360a;
        c cVar = aVar.f1343b;
        boolean z9 = this.f1362d;
        cVar.getClass();
        synchronized (aVar) {
            try {
                try {
                    iR = (z9 ? aVar.f1346e : aVar.f1345d).r(bArr, i10, i11);
                    if (iR > 0) {
                        aVar.b(iR, false);
                    }
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            } finally {
            }
        }
        if (iR == -1) {
            this.f1361b = true;
        }
        return iR;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
