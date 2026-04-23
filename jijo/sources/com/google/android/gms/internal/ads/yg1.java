package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class yg1 implements y7 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ah1 f10875t = q7.b.v(yg1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10876a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f10879f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10880h;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zv f10882s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10881q = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10878d = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10877b = true;

    public yg1(String str) {
        this.f10876a = str;
    }

    @Override // com.google.android.gms.internal.ads.y7
    public final void a(zv zvVar, ByteBuffer byteBuffer, long j10, w7 w7Var) {
        this.f10880h = zvVar.c();
        byteBuffer.remaining();
        this.f10881q = j10;
        this.f10882s = zvVar;
        zvVar.f11328a.position((int) (zvVar.c() + j10));
        this.f10878d = false;
        this.f10877b = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.f10878d) {
                return;
            }
            try {
                ah1 ah1Var = f10875t;
                String str = this.f10876a;
                ah1Var.x(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                zv zvVar = this.f10882s;
                long j10 = this.f10880h;
                long j11 = this.f10881q;
                int i10 = (int) j10;
                ByteBuffer byteBuffer = zvVar.f11328a;
                int iPosition = byteBuffer.position();
                byteBuffer.position(i10);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j11);
                byteBuffer.position(iPosition);
                this.f10879f = byteBufferSlice;
                this.f10878d = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            ah1 ah1Var = f10875t;
            String str = this.f10876a;
            ah1Var.x(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f10879f;
            if (byteBuffer != null) {
                this.f10877b = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f10879f = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.y7
    public final String zza() {
        return this.f10876a;
    }
}
