package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class b8 extends yg1 {
    public float A;
    public dh1 B;
    public long C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Date f2934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Date f2935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f2936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f2937y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public double f2938z;

    @Override // com.google.android.gms.internal.ads.yg1
    public final void c(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.get();
        if (i10 < 0) {
            i10 += NotificationCompat.FLAG_LOCAL_ONLY;
        }
        this.f2933u = i10;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f10877b) {
            d();
        }
        if (this.f2933u == 1) {
            this.f2934v = tp1.D(b4.f.n0(byteBuffer));
            this.f2935w = tp1.D(b4.f.n0(byteBuffer));
            this.f2936x = b4.f.k0(byteBuffer);
            this.f2937y = b4.f.n0(byteBuffer);
        } else {
            this.f2934v = tp1.D(b4.f.k0(byteBuffer));
            this.f2935w = tp1.D(b4.f.k0(byteBuffer));
            this.f2936x = b4.f.k0(byteBuffer);
            this.f2937y = b4.f.k0(byteBuffer);
        }
        this.f2938z = b4.f.a0(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.A = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        b4.f.k0(byteBuffer);
        b4.f.k0(byteBuffer);
        this.B = new dh1(b4.f.a0(byteBuffer), b4.f.a0(byteBuffer), b4.f.a0(byteBuffer), b4.f.a0(byteBuffer), b4.f.U(byteBuffer), b4.f.U(byteBuffer), b4.f.U(byteBuffer), b4.f.a0(byteBuffer), b4.f.a0(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.C = b4.f.k0(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f2934v + ";modificationTime=" + this.f2935w + ";timescale=" + this.f2936x + ";duration=" + this.f2937y + ";rate=" + this.f2938z + ";volume=" + this.A + ";matrix=" + this.B + ";nextTrackId=" + this.C + "]";
    }
}
