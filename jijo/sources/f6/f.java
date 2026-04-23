package f6;

import androidx.core.app.NotificationCompat;
import com.trilead.ssh2.compression.ICompressor;
import com.trilead.ssh2.crypto.cipher.CipherInputStream;
import com.trilead.ssh2.crypto.cipher.CipherOutputStream;
import com.trilead.ssh2.crypto.cipher.NullCipher;
import com.trilead.ssh2.crypto.digest.MAC;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c6.a f13151v = c6.a.a(f.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CipherInputStream f13154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CipherOutputStream f13155d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MAC f13157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f13158g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MAC f13160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f13161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f13162k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f13167p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SecureRandom f13172u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13152a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13153b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13156e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13159h = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ICompressor f13163l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ICompressor f13164m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13165n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13166o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f13168q = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f13169r = new byte[5];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f13170s = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f13171t = new byte[5];

    public f(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        this.f13154c = new CipherInputStream(new NullCipher(), inputStream);
        this.f13155d = new CipherOutputStream(new NullCipher(), outputStream);
        this.f13172u = secureRandom;
    }

    public final void a(byte[] bArr) throws IOException {
        int length = bArr.length;
        ICompressor iCompressor = this.f13164m;
        if (iCompressor != null && this.f13166o) {
            if (this.f13167p.length < bArr.length + 1024) {
                this.f13167p = new byte[bArr.length + 1024];
            }
            length = iCompressor.compress(bArr, 0, length, this.f13167p);
            bArr = this.f13167p;
        }
        int i10 = length + 5;
        int i11 = length + 9;
        int i12 = this.f13159h;
        int i13 = i11 % i12;
        if (i13 != 0) {
            i11 += i12 - i13;
        }
        if (i11 < 16) {
            i11 = 16;
        }
        int i14 = i11 - i10;
        boolean z9 = this.f13156e;
        byte[] bArr2 = this.f13168q;
        if (z9) {
            for (int i15 = 0; i15 < i14; i15 += 4) {
                int iNextInt = this.f13172u.nextInt();
                bArr2[i15] = (byte) iNextInt;
                bArr2[i15 + 1] = (byte) (iNextInt >> 8);
                bArr2[i15 + 2] = (byte) (iNextInt >> 16);
                bArr2[i15 + 3] = (byte) (iNextInt >> 24);
            }
        } else {
            for (int i16 = 0; i16 < i14; i16++) {
                bArr2[i16] = 0;
            }
        }
        int i17 = i11 - 4;
        byte[] bArr3 = this.f13169r;
        bArr3[0] = (byte) (i17 >> 24);
        bArr3[1] = (byte) (i17 >> 16);
        bArr3[2] = (byte) (i17 >> 8);
        bArr3[3] = (byte) i17;
        bArr3[4] = (byte) i14;
        CipherOutputStream cipherOutputStream = this.f13155d;
        cipherOutputStream.write(bArr3, 0, 5);
        cipherOutputStream.write(bArr, 0, length);
        cipherOutputStream.write(bArr2, 0, i14);
        MAC mac = this.f13157f;
        if (mac != null) {
            mac.initMac(this.f13152a);
            this.f13157f.update(bArr3, 0, 5);
            this.f13157f.update(bArr, 0, length);
            this.f13157f.update(bArr2, 0, i14);
            this.f13157f.getMac(this.f13158g, 0);
            byte[] bArr4 = this.f13158g;
            cipherOutputStream.writePlain(bArr4, 0, bArr4.length);
        }
        cipherOutputStream.flush();
        c6.a aVar = f13151v;
        aVar.getClass();
        aVar.b(90, "Sent " + d6.d.a(bArr[0] & 255) + " " + length + " bytes payload");
        this.f13152a = this.f13152a + 1;
    }
}
