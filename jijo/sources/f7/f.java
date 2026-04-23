package f7;

import com.google.android.gms.internal.ads.fb1;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f13254c = new f(new LinkedHashSet(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f13255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3.i f13256b;

    public f(Set set, t3.i iVar) {
        this.f13255a = set;
        this.f13256b = iVar;
    }

    public static String b(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + p7.h.j(x509Certificate.getPublicKey().getEncoded()).f("SHA-256").a();
    }

    public final void a(String str, List list) throws SSLPeerUnverifiedException {
        List listEmptyList = Collections.emptyList();
        Iterator it = this.f13255a.iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        t3.i iVar = this.f13256b;
        if (iVar != null) {
            list = iVar.g(str, list);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listEmptyList.size() > 0) {
                fb1.t(listEmptyList.get(0));
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i11);
            sb.append("\n    ");
            sb.append(b(x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size3 = listEmptyList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            fb1.t(listEmptyList.get(i12));
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (g7.b.j(this.f13256b, fVar.f13256b) && this.f13255a.equals(fVar.f13255a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        t3.i iVar = this.f13256b;
        return this.f13255a.hashCode() + ((iVar != null ? iVar.hashCode() : 0) * 31);
    }
}
