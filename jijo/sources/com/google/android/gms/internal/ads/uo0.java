package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class uo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f9548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f9549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft0 f9550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ed0 f9551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9552f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9553g = 0;

    public uo0(Context context, mu muVar, Set set, ft0 ft0Var, ed0 ed0Var) {
        this.f9547a = context;
        this.f9549c = muVar;
        this.f9548b = set;
        this.f9550d = ft0Var;
        this.f9551e = ed0Var;
    }

    public final c21 a(Object obj, Bundle bundle) {
        bt0 bt0VarD = tc1.d(this.f9547a, 8);
        bt0VarD.zzi();
        Set<to0> set = this.f9548b;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        xf xfVar = eg.Qa;
        if (!((String) zzba.zzc().a(xfVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzba.zzc().a(xfVar)).split(","));
        }
        ((y3.b) zzu.zzB()).getClass();
        this.f9552f = SystemClock.elapsedRealtime();
        Bundle bundle2 = new Bundle();
        if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue() && bundle != null) {
            ((y3.b) zzu.zzB()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (to0 to0Var : set) {
            if (!arrayList2.contains(String.valueOf(to0Var.zza()))) {
                if (!((Boolean) zzba.zzc().a(eg.f4090o5)).booleanValue() || to0Var.zza() != 44) {
                    ((y3.b) zzu.zzB()).getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    n5.a aVarZzb = to0Var.zzb();
                    aVarZzb.a(new jw(this, jElapsedRealtime, to0Var, bundle2), nu.f7388f);
                    arrayList.add(aVarZzb);
                }
            }
        }
        bz0 bz0VarK = bz0.k(arrayList);
        d30 d30Var = new d30(arrayList, obj, bundle, bundle2, 2);
        c21 c21Var = new c21(bz0VarK, true, false);
        c21Var.B = new b21(c21Var, d30Var, this.f9549c);
        c21Var.w();
        if (gt0.a()) {
            tc1.b0(c21Var, this.f9550d, bt0VarD, false);
        }
        return c21Var;
    }
}
