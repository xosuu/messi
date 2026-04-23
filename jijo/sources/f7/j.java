package f7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.q3;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f13295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f13296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f13297g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f13300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f13301d;

    static {
        g[] gVarArr = {g.f13279q, g.f13281s, g.f13280r, g.f13282t, g.f13284v, g.f13283u, g.f13276n, g.f13277o, g.f13270h, g.f13271i, g.f13267e, g.f13268f, g.f13266d};
        q3 q3Var = new q3(true);
        q3Var.a(gVarArr);
        f0 f0Var = f0.f13260h;
        q3Var.g(f0.f13257b, f0.f13258d, f0.f13259f, f0Var);
        if (!q3Var.f14978a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        q3Var.f14979b = true;
        j jVar = new j(q3Var);
        f13295e = jVar;
        q3 q3Var2 = new q3(jVar);
        q3Var2.g(f0Var);
        if (!q3Var2.f14978a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        q3Var2.f14979b = true;
        f13296f = new j(q3Var2);
        f13297g = new j(new q3(false));
    }

    public j(q3 q3Var) {
        this.f13298a = q3Var.f14978a;
        this.f13300c = (String[]) q3Var.f14980c;
        this.f13301d = (String[]) q3Var.f14981d;
        this.f13299b = q3Var.f14979b;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f13298a) {
            return false;
        }
        String[] strArr = this.f13301d;
        if (strArr != null && !g7.b.p(g7.b.f13893f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f13300c;
        return strArr2 == null || g7.b.p(g.f13264b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z9 = jVar.f13298a;
        boolean z10 = this.f13298a;
        if (z10 != z9) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f13300c, jVar.f13300c) && Arrays.equals(this.f13301d, jVar.f13301d) && this.f13299b == jVar.f13299b);
    }

    public final int hashCode() {
        if (this.f13298a) {
            return ((((527 + Arrays.hashCode(this.f13300c)) * 31) + Arrays.hashCode(this.f13301d)) * 31) + (!this.f13299b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        List listUnmodifiableList;
        if (!this.f13298a) {
            return "ConnectionSpec()";
        }
        String string2 = "[all enabled]";
        List listUnmodifiableList2 = null;
        String[] strArr = this.f13300c;
        if (strArr != null) {
            if (strArr != null) {
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str : strArr) {
                    arrayList.add(g.a(str));
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                listUnmodifiableList = null;
            }
            string = listUnmodifiableList.toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.f13301d;
        if (strArr2 != null) {
            if (strArr2 != null) {
                ArrayList arrayList2 = new ArrayList(strArr2.length);
                for (String str2 : strArr2) {
                    arrayList2.add(f0.a(str2));
                }
                listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
            }
            string2 = listUnmodifiableList2.toString();
        }
        StringBuilder sbL = l.a0.l("ConnectionSpec(cipherSuites=", string, ", tlsVersions=", string2, ", supportsTlsExtensions=");
        sbL.append(this.f13299b);
        sbL.append(")");
        return sbL.toString();
    }
}
