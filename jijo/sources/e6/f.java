package e6;

import com.google.android.gms.internal.ads.i2;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ECParameterSpec f12729c;

    public f(String str, String str2, ECParameterSpec eCParameterSpec) {
        super(str);
        this.f12728b = str2;
        this.f12729c = eCParameterSpec;
    }

    @Override // e6.p
    public final KeyPair a(i2 i2Var) throws NoSuchAlgorithmException, IOException {
        String strG = i2Var.g();
        if (!strG.equals(this.f12728b)) {
            throw new IOException("Incorrect curve name: ".concat(strG));
        }
        byte[] bArrC = i2Var.c();
        BigInteger bigIntegerE = i2Var.e();
        ECParameterSpec eCParameterSpec = this.f12729c;
        ECPoint eCPointD = g.d(bArrC, eCParameterSpec.getCurve());
        if (eCPointD == null) {
            throw new IOException("Invalid ECDSA group");
        }
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPointD, eCParameterSpec);
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(bigIntegerE, eCParameterSpec);
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        return new KeyPair(keyFactory.generatePublic(eCPublicKeySpec), keyFactory.generatePrivate(eCPrivateKeySpec));
    }
}
