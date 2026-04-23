package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ed extends qu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3905b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3906d;

    public ed(l7 l7Var) {
        this.f3906d = l7Var;
    }

    @Override // com.google.android.gms.internal.ads.qu, java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        int i10 = this.f3905b;
        u21 u21Var = this.f8276a;
        switch (i10) {
            case 0:
                l7.d((l7) this.f3906d);
                break;
        }
        return u21Var.cancel(z9);
    }

    public final void d() {
        b(this.f3906d);
    }

    public ed(Object obj) {
        this.f3906d = obj;
    }
}
