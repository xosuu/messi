package e6;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.SimpleDERReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class e extends CertificateDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f12727b;

    public e(String str, ECParameterSpec eCParameterSpec) {
        this.f12726a = str;
        this.f12727b = eCParameterSpec;
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final KeyPair createKeyPair(PEMStructure pEMStructure) throws IOException {
        SimpleDERReader simpleDERReader = new SimpleDERReader(pEMStructure.getData());
        byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
        if (simpleDERReader.available() != 0) {
            throw new IOException("Unexpected padding in EC private key");
        }
        SimpleDERReader simpleDERReader2 = new SimpleDERReader(sequenceAsByteArray);
        BigInteger bigInteger = simpleDERReader2.readInt();
        if (bigInteger.compareTo(BigInteger.ONE) != 0) {
            throw new IOException("Unexpected version number in EC private key: " + bigInteger);
        }
        byte[] octetString = simpleDERReader2.readOctetString();
        String oid = null;
        byte[] octetString2 = null;
        while (simpleDERReader2.available() > 0) {
            int constructedType = simpleDERReader2.readConstructedType();
            SimpleDERReader constructed = simpleDERReader2.readConstructed();
            if (constructedType == 0) {
                oid = constructed.readOid();
            } else if (constructedType == 1) {
                octetString2 = constructed.readOctetString();
            }
        }
        if (!this.f12726a.equals(oid)) {
            throw new IOException("Incorrect OID for current curve");
        }
        BigInteger bigInteger2 = new BigInteger(1, octetString);
        int length = octetString2.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(octetString2, 1, bArr, 0, length);
        ECParameterSpec eCParameterSpec = this.f12727b;
        ECPoint eCPointD = g.d(bArr, eCParameterSpec.getCurve());
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(bigInteger2, eCParameterSpec);
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPointD, eCParameterSpec);
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            return new KeyPair(keyFactory.generatePublic(eCPublicKeySpec), keyFactory.generatePrivate(eCPrivateKeySpec));
        } catch (GeneralSecurityException unused) {
            throw new IOException("Could not generate EC key pair");
        }
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final String getEndLine() {
        return "-----END EC PRIVATE KEY-----";
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final String getStartLine() {
        return "-----BEGIN EC PRIVATE KEY-----";
    }
}
