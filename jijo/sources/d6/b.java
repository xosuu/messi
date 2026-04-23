package d6;

import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f12467a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12468b = 0;

    public final byte[] a() {
        int i10 = this.f12468b;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f12467a, 0, bArr, 0, i10);
        return bArr;
    }

    public final void b(boolean z9) {
        int i10 = this.f12468b + 1;
        byte[] bArr = this.f12467a;
        if (i10 > bArr.length) {
            byte[] bArr2 = new byte[bArr.length + 32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f12467a = bArr2;
        }
        byte[] bArr3 = this.f12467a;
        int i11 = this.f12468b;
        this.f12468b = i11 + 1;
        bArr3[i11] = z9 ? (byte) 1 : (byte) 0;
    }

    public final void c(int i10) {
        int i11 = this.f12468b;
        int i12 = i11 + 1;
        byte[] bArr = this.f12467a;
        if (i12 > bArr.length) {
            byte[] bArr2 = new byte[i11 + 32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f12467a = bArr2;
        }
        this.f12467a[i11] = (byte) i10;
        this.f12468b++;
    }

    public final void d(byte[] bArr, int i10) {
        int i11 = this.f12468b + i10;
        byte[] bArr2 = this.f12467a;
        if (i11 > bArr2.length) {
            byte[] bArr3 = new byte[bArr2.length + i10 + 32];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.f12467a = bArr3;
        }
        System.arraycopy(bArr, 0, this.f12467a, this.f12468b, i10);
        this.f12468b += i10;
    }

    public final void e(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 1 && byteArray[0] == 0) {
            h(0);
            return;
        }
        int length = byteArray.length;
        h(length);
        d(byteArray, length);
    }

    public final void f(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(',');
            }
            stringBuffer.append(strArr[i10]);
        }
        g(stringBuffer.toString());
    }

    public final void g(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        h(bytes.length);
        d(bytes, bytes.length);
    }

    public final void h(int i10) {
        int i11 = this.f12468b;
        int i12 = i11 + 4;
        byte[] bArr = this.f12467a;
        if (i12 > bArr.length) {
            byte[] bArr2 = new byte[i11 + 32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f12467a = bArr2;
        }
        byte[] bArr3 = this.f12467a;
        bArr3[i11] = (byte) (i10 >> 24);
        bArr3[i11 + 1] = (byte) (i10 >> 16);
        bArr3[i11 + 2] = (byte) (i10 >> 8);
        bArr3[i11 + 3] = (byte) i10;
        this.f12468b += 4;
    }
}
