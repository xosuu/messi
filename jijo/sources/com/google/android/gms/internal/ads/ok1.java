package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ok1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jo1 f7602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk1 f7605g;

    public ok1(pk1 pk1Var, String str, int i10, jo1 jo1Var) {
        this.f7605g = pk1Var;
        this.f7599a = str;
        this.f7600b = i10;
        this.f7601c = jo1Var == null ? -1L : jo1Var.f6055d;
        if (jo1Var == null || !jo1Var.b()) {
            return;
        }
        this.f7602d = jo1Var;
    }

    public final boolean a(ek1 ek1Var) {
        jo1 jo1Var = ek1Var.f4225d;
        if (jo1Var == null) {
            return this.f7600b != ek1Var.f4224c;
        }
        long j10 = this.f7601c;
        if (j10 == -1) {
            return false;
        }
        if (jo1Var.f6055d > j10) {
            return true;
        }
        jo1 jo1Var2 = this.f7602d;
        if (jo1Var2 == null) {
            return false;
        }
        wv wvVar = ek1Var.f4223b;
        int iA = wvVar.a(jo1Var.f6052a);
        int iA2 = wvVar.a(jo1Var2.f6052a);
        if (jo1Var.f6055d < jo1Var2.f6055d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        boolean zB = jo1Var.b();
        int i10 = jo1Var2.f6053b;
        if (!zB) {
            int i11 = jo1Var.f6056e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = jo1Var.f6053b;
        if (i12 > i10) {
            return true;
        }
        if (i12 == i10) {
            return jo1Var.f6054c > jo1Var2.f6054c;
        }
        return false;
    }

    public final boolean b(wv wvVar, wv wvVar2) {
        int i10 = this.f7600b;
        if (i10 < wvVar.c()) {
            pk1 pk1Var = this.f7605g;
            wvVar.e(i10, pk1Var.f7906a, 0L);
            for (int i11 = pk1Var.f7906a.f5417k; i11 <= pk1Var.f7906a.f5418l; i11++) {
                int iA = wvVar2.a(wvVar.f(i11));
                if (iA != -1) {
                    i10 = wvVar2.d(iA, pk1Var.f7907b, false).f9970c;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= wvVar2.c()) {
            i10 = -1;
        }
        this.f7600b = i10;
        if (i10 == -1) {
            return false;
        }
        jo1 jo1Var = this.f7602d;
        return jo1Var == null || wvVar2.a(jo1Var.f6052a) != -1;
    }
}
