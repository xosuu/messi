package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jx0 implements Serializable, ix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6111a;

    public final boolean equals(Object obj) {
        if (obj instanceof jx0) {
            return this.f6111a.equals(((jx0) obj).f6111a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6111a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z9 = true;
        for (Object obj : this.f6111a) {
            if (!z9) {
                sb.append(',');
            }
            sb.append(obj);
            z9 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.ix0
    public final boolean zza(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f6111a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((ix0) list.get(i10)).zza(obj)) {
                return false;
            }
            i10++;
        }
    }
}
