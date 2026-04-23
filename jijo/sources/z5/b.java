package z5;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.gp0;
import f7.e0;
import f7.n;
import f7.q;
import f7.y;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f20719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f20720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f20721i;

    public b(int i10) {
        this.f20713a = i10;
        if (i10 != 1) {
            this.f20718f = 0;
            return;
        }
        this.f20715c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f20716d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f20718f = -1;
        ArrayList arrayList = new ArrayList();
        this.f20720h = arrayList;
        arrayList.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public final q a() {
        if (((String) this.f20714b) == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (((String) this.f20717e) != null) {
            return new q(this);
        }
        throw new IllegalStateException("host == null");
    }

    public final void b(e0 e0Var, IOException iOException) {
        if (e0Var.f13252b.type() != Proxy.Type.DIRECT) {
            Object obj = this.f20714b;
            if (((f7.a) obj).f13201g != null) {
                ((f7.a) obj).f13201g.connectFailed(((f7.a) obj).f13195a.l(), e0Var.f13252b.address(), iOException);
            }
        }
        f5.b bVar = (f5.b) this.f20715c;
        synchronized (bVar) {
            ((Set) bVar.f13091b).add(e0Var);
        }
    }

    public final gp0 c() throws SocketException, UnknownHostException {
        String hostName;
        int port;
        boolean zContains;
        if (this.f20718f >= ((List) this.f20719g).size() && ((List) this.f20721i).isEmpty()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f20718f < ((List) this.f20719g).size()) {
            if (!(this.f20718f < ((List) this.f20719g).size())) {
                throw new SocketException("No route to " + ((f7.a) this.f20714b).f13195a.f13327d + "; exhausted proxy configurations: " + ((List) this.f20719g));
            }
            List list = (List) this.f20719g;
            int i10 = this.f20718f;
            this.f20718f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            this.f20720h = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                q qVar = ((f7.a) this.f20714b).f13195a;
                hostName = qVar.f13327d;
                port = qVar.f13328e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                port = inetSocketAddress.getPort();
            }
            if (port < 1 || port > 65535) {
                throw new SocketException("No route to " + hostName + ":" + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                ((List) this.f20720h).add(InetSocketAddress.createUnresolved(hostName, port));
            } else {
                ((n) this.f20717e).getClass();
                ((d5.e) ((f7.a) this.f20714b).f13196b).getClass();
                if (hostName == null) {
                    throw new UnknownHostException("hostname == null");
                }
                try {
                    List listAsList = Arrays.asList(InetAddress.getAllByName(hostName));
                    if (listAsList.isEmpty()) {
                        throw new UnknownHostException(((f7.a) this.f20714b).f13196b + " returned no addresses for " + hostName);
                    }
                    ((n) this.f20717e).getClass();
                    int size = listAsList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((List) this.f20720h).add(new InetSocketAddress((InetAddress) listAsList.get(i11), port));
                    }
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
            int size2 = ((List) this.f20720h).size();
            for (int i12 = 0; i12 < size2; i12++) {
                e0 e0Var = new e0((f7.a) this.f20714b, proxy, (InetSocketAddress) ((List) this.f20720h).get(i12));
                f5.b bVar = (f5.b) this.f20715c;
                synchronized (bVar) {
                    zContains = ((Set) bVar.f13091b).contains(e0Var);
                }
                if (zContains) {
                    ((List) this.f20721i).add(e0Var);
                } else {
                    arrayList.add(e0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll((List) this.f20721i);
            ((List) this.f20721i).clear();
        }
        return new gp0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x037e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(f7.q r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.b.d(f7.q, java.lang.String):int");
    }

    public final String toString() {
        switch (this.f20713a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f20714b);
                sb.append("://");
                if (!((String) this.f20715c).isEmpty() || !((String) this.f20716d).isEmpty()) {
                    sb.append((String) this.f20715c);
                    if (!((String) this.f20716d).isEmpty()) {
                        sb.append(':');
                        sb.append((String) this.f20716d);
                    }
                    sb.append('@');
                }
                if (((String) this.f20717e).indexOf(58) != -1) {
                    sb.append('[');
                    sb.append((String) this.f20717e);
                    sb.append(']');
                } else {
                    sb.append((String) this.f20717e);
                }
                int iB = this.f20718f;
                if (iB == -1) {
                    iB = q.b((String) this.f20714b);
                }
                if (iB != q.b((String) this.f20714b)) {
                    sb.append(':');
                    sb.append(iB);
                }
                List list = (List) this.f20720h;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append('/');
                    sb.append((String) list.get(i10));
                }
                if (((List) this.f20721i) != null) {
                    sb.append('?');
                    List list2 = (List) this.f20721i;
                    int size2 = list2.size();
                    for (int i11 = 0; i11 < size2; i11 += 2) {
                        String str = (String) list2.get(i11);
                        String str2 = (String) list2.get(i11 + 1);
                        if (i11 > 0) {
                            sb.append('&');
                        }
                        sb.append(str);
                        if (str2 != null) {
                            sb.append('=');
                            sb.append(str2);
                        }
                    }
                }
                if (((String) this.f20719g) != null) {
                    sb.append('#');
                    sb.append((String) this.f20719g);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public b(f7.a aVar, f5.b bVar, y yVar, n nVar) {
        this.f20713a = 2;
        this.f20719g = Collections.emptyList();
        this.f20720h = Collections.emptyList();
        this.f20721i = new ArrayList();
        this.f20714b = aVar;
        this.f20715c = bVar;
        this.f20716d = yVar;
        this.f20717e = nVar;
        Proxy proxy = aVar.f13202h;
        if (proxy != null) {
            this.f20719g = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = aVar.f13201g.select(aVar.f13195a.l());
            this.f20719g = (listSelect == null || listSelect.isEmpty()) ? g7.b.m(Proxy.NO_PROXY) : g7.b.l(listSelect);
        }
        this.f20718f = 0;
    }
}
