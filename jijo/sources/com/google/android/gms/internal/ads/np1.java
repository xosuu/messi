package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class np1 implements cq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ow f7353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f7355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1[] f7356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7357e;

    public np1(ow owVar, int[] iArr) {
        y1[] y1VarArr;
        int length = iArr.length;
        tc1.W(length > 0);
        owVar.getClass();
        this.f7353a = owVar;
        this.f7354b = length;
        this.f7356d = new y1[length];
        int i10 = 0;
        while (true) {
            int length2 = iArr.length;
            y1VarArr = owVar.f7688d;
            if (i10 >= length2) {
                break;
            }
            this.f7356d[i10] = y1VarArr[iArr[i10]];
            i10++;
        }
        Arrays.sort(this.f7356d, new e5(5));
        this.f7355c = new int[this.f7354b];
        for (int i11 = 0; i11 < this.f7354b; i11++) {
            int[] iArr2 = this.f7355c;
            y1 y1Var = this.f7356d[i11];
            int i12 = 0;
            while (true) {
                if (i12 >= y1VarArr.length) {
                    i12 = -1;
                    break;
                } else if (y1Var == y1VarArr[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
            iArr2[i11] = i12;
        }
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final int a(int i10) {
        return this.f7355c[i10];
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final y1 b(int i10) {
        return this.f7356d[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            np1 np1Var = (np1) obj;
            if (this.f7353a.equals(np1Var.f7353a) && Arrays.equals(this.f7355c, np1Var.f7355c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f7357e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f7355c) + (System.identityHashCode(this.f7353a) * 31);
        this.f7357e = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final int zzb(int i10) {
        for (int i11 = 0; i11 < this.f7354b; i11++) {
            if (this.f7355c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final int zzc() {
        return this.f7355c.length;
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final ow zze() {
        return this.f7353a;
    }
}
