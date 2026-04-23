package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu f6996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bz0 f6997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b01 f6998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jo1 f6999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jo1 f7000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jo1 f7001f;

    public mk1(vu vuVar) {
        this.f6996a = vuVar;
        zy0 zy0Var = bz0.f3132b;
        this.f6997b = wz0.f10382h;
        this.f6998c = b01.f2859s;
    }

    public static jo1 a(is isVar, bz0 bz0Var, jo1 jo1Var, vu vuVar) {
        wv wvVarZzn = isVar.zzn();
        int iZze = isVar.zze();
        Object objF = wvVarZzn.o() ? null : wvVarZzn.f(iZze);
        if (!isVar.b() && !wvVarZzn.o()) {
            vu vuVarD = wvVarZzn.d(iZze, vuVar, false);
            isVar.zzk();
            int i10 = yn0.f10944a;
            vuVarD.getClass();
        }
        for (int i11 = 0; i11 < bz0Var.size(); i11++) {
            jo1 jo1Var2 = (jo1) bz0Var.get(i11);
            if (d(jo1Var2, objF, isVar.b(), isVar.zzb(), isVar.zzc())) {
                return jo1Var2;
            }
        }
        if (bz0Var.isEmpty() && jo1Var != null && d(jo1Var, objF, isVar.b(), isVar.zzb(), isVar.zzc())) {
            return jo1Var;
        }
        return null;
    }

    public static boolean d(jo1 jo1Var, Object obj, boolean z9, int i10, int i11) {
        if (!jo1Var.f6052a.equals(obj)) {
            return false;
        }
        int i12 = jo1Var.f6053b;
        if (z9) {
            if (i12 != i10 || jo1Var.f6054c != i11) {
                return false;
            }
        } else if (i12 != -1 || jo1Var.f6056e != -1) {
            return false;
        }
        return true;
    }

    public final void b(xg xgVar, jo1 jo1Var, wv wvVar) {
        if (jo1Var == null) {
            return;
        }
        if (wvVar.a(jo1Var.f6052a) != -1) {
            xgVar.a(jo1Var, wvVar);
            return;
        }
        wv wvVar2 = (wv) this.f6998c.get(jo1Var);
        if (wvVar2 != null) {
            xgVar.a(jo1Var, wvVar2);
        }
    }

    public final void c(wv wvVar) {
        xg xgVar = new xg(5, 0);
        if (this.f6997b.isEmpty()) {
            b(xgVar, this.f7000e, wvVar);
            if (!tp1.P(this.f7001f, this.f7000e)) {
                b(xgVar, this.f7001f, wvVar);
            }
            if (!tp1.P(this.f6999d, this.f7000e) && !tp1.P(this.f6999d, this.f7001f)) {
                b(xgVar, this.f6999d, wvVar);
            }
        } else {
            for (int i10 = 0; i10 < this.f6997b.size(); i10++) {
                b(xgVar, (jo1) this.f6997b.get(i10), wvVar);
            }
            if (!this.f6997b.contains(this.f6999d)) {
                b(xgVar, this.f6999d, wvVar);
            }
        }
        this.f6998c = xgVar.g();
    }
}
