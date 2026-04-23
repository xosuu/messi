package p7;

import com.google.android.gms.internal.ads.go;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class o implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f16295a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16296b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16297d;

    public o(s sVar) {
        this.f16296b = sVar;
    }

    public final f a() {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f16295a;
        long j10 = eVar.f16276b;
        if (j10 == 0) {
            j10 = 0;
        } else {
            go goVar = (go) eVar.f16275a.f5007g;
            int i10 = goVar.f5002b;
            if (i10 < 8192 && goVar.f5004d) {
                j10 -= (long) (i10 - goVar.f5001a);
            }
        }
        if (j10 > 0) {
            this.f16296b.h(eVar, j10);
        }
        return this;
    }

    @Override // p7.s
    public final v b() {
        return this.f16296b.b();
    }

    @Override // p7.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s sVar = this.f16296b;
        if (this.f16297d) {
            return;
        }
        try {
            e eVar = this.f16295a;
            long j10 = eVar.f16276b;
            if (j10 > 0) {
                sVar.h(eVar, j10);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            sVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f16297d = true;
        if (th == null) {
            return;
        }
        Charset charset = w.f16310a;
        throw th;
    }

    @Override // p7.f
    public final f d(long j10) {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        this.f16295a.L(j10);
        a();
        return this;
    }

    @Override // p7.f, p7.s, java.io.Flushable
    public final void flush() {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f16295a;
        long j10 = eVar.f16276b;
        s sVar = this.f16296b;
        if (j10 > 0) {
            sVar.h(eVar, j10);
        }
        sVar.flush();
    }

    @Override // p7.s
    public final void h(e eVar, long j10) {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        this.f16295a.h(eVar, j10);
        a();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16297d;
    }

    @Override // p7.f
    public final f j(int i10) {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        this.f16295a.N(i10);
        a();
        return this;
    }

    @Override // p7.f
    public final f l(int i10) {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        this.f16295a.M(i10);
        a();
        return this;
    }

    @Override // p7.f
    public final f o(int i10) {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        this.f16295a.K(i10);
        a();
        return this;
    }

    @Override // p7.f
    public final f q(byte[] bArr) {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f16295a;
        eVar.getClass();
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        eVar.H(0, bArr, bArr.length);
        a();
        return this;
    }

    @Override // p7.f
    public final f s(h hVar) {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        this.f16295a.I(hVar);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f16296b + ")";
    }

    @Override // p7.f
    public final f w(String str) {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f16295a;
        eVar.getClass();
        eVar.O(0, str.length(), str);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f16297d) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f16295a.write(byteBuffer);
        a();
        return iWrite;
    }
}
