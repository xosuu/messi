package net.i2p.crypto.eddsa.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class FieldElement implements Serializable {
    private static final long serialVersionUID = 1239527465875676L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final Field f16001f;

    public FieldElement(Field field) {
        if (field == null) {
            throw new IllegalArgumentException("field cannot be null");
        }
        this.f16001f = field;
    }

    public abstract FieldElement add(FieldElement fieldElement);

    public FieldElement addOne() {
        return add(this.f16001f.ONE);
    }

    public abstract FieldElement cmov(FieldElement fieldElement, int i10);

    public FieldElement divide(FieldElement fieldElement) {
        return multiply(fieldElement.invert());
    }

    public abstract FieldElement invert();

    public boolean isNegative() {
        return this.f16001f.getEncoding().isNegative(this);
    }

    public abstract boolean isNonZero();

    public abstract FieldElement multiply(FieldElement fieldElement);

    public abstract FieldElement negate();

    public abstract FieldElement pow22523();

    public abstract FieldElement square();

    public abstract FieldElement squareAndDouble();

    public abstract FieldElement subtract(FieldElement fieldElement);

    public FieldElement subtractOne() {
        return subtract(this.f16001f.ONE);
    }

    public byte[] toByteArray() {
        return this.f16001f.getEncoding().encode(this);
    }
}
