package b6;

import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c6.a f1384b = c6.a.a(i.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f1385a;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a aVar = this.f1385a;
            aVar.f1343b.u(aVar);
            a aVar2 = this.f1385a;
            d dVar = aVar2.f1344c;
            b bVar = (b) aVar2.f1345d.f14297a;
            byte[] bArr = new byte[6];
            bVar.getClass();
            if (bVar.read(bArr, 0, 6) != 6) {
                throw new IOException("Unexpected EOF on X11 startup!");
            }
            byte b10 = bArr[0];
            if (b10 != 66 && b10 != 108) {
                throw new IOException("Unknown endian format in X11 message!");
            }
            int i10 = b10 == 66 ? 0 : 1;
            byte[] bArr2 = new byte[6];
            if (bVar.read(bArr2, 0, 6) != 6) {
                throw new IOException("Unexpected EOF on X11 startup!");
            }
            int i11 = ((bArr2[i10] & 255) << 8) | (bArr2[1 - i10] & 255);
            int i12 = (bArr2[3 - i10] & 255) | ((bArr2[i10 + 2] & 255) << 8);
            if (i11 > 256 || i12 > 256) {
                throw new IOException("Buggy X11 authorization data");
            }
            int i13 = (4 - (i11 % 4)) % 4;
            int i14 = (4 - (i12 % 4)) % 4;
            byte[] bArr3 = new byte[i11];
            byte[] bArr4 = new byte[i12];
            byte[] bArr5 = new byte[4];
            if (bVar.read(bArr3, 0, i11) != i11) {
                throw new IOException("Unexpected EOF on X11 startup! (authProtocolName)");
            }
            if (bVar.read(bArr5, 0, i13) != i13) {
                throw new IOException("Unexpected EOF on X11 startup! (authProtocolNamePadding)");
            }
            if (bVar.read(bArr4, 0, i12) != i12) {
                throw new IOException("Unexpected EOF on X11 startup! (authProtocolData)");
            }
            if (bVar.read(bArr5, 0, i14) != i14) {
                throw new IOException("Unexpected EOF on X11 startup! (authProtocolDataPadding)");
            }
            if (!"MIT-MAGIC-COOKIE-1".equals(new String(bArr3, "ISO-8859-1"))) {
                throw new IOException("Unknown X11 authorization protocol!");
            }
            if (i12 != 16) {
                throw new IOException("Wrong data length for X11 authorization data!");
            }
            StringBuffer stringBuffer = new StringBuffer(32);
            for (int i15 = 0; i15 < i12; i15++) {
                String hexString = Integer.toHexString(bArr4[i15] & 255);
                if (hexString.length() != 2) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            String string = stringBuffer.toString();
            synchronized (this.f1385a) {
                this.f1385a.getClass();
            }
            this.f1385a.f1343b.d(string);
            throw new IOException("Invalid X11 cookie received.");
        } catch (IOException e10) {
            f1384b.f1578a.log(Level.FINER, "IOException in X11 proxy code", (Throwable) e10);
            try {
                a aVar3 = this.f1385a;
                aVar3.f1343b.e(aVar3, "IOException in X11 proxy code (" + e10.getMessage() + ")");
            } catch (IOException unused) {
            }
        }
    }
}
