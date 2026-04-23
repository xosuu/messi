package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.zzb;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ni0 implements hi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f7269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7270d;

    public /* synthetic */ ni0(Context context, Object obj, Executor executor, int i10) {
        this.f7267a = i10;
        this.f7268b = context;
        this.f7270d = obj;
        this.f7269c = executor;
    }

    public static final boolean c(kr0 kr0Var, int i10) {
        return ((or0) kr0Var.f6382a.f6060b).f7647g.contains(Integer.toString(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0b8a  */
    @Override // com.google.android.gms.internal.ads.hi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.android.gms.internal.ads.kr0 r71, com.google.android.gms.internal.ads.fr0 r72, com.google.android.gms.internal.ads.fi0 r73) throws com.google.android.gms.internal.ads.zzeir, com.google.android.gms.internal.ads.zzffn {
        /*
            Method dump skipped, instruction units count: 3360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ni0.a(com.google.android.gms.internal.ads.kr0, com.google.android.gms.internal.ads.fr0, com.google.android.gms.internal.ads.fi0):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void b(kr0 kr0Var, fr0 fr0Var, fi0 fi0Var) {
        zzffn zzffnVar;
        zzq zzqVar;
        int i10 = this.f7267a;
        Context context = this.f7268b;
        switch (i10) {
            case 0:
                vr0 vr0Var = (vr0) fi0Var.f4535b;
                or0 or0Var = (or0) kr0Var.f6382a.f6060b;
                String string = fr0Var.f4642v.toString();
                zzl zzlVar = or0Var.f7644d;
                wn wnVar = (wn) fi0Var.f4536c;
                vr0Var.getClass();
                try {
                    vr0Var.f9963a.D0(new a4.b(context), zzlVar, string, wnVar);
                    return;
                } finally {
                }
            case 1:
                zzq zzqVar2 = ((or0) kr0Var.f6382a.f6060b).f7645e;
                if (zzqVar2.zzn) {
                    zzqVar = new zzq(context, zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
                } else {
                    zzqVar = (((Boolean) zzba.zzc().a(eg.Z6)).booleanValue() && fr0Var.f4613g0) ? new zzq(context, zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : en1.N(context, fr0Var.f4640u);
                }
                zzq zzqVar3 = zzqVar;
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.Z6)).booleanValue();
                jp0 jp0Var = kr0Var.f6382a;
                if (zBooleanValue && fr0Var.f4613g0) {
                    vr0 vr0Var2 = (vr0) fi0Var.f4535b;
                    or0 or0Var2 = (or0) jp0Var.f6060b;
                    String string2 = fr0Var.f4642v.toString();
                    String strZzm = zzbs.zzm(fr0Var.f4636s);
                    zzl zzlVar2 = or0Var2.f7644d;
                    wn wnVar2 = (wn) fi0Var.f4536c;
                    vr0Var2.getClass();
                    try {
                        vr0Var2.f9963a.o1(new a4.b(context), zzqVar3, zzlVar2, string2, strZzm, wnVar2);
                        return;
                    } finally {
                    }
                }
                vr0 vr0Var3 = (vr0) fi0Var.f4535b;
                or0 or0Var3 = (or0) jp0Var.f6060b;
                String string3 = fr0Var.f4642v.toString();
                String strZzm2 = zzbs.zzm(fr0Var.f4636s);
                zzl zzlVar3 = or0Var3.f7644d;
                wn wnVar3 = (wn) fi0Var.f4536c;
                vr0Var3.getClass();
                try {
                    vr0Var3.f9963a.R0(new a4.b(context), zzqVar3, zzlVar3, string3, strZzm2, wnVar3);
                    return;
                } finally {
                }
            default:
                vr0 vr0Var4 = (vr0) fi0Var.f4535b;
                or0 or0Var4 = (or0) kr0Var.f6382a.f6060b;
                String string4 = fr0Var.f4642v.toString();
                String strZzm3 = zzbs.zzm(fr0Var.f4636s);
                wn wnVar4 = (wn) fi0Var.f4536c;
                or0 or0Var5 = (or0) kr0Var.f6382a.f6060b;
                zzbes zzbesVar = or0Var5.f7649i;
                zzl zzlVar4 = or0Var4.f7644d;
                ArrayList arrayList = or0Var5.f7647g;
                vr0Var4.getClass();
                try {
                    vr0Var4.f9963a.m1(new a4.b(context), zzlVar4, string4, strZzm3, wnVar4, zzbesVar, arrayList);
                    return;
                } finally {
                }
        }
    }
}
