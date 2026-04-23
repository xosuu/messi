package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class ko0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p21 f6343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f6344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0 f6345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f6346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final or0 f6347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xk0 f6348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rc0 f6349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ce0 f6350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6351i;

    public ko0(mu muVar, ScheduledExecutorService scheduledExecutorService, String str, zk0 zk0Var, Context context, or0 or0Var, xk0 xk0Var, rc0 rc0Var, ce0 ce0Var) {
        this.f6343a = muVar;
        this.f6344b = scheduledExecutorService;
        this.f6351i = str;
        this.f6345c = zk0Var;
        this.f6346d = context;
        this.f6347e = or0Var;
        this.f6348f = xk0Var;
        this.f6349g = rc0Var;
        this.f6350h = ce0Var;
    }

    public final h21 a(String str, List list, Bundle bundle, boolean z9, boolean z10) {
        ci1 ci1Var = new ci1(this, str, list, bundle, z9, z10);
        p21 p21Var = this.f6343a;
        h21 h21VarR = h21.r(tc1.k0(ci1Var, p21Var));
        if (!((Boolean) zzba.zzc().a(eg.f4096p1)).booleanValue()) {
            h21VarR = (h21) tc1.r0(h21VarR, ((Long) zzba.zzc().a(eg.f4024i1)).longValue(), TimeUnit.MILLISECONDS, this.f6344b);
        }
        return tc1.P(h21VarR, Throwable.class, new sk(str, 3), p21Var);
    }

    public final void b(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            cl0 cl0Var = (cl0) ((Map.Entry) it.next()).getValue();
            String str = cl0Var.f3331a;
            Bundle bundle = this.f6347e.f7644d.zzm;
            arrayList.add(a(str, Collections.singletonList(cl0Var.f3335e), bundle != null ? bundle.getBundle(str) : null, cl0Var.f3332b, cl0Var.f3333c));
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        or0 or0Var = this.f6347e;
        if (or0Var.f7658r) {
            if (!Arrays.asList(((String) zzba.zzc().a(eg.v1)).split(",")).contains(zzq.zzb(zzq.zzc(or0Var.f7644d)))) {
                return tc1.d0(new wm0(new JSONArray().toString(), 2, new Bundle()));
            }
        }
        return tc1.k0(new rk0(20, this), this.f6343a);
    }
}
