package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ci extends ii {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f3284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f3285v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3287b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3288d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3289f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3290h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3291q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3293t;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f3284u = Color.rgb(204, 204, 204);
        f3285v = iRgb;
    }

    public ci(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f3287b = new ArrayList();
        this.f3288d = new ArrayList();
        this.f3286a = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            fi fiVar = (fi) list.get(i12);
            this.f3287b.add(fiVar);
            this.f3288d.add(fiVar);
        }
        this.f3289f = num != null ? num.intValue() : f3284u;
        this.f3290h = num2 != null ? num2.intValue() : f3285v;
        this.f3291q = num3 != null ? num3.intValue() : 12;
        this.f3292s = i10;
        this.f3293t = i11;
    }

    @Override // com.google.android.gms.internal.ads.ji
    public final String zzg() {
        return this.f3286a;
    }

    @Override // com.google.android.gms.internal.ads.ji
    public final List zzh() {
        return this.f3288d;
    }
}
