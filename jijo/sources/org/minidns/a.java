package org.minidns;

import com.google.android.gms.internal.ads.ql1;
import f8.m;
import f8.x;
import java.io.IOException;
import java.net.InetAddress;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jasypt.salt.RandomSaltGenerator;
import x7.c;
import x7.d;
import x7.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ql1 f16121g = new ql1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f16122h = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16123i = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecureRandom f16125b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ql1 f16127d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4.a f16124a = new x4.a(7, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Random f16126c = new Random();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g8.a f16128e = new g8.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16129f = f16123i;

    public a(ql1 ql1Var) {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance(RandomSaltGenerator.DEFAULT_SECURE_RANDOM_ALGORITHM);
        } catch (NoSuchAlgorithmException unused) {
            secureRandom = new SecureRandom();
        }
        this.f16125b = secureRandom;
        this.f16127d = ql1Var;
    }

    public final Set a(org.minidns.dnsname.a aVar, x xVar) {
        Set setB;
        Set<m> setB2 = b(aVar, x.NS);
        if (setB2.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(setB2.size() * 3);
        for (m mVar : setB2) {
            int iOrdinal = xVar.ordinal();
            if (iOrdinal == 1) {
                setB = b(mVar.f13475d, x.A);
            } else {
                if (iOrdinal != 28) {
                    throw new AssertionError();
                }
                setB = b(mVar.f13475d, x.AAAA);
            }
            hashSet.addAll(setB);
        }
        return hashSet;
    }

    public final Set b(org.minidns.dnsname.a aVar, x xVar) {
        ql1 ql1Var = this.f16127d;
        if (ql1Var == null) {
            return Collections.emptySet();
        }
        e eVar = new e(aVar, xVar);
        Logger logger = d.f18529w;
        x7.a aVar2 = new x7.a();
        aVar2.f18506b = x7.b.QUERY;
        aVar2.f18507c = c.NO_ERROR;
        aVar2.f18515k = -1L;
        ArrayList arrayList = new ArrayList(1);
        aVar2.f18516l = arrayList;
        arrayList.add(eVar);
        aVar2.f18505a = this.f16125b.nextInt() & 65535;
        x7.a aVarD = d(aVar2);
        aVarD.getClass();
        y7.a aVarA = ql1Var.a(new d(aVarD));
        return aVarA == null ? Collections.emptySet() : aVarA.f20468a.c(eVar);
    }

    public abstract boolean c(e eVar, y7.c cVar);

    public abstract x7.a d(x7.a aVar);

    public final y7.b e(InetAddress inetAddress, d dVar) throws IOException {
        ql1 ql1Var = this.f16127d;
        y7.a aVarA = ql1Var == null ? null : ql1Var.a(dVar);
        if (aVarA != null) {
            return aVarA;
        }
        e eVarD = dVar.d();
        Level level = Level.FINE;
        Logger logger = f16122h;
        logger.log(level, "Asking {0} on {1} for {2} with:\n{3}", new Object[]{inetAddress, 53, eVarD, dVar});
        try {
            y7.c cVarX = this.f16128e.X(dVar, inetAddress);
            logger.log(level, "Response from {0} on {1} for {2}:\n{3}", new Object[]{inetAddress, 53, eVarD, cVarX});
            x4.a aVar = this.f16124a;
            aVar.getClass();
            e eVarD2 = dVar.d();
            a aVar2 = (a) aVar.f18391b;
            if (aVar2.f16127d != null && aVar2.c(eVarD2, cVarX)) {
                ql1 ql1Var2 = ((a) aVar.f18391b).f16127d;
                if (dVar.f18550u == null) {
                    dVar.f18550u = new d(dVar);
                }
                d dVar2 = dVar.f18550u;
                ql1Var2.getClass();
                if (dVar2.f18550u == null) {
                    dVar2.f18550u = new d(dVar2);
                }
                d dVar3 = dVar2.f18550u;
                synchronized (ql1Var2) {
                    d dVar4 = cVarX.f20468a;
                    if (dVar4.f18546q > 0) {
                        ((LinkedHashMap) ql1Var2.f8220g).put(dVar3, new y7.a(dVar4));
                    }
                }
            }
            return cVarX;
        } catch (IOException e10) {
            f16122h.log(level, "IOException {0} on {1} while resolving {2}: {3}", new Object[]{inetAddress, 53, eVarD, e10});
            throw e10;
        }
    }

    public abstract y7.b f(x7.a aVar);

    public y7.b g(e eVar) {
        Logger logger = d.f18529w;
        x7.a aVar = new x7.a();
        aVar.f18506b = x7.b.QUERY;
        aVar.f18507c = c.NO_ERROR;
        aVar.f18515k = -1L;
        ArrayList arrayList = new ArrayList(1);
        aVar.f18516l = arrayList;
        arrayList.add(eVar);
        aVar.f18505a = this.f16125b.nextInt() & 65535;
        return f(d(aVar));
    }
}
