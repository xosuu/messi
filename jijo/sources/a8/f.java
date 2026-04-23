package a8;

import f8.u;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import org.minidns.dnssec.DnssecValidationFailedException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ECParameterSpec f58c = new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97", 16)), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94", 16), new BigInteger("A6", 16)), new ECPoint(BigInteger.ONE, new BigInteger("8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14", 16)), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893", 16), 1);

    @Override // a8.h
    public final PublicKey a(f8.f fVar) throws DnssecValidationFailedException.DnssecInvalidKeySpecException, DnssecValidationFailedException.DataMalformedException, CloneNotSupportedException {
        DataInputStream dataInputStreamE = fVar.e();
        try {
            byte[] bArr = new byte[32];
            dataInputStreamE.readFully(bArr);
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = 31 - i10;
                byte b10 = bArr[i10];
                bArr[i10] = bArr[i11];
                bArr[i11] = b10;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            byte[] bArr2 = new byte[32];
            dataInputStreamE.readFully(bArr2);
            for (int i12 = 0; i12 < 16; i12++) {
                int i13 = 31 - i12;
                byte b11 = bArr2[i12];
                bArr2[i12] = bArr2[i13];
                bArr2[i13] = b11;
            }
            try {
                return this.f60a.generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, new BigInteger(1, bArr2)), f58c));
            } catch (InvalidKeySpecException e10) {
                throw new DnssecValidationFailedException.DnssecInvalidKeySpecException(e10);
            }
        } catch (IOException e11) {
            fVar.f13419q.clone();
            throw new DnssecValidationFailedException.DataMalformedException(e11);
        }
    }

    @Override // a8.h
    public final byte[] b(u uVar) {
        return (byte[]) uVar.f13473x.clone();
    }
}
