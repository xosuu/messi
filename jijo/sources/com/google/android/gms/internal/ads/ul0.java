package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ul0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9531b;

    public /* synthetic */ ul0(int i10, Object obj) {
        this.f9530a = i10;
        this.f9531b = obj;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        switch (this.f9530a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            default:
                return 49;
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        String str;
        int i10 = this.f9530a;
        gn0 gn0Var = null;
        int i11 = 0;
        char c10 = 1;
        Object obj = this.f9531b;
        switch (i10) {
            case 0:
                if (((Boolean) zzba.zzc().a(eg.D2)).booleanValue()) {
                    return tc1.d0(new vl0(0, d0.f.a((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
                }
                return tc1.d0(null);
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return tc1.d0(new lm0(0, arrayList));
            case 2:
                return tc1.d0(new vl0(1, ((or0) obj).f7656p));
            case 3:
                cq0 cq0Var = (cq0) obj;
                if (cq0Var != null && (str = cq0Var.f3386a) != null && !str.isEmpty()) {
                    gn0Var = new gn0(i11, this);
                }
                return tc1.d0(gn0Var);
            case 4:
                return tc1.d0(new gn0(c10 == true ? 1 : 0, (er0) obj));
            case 5:
                return tc1.d0(new mm0(3, (Bundle) obj));
            default:
                return tc1.o0(tc1.r0(tc1.d0(new Bundle()), ((Long) zzba.zzc().a(eg.K3)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), new b3(16), nu.f7383a);
        }
    }

    public ul0(or0 or0Var) {
        this.f9530a = 2;
        this.f9531b = or0Var;
    }

    public ul0(ScheduledExecutorService scheduledExecutorService) {
        this.f9530a = 6;
        this.f9531b = scheduledExecutorService;
    }
}
