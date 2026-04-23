package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f7743a;

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f7743a;
        tc1.h(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        int i10 = yn0.f10944a;
        SparseBooleanArray sparseBooleanArray = this.f7743a;
        if (i10 >= 24) {
            return sparseBooleanArray.equals(pVar.f7743a);
        }
        if (sparseBooleanArray.size() != pVar.f7743a.size()) {
            return false;
        }
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            if (a(i11) != pVar.a(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = yn0.f10944a;
        SparseBooleanArray sparseBooleanArray = this.f7743a;
        if (i10 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            size = (size * 31) + a(i11);
        }
        return size;
    }
}
