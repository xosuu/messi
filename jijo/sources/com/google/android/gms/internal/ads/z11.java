package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z11 extends u11 {
    public List B;

    public z11(bz0 bz0Var, boolean z9) {
        List arrayList;
        super(bz0Var, z9, true);
        if (bz0Var.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            int size = bz0Var.size();
            tp1.G(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i10 = 0; i10 < bz0Var.size(); i10++) {
            arrayList.add(null);
        }
        this.B = arrayList;
        w();
    }

    @Override // com.google.android.gms.internal.ads.u11
    public final void u(int i10, Object obj) {
        List list = this.B;
        if (list != null) {
            list.set(i10, new a21(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    public final void v() {
        List<a21> list = this.B;
        if (list != null) {
            int size = list.size();
            tp1.G(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (a21 a21Var : list) {
                arrayList.add(a21Var != null ? a21Var.f2567a : null);
            }
            f(Collections.unmodifiableList(arrayList));
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    public final void x(int i10) {
        this.f9341x = null;
        this.B = null;
    }
}
