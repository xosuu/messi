package net.i2p.crypto.eddsa.math.bigint;

import java.math.BigInteger;
import net.i2p.crypto.eddsa.math.Field;
import net.i2p.crypto.eddsa.math.ScalarOps;

/* JADX INFO: loaded from: classes.dex */
public class BigIntegerScalarOps implements ScalarOps {
    private final BigIntegerLittleEndianEncoding enc;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final BigInteger f16002l;

    public BigIntegerScalarOps(Field field, BigInteger bigInteger) {
        this.f16002l = bigInteger;
        BigIntegerLittleEndianEncoding bigIntegerLittleEndianEncoding = new BigIntegerLittleEndianEncoding();
        this.enc = bigIntegerLittleEndianEncoding;
        bigIntegerLittleEndianEncoding.setField(field);
    }

    @Override // net.i2p.crypto.eddsa.math.ScalarOps
    public byte[] multiplyAndAdd(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        BigIntegerLittleEndianEncoding bigIntegerLittleEndianEncoding = this.enc;
        return bigIntegerLittleEndianEncoding.encode(bigIntegerLittleEndianEncoding.toBigInteger(bArr).multiply(this.enc.toBigInteger(bArr2)).add(this.enc.toBigInteger(bArr3)).mod(this.f16002l));
    }

    @Override // net.i2p.crypto.eddsa.math.ScalarOps
    public byte[] reduce(byte[] bArr) {
        BigIntegerLittleEndianEncoding bigIntegerLittleEndianEncoding = this.enc;
        return bigIntegerLittleEndianEncoding.encode(bigIntegerLittleEndianEncoding.toBigInteger(bArr).mod(this.f16002l));
    }
}
