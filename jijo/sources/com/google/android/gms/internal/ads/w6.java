package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class w6 implements v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f10079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10080b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10081d;

    public w6(FileChannel fileChannel, long j10, long j11) {
        this.f10079a = fileChannel;
        this.f10080b = j10;
        this.f10081d = j11;
    }

    @Override // com.google.android.gms.internal.ads.v6
    public final void c(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f10079a.map(FileChannel.MapMode.READ_ONLY, this.f10080b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.v6
    public final long zza() {
        return this.f10081d;
    }
}
