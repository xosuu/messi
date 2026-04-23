package e6;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.i2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ECParameterSpec f12731e;

    public g(String str, String str2, ECParameterSpec eCParameterSpec) {
        super(str, "ecdsa-sha2-".concat(str2), null);
        this.f12730d = str2;
        this.f12731e = eCParameterSpec;
    }

    public static ECPoint d(byte[] bArr, EllipticCurve ellipticCurve) {
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) / 8;
        if (bArr.length != (fieldSize * 2) + 1 || bArr[0] != 4 || bArr.length == 0) {
            return null;
        }
        byte[] bArr2 = new byte[fieldSize];
        System.arraycopy(bArr, 1, bArr2, 0, fieldSize);
        byte[] bArr3 = new byte[fieldSize];
        System.arraycopy(bArr, fieldSize + 1, bArr3, 0, fieldSize);
        return new ECPoint(new BigInteger(1, bArr2), new BigInteger(1, bArr3));
    }

    public static void f(int i10, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        if (i10 <= 127) {
            byteArrayOutputStream.write(i10);
            return;
        }
        int i11 = 0;
        int i12 = i10;
        while (i12 != 0) {
            i12 >>>= 8;
            i11++;
        }
        byteArrayOutputStream.write(i11 | NotificationCompat.FLAG_HIGH_PRIORITY);
        for (int i13 = (i11 - 1) * 8; i13 >= 0; i13 -= 8) {
            byteArrayOutputStream.write((byte) (i10 >> i13));
        }
    }

    @Override // e6.h
    public final byte[] b(byte[] bArr) throws IOException {
        i2 i2Var = new i2(bArr, 1);
        String strG = i2Var.g();
        if (!strG.equals(this.f12733b)) {
            throw new IOException("Unsupported signature format: ".concat(strG));
        }
        byte[] bArrC = i2Var.c();
        if (i2Var.j() != 0) {
            throw new IOException("Unexpected padding in ECDSA signature");
        }
        i2 i2Var2 = new i2(bArrC, 1);
        byte[] byteArray = i2Var2.e().toByteArray();
        byte[] byteArray2 = i2Var2.e().toByteArray();
        int length = byteArray.length;
        int length2 = byteArray2.length;
        if ((byteArray[0] & 128) != 0) {
            length++;
        }
        if ((byteArray2[0] & 128) != 0) {
            length2++;
        }
        int i10 = length + 6 + length2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        byteArrayOutputStream.write(48);
        f(i10 - 2, byteArrayOutputStream);
        byteArrayOutputStream.write(2);
        f(length, byteArrayOutputStream);
        if (length != byteArray.length) {
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(byteArray);
        byteArrayOutputStream.write(2);
        f(length2, byteArrayOutputStream);
        if (length2 != byteArray2.length) {
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(byteArray2);
        return byteArrayOutputStream.toByteArray();
    }

    public final ECPublicKey e(byte[] bArr) throws IOException {
        i2 i2Var = new i2(bArr, 1);
        if (!i2Var.g().equals(this.f12733b)) {
            throw new IOException("Invalid key format");
        }
        i2Var.g();
        byte[] bArrC = i2Var.c();
        if (i2Var.j() != 0) {
            throw new IOException("Unexpected adding in ECDSA public key");
        }
        ECParameterSpec eCParameterSpec = this.f12731e;
        ECPoint eCPointD = d(bArrC, eCParameterSpec.getCurve());
        if (eCPointD == null) {
            throw new IOException("Invalid ECDSA group");
        }
        try {
            return (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPointD, eCParameterSpec));
        } catch (GeneralSecurityException e10) {
            throw new IOException("Could not decode ECDSA key", e10);
        }
    }
}
