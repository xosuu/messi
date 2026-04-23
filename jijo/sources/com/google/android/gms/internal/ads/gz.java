package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes.dex */
public final class gz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy f5112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f5113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzq f5115d;

    public /* synthetic */ gz(zy zyVar) {
        this.f5112a = zyVar;
    }

    public final android.support.v4.media.b a() {
        tp1.h0(this.f5113b, Context.class);
        tp1.h0(this.f5114c, String.class);
        tp1.h0(this.f5115d, zzq.class);
        Context context = this.f5113b;
        String str = this.f5114c;
        zzq zzqVar = this.f5115d;
        android.support.v4.media.b bVar = new android.support.v4.media.b();
        bVar.f93a = this.f5112a;
        bVar.f94b = kh1.a(context);
        bVar.f95c = kh1.a(zzqVar);
        bVar.f96d = kh1.a(str);
        zy zyVar = (zy) bVar.f93a;
        bVar.f97e = ih1.b(new md0(zyVar.f11377y, 21, (Object) null));
        nh1 nh1VarB = ih1.b(new hp0(zyVar.f11361m0, 4));
        bVar.f98f = nh1VarB;
        nh1 nh1Var = (nh1) bVar.f94b;
        nh1 nh1Var2 = zyVar.f11342d;
        kh1 kh1Var = zyVar.A;
        nh1 nh1Var3 = (nh1) bVar.f97e;
        nh1 nh1VarB2 = ih1.b(new z00(nh1Var, nh1Var2, kh1Var, nh1Var3, nh1VarB, en1.P, 13));
        bVar.f99g = nh1VarB2;
        bVar.f100h = ih1.b(new ub0(nh1Var, (nh1) bVar.f95c, (nh1) bVar.f96d, nh1VarB2, nh1Var3, nh1VarB, zyVar.f11356k, zyVar.C, zyVar.f11377y, 2));
        return bVar;
    }
}
