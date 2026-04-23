package j7;

import f7.a0;
import f7.b0;
import f7.c0;
import f7.k;
import f7.l;
import f7.p;
import f7.q;
import f7.r;
import f7.s;
import f7.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import p7.n;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14448a;

    public a(l lVar) {
        this.f14448a = lVar;
    }

    @Override // f7.r
    public final b0 a(g gVar) {
        boolean z9;
        z zVar = gVar.f14456f;
        n3.b bVarA = zVar.a();
        i iVar = zVar.f13399d;
        if (iVar != null) {
            s sVarI = iVar.i();
            if (sVarI != null) {
                bVarA.e("Content-Type", sVarI.f13334a);
            }
            long jH = iVar.h();
            if (jH != -1) {
                bVarA.e("Content-Length", Long.toString(jH));
                bVarA.g("Transfer-Encoding");
            } else {
                bVarA.e("Transfer-Encoding", "chunked");
                bVarA.g("Content-Length");
            }
        }
        p pVar = zVar.f13398c;
        String strA = pVar.a("Host");
        q qVar = zVar.f13396a;
        if (strA == null) {
            bVarA.e("Host", g7.b.k(qVar, false));
        }
        if (pVar.a("Connection") == null) {
            bVarA.e("Connection", "Keep-Alive");
        }
        if (pVar.a("Accept-Encoding") == null && pVar.a("Range") == null) {
            bVarA.e("Accept-Encoding", "gzip");
            z9 = true;
        } else {
            z9 = false;
        }
        l lVar = this.f14448a;
        ((d5.e) lVar).getClass();
        List listEmptyList = Collections.emptyList();
        if (!listEmptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = listEmptyList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb.append("; ");
                }
                k kVar = (k) listEmptyList.get(i10);
                sb.append(kVar.f13306a);
                sb.append('=');
                sb.append(kVar.f13307b);
            }
            bVarA.e("Cookie", sb.toString());
        }
        if (pVar.a("User-Agent") == null) {
            bVarA.e("User-Agent", "okhttp/3.10.0");
        }
        b0 b0VarA = gVar.a(bVarA.b());
        p pVar2 = b0VarA.f13224q;
        f.d(lVar, qVar, pVar2);
        a0 a0VarC = b0VarA.c();
        a0VarC.f13206a = zVar;
        if (z9 && "gzip".equalsIgnoreCase(b0VarA.a("Content-Encoding")) && f.b(b0VarA)) {
            p7.l lVar2 = new p7.l(b0VarA.f13225s.c());
            f7.e eVarC = pVar2.c();
            eVarC.c("Content-Encoding");
            eVarC.c("Content-Length");
            ArrayList arrayList = eVarC.f13250a;
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            f7.e eVar = new f7.e();
            Collections.addAll(eVar.f13250a, strArr);
            a0VarC.f13211f = eVar;
            String strA2 = b0VarA.a("Content-Type");
            Logger logger = n.f16294a;
            a0VarC.f13212g = new c0(strA2, -1L, new p7.p(lVar2));
        }
        return a0VarC.a();
    }
}
