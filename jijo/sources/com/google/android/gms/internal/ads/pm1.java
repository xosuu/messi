package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo1 f7921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7922b;

    public /* synthetic */ pm1(CopyOnWriteArrayList copyOnWriteArrayList, jo1 jo1Var) {
        this.f7922b = copyOnWriteArrayList;
        this.f7921a = jo1Var;
    }

    public final void a(gk1 gk1Var) {
        for (mo1 mo1Var : this.f7922b) {
            yn0.g(mo1Var.f7024a, new l0.a(this, mo1Var.f7025b, gk1Var, 24, 0));
        }
    }

    public final void b(bo1 bo1Var, gk1 gk1Var) {
        for (mo1 mo1Var : this.f7922b) {
            yn0.g(mo1Var.f7024a, new lo1(this, mo1Var.f7025b, bo1Var, gk1Var, 2));
        }
    }

    public final void c(bo1 bo1Var, gk1 gk1Var) {
        for (mo1 mo1Var : this.f7922b) {
            yn0.g(mo1Var.f7024a, new lo1(this, mo1Var.f7025b, bo1Var, gk1Var, 1));
        }
    }

    public final void d(bo1 bo1Var, gk1 gk1Var, IOException iOException, boolean z9) {
        for (mo1 mo1Var : this.f7922b) {
            yn0.g(mo1Var.f7024a, new mj1(this, mo1Var.f7025b, bo1Var, gk1Var, iOException, z9, 1));
        }
    }

    public final void e(bo1 bo1Var, gk1 gk1Var) {
        for (mo1 mo1Var : this.f7922b) {
            yn0.g(mo1Var.f7024a, new lo1(this, mo1Var.f7025b, bo1Var, gk1Var, 0));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pm1(int i10) {
        jo1 jo1Var = null;
        if (i10 != 1) {
            this(new CopyOnWriteArrayList(), jo1Var);
        } else {
            this(new CopyOnWriteArrayList(), jo1Var);
        }
    }
}
