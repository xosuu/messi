package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gp1 extends wv {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f5027g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg f5031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final da f5032f;

    static {
        zy0 zy0Var = bz0.f3132b;
        wz0 wz0Var = wz0.f10382h;
        List listEmptyList = Collections.emptyList();
        wz0 wz0Var2 = wz0.f10382h;
        ic icVar = ic.f5559a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new gb(uri, listEmptyList, wz0Var2);
        }
        new d8();
        fk fkVar = fk.f4541y;
    }

    public gp1(long j10, long j11, boolean z9, fg fgVar, da daVar) {
        this.f5028b = j10;
        this.f5029c = j11;
        this.f5030d = z9;
        fgVar.getClass();
        this.f5031e = fgVar;
        this.f5032f = daVar;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int a(Object obj) {
        return f5027g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final vu d(int i10, vu vuVar, boolean z9) {
        tc1.h(i10, 1);
        Object obj = z9 ? f5027g : null;
        long j10 = this.f5028b;
        zc zcVar = zc.f11204b;
        vuVar.b(null, obj, 0, j10, false);
        return vuVar;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final hv e(int i10, hv hvVar, long j10) {
        tc1.h(i10, 1);
        Object obj = hv.f5405m;
        fg fgVar = this.f5031e;
        long j11 = this.f5029c;
        hvVar.a(fgVar, this.f5030d, false, this.f5032f, j11);
        return hvVar;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final Object f(int i10) {
        tc1.h(i10, 1);
        return f5027g;
    }
}
