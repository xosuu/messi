package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1 f9942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f9946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f9947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wq1 f9948i;

    public vq1(wq1 wq1Var, Context context) {
        this.f9948i = wq1Var;
        this.f9940a = context;
        yn0.e(context);
        this.f9941b = new ArrayList();
        this.f9943d = -9223372036854775807L;
        this.f9946g = q.f8040g;
        this.f9947h = wq1.f10302m;
    }

    public final void a() {
        this.f9944e = false;
        this.f9943d = -9223372036854775807L;
        wq1 wq1Var = this.f9948i;
        if (wq1Var.f10314l == 1) {
            wq1Var.f10313k++;
            wq1Var.f10305c.a();
            tm0 tm0Var = wq1Var.f10311i;
            tc1.A(tm0Var);
            tm0Var.b(new yd0(24, wq1Var));
        }
    }

    public final void b(long j10, long j11) {
        try {
            this.f9948i.b(j10, j11);
        } catch (zzhw e10) {
            y1 y1Var = this.f9942c;
            if (y1Var == null) {
                y1Var = new y1(new q0());
            }
            throw new zzabb(e10, y1Var);
        }
    }

    public final void c() {
        if (this.f9942c == null) {
            return;
        }
        new ArrayList().addAll(this.f9941b);
        y1 y1Var = this.f9942c;
        y1Var.getClass();
        tc1.A(null);
        wk1 wk1Var = y1Var.f10726y;
        if (wk1Var == null || !wk1Var.c()) {
            wk1 wk1Var2 = wk1.f10217h;
        }
        StringBuilder sb = new StringBuilder("width must be positive, but is: ");
        int i10 = y1Var.f10719r;
        sb.append(i10);
        tc1.Q(sb.toString(), i10 > 0);
        StringBuilder sb2 = new StringBuilder("height must be positive, but is: ");
        int i11 = y1Var.f10720s;
        sb2.append(i11);
        tc1.Q(sb2.toString(), i11 > 0);
        throw null;
    }
}
