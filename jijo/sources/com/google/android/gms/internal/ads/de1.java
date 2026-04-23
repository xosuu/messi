package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class de1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f3632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f3633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f3635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f3640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ld1 f3641j;

    public de1() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f3640i = cryptoInfo;
        this.f3641j = yn0.f10944a >= 24 ? new ld1(cryptoInfo) : null;
    }
}
