package f8;

/* JADX INFO: loaded from: classes.dex */
public enum n {
    /* JADX INFO: Fake field, exist only in values array */
    RESERVED(0),
    SHA1(1);

    n(int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException();
        }
        o.f13443w.put(Byte.valueOf((byte) i10), this);
    }
}
