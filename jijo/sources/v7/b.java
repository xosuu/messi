package v7;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    SHA1(1),
    SHA256(2),
    /* JADX INFO: Fake field, exist only in values array */
    GOST(3),
    /* JADX INFO: Fake field, exist only in values array */
    SHA384(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17892a;

    b(int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException();
        }
        byte b10 = (byte) i10;
        this.f17892a = b10;
        d.f17906b.put(Byte.valueOf(b10), this);
    }
}
