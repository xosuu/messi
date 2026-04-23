package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class q50 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8114a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f8115b;

    public /* synthetic */ q50(r50 r50Var) {
        this.f8115b = new WeakReference(r50Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.f8115b;
        switch (this.f8114a) {
            case 0:
                r50 r50Var = (r50) weakReference.get();
                if (r50Var != null) {
                    r50Var.I0(new m30(21));
                }
                break;
            default:
                r50 r50Var2 = (r50) weakReference.get();
                if (r50Var2 != null) {
                    r50Var2.I0(new m30(22));
                }
                break;
        }
    }

    public /* synthetic */ q50(r50 r50Var, int i10) {
        this.f8115b = new WeakReference(r50Var);
    }
}
