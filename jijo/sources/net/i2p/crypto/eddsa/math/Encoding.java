package net.i2p.crypto.eddsa.math;

/* JADX INFO: loaded from: classes.dex */
public abstract class Encoding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Field f15998f;

    public abstract FieldElement decode(byte[] bArr);

    public abstract byte[] encode(FieldElement fieldElement);

    public abstract boolean isNegative(FieldElement fieldElement);

    public synchronized void setField(Field field) {
        if (this.f15998f != null) {
            throw new IllegalStateException("already set");
        }
        this.f15998f = field;
    }
}
