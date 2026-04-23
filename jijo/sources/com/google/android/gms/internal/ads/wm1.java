package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class wm1 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f10235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f10236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iq1 f10237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final iq1 f10238e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f10241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f10242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f10243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f10244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IllegalStateException f10247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public hn1 f10248o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10234a = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f10239f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f10240g = new ArrayDeque();

    public wm1(HandlerThread handlerThread) {
        this.f10235b = handlerThread;
        int i10 = 0;
        this.f10237d = new iq1(i10);
        this.f10238e = new iq1(i10);
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f10240g;
        if (!arrayDeque.isEmpty()) {
            this.f10242i = (MediaFormat) arrayDeque.getLast();
        }
        iq1 iq1Var = this.f10237d;
        iq1Var.f5676b = iq1Var.f5675a;
        iq1 iq1Var2 = this.f10238e;
        iq1Var2.f5676b = iq1Var2.f5675a;
        this.f10239f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f10234a) {
            this.f10244k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f10234a) {
            this.f10243j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        wi1 wi1Var;
        synchronized (this.f10234a) {
            try {
                this.f10237d.a(i10);
                hn1 hn1Var = this.f10248o;
                if (hn1Var != null && (wi1Var = hn1Var.f5354a.P) != null) {
                    wi1Var.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10234a) {
            try {
                MediaFormat mediaFormat = this.f10242i;
                if (mediaFormat != null) {
                    this.f10238e.a(-2);
                    this.f10240g.add(mediaFormat);
                    this.f10242i = null;
                }
                this.f10238e.a(i10);
                this.f10239f.add(bufferInfo);
                hn1 hn1Var = this.f10248o;
                if (hn1Var != null) {
                    wi1 wi1Var = hn1Var.f5354a.P;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f10234a) {
            this.f10238e.a(-2);
            this.f10240g.add(mediaFormat);
            this.f10242i = null;
        }
    }
}
