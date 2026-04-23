package com.google.android.gms.internal.ads;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4899a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4900b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4901d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4902f;

    public /* synthetic */ ge0(u11 u11Var, n5.a aVar, int i10) {
        this.f4901d = u11Var;
        this.f4902f = aVar;
        this.f4900b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4899a;
        int i11 = this.f4900b;
        Object obj = this.f4902f;
        Object obj2 = this.f4901d;
        switch (i10) {
            case 0:
                for (nf0 nf0Var : (CopyOnWriteArraySet) obj2) {
                    qe0 qe0Var = (qe0) obj;
                    if (!nf0Var.f7257d) {
                        if (i11 != -1) {
                            nf0Var.f7255b.c(i11);
                        }
                        nf0Var.f7256c = true;
                        qe0Var.mo0zza(nf0Var.f7254a);
                    }
                }
                return;
            default:
                u11 u11Var = (u11) obj2;
                n5.a aVar = (n5.a) obj;
                u11Var.getClass();
                try {
                    if (!aVar.isCancelled()) {
                        try {
                            try {
                                u11Var.u(i11, tc1.s0(aVar));
                            } catch (ExecutionException e10) {
                                u11Var.s(e10.getCause());
                            }
                        } catch (Throwable th) {
                            u11Var.s(th);
                        }
                        break;
                    } else {
                        u11Var.f9341x = null;
                        u11Var.cancel(false);
                    }
                    return;
                } finally {
                    u11Var.r(null);
                }
        }
    }

    public /* synthetic */ ge0(CopyOnWriteArraySet copyOnWriteArraySet, int i10, qe0 qe0Var) {
        this.f4901d = copyOnWriteArraySet;
        this.f4900b = i10;
        this.f4902f = qe0Var;
    }
}
