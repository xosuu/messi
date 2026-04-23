package v7;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    RSAMD5(1),
    /* JADX INFO: Fake field, exist only in values array */
    DH(2),
    DSA(3),
    RSASHA1(5),
    DSA_NSEC3_SHA1(6),
    RSASHA1_NSEC3_SHA1(7),
    RSASHA256(8),
    RSASHA512(10),
    ECC_GOST(12),
    ECDSAP256SHA256(13),
    ECDSAP384SHA384(14),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT(252),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATEDNS(253),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATEOID(254);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17904a;

    c(int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException();
        }
        byte b10 = (byte) i10;
        this.f17904a = b10;
        d.f17905a.put(Byte.valueOf(b10), this);
    }
}
