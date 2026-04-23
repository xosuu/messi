package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ew implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4313a = new ArrayList();

    public final boolean b(pv pvVar) {
        ArrayList arrayList = new ArrayList();
        for (dw dwVar : this.f4313a) {
            if (dwVar.f3756b == pvVar) {
                arrayList.add(dwVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((dw) it.next()).f3757c.k();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4313a.iterator();
    }
}
