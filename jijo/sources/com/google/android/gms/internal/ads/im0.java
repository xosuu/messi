package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class im0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5644e;

    public im0(Context context, mu muVar, or0 or0Var, VersionInfoParcel versionInfoParcel) {
        this.f5640a = 6;
        this.f5643d = context;
        this.f5641b = muVar;
        this.f5642c = or0Var;
        this.f5644e = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        switch (this.f5640a) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 9;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            default:
                return 35;
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        mm0 mm0Var;
        int i10 = this.f5640a;
        Object obj = this.f5641b;
        switch (i10) {
            case 0:
                return tc1.o0(((to0) obj).zzb(), new qr(4, this), nu.f7388f);
            case 1:
                xf xfVar = eg.La;
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(xfVar)).booleanValue();
                Object obj2 = this.f5644e;
                if (zBooleanValue && (mm0Var = ((nm0) obj2).f7316b) != null) {
                    return tc1.d0(mm0Var);
                }
                if (tc1.n((String) zzba.zzc().a(eg.f4013h1)) || (!((Boolean) zzba.zzc().a(xfVar)).booleanValue() && (((nm0) obj2).f7315a.get() || !((be0) this.f5643d).f2998b))) {
                    return tc1.d0(new mm0(0, new Bundle()));
                }
                ((nm0) obj2).f7315a.set(true);
                return ((q11) ((p21) obj)).b(new du(7, this));
            case 2:
                return ((q11) ((p21) obj)).b(new du(9, this));
            case 3:
                return ((q11) ((p21) obj)).b(new du(13, this));
            case 4:
                return ((q11) ((p21) obj)).b(new du(17, this));
            case 5:
                return ((q11) ((p21) obj)).b(new du(19, this));
            case 6:
                return ((q11) ((p21) obj)).b(new du(21, this));
            default:
                return ((q11) ((p21) obj)).b(new du(23, this));
        }
    }

    public /* synthetic */ im0(mu muVar, Object obj, Object obj2, String str, int i10) {
        this.f5640a = i10;
        this.f5641b = muVar;
        this.f5643d = obj;
        this.f5642c = obj2;
        this.f5644e = str;
    }

    public /* synthetic */ im0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f5640a = i10;
        this.f5641b = obj;
        this.f5642c = obj2;
        this.f5643d = obj3;
        this.f5644e = obj4;
    }
}
