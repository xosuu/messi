package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2136a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2137b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2138c = new ArrayList();

    public final zzbf zza(String str, double d10, double d11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10 = 0;
        while (true) {
            arrayList = this.f2136a;
            int size = arrayList.size();
            arrayList2 = this.f2137b;
            arrayList3 = this.f2138c;
            if (i10 >= size) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i10++;
        }
        arrayList.add(i10, str);
        arrayList3.add(i10, Double.valueOf(d10));
        arrayList2.add(i10, Double.valueOf(d11));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this);
    }
}
