package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class ms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep f7039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa f7040b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ps0 f7042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7043e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f7041c = new ArrayDeque();

    public ms0(ep epVar, zr0 zr0Var, aa aaVar) {
        this.f7039a = epVar;
        this.f7040b = aaVar;
        zr0Var.f11316a = new ks0(this);
    }

    public final synchronized void a(bq0 bq0Var) {
        this.f7041c.add(bq0Var);
    }

    public final synchronized void b() {
        fs0 fs0Var;
        if (((Boolean) zzba.zzc().a(eg.E5)).booleanValue() && !zzu.zzo().d().zzh().f3449j) {
            this.f7041c.clear();
            return;
        }
        if (c()) {
            while (!this.f7041c.isEmpty()) {
                bq0 bq0Var = (bq0) this.f7041c.pollFirst();
                if (bq0Var == null || ((fs0Var = bq0Var.f3077g) != null && this.f7039a.w(fs0Var))) {
                    ps0 ps0Var = new ps0(this.f7039a, this.f7040b, bq0Var);
                    this.f7042d = ps0Var;
                    ps0Var.b(new ok0(this, bq0Var, 1));
                    return;
                }
            }
        }
    }

    public final synchronized boolean c() {
        return this.f7042d == null;
    }
}
