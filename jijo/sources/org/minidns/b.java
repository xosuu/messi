package org.minidns;

import b8.c;
import b8.e;
import com.google.android.gms.internal.ads.ql1;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final CopyOnWriteArrayList f16130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final CopyOnWriteArraySet f16131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CopyOnWriteArraySet f16132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Set f16133o;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f16134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f16135k;

    static {
        InetAddress byName;
        InetAddress byName2;
        Logger logger = a.f16122h;
        f16130l = new CopyOnWriteArrayList();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        f16131m = copyOnWriteArraySet;
        f16132n = new CopyOnWriteArraySet();
        h(b8.b.f1480f);
        h(c.f1481f);
        h(e.f1482f);
        try {
            Pattern pattern = h8.a.f14155a;
            try {
                byName2 = InetAddress.getByName("8.8.8.8");
            } catch (UnknownHostException e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (IllegalArgumentException e11) {
            logger.log(Level.WARNING, "Could not add static IPv4 DNS Server", (Throwable) e11);
        }
        if (!(byName2 instanceof Inet4Address)) {
            throw new IllegalArgumentException();
        }
        copyOnWriteArraySet.add((Inet4Address) byName2);
        try {
            Pattern pattern2 = h8.a.f14155a;
            try {
                byName = InetAddress.getByName("[2001:4860:4860::8888]");
            } catch (UnknownHostException e12) {
                throw new IllegalArgumentException(e12);
            }
        } catch (IllegalArgumentException e13) {
            logger.log(Level.WARNING, "Could not add static IPv6 DNS Server", (Throwable) e13);
        }
        if (!(byName instanceof Inet6Address)) {
            throw new IllegalArgumentException();
        }
        f16132n.add((Inet6Address) byName);
        f16133o = Collections.newSetFromMap(new ConcurrentHashMap(4));
    }

    public b(ql1 ql1Var) {
        super(ql1Var);
        this.f16134j = Collections.newSetFromMap(new ConcurrentHashMap(4));
        this.f16135k = true;
    }

    public static void h(b8.a aVar) {
        if (!aVar.c()) {
            a.f16122h.fine("Not adding " + aVar.f1478a + " as it is not available.");
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = f16130l;
        synchronized (copyOnWriteArrayList) {
            ArrayList arrayList = new ArrayList(copyOnWriteArrayList.size() + 1);
            arrayList.addAll(copyOnWriteArrayList);
            arrayList.add(aVar);
            Collections.sort(arrayList);
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r0 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0.hasNext() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r10 = (java.lang.String) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r10 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (h8.a.f14156b.matcher(r10).matches() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r10 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r12 = h8.a.f14155a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (h8.a.f14155a.matcher(r10).matches() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r12 != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r8.warning("The DNS server lookup mechanism '" + ((b8.a) r9).f1478a + "' returned an invalid non-IP address result: '" + r10 + "'");
        r0.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (org.minidns.b.f16133o.contains(r10) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        r8.fine("The DNS server lookup mechanism '" + ((b8.a) r9).f1478a + "' returned a blacklisted result: '" + r10 + "'");
        r0.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (r5.isEmpty() != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e3  */
    @Override // org.minidns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y7.b f(x7.a r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.b.f(x7.a):y7.b");
    }
}
