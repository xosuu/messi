package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pe implements zzo, su, tu, cn, dn, zzbd, dr, j0, k21, w61, d61, b61, m71, a71, y61, nb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7860a;

    public /* synthetic */ pe(int i10) {
        this.f7860a = i10;
    }

    @Override // com.google.android.gms.internal.ads.k21
    public void E(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.dn
    public /* bridge */ /* synthetic */ JSONObject a(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.d61, com.google.android.gms.internal.ads.a71
    public f71 b(t.a aVar) {
        switch (this.f7860a) {
            case 1:
                g51 g51Var = (g51) aVar;
                xa1 xa1VarB = ya1.B();
                byte[] bArrI = g51Var.f4822d.i();
                cc1 cc1VarQ = ec1.q(0, bArrI, bArrI.length);
                xa1VarB.d();
                ((ya1) xa1VarB.f9462b).zzd = cc1VarQ;
                return f71.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((ya1) xa1VarB.b()).b(), 2, w51.b(g51Var.f4821b.f5805a), g51Var.f4824h);
            case 5:
                f71 f71Var = ((g61) aVar).f4836b;
                int i10 = f61.f4420b[u.h.b(f71Var.f4424d)];
                return f71Var;
            case 18:
                o71 o71Var = (o71) aVar;
                x61 x61Var = g81.f4845a;
                k81 k81VarB = l81.B();
                r71 r71Var = o71Var.f7527b;
                o81 o81VarB = p81.B();
                int i11 = r71Var.f8431b;
                o81VarB.d();
                ((p81) o81VarB.f9462b).zzc = i11;
                p81 p81Var = (p81) o81VarB.b();
                k81VarB.d();
                l81.H((l81) k81VarB.f9462b, p81Var);
                byte[] bArrI2 = o71Var.f7528d.i();
                cc1 cc1VarQ2 = ec1.q(0, bArrI2, bArrI2.length);
                k81VarB.d();
                ((l81) k81VarB.f9462b).zze = cc1VarQ2;
                return f71.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((l81) k81VarB.b()).b(), 2, g81.b(o71Var.f7527b.f8432c), o71Var.f7530h);
            default:
                v71 v71Var = (v71) aVar;
                yz yzVar = i81.f5523a;
                s91 s91VarB = t91.B();
                a81 a81Var = v71Var.f9795b;
                w91 w91VarC = x91.C();
                int i12 = a81Var.f2621b;
                w91VarC.d();
                ((x91) w91VarC.f9462b).zzd = i12;
                r91 r91Var = (r91) i81.f5524b.c(a81Var.f2623d);
                w91VarC.d();
                ((x91) w91VarC.f9462b).zzc = r91Var.a();
                x91 x91Var = (x91) w91VarC.b();
                s91VarB.d();
                t91.H((t91) s91VarB.f9462b, x91Var);
                byte[] bArrI3 = v71Var.f9796d.i();
                cc1 cc1VarQ3 = ec1.q(0, bArrI3, bArrI3.length);
                s91VarB.d();
                ((t91) s91VarB.f9462b).zzf = cc1VarQ3;
                return f71.a("type.googleapis.com/google.crypto.tink.HmacKey", ((t91) s91VarB.b()).b(), 2, (ua1) i81.f5523a.c(v71Var.f9795b.f2622c), v71Var.f9798h);
        }
    }

    @Override // com.google.android.gms.internal.ads.nb1
    public /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        switch (this.f7860a) {
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 25:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 26:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 27:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 28:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.b61
    public t.a d(f71 f71Var) throws GeneralSecurityException {
        int i10 = 0;
        Integer num = f71Var.f4426f;
        ua1 ua1Var = f71Var.f4425e;
        ec1 ec1Var = f71Var.f4423c;
        String str = f71Var.f4421a;
        switch (this.f7860a) {
            case 2:
                if (!str.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    pc1 pc1Var = pc1.f7857a;
                    yd1 yd1Var = yd1.f10857c;
                    ya1 ya1VarC = ya1.C(ec1Var, pc1.f7858b);
                    if (ya1VarC.A() == 0) {
                        return g51.q(w51.a(ua1Var), mx0.g(ya1VarC.D().b()), num);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzgyn unused) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 19:
                x61 x61Var = g81.f4845a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    pc1 pc1Var2 = pc1.f7857a;
                    yd1 yd1Var2 = yd1.f10857c;
                    l81 l81VarC = l81.C(ec1Var, pc1.f7858b);
                    if (l81VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ep epVar = new ep(i10);
                    epVar.e(l81VarC.E().f());
                    epVar.j(l81VarC.D().A());
                    epVar.f4271f = g81.a(ua1Var);
                    r71 r71VarP = epVar.p();
                    ep epVar2 = new ep(23, i10);
                    epVar2.f4269b = r71VarP;
                    epVar2.f4270d = mx0.g(l81VarC.E().b());
                    epVar2.f4271f = num;
                    return epVar2.o();
                } catch (zzgyn | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                yz yzVar = i81.f5523a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    pc1 pc1Var3 = pc1.f7857a;
                    yd1 yd1Var3 = yd1.f10857c;
                    t91 t91VarD = t91.D(ec1Var, pc1.f7858b);
                    if (t91VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    xq xqVar = new xq((g1.a) null);
                    xqVar.q(t91VarD.F().f());
                    xqVar.u(t91VarD.E().A());
                    xqVar.f10632f = (y71) i81.f5524b.d(t91VarD.E().B());
                    xqVar.f10633h = (z71) i81.f5523a.d(ua1Var);
                    a81 a81VarG = xqVar.G();
                    ep epVar3 = new ep(25, i10);
                    epVar3.f4269b = a81VarG;
                    epVar3.f4270d = mx0.g(t91VarD.F().b());
                    epVar3.f4271f = num;
                    return epVar3.q();
                } catch (zzgyn | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.dr
    public void e(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.dr
    public void f(Throwable th, String str, float f10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.y61
    public g71 g(t31 t31Var) {
        switch (this.f7860a) {
            case 16:
                r71 r71Var = (r71) t31Var;
                x61 x61Var = g81.f4845a;
                aa1 aa1VarA = ba1.A();
                aa1VarA.f("type.googleapis.com/google.crypto.tink.AesCmacKey");
                m81 m81VarB = n81.B();
                o81 o81VarB = p81.B();
                int i10 = r71Var.f8431b;
                o81VarB.d();
                ((p81) o81VarB.f9462b).zzc = i10;
                p81 p81Var = (p81) o81VarB.b();
                m81VarB.d();
                n81.F((n81) m81VarB.f9462b, p81Var);
                m81VarB.d();
                ((n81) m81VarB.f9462b).zzd = r71Var.f8430a;
                aa1VarA.g(((n81) m81VarB.b()).b());
                aa1VarA.e(g81.b(r71Var.f8432c));
                return g71.a((ba1) aa1VarA.b());
            default:
                a81 a81Var = (a81) t31Var;
                yz yzVar = i81.f5523a;
                aa1 aa1VarA2 = ba1.A();
                aa1VarA2.f("type.googleapis.com/google.crypto.tink.HmacKey");
                u91 u91VarC = v91.C();
                w91 w91VarC = x91.C();
                int i11 = a81Var.f2621b;
                w91VarC.d();
                ((x91) w91VarC.f9462b).zzd = i11;
                r91 r91Var = (r91) i81.f5524b.c(a81Var.f2623d);
                w91VarC.d();
                ((x91) w91VarC.f9462b).zzc = r91Var.a();
                x91 x91Var = (x91) w91VarC.b();
                u91VarC.d();
                v91.G((v91) u91VarC.f9462b, x91Var);
                u91VarC.d();
                ((v91) u91VarC.f9462b).zze = a81Var.f2620a;
                aa1VarA2.g(((v91) u91VarC.b()).b());
                aa1VarA2.e((ua1) i81.f5523a.c(a81Var.f2622c));
                return g71.a((ba1) aa1VarA2.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.j0
    public g0[] h(Uri uri, Map map) {
        switch (this.f7860a) {
            case 23:
                AtomicInteger atomicInteger = yw.G;
                return new g0[]{new h3(), new h2()};
            default:
                AtomicInteger atomicInteger2 = yw.G;
                return new g0[]{new h3(), new h2(), new e3(a4.f2573j, 32, wz0.f10382h)};
        }
    }

    @Override // com.google.android.gms.internal.ads.cn
    public Object i(JSONObject jSONObject) {
        switch (this.f7860a) {
            case 9:
                Charset charset = en.f4243a;
                return new ByteArrayInputStream(jSONObject.toString().getBytes(en.f4243a));
            default:
                return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.w61
    public l31 j(g71 g71Var) throws GeneralSecurityException {
        int i10 = this.f7860a;
        ba1 ba1Var = g71Var.f4843b;
        switch (i10) {
            case 0:
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE = ba1Var.E();
                    pc1 pc1Var = pc1.f7857a;
                    yd1 yd1Var = yd1.f10857c;
                    if (za1.C(ec1VarE, pc1.f7858b).A() == 0) {
                        return new j51(w51.a(ba1Var.D()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (zzgyn e10) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
                }
            case 17:
                x61 x61Var = g81.f4845a;
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE2 = ba1Var.E();
                    pc1 pc1Var2 = pc1.f7857a;
                    yd1 yd1Var2 = yd1.f10857c;
                    n81 n81VarC = n81.C(ec1VarE2, pc1.f7858b);
                    ep epVar = new ep(0);
                    epVar.e(n81VarC.A());
                    epVar.j(n81VarC.D().A());
                    epVar.f4271f = g81.a(ba1Var.D());
                    return epVar.p();
                } catch (zzgyn e11) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e11);
                }
            default:
                yz yzVar = i81.f5523a;
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE3 = ba1Var.E();
                    pc1 pc1Var3 = pc1.f7857a;
                    yd1 yd1Var3 = yd1.f10857c;
                    v91 v91VarE = v91.E(ec1VarE3, pc1.f7858b);
                    if (v91VarE.B() != 0) {
                        throw new GeneralSecurityException(fb1.g("Parsing HmacParameters failed: unknown Version ", v91VarE.B()));
                    }
                    xq xqVar = new xq((g1.a) null);
                    xqVar.q(v91VarE.A());
                    xqVar.u(v91VarE.F().A());
                    xqVar.f10632f = (y71) i81.f5524b.d(v91VarE.F().B());
                    xqVar.f10633h = (z71) i81.f5523a.d(ba1Var.D());
                    return xqVar.G();
                } catch (zzgyn e12) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e12);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.su, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: zza */
    public void mo1zza() {
    }

    public /* synthetic */ pe(int i10, int i11) {
        this.f7860a = i10;
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo4a(Object obj) {
        ((r20) obj).zzr();
    }

    @Override // com.google.android.gms.internal.ads.m71
    public Object zza() throws GeneralSecurityException {
        y71 y71Var = y71.f10794d;
        y71 y71Var2 = y71.f10796f;
        z71 z71Var = z71.f11178b;
        g1.a aVar = null;
        switch (this.f7860a) {
            case 4:
                t61 t61Var = new t61();
                t61Var.f(new c61(new pe(5), g61.class));
                return t61Var;
            case 11:
                xq xqVar = new xq(aVar);
                xqVar.q(32);
                xqVar.u(16);
                xqVar.f10633h = z71Var;
                xqVar.f10632f = y71Var;
                return xqVar.G();
            case 12:
                xq xqVar2 = new xq(aVar);
                xqVar2.q(32);
                xqVar2.u(32);
                xqVar2.f10633h = z71Var;
                xqVar2.f10632f = y71Var;
                return xqVar2.G();
            case 13:
                xq xqVar3 = new xq(aVar);
                xqVar3.q(64);
                xqVar3.u(32);
                xqVar3.f10633h = z71Var;
                xqVar3.f10632f = y71Var2;
                return xqVar3.G();
            case 14:
                xq xqVar4 = new xq(aVar);
                xqVar4.q(64);
                xqVar4.u(64);
                xqVar4.f10633h = z71Var;
                xqVar4.f10632f = y71Var2;
                return xqVar4.G();
            default:
                ep epVar = new ep(0);
                epVar.e(32);
                epVar.j(16);
                epVar.f4271f = q71.f8131b;
                return epVar.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.util.client.zzo
    public Object zza(Object obj) {
        switch (this.f7860a) {
            case 6:
                if (obj == 0) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                if (iInterfaceQueryLocalInterface instanceof bi) {
                    return (bi) iInterfaceQueryLocalInterface;
                }
                return new bi(obj, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
            case 13:
                int i10 = ey.f4316a;
                if (obj == 0) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
                if (iInterfaceQueryLocalInterface2 instanceof fy) {
                    return (fy) iInterfaceQueryLocalInterface2;
                }
                return new dy(obj, "com.google.android.gms.ads.measurement.IMeasurementManager");
            default:
                if (obj == 0) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                if (iInterfaceQueryLocalInterface3 instanceof rs) {
                    return (rs) iInterfaceQueryLocalInterface3;
                }
                return new rs(obj, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        }
    }

    @Override // com.google.android.gms.internal.ads.tu, com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public void mo5zza(Object obj) {
        zze.zza("Ending javascript session.");
        an anVar = (an) ((zm) obj);
        HashSet<AbstractMap.SimpleEntry> hashSet = anVar.f2740b;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((wk) simpleEntry.getValue()).toString())));
            anVar.f2739a.z((String) simpleEntry.getKey(), (wk) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.a71
    public Object b(t.a aVar) throws GeneralSecurityException {
        switch (this.f7860a) {
            case 6:
                k61 k61Var = p71.f7829a;
                if (((o71) aVar).f7527b.f8430a == 32) {
                    t71 t71Var = new t71();
                    if (tp1.N(1)) {
                        return t71Var;
                    }
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 7:
                o71 o71Var = (o71) aVar;
                k61 k61Var2 = p71.f7829a;
                if (o71Var.f7527b.f8430a == 32) {
                    return new rb1(o71Var);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 8:
                t71 t71Var2 = new t71();
                if (tp1.N(2)) {
                    return t71Var2;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 9:
                return new rb1((v71) aVar);
            default:
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
                int iOrdinal = f71Var.f4425e.ordinal();
                f71 f71Var2 = g61Var.f4836b;
                if (iOrdinal == 1) {
                    u61.b(f71Var2.f4426f.intValue()).b();
                } else if (iOrdinal == 2) {
                    u61.a(f71Var2.f4426f.intValue()).b();
                } else if (iOrdinal == 3) {
                    u61.f9405a.b();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    u61.a(f71Var2.f4426f.intValue()).b();
                }
                return new d81();
        }
    }
}
