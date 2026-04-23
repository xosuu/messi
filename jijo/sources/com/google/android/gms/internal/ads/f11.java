package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class f11 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m11 f4354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5.a f4355b;

    public f11(m11 m11Var, n5.a aVar) {
        this.f4354a = m11Var;
        this.f4355b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4354a.f6805a != this) {
            return;
        }
        n5.a aVar = this.f4355b;
        if (m11.f6803q.V(this.f4354a, this, m11.h(aVar))) {
            m11.o(this.f4354a, false);
        }
    }
}
