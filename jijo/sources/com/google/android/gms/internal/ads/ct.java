package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ct implements dt {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List f3410l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef1 f3411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3412b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f3415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzbxi f3417g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3413c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3414d = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3418h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f3419i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3420j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3421k = false;

    public ct(Context context, VersionInfoParcel versionInfoParcel, zzbxi zzbxiVar, String str) {
        this.f3415e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f3412b = new LinkedHashMap();
        this.f3417g = zzbxiVar;
        Iterator it = zzbxiVar.f11597h.iterator();
        while (it.hasNext()) {
            this.f3419i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f3419i.remove("cookie".toLowerCase(Locale.ENGLISH));
        ef1 ef1VarA = qg1.A();
        ef1VarA.d();
        qg1.O((qg1) ef1VarA.f9462b, 9);
        ef1VarA.d();
        qg1.E((qg1) ef1VarA.f9462b, str);
        ef1VarA.d();
        qg1.F((qg1) ef1VarA.f9462b, str);
        ff1 ff1VarA = gf1.A();
        String str2 = this.f3417g.f11593a;
        if (str2 != null) {
            ff1VarA.d();
            gf1.B((gf1) ff1VarA.f9462b, str2);
        }
        gf1 gf1Var = (gf1) ff1VarA.b();
        ef1VarA.d();
        qg1.G((qg1) ef1VarA.f9462b, gf1Var);
        jg1 jg1VarA = kg1.A();
        boolean zF = z3.b.a(this.f3415e).f();
        jg1VarA.d();
        kg1.D((kg1) jg1VarA.f9462b, zF);
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            jg1VarA.d();
            kg1.B((kg1) jg1VarA.f9462b, str3);
        }
        s3.d dVar = s3.d.f16687b;
        Context context2 = this.f3415e;
        dVar.getClass();
        long jA = s3.d.a(context2);
        if (jA > 0) {
            jg1VarA.d();
            kg1.C((kg1) jg1VarA.f9462b, jA);
        }
        kg1 kg1Var = (kg1) jg1VarA.b();
        ef1VarA.d();
        qg1.L((qg1) ef1VarA.f9462b, kg1Var);
        this.f3411a = ef1VarA;
    }

    public final void a(String str, Map map, int i10) {
        synchronized (this.f3418h) {
            if (i10 == 3) {
                try {
                    this.f3421k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f3412b.containsKey(str)) {
                if (i10 == 3) {
                    hg1 hg1Var = (hg1) this.f3412b.get(str);
                    hg1Var.d();
                    ig1.H((ig1) hg1Var.f9462b, 4);
                }
                return;
            }
            hg1 hg1VarB = ig1.B();
            int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i11 != 0) {
                hg1VarB.d();
                ig1.H((ig1) hg1VarB.f9462b, i11);
            }
            int size = this.f3412b.size();
            hg1VarB.d();
            ig1.D((ig1) hg1VarB.f9462b, size);
            hg1VarB.d();
            ig1.E((ig1) hg1VarB.f9462b, str);
            of1 of1VarA = qf1.A();
            if (!this.f3419i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    if (this.f3419i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        mf1 mf1VarA = nf1.A();
                        Charset charset = ed1.f3910a;
                        cc1 cc1Var = new cc1(str2.getBytes(charset));
                        mf1VarA.d();
                        nf1.B((nf1) mf1VarA.f9462b, cc1Var);
                        cc1 cc1Var2 = new cc1(str3.getBytes(charset));
                        mf1VarA.d();
                        nf1.C((nf1) mf1VarA.f9462b, cc1Var2);
                        nf1 nf1Var = (nf1) mf1VarA.b();
                        of1VarA.d();
                        qf1.B((qf1) of1VarA.f9462b, nf1Var);
                    }
                }
            }
            qf1 qf1Var = (qf1) of1VarA.b();
            hg1VarB.d();
            ig1.F((ig1) hg1VarB.f9462b, qf1Var);
            this.f3412b.put(str, hg1VarB);
        }
    }

    public final void b() {
        synchronized (this.f3418h) {
            this.f3412b.keySet();
            m21 m21VarD0 = tc1.d0(Collections.emptyMap());
            if0 if0Var = new if0(2, this);
            mu muVar = nu.f7388f;
            r11 r11VarQ0 = tc1.q0(m21VarD0, if0Var, muVar);
            n5.a aVarR0 = tc1.r0(r11VarQ0, 10L, TimeUnit.SECONDS, nu.f7386d);
            tc1.u0(r11VarQ0, new rk0(9, aVarR0, 0), muVar);
            f3410l.add(aVarR0);
        }
    }

    public final void c(String str) {
        synchronized (this.f3418h) {
            try {
                if (str == null) {
                    ef1 ef1Var = this.f3411a;
                    ef1Var.d();
                    qg1.J((qg1) ef1Var.f9462b);
                } else {
                    ef1 ef1Var2 = this.f3411a;
                    ef1Var2.d();
                    qg1.I((qg1) ef1Var2.f9462b, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
