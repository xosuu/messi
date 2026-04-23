package a8;

import f8.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public abstract class e extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ECParameterSpec f56c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57d;

    public e(BigInteger[] bigIntegerArr, int i10, String str) {
        ECParameterSpec eCParameterSpec = new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigIntegerArr[0]), bigIntegerArr[1], bigIntegerArr[2]), new ECPoint(bigIntegerArr[3], bigIntegerArr[4]), bigIntegerArr[5], 1);
        super("EC", str);
        this.f57d = i10;
        this.f56c = eCParameterSpec;
    }

    @Override // a8.h
    public final PublicKey a(f8.f fVar) throws DnssecValidationFailedException.DnssecInvalidKeySpecException, DnssecValidationFailedException.DataMalformedException, CloneNotSupportedException {
        int i10 = this.f57d;
        DataInputStream dataInputStreamE = fVar.e();
        try {
            byte[] bArr = new byte[i10];
            dataInputStreamE.readFully(bArr);
            BigInteger bigInteger = new BigInteger(1, bArr);
            byte[] bArr2 = new byte[i10];
            dataInputStreamE.readFully(bArr2);
            try {
                return this.f60a.generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, new BigInteger(1, bArr2)), this.f56c));
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
        int i10 = this.f57d;
        byte[] bArr = uVar.f13473x;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            byte[] bArr2 = new byte[i10];
            dataInputStream.readFully(bArr2);
            int i11 = bArr2[0] < 0 ? i10 + 1 : i10;
            byte[] bArr3 = new byte[i10];
            dataInputStream.readFully(bArr3);
            int i12 = bArr3[0] < 0 ? i10 + 1 : i10;
            dataOutputStream.writeByte(48);
            dataOutputStream.writeByte(i11 + i12 + 4);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i11);
            if (i11 > i10) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr2);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i12);
            if (i12 > i10) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr3);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            bArr.clone();
            throw new DnssecValidationFailedException.DataMalformedException(e10);
        }
    }
}
