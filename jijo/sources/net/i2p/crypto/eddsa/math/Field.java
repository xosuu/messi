package net.i2p.crypto.eddsa.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Field implements Serializable {
    private static final long serialVersionUID = 8746587465875676L;
    public final FieldElement EIGHT;
    public final FieldElement FIVE;
    public final FieldElement FOUR;
    public final FieldElement ONE;
    public final FieldElement TWO;
    public final FieldElement ZERO;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15999b;
    private final Encoding enc;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final FieldElement f16000q;
    private final FieldElement qm2;
    private final FieldElement qm5d8;

    public Field(int i10, byte[] bArr, Encoding encoding) {
        this.f15999b = i10;
        this.enc = encoding;
        encoding.setField(this);
        FieldElement fieldElementFromByteArray = fromByteArray(bArr);
        this.f16000q = fieldElementFromByteArray;
        this.ZERO = fromByteArray(Constants.ZERO);
        this.ONE = fromByteArray(Constants.ONE);
        FieldElement fieldElementFromByteArray2 = fromByteArray(Constants.TWO);
        this.TWO = fieldElementFromByteArray2;
        this.FOUR = fromByteArray(Constants.FOUR);
        FieldElement fieldElementFromByteArray3 = fromByteArray(Constants.FIVE);
        this.FIVE = fieldElementFromByteArray3;
        FieldElement fieldElementFromByteArray4 = fromByteArray(Constants.EIGHT);
        this.EIGHT = fieldElementFromByteArray4;
        this.qm2 = fieldElementFromByteArray.subtract(fieldElementFromByteArray2);
        this.qm5d8 = fieldElementFromByteArray.subtract(fieldElementFromByteArray3).divide(fieldElementFromByteArray4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Field)) {
            return false;
        }
        Field field = (Field) obj;
        return this.f15999b == field.f15999b && this.f16000q.equals(field.f16000q);
    }

    public FieldElement fromByteArray(byte[] bArr) {
        return this.enc.decode(bArr);
    }

    public Encoding getEncoding() {
        return this.enc;
    }

    public FieldElement getQ() {
        return this.f16000q;
    }

    public FieldElement getQm2() {
        return this.qm2;
    }

    public FieldElement getQm5d8() {
        return this.qm5d8;
    }

    public int getb() {
        return this.f15999b;
    }

    public int hashCode() {
        return this.f16000q.hashCode();
    }
}
