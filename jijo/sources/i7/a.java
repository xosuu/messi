package i7;

import d5.e;
import f7.g;
import f7.j;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.q3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14178b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14180d;

    public a(List list) {
        this.f14177a = list;
    }

    public final j a(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z9;
        j jVar;
        int i10 = this.f14178b;
        List list = this.f14177a;
        int size = list.size();
        while (true) {
            z9 = true;
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = (j) list.get(i10);
            if (jVar.a(sSLSocket)) {
                this.f14178b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f14180d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i11 = this.f14178b;
        while (true) {
            if (i11 >= list.size()) {
                z9 = false;
                break;
            }
            if (((j) list.get(i11)).a(sSLSocket)) {
                break;
            }
            i11++;
        }
        this.f14179c = z9;
        e eVar = e.f12374q;
        boolean z10 = this.f14180d;
        eVar.getClass();
        String[] strArr = jVar.f13300c;
        String[] strArrN = strArr != null ? g7.b.n(g.f13264b, sSLSocket.getEnabledCipherSuites(), strArr) : sSLSocket.getEnabledCipherSuites();
        String[] strArr2 = jVar.f13301d;
        String[] strArrN2 = strArr2 != null ? g7.b.n(g7.b.f13893f, sSLSocket.getEnabledProtocols(), strArr2) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        b0.g gVar = g.f13264b;
        byte[] bArr = g7.b.f13888a;
        int length = supportedCipherSuites.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            if (gVar.compare(supportedCipherSuites[i12], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i12++;
        }
        if (z10 && i12 != -1) {
            String str = supportedCipherSuites[i12];
            int length2 = strArrN.length;
            String[] strArr3 = new String[length2 + 1];
            System.arraycopy(strArrN, 0, strArr3, 0, strArrN.length);
            strArr3[length2] = str;
            strArrN = strArr3;
        }
        q3 q3Var = new q3(jVar);
        q3Var.b(strArrN);
        q3Var.h(strArrN2);
        j jVar2 = new j(q3Var);
        String[] strArr4 = jVar2.f13301d;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = jVar2.f13300c;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
        return jVar;
    }
}
