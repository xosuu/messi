package net.i2p.crypto.eddsa.math.bigint;

import java.io.Serializable;
import java.math.BigInteger;
import net.i2p.crypto.eddsa.math.Encoding;
import net.i2p.crypto.eddsa.math.Field;
import net.i2p.crypto.eddsa.math.FieldElement;

/* JADX INFO: loaded from: classes.dex */
public class BigIntegerLittleEndianEncoding extends Encoding implements Serializable {
    private static final long serialVersionUID = 3984579843759837L;
    private BigInteger mask;

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public FieldElement decode(byte[] bArr) {
        Field field = this.f15998f;
        if (field == null) {
            throw new IllegalStateException("field not set");
        }
        if (bArr.length == field.getb() / 8) {
            return new BigIntegerFieldElement(this.f15998f, toBigInteger(bArr).and(this.mask));
        }
        throw new IllegalArgumentException("Not a valid encoding");
    }

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public byte[] encode(FieldElement fieldElement) {
        return encode(((BigIntegerFieldElement) fieldElement).bi.and(this.mask));
    }

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public boolean isNegative(FieldElement fieldElement) {
        return ((BigIntegerFieldElement) fieldElement).bi.testBit(0);
    }

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public synchronized void setField(Field field) {
        super.setField(field);
        BigInteger bigInteger = BigInteger.ONE;
        this.mask = bigInteger.shiftLeft(field.getb() - 1).subtract(bigInteger);
    }

    public BigInteger toBigInteger(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = bArr[(bArr.length - 1) - i10];
        }
        return new BigInteger(1, bArr2);
    }

    public byte[] encode(BigInteger bigInteger) {
        if (this.f15998f == null) {
            throw new IllegalStateException("field not set");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int bVar = this.f15998f.getb() / 8;
        byte[] bArr = new byte[bVar];
        for (int i10 = 0; i10 < byteArray.length; i10++) {
            bArr[i10] = byteArray[(byteArray.length - 1) - i10];
        }
        for (int length = byteArray.length; length < bVar; length++) {
            bArr[length] = 0;
        }
        return bArr;
    }
}
