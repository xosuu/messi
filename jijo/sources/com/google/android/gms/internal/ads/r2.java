package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends t2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8356e;

    public r2(int i10, long j10) {
        super(i10);
        this.f8354c = j10;
        this.f8355d = new ArrayList();
        this.f8356e = new ArrayList();
    }

    public final r2 d(int i10) {
        ArrayList arrayList = this.f8356e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            r2 r2Var = (r2) arrayList.get(i11);
            if (r2Var.f9035b == i10) {
                return r2Var;
            }
        }
        return null;
    }

    public final s2 e(int i10) {
        ArrayList arrayList = this.f8355d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            s2 s2Var = (s2) arrayList.get(i11);
            if (s2Var.f9035b == i10) {
                return s2Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.t2
    public final String toString() {
        ArrayList arrayList = this.f8355d;
        return t2.c(this.f9035b) + " leaves: " + Arrays.toString(arrayList.toArray()) + " containers: " + Arrays.toString(this.f8356e.toArray());
    }
}
