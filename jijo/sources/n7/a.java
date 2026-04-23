package n7;

import g7.b;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import p7.l;
import p7.n;
import p7.p;
import p7.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f15982e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f15983f = new String[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f15984g = {"*"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f15985h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15986a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f15987b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f15988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f15989d;

    public static String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z9;
        int i12;
        int i13;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z10 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z10) {
                    i12 = 46;
                    z9 = false;
                } else {
                    z9 = z10;
                    i12 = bArr2[i19][i20] & 255;
                }
                i13 = i12 - (bArr[i16 + i21] & 255);
                if (i13 == 0) {
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z10 = z9;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        z10 = true;
                        i20 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i22 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    while (true) {
                        i19++;
                        if (i19 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i19].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            return new String(bArr, i16, i18, b.f13891d);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i15;
        }
        return null;
    }

    public final void b() {
        InputStream resourceAsStream = a.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = n.f16294a;
        p pVar = new p(new l(new p7.b(resourceAsStream, new v())));
        try {
            byte[] bArr = new byte[pVar.k()];
            pVar.c(bArr);
            byte[] bArr2 = new byte[pVar.k()];
            pVar.c(bArr2);
            synchronized (this) {
                this.f15988c = bArr;
                this.f15989d = bArr2;
            }
            this.f15987b.countDown();
        } finally {
            b.d(pVar);
        }
    }
}
