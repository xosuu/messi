package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.j7;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.zzaop;
import f.f;
import java.util.Map;
import l3.d;
import l3.e;
import n5.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static j7 f2146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f2147b = new Object();

    public zzbo(Context context) {
        j7 j7Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f2147b) {
            try {
                if (f2146a == null) {
                    eg.a(context);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.W3)).booleanValue()) {
                        j7Var = zzaz.zzb(context);
                    } else {
                        j7Var = new j7(new s7(new p80(context.getApplicationContext())), new rk0());
                        j7Var.c();
                    }
                    f2146a = j7Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a zza(String str) {
        qu quVar = new qu();
        f2146a.a(new zzbn(str, null, quVar));
        return quVar;
    }

    public final a zzb(int i10, String str, Map map, byte[] bArr) {
        e eVar = new e();
        f fVar = new f(str, eVar);
        byte[] bArr2 = null;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        d dVar = new d(i10, str, eVar, fVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                Map mapZzl = dVar.zzl();
                if (bArr != null) {
                    bArr2 = bArr;
                }
                zzlVar.zzd(str, "GET", mapZzl, bArr2);
            } catch (zzaop e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(e10.getMessage());
            }
        }
        f2146a.a(dVar);
        return eVar;
    }
}
