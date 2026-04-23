package e6;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.SimpleDERReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CertificateDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12723a;

    public /* synthetic */ b(int i10) {
        this.f12723a = i10;
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final KeyPair createKeyPair(PEMStructure pEMStructure) throws IOException {
        switch (this.f12723a) {
            case 0:
                SimpleDERReader simpleDERReader = new SimpleDERReader(pEMStructure.getData());
                byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
                if (simpleDERReader.available() != 0) {
                    throw new IOException("Padding in DSA PRIVATE KEY DER stream.");
                }
                simpleDERReader.resetInput(sequenceAsByteArray);
                BigInteger bigInteger = simpleDERReader.readInt();
                if (bigInteger.compareTo(BigInteger.ZERO) != 0) {
                    throw new IOException("Wrong version (" + bigInteger + ") in DSA PRIVATE KEY DER stream.");
                }
                BigInteger bigInteger2 = simpleDERReader.readInt();
                BigInteger bigInteger3 = simpleDERReader.readInt();
                BigInteger bigInteger4 = simpleDERReader.readInt();
                BigInteger bigInteger5 = simpleDERReader.readInt();
                BigInteger bigInteger6 = simpleDERReader.readInt();
                if (simpleDERReader.available() != 0) {
                    throw new IOException("Padding in DSA PRIVATE KEY DER stream.");
                }
                try {
                    DSAPrivateKeySpec dSAPrivateKeySpec = new DSAPrivateKeySpec(bigInteger6, bigInteger2, bigInteger3, bigInteger4);
                    DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(bigInteger5, bigInteger2, bigInteger3, bigInteger4);
                    KeyFactory keyFactory = KeyFactory.getInstance("DSA");
                    return new KeyPair(keyFactory.generatePublic(dSAPublicKeySpec), keyFactory.generatePrivate(dSAPrivateKeySpec));
                } catch (GeneralSecurityException unused) {
                    throw new IOException("Could not decode DSA key pair");
                }
            default:
                SimpleDERReader simpleDERReader2 = new SimpleDERReader(pEMStructure.getData());
                byte[] sequenceAsByteArray2 = simpleDERReader2.readSequenceAsByteArray();
                if (simpleDERReader2.available() != 0) {
                    throw new IOException("Padding in RSA PRIVATE KEY DER stream.");
                }
                simpleDERReader2.resetInput(sequenceAsByteArray2);
                BigInteger bigInteger7 = simpleDERReader2.readInt();
                if (bigInteger7.compareTo(BigInteger.ZERO) != 0 && bigInteger7.compareTo(BigInteger.ONE) != 0) {
                    throw new IOException("Wrong version (" + bigInteger7 + ") in RSA PRIVATE KEY DER stream.");
                }
                BigInteger bigInteger8 = simpleDERReader2.readInt();
                BigInteger bigInteger9 = simpleDERReader2.readInt();
                try {
                    RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigInteger8, bigInteger9, simpleDERReader2.readInt(), simpleDERReader2.readInt(), simpleDERReader2.readInt(), simpleDERReader2.readInt(), simpleDERReader2.readInt(), simpleDERReader2.readInt());
                    RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(bigInteger8, bigInteger9);
                    KeyFactory keyFactory2 = KeyFactory.getInstance("RSA");
                    return new KeyPair(keyFactory2.generatePublic(rSAPublicKeySpec), keyFactory2.generatePrivate(rSAPrivateCrtKeySpec));
                } catch (GeneralSecurityException unused2) {
                    throw new IOException("Could not decode RSA Key Pair");
                }
        }
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final String getEndLine() {
        switch (this.f12723a) {
            case 0:
                return "-----END DSA PRIVATE KEY-----";
            default:
                return "-----END RSA PRIVATE KEY-----";
        }
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final String getStartLine() {
        switch (this.f12723a) {
            case 0:
                return "-----BEGIN DSA PRIVATE KEY-----";
            default:
                return "-----BEGIN RSA PRIVATE KEY-----";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj) {
        this(1);
        this.f12723a = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b() {
        this(0);
        this.f12723a = 0;
    }
}
