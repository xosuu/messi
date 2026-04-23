package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u20 implements uj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9353a;

    public u20(List list) {
        this.f9353a = list;
    }

    @Override // com.google.android.gms.internal.ads.uj0
    public final void zzr() {
        Iterator it = this.f9353a.iterator();
        while (it.hasNext()) {
            tc1.u0((n5.a) it.next(), new pe(28, 0), d21.f3541a);
        }
    }

    public u20(r20 r20Var) {
        this.f9353a = Collections.singletonList(tc1.d0(r20Var));
    }
}
