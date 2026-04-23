package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Excluder f12241a = Excluder.f12055q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12242b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f12243c = h.f12053a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12244d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f12245e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f12246f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12247g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12248h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12249i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12250j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f12251k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f12252l = v.f12259a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f12253m = v.f12260b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedList f12254n = new LinkedList();

    public final j a() {
        int i10;
        y yVarA;
        y yVarA2;
        ArrayList arrayList = this.f12245e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f12246f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z9 = com.google.gson.internal.sql.b.f12224a;
        com.google.gson.internal.bind.a aVar = com.google.gson.internal.bind.b.f12136b;
        int i11 = this.f12247g;
        if (i11 != 2 && (i10 = this.f12248h) != 2) {
            y yVarA3 = aVar.a(i11, i10);
            if (z9) {
                yVarA = com.google.gson.internal.sql.b.f12226c.a(i11, i10);
                yVarA2 = com.google.gson.internal.sql.b.f12225b.a(i11, i10);
            } else {
                yVarA = null;
                yVarA2 = null;
            }
            arrayList3.add(yVarA3);
            if (z9) {
                arrayList3.add(yVarA);
                arrayList3.add(yVarA2);
            }
        }
        Excluder excluder = this.f12241a;
        a aVar2 = this.f12243c;
        HashMap map = new HashMap(this.f12244d);
        boolean z10 = this.f12249i;
        boolean z11 = this.f12250j;
        boolean z12 = this.f12251k;
        int i12 = this.f12242b;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new j(excluder, aVar2, map, z10, z11, z12, i12, arrayList3, this.f12252l, this.f12253m, new ArrayList(this.f12254n));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(q qVar) {
        ArrayList arrayList = this.f12245e;
        arrayList.add(TreeTypeAdapter.f(new r5.a(Double.class), qVar));
        if (qVar instanceof x) {
            arrayList.add(com.google.gson.internal.bind.g.c(new r5.a(Double.class), (x) qVar));
        }
    }
}
