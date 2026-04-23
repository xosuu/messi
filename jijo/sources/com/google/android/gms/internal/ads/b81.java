package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b81 {
    static {
        int i10 = wa1.zza;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        s61 s61Var = s61.f8810b;
        s61Var.d(e81.f3878a);
        s61Var.c(e81.f3879b);
        s61Var.d(u71.f9411a);
        int i10 = x71.f10469f;
        if (!tp1.N(i10)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        yz yzVar = i81.f5523a;
        t61 t61Var = t61.f9074b;
        t61Var.h(i81.f5525c);
        t61Var.g(i81.f5526d);
        t61Var.f(i81.f5527e);
        t61Var.e(i81.f5528f);
        s61Var.c(x71.f10464a);
        s61Var.c(x71.f10465b);
        r61 r61Var = r61.f8428b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", f81.f4429a);
        xq xqVar = new xq((g1.a) null);
        xqVar.q(32);
        xqVar.u(16);
        z71 z71Var = z71.f11181e;
        xqVar.f10633h = z71Var;
        y71 y71Var = y71.f10794d;
        xqVar.f10632f = y71Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", xqVar.G());
        xq xqVar2 = new xq((g1.a) null);
        xqVar2.q(32);
        xqVar2.u(32);
        z71 z71Var2 = z71.f11178b;
        xqVar2.f10633h = z71Var2;
        xqVar2.f10632f = y71Var;
        map.put("HMAC_SHA256_256BITTAG", xqVar2.G());
        xq xqVar3 = new xq((g1.a) null);
        xqVar3.q(32);
        xqVar3.u(32);
        xqVar3.f10633h = z71Var;
        xqVar3.f10632f = y71Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", xqVar3.G());
        xq xqVar4 = new xq((g1.a) null);
        xqVar4.q(64);
        xqVar4.u(16);
        xqVar4.f10633h = z71Var2;
        y71 y71Var2 = y71.f10796f;
        xqVar4.f10632f = y71Var2;
        map.put("HMAC_SHA512_128BITTAG", xqVar4.G());
        xq xqVar5 = new xq((g1.a) null);
        xqVar5.q(64);
        xqVar5.u(16);
        xqVar5.f10633h = z71Var;
        xqVar5.f10632f = y71Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", xqVar5.G());
        xq xqVar6 = new xq((g1.a) null);
        xqVar6.q(64);
        xqVar6.u(32);
        xqVar6.f10633h = z71Var2;
        xqVar6.f10632f = y71Var2;
        map.put("HMAC_SHA512_256BITTAG", xqVar6.G());
        xq xqVar7 = new xq((g1.a) null);
        xqVar7.q(64);
        xqVar7.u(32);
        xqVar7.f10633h = z71Var;
        xqVar7.f10632f = y71Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", xqVar7.G());
        map.put("HMAC_SHA512_512BITTAG", f81.f4430b);
        xq xqVar8 = new xq((g1.a) null);
        xqVar8.q(64);
        xqVar8.u(64);
        xqVar8.f10633h = z71Var;
        xqVar8.f10632f = y71Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", xqVar8.G());
        r61Var.c(Collections.unmodifiableMap(map));
        m61 m61Var = m61.f6878b;
        m61Var.b(x71.f10468e, a81.class);
        o61.f7520b.a(x71.f10467d, a81.class);
        z51 z51Var = z51.f11154d;
        z51Var.b(x71.f10466c, i10);
        if (y51.a()) {
            return;
        }
        k61 k61Var = p71.f7829a;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        t61Var.h(g81.f4845a);
        t61Var.g(g81.f4846b);
        t61Var.f(g81.f4847c);
        t61Var.e(g81.f4848d);
        m61Var.b(p71.f7829a, r71.class);
        s61Var.c(p71.f7830b);
        s61Var.c(p71.f7831c);
        HashMap map2 = new HashMap();
        r71 r71Var = f81.f4431c;
        map2.put("AES_CMAC", r71Var);
        map2.put("AES256_CMAC", r71Var);
        ep epVar = new ep(0);
        epVar.e(32);
        epVar.j(16);
        epVar.f4271f = q71.f8134e;
        map2.put("AES256_CMAC_RAW", epVar.p());
        r61Var.c(Collections.unmodifiableMap(map2));
        z51Var.a(p71.f7832d);
    }
}
