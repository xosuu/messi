package e6;

import com.google.android.gms.internal.ads.i2;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.EdDSASecurityProvider;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i10) {
        super(str);
        this.f12722b = i10;
    }

    @Override // e6.p
    public final KeyPair a(i2 i2Var) throws InvalidKeySpecException, NoSuchAlgorithmException, IOException {
        KeySpec rSAPrivateKeySpec;
        switch (this.f12722b) {
            case 0:
                BigInteger bigIntegerE = i2Var.e();
                BigInteger bigIntegerE2 = i2Var.e();
                BigInteger bigIntegerE3 = i2Var.e();
                BigInteger bigIntegerE4 = i2Var.e();
                DSAPrivateKeySpec dSAPrivateKeySpec = new DSAPrivateKeySpec(i2Var.e(), bigIntegerE, bigIntegerE2, bigIntegerE3);
                DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(bigIntegerE4, bigIntegerE, bigIntegerE2, bigIntegerE3);
                KeyFactory keyFactory = KeyFactory.getInstance("DSA");
                return new KeyPair(keyFactory.generatePublic(dSAPublicKeySpec), keyFactory.generatePrivate(dSAPrivateKeySpec));
            case 1:
                EdDSANamedCurveSpec byName = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);
                byte[] bArrC = i2Var.c();
                byte[] bArrC2 = i2Var.c();
                EdDSAPublicKeySpec edDSAPublicKeySpec = new EdDSAPublicKeySpec(bArrC, byName);
                EdDSAPrivateKeySpec edDSAPrivateKeySpec = new EdDSAPrivateKeySpec(Arrays.copyOfRange(bArrC2, 0, 32), byName);
                KeyFactory keyFactory2 = KeyFactory.getInstance("EdDSA", new EdDSASecurityProvider());
                return new KeyPair(keyFactory2.generatePublic(edDSAPublicKeySpec), keyFactory2.generatePrivate(edDSAPrivateKeySpec));
            default:
                BigInteger bigIntegerE5 = i2Var.e();
                BigInteger bigIntegerE6 = i2Var.e();
                BigInteger bigIntegerE7 = i2Var.e();
                BigInteger bigIntegerE8 = i2Var.e();
                BigInteger bigIntegerE9 = i2Var.e();
                RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(bigIntegerE5, bigIntegerE6);
                if (bigIntegerE9 == null || bigIntegerE8 == null) {
                    rSAPrivateKeySpec = new RSAPrivateKeySpec(bigIntegerE5, bigIntegerE7);
                } else {
                    BigInteger bigIntegerModInverse = bigIntegerE8.modInverse(bigIntegerE9);
                    BigInteger bigInteger = BigInteger.ONE;
                    rSAPrivateKeySpec = new RSAPrivateCrtKeySpec(bigIntegerE5, bigIntegerE6, bigIntegerE7, bigIntegerE9, bigIntegerModInverse, bigIntegerE7.mod(bigIntegerE9.subtract(bigInteger)), bigIntegerE7.mod(bigIntegerModInverse.subtract(bigInteger)), bigIntegerE8);
                }
                KeyFactory keyFactory3 = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory3.generatePublic(rSAPublicKeySpec), keyFactory3.generatePrivate(rSAPrivateKeySpec));
        }
    }
}
