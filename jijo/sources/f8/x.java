package f8;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public enum x {
    UNKNOWN(-1, null),
    A(1, a.class),
    NS(2, m.class),
    MD(3, null),
    MF(4, null),
    CNAME(5, c.class),
    SOA(6, z.class),
    MB(7, null),
    MG(8, null),
    MR(9, null),
    NULL(10, null),
    WKS(11, null),
    PTR(12, t.class),
    HINFO(13, null),
    MINFO(14, null),
    MX(15, l.class),
    TXT(16, f0.class),
    RP(17, null),
    AFSDB(18, null),
    X25(19, null),
    ISDN(20, null),
    RT(21, null),
    NSAP(22, null),
    NSAP_PTR(23, null),
    SIG(24, null),
    KEY(25, null),
    PX(26, null),
    GPOS(27, null),
    AAAA(28, b.class),
    LOC(29, null),
    NXT(30, null),
    EID(31, null),
    NIMLOC(32, null),
    SRV(33, a0.class),
    ATMA(34, null),
    NAPTR(35, null),
    KX(36, null),
    CERT(37, null),
    A6(38, null),
    DNAME(39, e.class),
    SINK(40, null),
    OPT(41, s.class),
    APL(42, null),
    DS(43, g.class),
    SSHFP(44, null),
    IPSECKEY(45, null),
    RRSIG(46, u.class),
    NSEC(47, q.class),
    DNSKEY(48, f.class),
    DHCID(49, null),
    NSEC3(50, o.class),
    NSEC3PARAM(51, p.class),
    TLSA(52, e0.class),
    HIP(55, null),
    NINFO(56, null),
    RKEY(57, null),
    TALINK(58, null),
    CDS(59, null),
    CDNSKEY(60, null),
    OPENPGPKEY(61, r.class),
    CSYNC(62, null),
    SPF(99, null),
    UINFO(100, null),
    UID(101, null),
    GID(102, null),
    UNSPEC(103, null),
    NID(104, null),
    L32(105, null),
    L64(106, null),
    LP(107, null),
    EUI48(108, null),
    EUI64(109, null),
    TKEY(249, null),
    TSIG(250, null),
    IXFR(251, null),
    AXFR(252, null),
    MAILB(253, null),
    MAILA(254, null),
    ANY(255, null),
    URI(NotificationCompat.FLAG_LOCAL_ONLY, null),
    CAA(257, null),
    TA(32768, null),
    DLV(32769, d.class);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f13521b;
    public static final HashMap T0 = new HashMap();
    public static final HashMap U0 = new HashMap();

    static {
        for (x xVar : values()) {
            T0.put(Integer.valueOf(xVar.f13520a), xVar);
            Class cls = xVar.f13521b;
            if (cls != null) {
                U0.put(cls, xVar);
            }
        }
    }

    x(int i10, Class cls) {
        this.f13520a = i10;
        this.f13521b = cls;
    }

    public static x a(int i10) {
        x xVar = (x) T0.get(Integer.valueOf(i10));
        return xVar == null ? UNKNOWN : xVar;
    }
}
