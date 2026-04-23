package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.ads.internal.client.zzdq f7199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ji f7200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f7201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f7202e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzel f7204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f7205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fx f7206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fx f7207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fx f7208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zh0 f7209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n5.a f7210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public qu f7211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f7212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f7213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a4.a f7214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f7215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public pi f7216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pi f7217t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f7218u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f7221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f7222y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s.k f7219v = new s.k();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s.k f7220w = new s.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f7203f = Collections.emptyList();

    public static n90 P(eo eoVar) {
        try {
            com.google.android.gms.ads.internal.client.zzdq zzdqVarZzj = eoVar.zzj();
            return y(zzdqVarZzj == null ? null : new m90(zzdqVarZzj, eoVar), eoVar.zzk(), (View) z(eoVar.zzm()), eoVar.zzs(), eoVar.zzv(), eoVar.zzq(), eoVar.zzi(), eoVar.zzr(), (View) z(eoVar.zzn()), eoVar.zzo(), eoVar.zzu(), eoVar.zzt(), eoVar.zze(), eoVar.zzl(), eoVar.zzp(), eoVar.zzf());
        } catch (RemoteException e10) {
            zzm.zzk("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public static n90 y(m90 m90Var, ji jiVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, a4.a aVar, String str4, String str5, double d10, pi piVar, String str6, float f10) {
        n90 n90Var = new n90();
        n90Var.f7198a = 6;
        n90Var.f7199b = m90Var;
        n90Var.f7200c = jiVar;
        n90Var.f7201d = view;
        n90Var.s("headline", str);
        n90Var.f7202e = list;
        n90Var.s("body", str2);
        n90Var.f7205h = bundle;
        n90Var.s("call_to_action", str3);
        n90Var.f7212o = view2;
        n90Var.f7214q = aVar;
        n90Var.s("store", str4);
        n90Var.s("price", str5);
        n90Var.f7215r = d10;
        n90Var.f7216s = piVar;
        n90Var.s("advertiser", str6);
        synchronized (n90Var) {
            n90Var.f7221x = f10;
        }
        return n90Var;
    }

    public static Object z(a4.a aVar) {
        if (aVar == null) {
            return null;
        }
        return a4.b.a0(aVar);
    }

    public final synchronized float A() {
        return this.f7221x;
    }

    public final synchronized int B() {
        return this.f7198a;
    }

    public final synchronized Bundle C() {
        try {
            if (this.f7205h == null) {
                this.f7205h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7205h;
    }

    public final synchronized View D() {
        return this.f7201d;
    }

    public final synchronized View E() {
        return this.f7212o;
    }

    public final synchronized s.k F() {
        return this.f7220w;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq G() {
        return this.f7199b;
    }

    public final synchronized zzel H() {
        return this.f7204g;
    }

    public final synchronized ji I() {
        return this.f7200c;
    }

    public final pi J() {
        List list = this.f7202e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f7202e.get(0);
        if (obj instanceof IBinder) {
            return fi.u1((IBinder) obj);
        }
        return null;
    }

    public final synchronized pi K() {
        return this.f7216s;
    }

    public final synchronized qu L() {
        return this.f7211n;
    }

    public final synchronized fx M() {
        return this.f7207j;
    }

    public final synchronized fx N() {
        return this.f7208k;
    }

    public final synchronized fx O() {
        return this.f7206i;
    }

    public final synchronized zh0 Q() {
        return this.f7209l;
    }

    public final synchronized a4.a R() {
        return this.f7214q;
    }

    public final synchronized n5.a S() {
        return this.f7210m;
    }

    public final synchronized String T() {
        return d("advertiser");
    }

    public final synchronized String U() {
        return d("body");
    }

    public final synchronized String V() {
        return d("call_to_action");
    }

    public final synchronized String a() {
        return this.f7218u;
    }

    public final synchronized String b() {
        return d("headline");
    }

    public final synchronized String c() {
        return d("store");
    }

    public final synchronized String d(String str) {
        return (String) this.f7220w.getOrDefault(str, null);
    }

    public final synchronized List e() {
        return this.f7202e;
    }

    public final synchronized void f(ji jiVar) {
        this.f7200c = jiVar;
    }

    public final synchronized void g(String str) {
        this.f7218u = str;
    }

    public final synchronized void h(zzel zzelVar) {
        this.f7204g = zzelVar;
    }

    public final synchronized void i(pi piVar) {
        this.f7216s = piVar;
    }

    public final synchronized void j(String str, fi fiVar) {
        if (fiVar == null) {
            this.f7219v.remove(str);
        } else {
            this.f7219v.put(str, fiVar);
        }
    }

    public final synchronized void k(fx fxVar) {
        this.f7207j = fxVar;
    }

    public final synchronized void l(pi piVar) {
        this.f7217t = piVar;
    }

    public final synchronized void m(bz0 bz0Var) {
        this.f7203f = bz0Var;
    }

    public final synchronized void n(fx fxVar) {
        this.f7208k = fxVar;
    }

    public final synchronized void o(n5.a aVar) {
        this.f7210m = aVar;
    }

    public final synchronized void p(String str) {
        this.f7222y = str;
    }

    public final synchronized void q(qu quVar) {
        this.f7211n = quVar;
    }

    public final synchronized void r(double d10) {
        this.f7215r = d10;
    }

    public final synchronized void s(String str, String str2) {
        if (str2 == null) {
            this.f7220w.remove(str);
        } else {
            this.f7220w.put(str, str2);
        }
    }

    public final synchronized double t() {
        return this.f7215r;
    }

    public final synchronized void u(rx rxVar) {
        this.f7199b = rxVar;
    }

    public final synchronized void v(View view) {
        this.f7212o = view;
    }

    public final synchronized void w(fx fxVar) {
        this.f7206i = fxVar;
    }

    public final synchronized void x(View view) {
        this.f7213p = view;
    }
}
