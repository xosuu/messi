package a8;

import f8.n;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.dnssec.DnssecValidatorInitializationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f50a = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f51b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f52c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f53d;

    public a() {
        HashMap map = new HashMap();
        this.f51b = map;
        HashMap map2 = new HashMap();
        this.f52c = map2;
        HashMap map3 = new HashMap();
        this.f53d = map3;
        try {
            map.put(v7.b.SHA1, new g("SHA-1"));
            map3.put(n.SHA1, new g("SHA-1"));
            try {
                map.put(v7.b.SHA256, new g("SHA-256"));
                try {
                    map2.put(v7.c.RSAMD5, new i("MD5withRSA"));
                } catch (NoSuchAlgorithmException e10) {
                    this.f50a.log(Level.FINER, "Platform does not support RSA/MD5", (Throwable) e10);
                }
                try {
                    b bVar = new b("DSA", "SHA1withDSA");
                    this.f52c.put(v7.c.DSA, bVar);
                    this.f52c.put(v7.c.DSA_NSEC3_SHA1, bVar);
                } catch (NoSuchAlgorithmException e11) {
                    this.f50a.log(Level.FINE, "Platform does not support DSA/SHA-1", (Throwable) e11);
                }
                try {
                    i iVar = new i("SHA1withRSA");
                    this.f52c.put(v7.c.RSASHA1, iVar);
                    this.f52c.put(v7.c.RSASHA1_NSEC3_SHA1, iVar);
                    try {
                        this.f52c.put(v7.c.RSASHA256, new i("SHA256withRSA"));
                    } catch (NoSuchAlgorithmException e12) {
                        this.f50a.log(Level.INFO, "Platform does not support RSA/SHA-256", (Throwable) e12);
                    }
                    try {
                        this.f52c.put(v7.c.RSASHA512, new i("SHA512withRSA"));
                    } catch (NoSuchAlgorithmException e13) {
                        this.f50a.log(Level.INFO, "Platform does not support RSA/SHA-512", (Throwable) e13);
                    }
                    try {
                        this.f52c.put(v7.c.ECC_GOST, new f("ECGOST3410", "GOST3411withECGOST3410"));
                    } catch (NoSuchAlgorithmException e14) {
                        this.f50a.log(Level.FINE, "Platform does not support GOST R 34.10-2001", (Throwable) e14);
                    }
                    try {
                        this.f52c.put(v7.c.ECDSAP256SHA256, new c(c.f54e, 32, "SHA256withECDSA"));
                    } catch (NoSuchAlgorithmException e15) {
                        this.f50a.log(Level.INFO, "Platform does not support ECDSA/SHA-256", (Throwable) e15);
                    }
                    try {
                        this.f52c.put(v7.c.ECDSAP384SHA384, new d(d.f55e, 48, "SHA384withECDSA"));
                    } catch (NoSuchAlgorithmException e16) {
                        this.f50a.log(Level.INFO, "Platform does not support ECDSA/SHA-384", (Throwable) e16);
                    }
                } catch (NoSuchAlgorithmException e17) {
                    throw new DnssecValidatorInitializationException("Platform does not support RSA/SHA-1", e17);
                }
            } catch (NoSuchAlgorithmException e18) {
                throw new DnssecValidatorInitializationException("SHA-256 is mandatory", e18);
            }
        } catch (NoSuchAlgorithmException e19) {
            throw new DnssecValidatorInitializationException("SHA-1 is mandatory", e19);
        }
    }
}
