package j7;

import com.google.android.gms.internal.ads.gp0;
import f7.b0;
import f7.q;
import f7.r;
import f7.w;
import f7.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f14463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14465c;

    public h(w wVar, boolean z9) {
        this.f14463a = wVar;
        this.f14464b = z9;
    }

    public static boolean d(b0 b0Var, q qVar) {
        q qVar2 = b0Var.f13219a.f13396a;
        return qVar2.f13327d.equals(qVar.f13327d) && qVar2.f13328e == qVar.f13328e && qVar2.f13324a.equals(qVar.f13324a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [f7.d0, i7.b, j7.d] */
    /* JADX WARN: Type inference failed for: r13v2 */
    @Override // f7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f7.b0 a(j7.g r17) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.h.a(j7.g):f7.b0");
    }

    public final f7.a b(q qVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        f7.f fVar;
        boolean zEquals = qVar.f13324a.equals("https");
        w wVar = this.f14463a;
        if (zEquals) {
            sSLSocketFactory = wVar.f13379w;
            hostnameVerifier = wVar.f13381y;
            fVar = wVar.f13382z;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new f7.a(qVar.f13327d, qVar.f13328e, wVar.D, wVar.f13378v, sSLSocketFactory, hostnameVerifier, fVar, wVar.A, wVar.f13370b, wVar.f13371d, wVar.f13372f, wVar.f13376t);
    }

    public final boolean c(IOException iOException, i7.d dVar, boolean z9, z zVar) {
        dVar.g(iOException);
        if (!this.f14463a.G) {
            return false;
        }
        if (z9) {
            i iVar = zVar.f13399d;
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z9)) {
            return false;
        }
        if (dVar.f14198c != null) {
            return true;
        }
        gp0 gp0Var = dVar.f14197b;
        if (gp0Var != null && gp0Var.f5025b < ((List) gp0Var.f5026d).size()) {
            return true;
        }
        z5.b bVar = dVar.f14202g;
        return bVar.f20718f < ((List) bVar.f20719g).size() || !((List) bVar.f20721i).isEmpty();
    }
}
