package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class zzsk extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cn1 f11663b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11664d;

    public zzsk(int i10, y1 y1Var, zzsw zzswVar) {
        this("Decoder init failed: [" + i10 + "], " + y1Var.toString(), zzswVar, y1Var.f10714m, null, fb1.g("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", Math.abs(i10)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzsk(y1 y1Var, Exception exc, cn1 cn1Var) {
        String str = "Decoder init failed: " + cn1Var.f3343a + ", " + y1Var.toString();
        String str2 = y1Var.f10714m;
        int i10 = yn0.f10944a;
        this(str, exc, str2, cn1Var, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
    }

    public zzsk(String str, Throwable th, String str2, cn1 cn1Var, String str3) {
        super(str, th);
        this.f11662a = str2;
        this.f11663b = cn1Var;
        this.f11664d = str3;
    }
}
