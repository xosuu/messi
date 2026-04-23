package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface an1 {
    ByteBuffer a(int i10);

    void b(int i10);

    ByteBuffer c(int i10);

    void d(int i10);

    void e(Bundle bundle);

    boolean f(hn1 hn1Var);

    void g(int i10, de1 de1Var, long j10);

    void h(Surface surface);

    int i(MediaCodec.BufferInfo bufferInfo);

    void k(int i10, long j10);

    void m(long j10, int i10, int i11, int i12);

    int zza();

    MediaFormat zzc();

    void zzi();

    void zzl();
}
