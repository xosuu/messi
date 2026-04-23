package j7;

import b7.u;
import f7.a0;
import f7.b0;
import f7.d0;
import f7.r;
import f7.z;
import java.net.ProtocolException;
import java.util.logging.Logger;
import p7.n;
import p7.o;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14449a;

    public c(boolean z9) {
        this.f14449a = z9;
    }

    @Override // f7.r
    public final b0 a(g gVar) throws ProtocolException {
        b0 b0VarA;
        i iVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        gVar.f14458h.getClass();
        d dVar = gVar.f14453c;
        z zVar = gVar.f14456f;
        dVar.e(zVar);
        boolean zX = u.x(zVar.f13397b);
        i7.d dVar2 = gVar.f14452b;
        a0 a0VarF = null;
        if (zX && (iVar = zVar.f13399d) != null) {
            if ("100-continue".equalsIgnoreCase(zVar.f13398c.a("Expect"))) {
                dVar.c();
                a0VarF = dVar.f(true);
            }
            if (a0VarF == null) {
                b bVar = new b(dVar.a(zVar, iVar.h()));
                Logger logger = n.f16294a;
                o oVar = new o(bVar);
                iVar.z(oVar);
                oVar.close();
            } else if (gVar.f14454d.f14187h == null) {
                dVar2.e();
            }
        }
        dVar.b();
        if (a0VarF == null) {
            a0VarF = dVar.f(false);
        }
        a0VarF.f13206a = zVar;
        a0VarF.f13210e = dVar2.a().f14185f;
        a0VarF.f13216k = jCurrentTimeMillis;
        a0VarF.f13217l = System.currentTimeMillis();
        b0 b0VarA2 = a0VarF.a();
        int i10 = b0VarA2.f13221d;
        if (i10 == 100) {
            a0 a0VarF2 = dVar.f(false);
            a0VarF2.f13206a = zVar;
            a0VarF2.f13210e = dVar2.a().f14185f;
            a0VarF2.f13216k = jCurrentTimeMillis;
            a0VarF2.f13217l = System.currentTimeMillis();
            b0VarA2 = a0VarF2.a();
            i10 = b0VarA2.f13221d;
        }
        if (this.f14449a && i10 == 101) {
            a0 a0VarC = b0VarA2.c();
            a0VarC.f13212g = g7.b.f13890c;
            b0VarA = a0VarC.a();
        } else {
            a0 a0VarC2 = b0VarA2.c();
            a0VarC2.f13212g = dVar.d(b0VarA2);
            b0VarA = a0VarC2.a();
        }
        if ("close".equalsIgnoreCase(b0VarA.f13219a.f13398c.a("Connection")) || "close".equalsIgnoreCase(b0VarA.a("Connection"))) {
            dVar2.e();
        }
        if (i10 == 204 || i10 == 205) {
            d0 d0Var = b0VarA.f13225s;
            if (d0Var.a() > 0) {
                throw new ProtocolException("HTTP " + i10 + " had non-zero Content-Length: " + d0Var.a());
            }
        }
        return b0VarA;
    }
}
