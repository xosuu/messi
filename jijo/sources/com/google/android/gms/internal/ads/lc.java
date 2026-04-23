package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class lc extends hc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MessageDigest f6550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6552e;

    public lc(int i10) {
        int i11 = i10 >> 3;
        this.f6551d = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.f6552e = i10;
    }

    @Override // com.google.android.gms.internal.ads.hc
    public final byte[] i(String str) {
        synchronized (this.f5252a) {
            try {
                MessageDigest messageDigestH = h();
                this.f6550c = messageDigestH;
                if (messageDigestH == null) {
                    return new byte[0];
                }
                messageDigestH.reset();
                this.f6550c.update(str.getBytes(Charset.forName(StandardStringDigester.MESSAGE_CHARSET)));
                byte[] bArrDigest = this.f6550c.digest();
                int length = bArrDigest.length;
                int i10 = this.f6551d;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.f6552e & 7) > 0) {
                    long j10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 > 0) {
                            j10 <<= 8;
                        }
                        j10 += (long) (bArr[i11] & 255);
                    }
                    long j11 = j10 >>> (8 - (this.f6552e & 7));
                    int i12 = this.f6551d;
                    while (true) {
                        i12--;
                        if (i12 < 0) {
                            break;
                        }
                        bArr[i12] = (byte) (255 & j11);
                        j11 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
