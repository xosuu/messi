package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f2139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[] f2140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f2141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2143e;

    public zzbh(zzbf zzbfVar) {
        int size = zzbfVar.f2137b.size();
        this.f2139a = (String[]) zzbfVar.f2136a.toArray(new String[size]);
        ArrayList arrayList = zzbfVar.f2137b;
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        this.f2140b = dArr;
        ArrayList arrayList2 = zzbfVar.f2138c;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i11 = 0; i11 < size3; i11++) {
            dArr2[i11] = ((Double) arrayList2.get(i11)).doubleValue();
        }
        this.f2141c = dArr2;
        this.f2142d = new int[size];
        this.f2143e = 0;
    }

    public final List zza() {
        String[] strArr = this.f2139a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            double d10 = this.f2141c[i10];
            double d11 = this.f2140b[i10];
            int i11 = this.f2142d[i10];
            arrayList.add(new zzbe(str, d10, d11, ((double) i11) / ((double) this.f2143e), i11));
        }
        return arrayList;
    }

    public final void zzb(double d10) {
        this.f2143e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f2141c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f2140b[i10]) {
                int[] iArr = this.f2142d;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            } else {
                i10++;
            }
        }
    }
}
