package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ci1 implements gj1, x11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3295b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3296d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3297f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f3298h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f3299q;

    public /* synthetic */ ci1(ko0 ko0Var, String str, List list, Bundle bundle, boolean z9, boolean z10) {
        this.f3296d = ko0Var;
        this.f3297f = str;
        this.f3298h = list;
        this.f3299q = bundle;
        this.f3294a = z9;
        this.f3295b = z10;
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final to a() {
        gj1 gj1Var = (gj1) this.f3299q;
        return gj1Var != null ? gj1Var.a() : ((ck1) this.f3296d).f3322f;
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final void c(to toVar) {
        gj1 gj1Var = (gj1) this.f3299q;
        if (gj1Var != null) {
            gj1Var.c(toVar);
            toVar = ((gj1) this.f3299q).a();
        }
        ((ck1) this.f3296d).c(toVar);
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final boolean d() {
        if (this.f3294a) {
            return false;
        }
        gj1 gj1Var = (gj1) this.f3299q;
        gj1Var.getClass();
        return gj1Var.d();
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final long zza() {
        throw null;
    }

    public ci1(bi1 bi1Var) {
        this.f3297f = bi1Var;
        ck1 ck1Var = new ck1();
        ck1Var.f3322f = to.f9205d;
        this.f3296d = ck1Var;
        this.f3294a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.x11
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n5.a mo2zza() {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ci1.mo2zza():n5.a");
    }
}
