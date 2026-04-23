package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class eb extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final na f3890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f3891i;

    public eb(ja jaVar, j8 j8Var, int i10, na naVar) {
        super(jaVar, "1LUIVO6lhWmBJfHw9DMAIriIU/Yodc7yYpCjENKu6ENqSuhgH3MJrJCpj/jKq6Pa", "V8P78mWO+MxnWR283vMX+BSDXEvrm8XlQCYXMpvUe5w=", j8Var, i10, 53);
        this.f3890h = naVar;
        if (naVar != null) {
            if (naVar.f7235x <= -2) {
                WeakReference weakReference = naVar.f7231t;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    naVar.f7235x = -3L;
                }
            }
            this.f3891i = naVar.f7235x;
        }
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        if (this.f3890h != null) {
            long jLongValue = ((Long) this.f5556e.invoke(null, Long.valueOf(this.f3891i))).longValue();
            j8 j8Var = this.f5555d;
            j8Var.d();
            x8.P((x8) j8Var.f9462b, jLongValue);
        }
    }
}
