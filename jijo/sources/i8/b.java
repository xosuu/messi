package i8;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f14211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14212d;

    public b(int i10) {
        this.f14209a = i10;
        if (i10 != 1) {
            this.f14210b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
            this.f14211c = (byte) 61;
            this.f14212d = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];
            b();
            return;
        }
        this.f14210b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        this.f14211c = (byte) 61;
        this.f14212d = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];
        b();
    }

    public final void a(byte[] bArr, int i10, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        int i11 = 0;
        int i12 = this.f14209a;
        byte[] bArr2 = this.f14210b;
        switch (i12) {
            case 0:
                int i13 = i10 % 3;
                int i14 = i10 - i13;
                while (i11 < i14) {
                    int i15 = bArr[i11] & 255;
                    int i16 = bArr[i11 + 1] & 255;
                    byte b10 = bArr[i11 + 2];
                    byteArrayOutputStream.write(bArr2[(i15 >>> 2) & 63]);
                    byteArrayOutputStream.write(bArr2[((i15 << 4) | (i16 >>> 4)) & 63]);
                    byteArrayOutputStream.write(bArr2[((i16 << 2) | ((b10 & 255) >>> 6)) & 63]);
                    byteArrayOutputStream.write(bArr2[b10 & 63]);
                    i11 += 3;
                }
                if (i13 == 1) {
                    int i17 = bArr[i14] & 255;
                    byteArrayOutputStream.write(bArr2[(i17 >>> 2) & 63]);
                    byteArrayOutputStream.write(bArr2[(i17 << 4) & 63]);
                    byteArrayOutputStream.write(this.f14211c);
                    byteArrayOutputStream.write(this.f14211c);
                } else if (i13 == 2) {
                    int i18 = bArr[i14] & 255;
                    int i19 = bArr[i14 + 1] & 255;
                    int i20 = (i18 >>> 2) & 63;
                    byteArrayOutputStream.write(bArr2[i20]);
                    byteArrayOutputStream.write(bArr2[((i18 << 4) | (i19 >>> 4)) & 63]);
                    byteArrayOutputStream.write(bArr2[(i19 << 2) & 63]);
                    byteArrayOutputStream.write(this.f14211c);
                }
                int i21 = i14 / 3;
                break;
            default:
                int i22 = i10 % 3;
                int i23 = i10 - i22;
                while (i11 < i23) {
                    int i24 = bArr[i11] & 255;
                    int i25 = bArr[i11 + 1] & 255;
                    byte b11 = bArr[i11 + 2];
                    byteArrayOutputStream.write(bArr2[(i24 >>> 2) & 63]);
                    byteArrayOutputStream.write(bArr2[((i24 << 4) | (i25 >>> 4)) & 63]);
                    byteArrayOutputStream.write(bArr2[((i25 << 2) | ((b11 & 255) >>> 6)) & 63]);
                    byteArrayOutputStream.write(bArr2[b11 & 63]);
                    i11 += 3;
                }
                if (i22 == 1) {
                    int i26 = bArr[i23] & 255;
                    byteArrayOutputStream.write(bArr2[(i26 >>> 2) & 63]);
                    byteArrayOutputStream.write(bArr2[(i26 << 4) & 63]);
                    byteArrayOutputStream.write(this.f14211c);
                    byteArrayOutputStream.write(this.f14211c);
                } else if (i22 == 2) {
                    int i27 = bArr[i23] & 255;
                    int i28 = bArr[i23 + 1] & 255;
                    int i29 = (i27 >>> 2) & 63;
                    byteArrayOutputStream.write(bArr2[i29]);
                    byteArrayOutputStream.write(bArr2[((i27 << 4) | (i28 >>> 4)) & 63]);
                    byteArrayOutputStream.write(bArr2[(i28 << 2) & 63]);
                    byteArrayOutputStream.write(this.f14211c);
                }
                int i30 = i23 / 3;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b() {
        int i10 = this.f14209a;
        byte[] bArr = this.f14212d;
        byte[] bArr2 = this.f14210b;
        int i11 = 0;
        switch (i10) {
            case 0:
                while (i11 < bArr2.length) {
                    bArr[bArr2[i11]] = (byte) i11;
                    i11++;
                }
                break;
            default:
                while (i11 < bArr2.length) {
                    bArr[bArr2[i11]] = (byte) i11;
                    i11++;
                }
                break;
        }
    }
}
