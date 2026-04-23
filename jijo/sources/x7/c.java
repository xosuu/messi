package x7;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    FORMAT_ERR(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_FAIL(2),
    /* JADX INFO: Fake field, exist only in values array */
    NX_DOMAIN(3),
    /* JADX INFO: Fake field, exist only in values array */
    NO_IMP(4),
    /* JADX INFO: Fake field, exist only in values array */
    REFUSED(5),
    /* JADX INFO: Fake field, exist only in values array */
    YXDOMAIN(6),
    /* JADX INFO: Fake field, exist only in values array */
    YXRRSET(7),
    /* JADX INFO: Fake field, exist only in values array */
    NXRRSET(8),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_AUTH(9),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ZONE(10),
    /* JADX INFO: Fake field, exist only in values array */
    BADVERS_BADSIG(16),
    /* JADX INFO: Fake field, exist only in values array */
    BADKEY(17),
    /* JADX INFO: Fake field, exist only in values array */
    BADTIME(18),
    /* JADX INFO: Fake field, exist only in values array */
    BADMODE(19),
    /* JADX INFO: Fake field, exist only in values array */
    BADNAME(20),
    /* JADX INFO: Fake field, exist only in values array */
    BADALG(21),
    /* JADX INFO: Fake field, exist only in values array */
    BADTRUNC(22),
    /* JADX INFO: Fake field, exist only in values array */
    BADCOOKIE(23);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f18526d = new HashMap(values().length);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f18528a;

    static {
        for (c cVar : values()) {
            f18526d.put(Integer.valueOf(cVar.f18528a), cVar);
        }
    }

    c(int i10) {
        this.f18528a = (byte) i10;
    }
}
