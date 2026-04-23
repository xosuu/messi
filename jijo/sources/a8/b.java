package a8;

import f8.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import org.minidns.dnssec.DnssecValidationFailedException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {
    @Override // a8.h
    public final PublicKey a(f8.f fVar) throws DnssecValidationFailedException.DnssecInvalidKeySpecException, DnssecValidationFailedException.DataMalformedException, CloneNotSupportedException {
        DataInputStream dataInputStreamE = fVar.e();
        try {
            int unsignedByte = dataInputStreamE.readUnsignedByte();
            byte[] bArr = new byte[20];
            dataInputStreamE.readFully(bArr);
            BigInteger bigInteger = new BigInteger(1, bArr);
            int i10 = (unsignedByte * 8) + 64;
            byte[] bArr2 = new byte[i10];
            dataInputStreamE.readFully(bArr2);
            BigInteger bigInteger2 = new BigInteger(1, bArr2);
            byte[] bArr3 = new byte[i10];
            dataInputStreamE.readFully(bArr3);
            BigInteger bigInteger3 = new BigInteger(1, bArr3);
            byte[] bArr4 = new byte[i10];
            dataInputStreamE.readFully(bArr4);
            try {
                return this.f60a.generatePublic(new DSAPublicKeySpec(new BigInteger(1, bArr4), bigInteger2, bigInteger, bigInteger3));
            } catch (InvalidKeySpecException e10) {
                throw new DnssecValidationFailedException.DnssecInvalidKeySpecException(e10);
            }
        } catch (IOException e11) {
            fVar.f13419q.clone();
            throw new DnssecValidationFailedException.DataMalformedException(e11);
        }
    }

    @Override // a8.h
    public final byte[] b(u uVar) throws DnssecValidationFailedException.DataMalformedException, CloneNotSupportedException {
        int i10;
        int i11;
        int i12;
        byte[] bArr = uVar.f13473x;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            dataInputStream.readByte();
            byte[] bArr2 = new byte[20];
            dataInputStream.readFully(bArr2);
            byte b10 = bArr2[0];
            int i13 = 21;
            if (b10 == 0) {
                i10 = 0;
                while (i10 < 20 && bArr2[i10] == 0) {
                    i10++;
                }
                i11 = 20 - i10;
            } else if (b10 < 0) {
                i10 = 0;
                i11 = 21;
            } else {
                i10 = 0;
                i11 = 20;
            }
            byte[] bArr3 = new byte[20];
            dataInputStream.readFully(bArr3);
            byte b11 = bArr3[0];
            if (b11 == 0) {
                i12 = 0;
                while (i12 < 20 && bArr3[i12] == 0) {
                    i12++;
                }
                i13 = 20 - i12;
            } else if (b11 < 0) {
                i12 = 0;
            } else {
                i12 = 0;
                i13 = 20;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(48);
            dataOutputStream.writeByte(i11 + i13 + 4);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i11);
            if (i11 > 20) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr2, i10, 20 - i10);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i13);
            if (i13 > 20) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr3, i12, 20 - i12);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            bArr.clone();
            throw new DnssecValidationFailedException.DataMalformedException(e10);
        }
    }
}
