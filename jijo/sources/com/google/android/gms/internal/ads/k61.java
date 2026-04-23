package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k61 implements l61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6204a;

    public final t.a a(l31 l31Var, Integer num) throws GeneralSecurityException {
        int i10 = 0;
        wq wqVar = null;
        switch (this.f6204a) {
            case 0:
                m61 m61Var = m61.f6878b;
                ba1 ba1Var = ((h61) l31Var).f5224a.f4843b;
                z51 z51Var = z51.f11154d;
                e61 e61VarC = z51Var.c(ba1Var.F());
                if (!((Boolean) z51Var.f11156b.get(ba1Var.F())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                ec1 ec1VarE = ba1Var.E();
                e61VarC.getClass();
                aa1 aa1VarA = ba1.A();
                aa1VarA.f(e61VarC.f3873a);
                aa1VarA.g(ec1VarE);
                aa1VarA.e(ua1.RAW);
                ba1 ba1Var2 = (ba1) aa1VarA.b();
                g71 g71Var = new g71(ba1Var2, n71.a(ba1Var2.F()));
                t61 t61Var = t61.f9074b;
                i71 i71VarC = t61Var.c(m61.f6878b.a(t61Var.b(g71Var), null));
                y91 y91VarA = z91.A();
                f71 f71Var = (f71) i71VarC;
                String str = f71Var.f4421a;
                y91VarA.d();
                z91.F((z91) y91VarA.f9462b, str);
                y91VarA.d();
                z91.G((z91) y91VarA.f9462b, f71Var.f4423c);
                y91VarA.d();
                ((z91) y91VarA.f9462b).zze = g1.a.d(f71Var.f4424d);
                z91 z91Var = (z91) y91VarA.b();
                return new g61(f71.a(z91Var.E(), z91Var.D(), z91Var.B(), ba1Var.D(), num));
            case 1:
                b41 b41Var = (b41) l31Var;
                z61 z61Var = y31.f10752a;
                int i11 = b41Var.f2891a;
                if (i11 != 16 && i11 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                xq xqVar = new xq(wqVar);
                xqVar.f10630b = b41Var;
                xqVar.f10633h = num;
                xqVar.f10631d = mx0.h(i11);
                xqVar.f10632f = mx0.h(b41Var.f2892b);
                return xqVar.C();
            case 2:
                g41 g41Var = (g41) l31Var;
                z61 z61Var2 = d41.f3564a;
                int i12 = g41Var.f4813a;
                if (i12 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                ep epVar = new ep(19, i10);
                epVar.f4269b = g41Var;
                epVar.f4271f = num;
                epVar.f4270d = mx0.h(i12);
                return epVar.l();
            case 3:
                k41 k41Var = (k41) l31Var;
                z61 z61Var3 = i41.f5480a;
                int i13 = k41Var.f6177a;
                if (i13 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                ep epVar2 = new ep(20, i10);
                epVar2.f4269b = k41Var;
                epVar2.f4271f = num;
                epVar2.f4270d = mx0.h(i13);
                return epVar2.m();
            case 4:
                p41 p41Var = (p41) l31Var;
                ep epVar3 = new ep(21, i10);
                epVar3.f4269b = p41Var;
                epVar3.f4271f = num;
                epVar3.f4270d = mx0.h(p41Var.f7803a);
                return epVar3.n();
            case 5:
                z61 z61Var4 = r41.f8390a;
                return q41.q(((t41) l31Var).f9046a, mx0.h(32), num);
            case 6:
                return w41.q((y41) l31Var, num);
            case 7:
                return a51.q((d51) l31Var, num);
            case 8:
                z61 z61Var5 = h51.f5220a;
                return g51.q(((j51) l31Var).f5805a, mx0.h(32), num);
            case 9:
                r71 r71Var = (r71) l31Var;
                k61 k61Var = p71.f7829a;
                int i14 = r71Var.f8430a;
                if (i14 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                ep epVar4 = new ep(23, i10);
                epVar4.f4269b = r71Var;
                epVar4.f4270d = mx0.h(i14);
                epVar4.f4271f = num;
                return epVar4.o();
            default:
                a81 a81Var = (a81) l31Var;
                ep epVar5 = new ep(25, i10);
                epVar5.f4269b = a81Var;
                epVar5.f4270d = mx0.h(a81Var.f2620a);
                epVar5.f4271f = num;
                return epVar5.q();
        }
    }
}
