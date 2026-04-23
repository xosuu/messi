package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class tm1 implements an1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f9196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wm1 f9197b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bn1 f9198d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9199f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9200h = 0;

    public /* synthetic */ tm1(MediaCodec mediaCodec, HandlerThread handlerThread, bn1 bn1Var) {
        this.f9196a = mediaCodec;
        this.f9197b = new wm1(handlerThread);
        this.f9198d = bn1Var;
    }

    public static void j(tm1 tm1Var, MediaFormat mediaFormat, Surface surface, int i10) {
        wm1 wm1Var = tm1Var.f9197b;
        tc1.W(wm1Var.f10236c == null);
        HandlerThread handlerThread = wm1Var.f10235b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = tm1Var.f9196a;
        mediaCodec.setCallback(wm1Var, handler);
        wm1Var.f10236c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        tm1Var.f9198d.zzh();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        tm1Var.f9200h = 1;
    }

    public static String l(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final ByteBuffer a(int i10) {
        return this.f9196a.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void b(int i10) {
        this.f9196a.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final ByteBuffer c(int i10) {
        return this.f9196a.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void d(int i10) {
        this.f9196a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void e(Bundle bundle) {
        this.f9198d.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final boolean f(hn1 hn1Var) {
        wm1 wm1Var = this.f9197b;
        synchronized (wm1Var.f10234a) {
            wm1Var.f10248o = hn1Var;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void g(int i10, de1 de1Var, long j10) {
        this.f9198d.c(i10, de1Var, j10);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void h(Surface surface) {
        this.f9196a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int i10;
        this.f9198d.zzc();
        wm1 wm1Var = this.f9197b;
        synchronized (wm1Var.f10234a) {
            try {
                IllegalStateException illegalStateException = wm1Var.f10247n;
                if (illegalStateException != null) {
                    wm1Var.f10247n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = wm1Var.f10243j;
                if (codecException != null) {
                    wm1Var.f10243j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = wm1Var.f10244k;
                if (cryptoException != null) {
                    wm1Var.f10244k = null;
                    throw cryptoException;
                }
                i10 = -1;
                if (!(wm1Var.f10245l > 0 || wm1Var.f10246m)) {
                    iq1 iq1Var = wm1Var.f10238e;
                    int i11 = iq1Var.f5675a;
                    int i12 = iq1Var.f5676b;
                    if (i11 != i12) {
                        if (i11 == i12) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i10 = ((int[]) iq1Var.f5677c)[i11];
                        iq1Var.f5675a = (i11 + 1) & iq1Var.f5678d;
                        if (i10 >= 0) {
                            tc1.A(wm1Var.f10241h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) wm1Var.f10239f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (i10 == -2) {
                            wm1Var.f10241h = (MediaFormat) wm1Var.f10240g.remove();
                            i10 = -2;
                        }
                    }
                }
            } finally {
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void k(int i10, long j10) {
        this.f9196a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void m(long j10, int i10, int i11, int i12) {
        this.f9198d.a(j10, i10, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final int zza() {
        int i10;
        this.f9198d.zzc();
        wm1 wm1Var = this.f9197b;
        synchronized (wm1Var.f10234a) {
            try {
                IllegalStateException illegalStateException = wm1Var.f10247n;
                if (illegalStateException != null) {
                    wm1Var.f10247n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = wm1Var.f10243j;
                if (codecException != null) {
                    wm1Var.f10243j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = wm1Var.f10244k;
                if (cryptoException != null) {
                    wm1Var.f10244k = null;
                    throw cryptoException;
                }
                i10 = -1;
                if (!(wm1Var.f10245l > 0 || wm1Var.f10246m)) {
                    iq1 iq1Var = wm1Var.f10237d;
                    int i11 = iq1Var.f5675a;
                    int i12 = iq1Var.f5676b;
                    if (i11 != i12) {
                        if (i11 == i12) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i10 = ((int[]) iq1Var.f5677c)[i11];
                        iq1Var.f5675a = (i11 + 1) & iq1Var.f5678d;
                    }
                }
            } finally {
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        wm1 wm1Var = this.f9197b;
        synchronized (wm1Var.f10234a) {
            try {
                mediaFormat = wm1Var.f10241h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void zzi() {
        this.f9198d.zzb();
        this.f9196a.flush();
        wm1 wm1Var = this.f9197b;
        synchronized (wm1Var.f10234a) {
            wm1Var.f10245l++;
            Handler handler = wm1Var.f10236c;
            int i10 = yn0.f10944a;
            handler.post(new yd0(22, wm1Var));
        }
        this.f9196a.start();
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final void zzl() {
        try {
            if (this.f9200h == 1) {
                this.f9198d.zzg();
                wm1 wm1Var = this.f9197b;
                synchronized (wm1Var.f10234a) {
                    wm1Var.f10246m = true;
                    wm1Var.f10235b.quit();
                    wm1Var.a();
                }
            }
            this.f9200h = 2;
            if (this.f9199f) {
                return;
            }
            this.f9196a.release();
            this.f9199f = true;
        } catch (Throwable th) {
            if (!this.f9199f) {
                this.f9196a.release();
                this.f9199f = true;
            }
            throw th;
        }
    }
}
