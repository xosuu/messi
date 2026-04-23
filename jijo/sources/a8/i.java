package a8;

import f8.u;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import org.minidns.dnssec.DnssecValidationFailedException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {
    public i(String str) {
        super("RSA", str);
    }

    @Override // a8.h
    public final PublicKey a(f8.f fVar) throws DnssecValidationFailedException.DnssecInvalidKeySpecException, DnssecValidationFailedException.DataMalformedException, CloneNotSupportedException {
        int i10;
        byte[] bArr = fVar.f13419q;
        DataInputStream dataInputStreamE = fVar.e();
        try {
            int unsignedByte = dataInputStreamE.readUnsignedByte();
            if (unsignedByte == 0) {
                unsignedByte = dataInputStreamE.readUnsignedShort();
                i10 = 3;
            } else {
                i10 = 1;
            }
            byte[] bArr2 = new byte[unsignedByte];
            dataInputStreamE.readFully(bArr2);
            int i11 = i10 + unsignedByte;
            BigInteger bigInteger = new BigInteger(1, bArr2);
            byte[] bArr3 = new byte[bArr.length - i11];
            dataInputStreamE.readFully(bArr3);
            try {
                return this.f60a.generatePublic(new RSAPublicKeySpec(new BigInteger(1, bArr3), bigInteger));
            } catch (InvalidKeySpecException e10) {
                throw new DnssecValidationFailedException.DnssecInvalidKeySpecException(e10);
            }
        } catch (IOException e11) {
            bArr.clone();
            throw new DnssecValidationFailedException.DataMalformedException(e11);
        }
    }

    @Override // a8.h
    public final byte[] b(u uVar) {
        return (byte[]) uVar.f13473x.clone();
    }
}
