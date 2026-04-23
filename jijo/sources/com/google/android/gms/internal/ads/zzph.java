package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class zzph extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11656b;

    public zzph(int i10, int i11, int i12, int i13, y1 y1Var, boolean z9, RuntimeException runtimeException) {
        String strValueOf = String.valueOf(y1Var);
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i10);
        sb.append(" Config(");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(", ");
        sb.append(i13);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z9 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " (recoverable)");
        super(sb.toString(), runtimeException);
        this.f11655a = i10;
        this.f11656b = z9;
    }
}
