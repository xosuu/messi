package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Binder;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.h21;
import com.google.android.gms.internal.ads.q11;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.xa;
import com.google.android.gms.internal.ads.y11;
import com.google.android.gms.internal.ads.ye0;
import com.google.android.gms.internal.ads.yf0;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzdyp;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import n5.a;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff0 f2392b;

    public zzaw(Executor executor, ff0 ff0Var) {
        this.f2391a = executor;
        this.f2392b = ff0Var;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final a zza(Object obj) {
        a aVarD;
        final zzbvb zzbvbVar = (zzbvb) obj;
        ff0 ff0Var = this.f2392b;
        ff0Var.getClass();
        String str = zzbvbVar.f11577f;
        com.google.android.gms.ads.internal.zzu.zzp();
        int i10 = 1;
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            aVarD = tc1.Z(new zzdyp(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.K6)).booleanValue()) {
                aVarD = ((q11) ff0Var.f4514c).b(new xa(ff0Var, 6, zzbvbVar));
            } else {
                aVarD = ff0Var.f4515d.d(zzbvbVar);
            }
        }
        return tc1.q0(tc1.V((h21) tc1.r0(h21.r(aVarD), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.U4)).intValue(), TimeUnit.SECONDS, ff0Var.f4512a), Throwable.class, new ye0(ff0Var, zzbvbVar, Binder.getCallingUid(), i10), ff0Var.f4513b), new y11() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzav
            @Override // com.google.android.gms.internal.ads.y11
            public final a zza(Object obj2) {
                yf0 yf0Var = (yf0) obj2;
                zzay zzayVar = new zzay(new JsonReader(new InputStreamReader(yf0Var.f10868a)), yf0Var.f10869b);
                try {
                    zzayVar.zzb = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(zzbvbVar.f11574a).toString();
                } catch (JSONException unused) {
                    zzayVar.zzb = "{}";
                }
                return tc1.d0(zzayVar);
            }
        }, this.f2391a);
    }
}
