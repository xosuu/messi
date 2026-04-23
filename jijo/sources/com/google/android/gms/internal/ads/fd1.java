package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fd1 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f4483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f4484b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4485d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4486f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4487h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4488q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f4489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f4491u;

    public final void a(int i10) {
        int i11 = this.f4487h + i10;
        this.f4487h = i11;
        if (i11 == this.f4484b.limit()) {
            c();
        }
    }

    public final boolean c() {
        this.f4486f++;
        Iterator it = this.f4483a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f4484b = byteBuffer;
        this.f4487h = byteBuffer.position();
        if (this.f4484b.hasArray()) {
            this.f4488q = true;
            this.f4489s = this.f4484b.array();
            this.f4490t = this.f4484b.arrayOffset();
        } else {
            this.f4488q = false;
            this.f4491u = pe1.h(this.f4484b);
            this.f4489s = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f4486f == this.f4485d) {
            return -1;
        }
        if (this.f4488q) {
            int i10 = this.f4489s[this.f4487h + this.f4490t] & 255;
            a(1);
            return i10;
        }
        int iV0 = pe1.f7866c.v0(((long) this.f4487h) + this.f4491u) & 255;
        a(1);
        return iV0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f4486f == this.f4485d) {
            return -1;
        }
        int iLimit = this.f4484b.limit();
        int i12 = this.f4487h;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f4488q) {
            System.arraycopy(this.f4489s, i12 + this.f4490t, bArr, i10, i11);
            a(i11);
        } else {
            int iPosition = this.f4484b.position();
            this.f4484b.position(this.f4487h);
            this.f4484b.get(bArr, i10, i11);
            this.f4484b.position(iPosition);
            a(i11);
        }
        return i11;
    }
}
