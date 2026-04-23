package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class u11 extends w11 {
    public static final c.a A = new c.a(u11.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public wy0 f9341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f9342y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f9343z;

    public u11(bz0 bz0Var, boolean z9, boolean z10) {
        int size = bz0Var.size();
        this.f10032t = null;
        this.f10033u = size;
        this.f9341x = bz0Var;
        this.f9342y = z9;
        this.f9343z = z10;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final String d() {
        wy0 wy0Var = this.f9341x;
        return wy0Var != null ? "futures=".concat(wy0Var.toString()) : super.d();
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final void e() {
        wy0 wy0Var = this.f9341x;
        x(1);
        if ((wy0Var != null) && (this.f6805a instanceof b11)) {
            boolean zM = m();
            m01 m01VarF = wy0Var.f();
            while (m01VarF.hasNext()) {
                ((Future) m01VarF.next()).cancel(zM);
            }
        }
    }

    public final void r(wy0 wy0Var) {
        int iA = w11.f10030v.A(this);
        int i10 = 0;
        en1.M0("Less than 0 remaining futures", iA >= 0);
        if (iA == 0) {
            if (wy0Var != null) {
                m01 m01VarF = wy0Var.f();
                while (m01VarF.hasNext()) {
                    Future future = (Future) m01VarF.next();
                    if (!future.isCancelled()) {
                        try {
                            u(i10, tc1.s0(future));
                        } catch (ExecutionException e10) {
                            s(e10.getCause());
                        } catch (Throwable th) {
                            s(th);
                        }
                    }
                    i10++;
                }
            }
            this.f10032t = null;
            v();
            x(2);
        }
    }

    public final void s(Throwable th) {
        th.getClass();
        if (this.f9342y && !g(th)) {
            Set set = this.f10032t;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                t(setNewSetFromMap);
                w11.f10030v.M(this, setNewSetFromMap);
                Set set2 = this.f10032t;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            A.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z9 = th instanceof Error;
        if (z9) {
            A.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z9 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public final void t(Set set) {
        set.getClass();
        if (this.f6805a instanceof b11) {
            return;
        }
        Throwable thB = b();
        Objects.requireNonNull(thB);
        while (thB != null && set.add(thB)) {
            thB = thB.getCause();
        }
    }

    public abstract void u(int i10, Object obj);

    public abstract void v();

    public final void w() {
        Objects.requireNonNull(this.f9341x);
        if (this.f9341x.isEmpty()) {
            v();
            return;
        }
        d21 d21Var = d21.f3541a;
        if (!this.f9342y) {
            vh0 vh0Var = new vh0(this, 14, this.f9343z ? this.f9341x : null);
            m01 m01VarF = this.f9341x.f();
            while (m01VarF.hasNext()) {
                ((n5.a) m01VarF.next()).a(vh0Var, d21Var);
            }
            return;
        }
        m01 m01VarF2 = this.f9341x.f();
        int i10 = 0;
        while (m01VarF2.hasNext()) {
            n5.a aVar = (n5.a) m01VarF2.next();
            aVar.a(new ge0(this, aVar, i10), d21Var);
            i10++;
        }
    }

    public abstract void x(int i10);
}
