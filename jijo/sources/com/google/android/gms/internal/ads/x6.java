package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10454e;

    public /* synthetic */ x6(ByteBuffer byteBuffer, long j10, long j11, long j12, ByteBuffer byteBuffer2) {
        this.f10453d = byteBuffer;
        this.f10450a = j10;
        this.f10451b = j11;
        this.f10452c = j12;
        this.f10454e = byteBuffer2;
    }

    public x6(AudioTrack audioTrack) {
        this.f10453d = audioTrack;
        this.f10454e = new AudioTimestamp();
    }
}
