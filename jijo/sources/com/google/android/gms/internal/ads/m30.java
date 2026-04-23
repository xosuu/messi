package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import javax.crypto.Cipher;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class m30 implements s60, b60, d61, b61, m71, a71, y61, w61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6831a;

    public /* synthetic */ m30(int i10) {
        this.f6831a = i10;
    }

    private static void a(Object obj) {
        gl0 gl0Var = (gl0) ((p50) obj);
        synchronized (gl0Var) {
            try {
                Object parent = gl0Var.f4947b.f10991q.getParent();
                if (parent instanceof View) {
                    View view = (View) parent;
                    zzu.zzp();
                    if (zzt.zzW(view, view.getContext())) {
                        zzq zzqVarN = gl0Var.f4951q.f7359b;
                        l10 l10Var = gl0Var.f4954u;
                        if (l10Var != null && l10Var.g() != null && gl0Var.f4951q.f7374q) {
                            zzqVarN = en1.N(gl0Var.f4946a, Collections.singletonList(gl0Var.f4954u.g()));
                        }
                        gl0Var.u1(zzqVarN);
                        nr0 nr0Var = gl0Var.f4951q;
                        nr0Var.f7373p = true;
                        try {
                            gl0Var.v1(nr0Var.f7358a);
                        } catch (RemoteException unused) {
                            zzm.zzj("Failed to refresh the banner ad.");
                        }
                        gl0Var.f4951q.f7373p = false;
                        return;
                    }
                }
                yp0 yp0Var = gl0Var.f4947b;
                yp0Var.f10993t.J0(yp0Var.f10995v.a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d61, com.google.android.gms.internal.ads.a71
    public f71 b(t.a aVar) {
        switch (this.f6831a) {
            case 0:
                a51 a51Var = (a51) aVar;
                qa1 qa1VarB = ra1.B();
                ta1 ta1VarB = e51.b(a51Var.f2592b);
                qa1VarB.d();
                ra1.F((ra1) qa1VarB.f9462b, ta1VarB);
                return f71.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((ra1) qa1VarB.b()).b(), 5, e51.c(a51Var.f2592b.f3570a), a51Var.f2593d);
            case 11:
                w31 w31Var = (w31) aVar;
                x61 x61Var = l51.f6502a;
                q81 q81VarB = r81.B();
                u81 u81VarB = v81.B();
                y81 y81VarB = z81.B();
                int i10 = w31Var.f10052b.f2893c;
                y81VarB.d();
                ((z81) y81VarB.f9462b).zzc = i10;
                z81 z81Var = (z81) y81VarB.b();
                u81VarB.d();
                v81.F((v81) u81VarB.f9462b, z81Var);
                byte[] bArrI = w31Var.f10053d.i();
                cc1 cc1VarQ = ec1.q(0, bArrI, bArrI.length);
                u81VarB.d();
                ((v81) u81VarB.f9462b).zzf = cc1VarQ;
                v81 v81Var = (v81) u81VarB.b();
                q81VarB.d();
                r81.G((r81) q81VarB.f9462b, v81Var);
                s91 s91VarB = t91.B();
                b41 b41Var = w31Var.f10052b;
                x91 x91VarC = l51.c(b41Var);
                s91VarB.d();
                t91.H((t91) s91VarB.f9462b, x91VarC);
                byte[] bArrI2 = w31Var.f10054f.i();
                cc1 cc1VarQ2 = ec1.q(0, bArrI2, bArrI2.length);
                s91VarB.d();
                ((t91) s91VarB.f9462b).zzf = cc1VarQ2;
                t91 t91Var = (t91) s91VarB.b();
                q81VarB.d();
                r81.H((r81) q81VarB.f9462b, t91Var);
                return f71.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((r81) q81VarB.b()).b(), 2, l51.d(b41Var.f2895e), w31Var.f10056q);
            case 15:
                c41 c41Var = (c41) aVar;
                x61 x61Var2 = m51.f6871a;
                a91 a91VarB = b91.B();
                g41 g41Var = c41Var.f3168b;
                e91 e91VarB = f91.B();
                int i11 = g41Var.f4814b;
                e91VarB.d();
                ((f91) e91VarB.f9462b).zzc = i11;
                f91 f91Var = (f91) e91VarB.b();
                a91VarB.d();
                b91.G((b91) a91VarB.f9462b, f91Var);
                byte[] bArrI3 = c41Var.f3169d.i();
                cc1 cc1VarQ3 = ec1.q(0, bArrI3, bArrI3.length);
                a91VarB.d();
                ((b91) a91VarB.f9462b).zzf = cc1VarQ3;
                return f71.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((b91) a91VarB.b()).b(), 2, m51.b(c41Var.f3168b.f4815c), c41Var.f3171h);
            case 19:
                h41 h41Var = (h41) aVar;
                x61 x61Var3 = n51.f7175a;
                g91 g91VarB = h91.B();
                byte[] bArrI4 = h41Var.f5215d.i();
                cc1 cc1VarQ4 = ec1.q(0, bArrI4, bArrI4.length);
                g91VarB.d();
                ((h91) g91VarB.f9462b).zzd = cc1VarQ4;
                return f71.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((h91) g91VarB.b()).b(), 2, n51.b(h41Var.f5214b.f6178b), h41Var.f5217h);
            case 23:
                l41 l41Var = (l41) aVar;
                x61 x61Var4 = o51.f7515a;
                k91 k91VarB = l91.B();
                byte[] bArrI5 = l41Var.f6490d.i();
                cc1 cc1VarQ5 = ec1.q(0, bArrI5, bArrI5.length);
                k91VarB.d();
                ((l91) k91VarB.f9462b).zzd = cc1VarQ5;
                return f71.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((l91) k91VarB.b()).b(), 2, o51.b(l41Var.f6489b.f7804b), l41Var.f6492h);
            default:
                q41 q41Var = (q41) aVar;
                x61 x61Var5 = q51.f8116a;
                o91 o91VarB = p91.B();
                byte[] bArrI6 = q41Var.f8106d.i();
                cc1 cc1VarQ6 = ec1.q(0, bArrI6, bArrI6.length);
                o91VarB.d();
                ((p91) o91VarB.f9462b).zzd = cc1VarQ6;
                return f71.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((p91) o91VarB.b()).b(), 2, q51.b(q41Var.f8105b.f9046a), q41Var.f8108h);
        }
    }

    @Override // com.google.android.gms.internal.ads.b61
    public t.a d(f71 f71Var) throws GeneralSecurityException {
        wq wqVar = null;
        int i10 = 0;
        Integer num = f71Var.f4426f;
        ua1 ua1Var = f71Var.f4425e;
        ec1 ec1Var = f71Var.f4423c;
        String str = f71Var.f4421a;
        switch (this.f6831a) {
            case 1:
                if (!str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    pc1 pc1Var = pc1.f7857a;
                    yd1 yd1Var = yd1.f10857c;
                    ra1 ra1VarC = ra1.C(ec1Var, pc1.f7858b);
                    if (ra1VarC.A() == 0) {
                        return a51.q(e51.a(ra1VarC.D(), ua1Var), num);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(ra1VarC)));
                } catch (zzgyn e10) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
                }
            case 12:
                x61 x61Var = l51.f6502a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    pc1 pc1Var2 = pc1.f7857a;
                    yd1 yd1Var2 = yd1.f10857c;
                    r81 r81VarC = r81.C(ec1Var, pc1.f7858b);
                    if (r81VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (r81VarC.D().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (r81VarC.E().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    tl0 tl0Var = new tl0(i10);
                    tl0Var.f(r81VarC.D().E().f());
                    tl0Var.h(r81VarC.E().F().f());
                    tl0Var.i(r81VarC.D().D().A());
                    tl0Var.k(r81VarC.E().E().A());
                    tl0Var.f9189h = l51.a(r81VarC.E().E().B());
                    tl0Var.f9190q = l51.b(ua1Var);
                    b41 b41VarN = tl0Var.n();
                    xq xqVar = new xq(wqVar);
                    xqVar.f10630b = b41VarN;
                    xqVar.f10631d = mx0.g(r81VarC.D().E().b());
                    xqVar.f10632f = mx0.g(r81VarC.E().F().b());
                    xqVar.f10633h = num;
                    return xqVar.C();
                } catch (zzgyn unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 16:
                x61 x61Var2 = m51.f6871a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    pc1 pc1Var3 = pc1.f7857a;
                    yd1 yd1Var3 = yd1.f10857c;
                    b91 b91VarC = b91.C(ec1Var, pc1.f7858b);
                    if (b91VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    xq xqVar2 = new xq();
                    xqVar2.p(b91VarC.E().f());
                    xqVar2.i(b91VarC.D().A());
                    xqVar2.v();
                    xqVar2.f10633h = m51.a(ua1Var);
                    g41 g41VarD = xqVar2.D();
                    ep epVar = new ep(19, i10);
                    epVar.f4269b = g41VarD;
                    epVar.f4270d = mx0.g(b91VarC.E().b());
                    epVar.f4271f = num;
                    return epVar.l();
                } catch (zzgyn unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 20:
                x61 x61Var3 = n51.f7175a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    pc1 pc1Var4 = pc1.f7857a;
                    yd1 yd1Var4 = yd1.f10857c;
                    h91 h91VarC = h91.C(ec1Var, pc1.f7858b);
                    if (h91VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    xq xqVar3 = new xq((Object) wqVar);
                    xqVar3.o(h91VarC.D().f());
                    xqVar3.g();
                    xqVar3.t();
                    xqVar3.f10633h = n51.a(ua1Var);
                    k41 k41VarF = xqVar3.F();
                    ep epVar2 = new ep(20, i10);
                    epVar2.f4269b = k41VarF;
                    epVar2.f4270d = mx0.g(h91VarC.D().b());
                    epVar2.f4271f = num;
                    return epVar2.m();
                } catch (zzgyn unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                x61 x61Var4 = o51.f7515a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    pc1 pc1Var5 = pc1.f7857a;
                    yd1 yd1Var5 = yd1.f10857c;
                    l91 l91VarC = l91.C(ec1Var, pc1.f7858b);
                    if (l91VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int iF = l91VarC.D().f();
                    if (iF != 16 && iF != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iF)));
                    }
                    Integer numValueOf = Integer.valueOf(iF);
                    n41 n41VarA = o51.a(ua1Var);
                    if (numValueOf == null) {
                        throw new GeneralSecurityException("Key size is not set");
                    }
                    p41 p41Var = new p41(numValueOf.intValue(), n41VarA);
                    ep epVar3 = new ep(21, i10);
                    epVar3.f4269b = p41Var;
                    epVar3.f4270d = mx0.g(l91VarC.D().b());
                    epVar3.f4271f = num;
                    return epVar3.n();
                } catch (zzgyn unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            default:
                x61 x61Var5 = q51.f8116a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    pc1 pc1Var6 = pc1.f7857a;
                    yd1 yd1Var6 = yd1.f10857c;
                    p91 p91VarC = p91.C(ec1Var, pc1.f7858b);
                    if (p91VarC.A() == 0) {
                        return q41.q(q51.a(ua1Var), mx0.g(p91VarC.D().b()), num);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzgyn unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.y61
    public g71 g(t31 t31Var) {
        switch (this.f6831a) {
            case 9:
                b41 b41Var = (b41) t31Var;
                x61 x61Var = l51.f6502a;
                aa1 aa1VarA = ba1.A();
                aa1VarA.f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                s81 s81VarA = t81.A();
                w81 w81VarB = x81.B();
                y81 y81VarB = z81.B();
                int i10 = b41Var.f2893c;
                y81VarB.d();
                ((z81) y81VarB.f9462b).zzc = i10;
                z81 z81Var = (z81) y81VarB.b();
                w81VarB.d();
                x81.E((x81) w81VarB.f9462b, z81Var);
                w81VarB.d();
                ((x81) w81VarB.f9462b).zze = b41Var.f2891a;
                x81 x81Var = (x81) w81VarB.b();
                s81VarA.d();
                t81.E((t81) s81VarA.f9462b, x81Var);
                u91 u91VarC = v91.C();
                x91 x91VarC = l51.c(b41Var);
                u91VarC.d();
                v91.G((v91) u91VarC.f9462b, x91VarC);
                u91VarC.d();
                ((v91) u91VarC.f9462b).zze = b41Var.f2892b;
                v91 v91Var = (v91) u91VarC.b();
                s81VarA.d();
                t81.F((t81) s81VarA.f9462b, v91Var);
                aa1VarA.g(((t81) s81VarA.b()).b());
                aa1VarA.e(l51.d(b41Var.f2895e));
                return g71.a((ba1) aa1VarA.b());
            case 13:
                g41 g41Var = (g41) t31Var;
                x61 x61Var2 = m51.f6871a;
                aa1 aa1VarA2 = ba1.A();
                aa1VarA2.f("type.googleapis.com/google.crypto.tink.AesEaxKey");
                c91 c91VarB = d91.B();
                e91 e91VarB = f91.B();
                int i11 = g41Var.f4814b;
                e91VarB.d();
                ((f91) e91VarB.f9462b).zzc = i11;
                f91 f91Var = (f91) e91VarB.b();
                c91VarB.d();
                d91.E((d91) c91VarB.f9462b, f91Var);
                c91VarB.d();
                ((d91) c91VarB.f9462b).zze = g41Var.f4813a;
                aa1VarA2.g(((d91) c91VarB.b()).b());
                aa1VarA2.e(m51.b(g41Var.f4815c));
                return g71.a((ba1) aa1VarA2.b());
            case 17:
                k41 k41Var = (k41) t31Var;
                x61 x61Var3 = n51.f7175a;
                aa1 aa1VarA3 = ba1.A();
                aa1VarA3.f("type.googleapis.com/google.crypto.tink.AesGcmKey");
                i91 i91VarC = j91.C();
                int i12 = k41Var.f6177a;
                i91VarC.d();
                ((j91) i91VarC.f9462b).zzc = i12;
                aa1VarA3.g(((j91) i91VarC.b()).b());
                aa1VarA3.e(n51.b(k41Var.f6178b));
                return g71.a((ba1) aa1VarA3.b());
            case sf.zzm /* 21 */:
                p41 p41Var = (p41) t31Var;
                x61 x61Var4 = o51.f7515a;
                aa1 aa1VarA4 = ba1.A();
                aa1VarA4.f("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                m91 m91VarC = n91.C();
                int i13 = p41Var.f7803a;
                m91VarC.d();
                ((n91) m91VarC.f9462b).zzc = i13;
                aa1VarA4.g(((n91) m91VarC.b()).b());
                aa1VarA4.e(o51.b(p41Var.f7804b));
                return g71.a((ba1) aa1VarA4.b());
            case 25:
                x61 x61Var5 = q51.f8116a;
                aa1 aa1VarA5 = ba1.A();
                aa1VarA5.f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                aa1VarA5.g(q91.A().b());
                aa1VarA5.e(q51.b(((t41) t31Var).f9046a));
                return g71.a((ba1) aa1VarA5.b());
            default:
                x61 x61Var6 = w51.f10075a;
                aa1 aa1VarA6 = ba1.A();
                aa1VarA6.f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                aa1VarA6.g(za1.B().b());
                aa1VarA6.e(w51.b(((j51) t31Var).f5805a));
                return g71.a((ba1) aa1VarA6.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.w61
    public l31 j(g71 g71Var) throws GeneralSecurityException {
        int i10 = 0;
        ba1 ba1Var = g71Var.f4843b;
        switch (this.f6831a) {
            case 10:
                x61 x61Var = l51.f6502a;
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE = ba1Var.E();
                    pc1 pc1Var = pc1.f7857a;
                    yd1 yd1Var = yd1.f10857c;
                    t81 t81VarB = t81.B(ec1VarE, pc1.f7858b);
                    if (t81VarB.D().B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    tl0 tl0Var = new tl0(i10);
                    tl0Var.f(t81VarB.C().A());
                    tl0Var.h(t81VarB.D().A());
                    tl0Var.i(t81VarB.C().D().A());
                    tl0Var.k(t81VarB.D().F().A());
                    tl0Var.f9189h = l51.a(t81VarB.D().F().B());
                    tl0Var.f9190q = l51.b(ba1Var.D());
                    return tl0Var.n();
                } catch (zzgyn e10) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
                }
            case 14:
                x61 x61Var2 = m51.f6871a;
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE2 = ba1Var.E();
                    pc1 pc1Var2 = pc1.f7857a;
                    yd1 yd1Var2 = yd1.f10857c;
                    d91 d91VarC = d91.C(ec1VarE2, pc1.f7858b);
                    xq xqVar = new xq();
                    xqVar.p(d91VarC.A());
                    xqVar.i(d91VarC.D().A());
                    xqVar.v();
                    xqVar.f10633h = m51.a(ba1Var.D());
                    return xqVar.D();
                } catch (zzgyn e11) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e11);
                }
            case 18:
                x61 x61Var3 = n51.f7175a;
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE3 = ba1Var.E();
                    pc1 pc1Var3 = pc1.f7857a;
                    yd1 yd1Var3 = yd1.f10857c;
                    j91 j91VarD = j91.D(ec1VarE3, pc1.f7858b);
                    if (j91VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    xq xqVar2 = new xq((Object) null);
                    xqVar2.o(j91VarD.A());
                    xqVar2.g();
                    xqVar2.t();
                    xqVar2.f10633h = n51.a(ba1Var.D());
                    return xqVar2.F();
                } catch (zzgyn e12) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e12);
                }
            case 22:
                x61 x61Var4 = o51.f7515a;
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE4 = ba1Var.E();
                    pc1 pc1Var4 = pc1.f7857a;
                    yd1 yd1Var4 = yd1.f10857c;
                    n91 n91VarD = n91.D(ec1VarE4, pc1.f7858b);
                    if (n91VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int iA = n91VarD.A();
                    if (iA != 16 && iA != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iA)));
                    }
                    Integer numValueOf = Integer.valueOf(iA);
                    n41 n41VarA = o51.a(ba1Var.D());
                    if (numValueOf != null) {
                        return new p41(numValueOf.intValue(), n41VarA);
                    }
                    throw new GeneralSecurityException("Key size is not set");
                } catch (zzgyn e13) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e13);
                }
            default:
                x61 x61Var5 = q51.f8116a;
                if (!ba1Var.F().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(ba1Var.F())));
                }
                try {
                    ec1 ec1VarE5 = ba1Var.E();
                    pc1 pc1Var5 = pc1.f7857a;
                    yd1 yd1Var5 = yd1.f10857c;
                    q91.B(ec1VarE5, pc1.f7858b);
                    return new t41(q51.a(ba1Var.D()));
                } catch (zzgyn e14) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e14);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public void mo5zza(Object obj) {
        switch (this.f6831a) {
            case 4:
                ((zza) obj).onAdClicked();
                return;
            case 5:
                ((o40) obj).zzb();
                return;
            case 6:
                ((u40) obj).a(en1.u0(11, null, null));
                return;
            case 7:
                ((w40) obj).zzr();
                return;
            case 8:
                ((k40) obj).zza();
                return;
            case 9:
                ((k40) obj).zzb();
                return;
            case 10:
                ((k40) obj).zzc();
                return;
            case 11:
                ((k40) obj).zzf();
                return;
            case 12:
                ((k40) obj).zze();
                return;
            case 13:
                ((e50) obj).zzs();
                return;
            case 14:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                return;
            case 15:
                ((k50) obj).zzg();
                return;
            case 16:
                ((zzp) obj).zzdr();
                return;
            case 17:
                ((zzp) obj).zzdk();
                return;
            case 18:
                ((zzp) obj).zzdq();
                return;
            case 19:
                ((zzp) obj).zzdH();
                return;
            case 20:
                ((zzp) obj).zzdt();
                return;
            case sf.zzm /* 21 */:
                a(obj);
                return;
            case 22:
                gl0 gl0Var = (gl0) ((p50) obj);
                synchronized (gl0Var) {
                    Object parent = gl0Var.f4947b.f10991q.getParent();
                    if (parent instanceof View) {
                        View view = (View) parent;
                        zzu.zzp();
                        if (zzt.zzW(view, view.getContext())) {
                            gl0Var.f4947b.c();
                            return;
                        }
                    }
                    gl0Var.f4947b.a();
                    return;
                }
            case 23:
                return;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                ((kl0) obj).onAdClicked();
                return;
            case 25:
                ((ml0) obj).onAdClicked();
                return;
            case 26:
                return;
            case 27:
                ((wq0) obj).zzf();
                return;
            case 28:
                ((kl0) obj).zzr();
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.m71
    public Object zza() throws GeneralSecurityException {
        j41 j41Var = j41.f5797b;
        e41 e41Var = e41.f3855b;
        a41 a41Var = a41.f2577b;
        z31 z31Var = z31.f11102d;
        Object obj = null;
        int i10 = 0;
        switch (this.f6831a) {
            case 2:
                xq xqVar = new xq(obj);
                xqVar.g();
                xqVar.o(16);
                xqVar.t();
                xqVar.f10633h = j41Var;
                return xqVar.F();
            case 3:
                xq xqVar2 = new xq(obj);
                xqVar2.g();
                xqVar2.o(32);
                xqVar2.t();
                xqVar2.f10633h = j41Var;
                return xqVar2.F();
            case 4:
                xq xqVar3 = new xq();
                xqVar3.i(16);
                xqVar3.p(16);
                xqVar3.v();
                xqVar3.f10633h = e41Var;
                return xqVar3.D();
            case 5:
                xq xqVar4 = new xq();
                xqVar4.i(16);
                xqVar4.p(32);
                xqVar4.v();
                xqVar4.f10633h = e41Var;
                return xqVar4.D();
            case 6:
                tl0 tl0Var = new tl0(i10);
                tl0Var.f(16);
                tl0Var.h(32);
                tl0Var.k(16);
                tl0Var.i(16);
                tl0Var.f9189h = z31Var;
                tl0Var.f9190q = a41Var;
                return tl0Var.n();
            default:
                tl0 tl0Var2 = new tl0(i10);
                tl0Var2.f(32);
                tl0Var2.h(32);
                tl0Var2.k(32);
                tl0Var2.i(16);
                tl0Var2.f9189h = z31Var;
                tl0Var2.f9190q = a41Var;
                return tl0Var2.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.a71
    public Object b(t.a aVar) {
        g51 g51Var = (g51) aVar;
        z61 z61Var = h51.f5220a;
        if (((Cipher) p51.f7808f.get()) != null) {
            return new v51(((tb1) g51Var.f4822d.f7073a).b(), g51Var.f4823f.b(), 1);
        }
        return new v51(((tb1) g51Var.f4822d.f7073a).b(), g51Var.f4823f.b(), 4);
    }
}
