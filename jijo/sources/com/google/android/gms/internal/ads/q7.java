package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f8130h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public q7(String str, z6 z6Var) {
        String str2 = z6Var.f11158b;
        long j10 = z6Var.f11159c;
        long j11 = z6Var.f11160d;
        long j12 = z6Var.f11161e;
        long j13 = z6Var.f11162f;
        ?? arrayList = z6Var.f11164h;
        if (arrayList == 0) {
            Map map = z6Var.f11163g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new d7((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }

    public static q7 a(p01 p01Var) throws IOException {
        if (s7.d(p01Var) != 538247942) {
            throw new IOException();
        }
        String strG = s7.g(p01Var);
        String strG2 = s7.g(p01Var);
        long jE = s7.e(p01Var);
        long jE2 = s7.e(p01Var);
        long jE3 = s7.e(p01Var);
        long jE4 = s7.e(p01Var);
        int iD = s7.d(p01Var);
        if (iD < 0) {
            throw new IOException(fb1.g("readHeaderList size=", iD));
        }
        List listEmptyList = iD == 0 ? Collections.emptyList() : new ArrayList();
        for (int i10 = 0; i10 < iD; i10++) {
            listEmptyList.add(new d7(s7.g(p01Var).intern(), s7.g(p01Var).intern()));
        }
        return new q7(strG, strG2, jE, jE2, jE3, jE4, listEmptyList);
    }

    public q7(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f8124b = str;
        this.f8125c = true == RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str2) ? null : str2;
        this.f8126d = j10;
        this.f8127e = j11;
        this.f8128f = j12;
        this.f8129g = j13;
        this.f8130h = list;
    }
}
