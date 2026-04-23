package h7;

import com.google.android.gms.internal.ads.fb1;
import f7.a0;
import f7.b0;
import f7.d;
import f7.p;
import f7.r;
import f7.w;
import f7.x;
import f7.z;
import g7.b;
import j7.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import okhttp3.internal.connection.RouteException;
import z5.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14154b;

    public /* synthetic */ a(int i10, w wVar) {
        this.f14153a = i10;
        this.f14154b = wVar;
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static b0 c(b0 b0Var) {
        if (b0Var == null || b0Var.f13225s == null) {
            return b0Var;
        }
        a0 a0VarC = b0Var.c();
        a0VarC.f13212g = null;
        return a0VarC.a();
    }

    @Override // f7.r
    public final b0 a(g gVar) {
        switch (this.f14153a) {
            case 0:
                Object obj = this.f14154b;
                fb1.t(obj);
                System.currentTimeMillis();
                z zVar = gVar.f14456f;
                e eVar = new e(zVar, (b0) null);
                if (((z) eVar.f20723b) != null) {
                    d dVarA = zVar.f13401f;
                    if (dVarA == null) {
                        dVarA = d.a(zVar.f13398c);
                        zVar.f13401f = dVarA;
                    }
                    if (dVarA.f13246j) {
                        eVar = new e((z) null, (b0) null);
                    }
                }
                z zVar2 = (z) eVar.f20723b;
                b0 b0Var = (b0) eVar.f20724d;
                fb1.t(obj);
                if (zVar2 == null && b0Var == null) {
                    a0 a0Var = new a0();
                    a0Var.f13206a = gVar.f14456f;
                    a0Var.f13207b = x.f13384d;
                    a0Var.f13208c = 504;
                    a0Var.f13209d = "Unsatisfiable Request (only-if-cached)";
                    a0Var.f13212g = b.f13890c;
                    a0Var.f13216k = -1L;
                    a0Var.f13217l = System.currentTimeMillis();
                    return a0Var.a();
                }
                if (zVar2 == null) {
                    a0 a0VarC = b0Var.c();
                    b0 b0VarC = c(b0Var);
                    if (b0VarC != null) {
                        a0.b("cacheResponse", b0VarC);
                    }
                    a0VarC.f13214i = b0VarC;
                    return a0VarC.a();
                }
                b0 b0VarA = gVar.a(zVar2);
                if (b0Var != null) {
                    if (b0VarA.f13221d == 304) {
                        a0 a0VarC2 = b0Var.c();
                        ArrayList arrayList = new ArrayList(20);
                        p pVar = b0Var.f13224q;
                        int iD = pVar.d();
                        int i10 = 0;
                        while (true) {
                            p pVar2 = b0VarA.f13224q;
                            if (i10 >= iD) {
                                int iD2 = pVar2.d();
                                for (int i11 = 0; i11 < iD2; i11++) {
                                    String strB = pVar2.b(i11);
                                    if (!"Content-Length".equalsIgnoreCase(strB) && !"Content-Encoding".equalsIgnoreCase(strB) && !"Content-Type".equalsIgnoreCase(strB) && b(strB)) {
                                        d5.e eVar2 = d5.e.f12374q;
                                        String strE = pVar2.e(i11);
                                        eVar2.getClass();
                                        arrayList.add(strB);
                                        arrayList.add(strE.trim());
                                    }
                                }
                                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                f7.e eVar3 = new f7.e();
                                Collections.addAll(eVar3.f13250a, strArr);
                                a0VarC2.f13211f = eVar3;
                                a0VarC2.f13216k = b0VarA.f13229w;
                                a0VarC2.f13217l = b0VarA.f13230x;
                                b0 b0VarC2 = c(b0Var);
                                if (b0VarC2 != null) {
                                    a0.b("cacheResponse", b0VarC2);
                                }
                                a0VarC2.f13214i = b0VarC2;
                                b0 b0VarC3 = c(b0VarA);
                                if (b0VarC3 != null) {
                                    a0.b("networkResponse", b0VarC3);
                                }
                                a0VarC2.f13213h = b0VarC3;
                                a0VarC2.a();
                                b0VarA.f13225s.close();
                                fb1.t(obj);
                                throw null;
                            }
                            String strB2 = pVar.b(i10);
                            String strE2 = pVar.e(i10);
                            if ((!"Warning".equalsIgnoreCase(strB2) || !strE2.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strB2) || "Content-Encoding".equalsIgnoreCase(strB2) || "Content-Type".equalsIgnoreCase(strB2) || !b(strB2) || pVar2.a(strB2) == null)) {
                                d5.e.f12374q.getClass();
                                arrayList.add(strB2);
                                arrayList.add(strE2.trim());
                            }
                            i10++;
                        }
                    } else {
                        b.d(b0Var.f13225s);
                    }
                }
                a0 a0VarC3 = b0VarA.c();
                b0 b0VarC4 = c(b0Var);
                if (b0VarC4 != null) {
                    a0.b("cacheResponse", b0VarC4);
                }
                a0VarC3.f13214i = b0VarC4;
                b0 b0VarC5 = c(b0VarA);
                if (b0VarC5 != null) {
                    a0.b("networkResponse", b0VarC5);
                }
                a0VarC3.f13213h = b0VarC5;
                b0 b0VarA2 = a0VarC3.a();
                fb1.t(obj);
                return b0VarA2;
            default:
                z zVar3 = gVar.f14456f;
                i7.d dVar = gVar.f14452b;
                boolean z9 = !zVar3.f13397b.equals("GET");
                w wVar = (w) this.f14154b;
                dVar.getClass();
                try {
                    j7.d dVarI = dVar.d(gVar.f14459i, gVar.f14460j, gVar.f14461k, wVar.K, wVar.G, z9).i(wVar, gVar, dVar);
                    synchronized (dVar.f14199d) {
                        dVar.f14207l = dVarI;
                        break;
                    }
                    return gVar.b(zVar3, dVar, dVarI, dVar.a());
                } catch (IOException e10) {
                    throw new RouteException(e10);
                }
        }
    }
}
