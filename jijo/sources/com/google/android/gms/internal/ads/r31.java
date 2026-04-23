package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class r31 {
    static {
        int i10 = wa1.zza;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        HashMap map;
        n41 n41Var;
        Integer num;
        n41 n41Var2;
        s61 s61Var = s61.f8810b;
        s61Var.d(v31.f9755a);
        s61Var.c(v31.f9756b);
        b81.a();
        int i10 = y31.f10756e;
        if (!tp1.N(i10)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        x61 x61Var = l51.f6502a;
        t61 t61Var = t61.f9074b;
        t61Var.h(l51.f6502a);
        t61Var.g(l51.f6503b);
        t61Var.f(l51.f6504c);
        t61Var.e(l51.f6505d);
        s61Var.c(y31.f10752a);
        r61 r61Var = r61.f8428b;
        HashMap map2 = new HashMap();
        map2.put("AES128_CTR_HMAC_SHA256", f51.f4411e);
        tl0 tl0Var = new tl0(0);
        tl0Var.f(16);
        tl0Var.h(32);
        tl0Var.k(16);
        tl0Var.i(16);
        z31 z31Var = z31.f11102d;
        tl0Var.f9189h = z31Var;
        a41 a41Var = a41.f2579d;
        tl0Var.f9190q = a41Var;
        map2.put("AES128_CTR_HMAC_SHA256_RAW", tl0Var.n());
        map2.put("AES256_CTR_HMAC_SHA256", f51.f4412f);
        tl0 tl0Var2 = new tl0(0);
        tl0Var2.f(32);
        tl0Var2.h(32);
        tl0Var2.k(32);
        tl0Var2.i(16);
        tl0Var2.f9189h = z31Var;
        tl0Var2.f9190q = a41Var;
        map2.put("AES256_CTR_HMAC_SHA256_RAW", tl0Var2.n());
        r61Var.c(Collections.unmodifiableMap(map2));
        o61 o61Var = o61.f7520b;
        o61Var.a(y31.f10754c, b41.class);
        m61 m61Var = m61.f6878b;
        m61Var.b(y31.f10755d, b41.class);
        z51 z51Var = z51.f11154d;
        z51Var.b(y31.f10753b, i10);
        int i11 = i41.f5484e;
        if (!tp1.N(i11)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        t61Var.h(n51.f7175a);
        t61Var.g(n51.f7176b);
        t61Var.f(n51.f7177c);
        t61Var.e(n51.f7178d);
        s61Var.c(i41.f5480a);
        HashMap map3 = new HashMap();
        map3.put("AES128_GCM", f51.f4407a);
        xq xqVar = new xq((Object) null);
        xqVar.g();
        xqVar.o(16);
        xqVar.t();
        j41 j41Var = j41.f5799d;
        xqVar.f10633h = j41Var;
        map3.put("AES128_GCM_RAW", xqVar.F());
        map3.put("AES256_GCM", f51.f4408b);
        xq xqVar2 = new xq((Object) null);
        xqVar2.g();
        xqVar2.o(32);
        xqVar2.t();
        xqVar2.f10633h = j41Var;
        map3.put("AES256_GCM_RAW", xqVar2.F());
        r61Var.c(Collections.unmodifiableMap(map3));
        o61Var.a(i41.f5482c, k41.class);
        m61Var.b(i41.f5483d, k41.class);
        z51Var.b(i41.f5481b, i11);
        if (y51.a()) {
            return;
        }
        z61 z61Var = d41.f3564a;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        t61Var.h(m51.f6871a);
        t61Var.g(m51.f6872b);
        t61Var.f(m51.f6873c);
        t61Var.e(m51.f6874d);
        s61Var.c(d41.f3564a);
        HashMap map4 = new HashMap();
        map4.put("AES128_EAX", f51.f4409c);
        xq xqVar3 = new xq();
        xqVar3.i(16);
        xqVar3.p(16);
        xqVar3.v();
        e41 e41Var = e41.f3857d;
        xqVar3.f10633h = e41Var;
        map4.put("AES128_EAX_RAW", xqVar3.D());
        map4.put("AES256_EAX", f51.f4410d);
        xq xqVar4 = new xq();
        xqVar4.i(16);
        xqVar4.p(32);
        xqVar4.v();
        xqVar4.f10633h = e41Var;
        map4.put("AES256_EAX_RAW", xqVar4.D());
        r61Var.c(Collections.unmodifiableMap(map4));
        m61Var.b(d41.f3566c, g41.class);
        z51Var.a(d41.f3565b);
        z61 z61Var2 = m41.f6842a;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        t61Var.h(o51.f7515a);
        t61Var.g(o51.f7516b);
        t61Var.f(o51.f7517c);
        t61Var.e(o51.f7518d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            s61Var.c(m41.f6842a);
            map = new HashMap();
            n41Var = n41.f7142d;
            num = 16;
            n41Var2 = n41.f7140b;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        map.put("AES128_GCM_SIV", new p41(num.intValue(), n41Var2));
        Integer num2 = 16;
        if (num2 == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        map.put("AES128_GCM_SIV_RAW", new p41(num2.intValue(), n41Var));
        Integer num3 = 32;
        if (num3 == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        map.put("AES256_GCM_SIV", new p41(num3.intValue(), n41Var2));
        Integer num4 = 32;
        if (num4 == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        map.put("AES256_GCM_SIV_RAW", new p41(num4.intValue(), n41Var));
        r61Var.c(Collections.unmodifiableMap(map));
        o61Var.a(m41.f6844c, p41.class);
        m61Var.b(m41.f6843b, p41.class);
        z51Var.a(m41.f6845d);
        z61 z61Var3 = r41.f8390a;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        x61 x61Var2 = q51.f8116a;
        t61 t61Var2 = t61.f9074b;
        t61Var2.h(q51.f8116a);
        t61Var2.g(q51.f8117b);
        t61Var2.f(q51.f8118c);
        t61Var2.e(q51.f8119d);
        s61 s61Var2 = s61.f8810b;
        s61Var2.c(r41.f8390a);
        m61 m61Var2 = m61.f6878b;
        m61Var2.b(r41.f8391b, t41.class);
        r61 r61Var2 = r61.f8428b;
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new t41(s41.f8792b));
        map5.put("CHACHA20_POLY1305_RAW", new t41(s41.f8794d));
        r61Var2.c(Collections.unmodifiableMap(map5));
        z51 z51Var2 = z51.f11154d;
        z51Var2.a(r41.f8392c);
        z61 z61Var4 = u41.f9367a;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        t61Var2.h(z41.f11125a);
        t61Var2.g(z41.f11126b);
        t61Var2.f(z41.f11127c);
        t61Var2.e(z41.f11128d);
        s61Var2.c(u41.f9367a);
        m61Var2.b(u41.f9369c, y41.class);
        z51Var2.a(u41.f9368b);
        e61 e61Var = v41.f9771a;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        t61Var2.h(e51.f3860a);
        t61Var2.g(e51.f3861b);
        t61Var2.f(e51.f3862c);
        t61Var2.e(e51.f3863d);
        m61Var2.b(v41.f9772b, d51.class);
        s61Var2.c(v41.f9773c);
        z51Var2.a(v41.f9771a);
        z61 z61Var5 = h51.f5220a;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        t61Var2.h(w51.f10075a);
        t61Var2.g(w51.f10076b);
        t61Var2.f(w51.f10077c);
        t61Var2.e(w51.f10078d);
        s61Var2.c(h51.f5220a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new j51(i51.f5497b));
        map6.put("XCHACHA20_POLY1305_RAW", new j51(i51.f5499d));
        r61Var2.c(Collections.unmodifiableMap(map6));
        m61Var2.b(h51.f5223d, j51.class);
        o61.f7520b.a(h51.f5222c, j51.class);
        z51Var2.a(h51.f5221b);
    }
}
