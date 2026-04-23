package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr0 f8269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hr0 f8270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh0 f8271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt0 f8272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft0 f8273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n00 f8274f;

    public qr0(lh0 lh0Var, vt0 vt0Var, fr0 fr0Var, hr0 hr0Var, n00 n00Var, ft0 ft0Var) {
        this.f8269a = fr0Var;
        this.f8270b = hr0Var;
        this.f8271c = lh0Var;
        this.f8272d = vt0Var;
        this.f8274f = n00Var;
        this.f8273e = ft0Var;
    }

    public final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(2, (String) it.next());
        }
    }

    public final void b(int i10, String str) {
        if (!this.f8269a.f4617i0) {
            this.f8272d.a(str, this.f8273e);
            return;
        }
        ((y3.b) zzu.zzB()).getClass();
        this.f8271c.c(new s7(System.currentTimeMillis(), this.f8270b.f5371b, str, i10));
    }

    public final void c(int i10, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            tc1.u0((((Boolean) zzba.zzc().a(eg.f4010g9)).booleanValue() && n00.b(str)) ? this.f8274f.a(str, zzay.zze()) : tc1.d0(str), new gp0(i10, 8, this), nu.f7383a);
        }
    }
}
