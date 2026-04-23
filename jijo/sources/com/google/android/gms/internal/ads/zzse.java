package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class zzse extends zzhb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11661a;

    public zzse(IllegalStateException illegalStateException, cn1 cn1Var) {
        super("Decoder failed: ".concat(String.valueOf(cn1Var == null ? null : cn1Var.f3343a)), illegalStateException);
        int i10 = yn0.f10944a;
        boolean z9 = illegalStateException instanceof MediaCodec.CodecException;
        this.f11661a = yn0.f10944a >= 23 ? z9 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : yn0.q(z9 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
