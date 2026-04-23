package f7;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f13251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f13252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f13253c;

    public e0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f13251a = aVar;
        this.f13252b = proxy;
        this.f13253c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (e0Var.f13251a.equals(this.f13251a) && e0Var.f13252b.equals(this.f13252b) && e0Var.f13253c.equals(this.f13253c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13253c.hashCode() + ((this.f13252b.hashCode() + ((this.f13251a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f13253c + "}";
    }
}
