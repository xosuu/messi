package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.crypto.spec.SecretKeySpec;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vq0 implements fq0, k4.a, qx0, px0, a71, y61, w61, d61, b61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9939a;

    public vq0(int i10) {
        this.f9939a = 14;
    }

    @Override // com.google.android.gms.internal.ads.a71
    public final Object b(t.a aVar) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.f9939a) {
            case 16:
                g61 g61Var = (g61) aVar;
                f71 f71Var = g61Var.f4836b;
                int i10 = f61.f4420b[u.h.b(f71Var.f4424d)];
                y91 y91VarA = z91.A();
                y91VarA.d();
                z91.F((z91) y91VarA.f9462b, f71Var.f4421a);
                y91VarA.d();
                z91.G((z91) y91VarA.f9462b, f71Var.f4423c);
                y91VarA.d();
                ((z91) y91VarA.f9462b).zze = g1.a.d(f71Var.f4424d);
                a31 a31Var = (a31) o31.a((z91) y91VarA.b(), a31.class);
                ua1 ua1Var = f71Var.f4425e;
                int iOrdinal = ua1Var.ordinal();
                f71 f71Var2 = g61Var.f4836b;
                if (iOrdinal == 1) {
                    bArrB = u61.b(f71Var2.f4426f.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = u61.a(f71Var2.f4426f.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(ua1Var)));
                    }
                    bArrB = u61.a(f71Var2.f4426f.intValue()).b();
                } else {
                    bArrB = u61.f9405a.b();
                }
                return new v51(a31Var, bArrB);
            case 17:
                w31 w31Var = (w31) aVar;
                byte[] bArrB2 = ((tb1) w31Var.f10053d.f7073a).b();
                b41 b41Var = w31Var.f10052b;
                ab1 ab1Var = new ab1(bArrB2, b41Var.f2893c);
                lj0 lj0Var = new lj0("HMAC".concat(String.valueOf(b41Var.f2896f)), new SecretKeySpec(((tb1) w31Var.f10054f.f7073a).b(), "HMAC"));
                int i11 = b41Var.f2894d;
                return new cb1(ab1Var, new rb1(lj0Var, i11), i11, w31Var.f10055h.b());
            case 18:
                c41 c41Var = (c41) aVar;
                b4.h hVar = bb1.f2956f;
                if (!tp1.N(1)) {
                    throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
                }
                c41Var.getClass();
                return new bb1(((tb1) c41Var.f3169d.f7073a).b(), c41Var.f3170f.b(), c41Var.f3168b.f4814b);
            case 19:
                h41 h41Var = (h41) aVar;
                h41Var.getClass();
                return new v51(((tb1) h41Var.f5215d.f7073a).b(), h41Var.f5216f);
            case 20:
                l41 l41Var = (l41) aVar;
                return new x51(((tb1) l41Var.f6490d.f7073a).b(), l41Var.f6491f.b());
            case sf.zzm /* 21 */:
                q41 q41Var = (q41) aVar;
                z61 z61Var = r41.f8390a;
                return p51.f7808f.get() != null ? new p51(((tb1) q41Var.f8106d.f7073a).b(), q41Var.f8107f.b()) : new v51(((tb1) q41Var.f8106d.f7073a).b(), q41Var.f8107f.b(), 3);
            case 22:
                z61 z61Var2 = u41.f9367a;
                j31.a(((w41) aVar).f10060b.f10768a);
                throw null;
            default:
                e61 e61Var = v41.f9771a;
                j31.a(((a51) aVar).f2592b.f3571b);
                throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.b61
    public final t.a d(f71 f71Var) throws GeneralSecurityException {
        x61 x61Var = z41.f11125a;
        if (!f71Var.f4421a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            ec1 ec1Var = f71Var.f4423c;
            pc1 pc1Var = pc1.f7857a;
            yd1 yd1Var = yd1.f10857c;
            na1 na1VarC = na1.C(ec1Var, pc1.f7858b);
            if (na1VarC.A() == 0) {
                return w41.q(new y41(na1VarC.D().D(), z41.a(f71Var.f4425e)), f71Var.f4426f);
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(na1VarC)));
        } catch (zzgyn e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.px0
    public final Iterator f(ks0 ks0Var, CharSequence charSequence) {
        return new nx0(charSequence);
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final g71 g(t31 t31Var) {
        switch (this.f9939a) {
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                y41 y41Var = (y41) t31Var;
                x61 x61Var = z41.f11125a;
                aa1 aa1VarA = ba1.A();
                aa1VarA.f("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                oa1 oa1VarA = pa1.A();
                String str = y41Var.f10768a;
                oa1VarA.d();
                pa1.E((pa1) oa1VarA.f9462b, str);
                aa1VarA.g(((pa1) oa1VarA.b()).b());
                aa1VarA.e(z41.b(y41Var.f10769b));
                return g71.a((ba1) aa1VarA.b());
            default:
                d51 d51Var = (d51) t31Var;
                x61 x61Var2 = e51.f3860a;
                aa1 aa1VarA2 = ba1.A();
                aa1VarA2.f("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                aa1VarA2.g(e51.b(d51Var).b());
                aa1VarA2.e(e51.c(d51Var.f3570a));
                return g71.a((ba1) aa1VarA2.b());
        }
    }

    @Override // k4.a
    public final Object i(k4.l lVar) {
        return Boolean.valueOf(lVar.d());
    }

    @Override // com.google.android.gms.internal.ads.w61
    public final l31 j(g71 g71Var) throws GeneralSecurityException {
        int i10 = this.f9939a;
        ba1 ba1Var = g71Var.f4843b;
        switch (i10) {
            case 25:
                x61 x61Var = z41.f11125a;
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE = ba1Var.E();
                    pc1 pc1Var = pc1.f7857a;
                    yd1 yd1Var = yd1.f10857c;
                    return new y41(pa1.C(ec1VarE, pc1.f7858b).D(), z41.a(ba1Var.D()));
                } catch (zzgyn e10) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
                }
            default:
                x61 x61Var2 = e51.f3860a;
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE2 = ba1Var.E();
                    pc1 pc1Var2 = pc1.f7857a;
                    yd1 yd1Var2 = yd1.f10857c;
                    return e51.a(ta1.D(ec1VarE2, pc1.f7858b), ba1Var.D());
                } catch (zzgyn e11) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e11);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final Object mo3zza() {
        switch (this.f9939a) {
            case 10:
            case 11:
                return -1;
            default:
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ vq0(int i10, int i11) {
        this.f9939a = i10;
    }

    @Override // com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        ds dsVar = (ds) ((es) obj);
        dsVar.a0(dsVar.m(), 6);
    }

    @Override // com.google.android.gms.internal.ads.a71
    public final f71 b(t.a aVar) {
        w41 w41Var = (w41) aVar;
        x61 x61Var = z41.f11125a;
        ma1 ma1VarB = na1.B();
        oa1 oa1VarA = pa1.A();
        String str = w41Var.f10060b.f10768a;
        oa1VarA.d();
        pa1.E((pa1) oa1VarA.f9462b, str);
        pa1 pa1Var = (pa1) oa1VarA.b();
        ma1VarB.d();
        na1.F((na1) ma1VarB.f9462b, pa1Var);
        return f71.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((na1) ma1VarB.b()).b(), 5, z41.b(w41Var.f10060b.f10769b), w41Var.f10061d);
    }
}
