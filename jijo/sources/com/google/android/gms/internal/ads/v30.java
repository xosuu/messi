package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v30 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f9744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f9746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f9747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f9748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f9749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f9750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f9751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh1 f9752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qh1 f9753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qh1 f9754k;

    public v30(nh1 nh1Var, ry ryVar, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, iy iyVar, nh1 nh1Var6, vo0 vo0Var, nh1 nh1Var7, nh1 nh1Var8) {
        this.f9744a = nh1Var;
        this.f9745b = ryVar;
        this.f9746c = nh1Var2;
        this.f9747d = nh1Var3;
        this.f9748e = nh1Var4;
        this.f9749f = nh1Var5;
        this.f9750g = iyVar;
        this.f9751h = nh1Var6;
        this.f9752i = vo0Var;
        this.f9753j = nh1Var7;
        this.f9754k = nh1Var8;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g4.c zzb() {
        xs0 xs0Var = (xs0) this.f9744a.zzb();
        VersionInfoParcel versionInfoParcelA = ((ry) this.f9745b).a();
        ApplicationInfo applicationInfoZzb = ((af0) this.f9746c).zzb();
        String packageName = ((jy) ((df0) this.f9747d).f3643a).a().getPackageName();
        tp1.b0(packageName);
        xf xfVar = eg.f3933a;
        ArrayList arrayListA = zzba.zza().a();
        PackageInfo packageInfo = (PackageInfo) this.f9748e.zzb();
        eh1 eh1VarA = ih1.a(en1.Q(this.f9749f));
        zzj zzjVarZzb = ((iy) this.f9750g).zzb();
        String str = (String) this.f9751h.zzb();
        uo0 uo0VarZzb = ((vo0) this.f9752i).zzb();
        or0 or0VarA = ((f40) this.f9753j).a();
        q60 q60Var = (q60) this.f9754k.zzb();
        g4.c cVar = new g4.c();
        cVar.f13696a = xs0Var;
        cVar.f13697b = versionInfoParcelA;
        cVar.f13698c = applicationInfoZzb;
        cVar.f13699d = packageName;
        cVar.f13700e = arrayListA;
        cVar.f13701f = packageInfo;
        cVar.f13702g = eh1VarA;
        cVar.f13703h = str;
        cVar.f13704i = uo0VarZzb;
        cVar.f13705j = zzjVarZzb;
        cVar.f13706k = or0VarA;
        cVar.f13707l = q60Var;
        return cVar;
    }
}
