package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class wf1 extends t2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1 f10169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final de1 f10170d = new de1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f10171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f10174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10175i;

    static {
        vg.a("media3.decoder");
    }

    public wf1(int i10) {
        this.f10175i = i10;
    }

    public void d() {
        this.f9035b = 0;
        ByteBuffer byteBuffer = this.f10171e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f10174h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f10172f = false;
    }

    public final void e(int i10) {
        ByteBuffer byteBuffer = this.f10171e;
        if (byteBuffer == null) {
            this.f10171e = g(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f10171e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferG = g(i11);
        byteBufferG.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferG.put(byteBuffer);
        }
        this.f10171e = byteBufferG;
    }

    public final void f() {
        ByteBuffer byteBuffer = this.f10171e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f10174h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer g(int i10) {
        int i11 = this.f10175i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f10171e;
        throw new zzhc("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }
}
