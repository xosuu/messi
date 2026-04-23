package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ju f3254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f3255c = new Bundle();

    public cd0(Context context, hd0 hd0Var, ju juVar, or0 or0Var, String str, String str2, zzj zzjVar) {
        ActivityManager.MemoryInfo memoryInfoZzc;
        hd0Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(hd0Var.f5568a);
        this.f3253a = concurrentHashMap;
        this.f3254b = juVar;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) zzba.zzc().a(eg.F8)).booleanValue()) {
            int iZzj = zzjVar.zzj();
            int i10 = iZzj - 1;
            if (iZzj == 0) {
                throw null;
            }
            concurrentHashMap.put("asv", i10 != 0 ? i10 != 1 ? "na" : "2" : "1");
        }
        if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            a("rt_f", String.valueOf(runtime.freeMemory()));
            a("rt_m", String.valueOf(runtime.maxMemory()));
            a("rt_t", String.valueOf(runtime.totalMemory()));
            a("wv_c", String.valueOf(zzu.zzo().f5063j.get()));
            if (((Boolean) zzba.zzc().a(eg.U1)).booleanValue() && (memoryInfoZzc = zzf.zzc(context)) != null) {
                a("mem_avl", String.valueOf(memoryInfoZzc.availMem));
                a("mem_tt", String.valueOf(memoryInfoZzc.totalMem));
                a("low_m", true != memoryInfoZzc.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) zzba.zzc().a(eg.f4091o6)).booleanValue()) {
            int iZzf = zzq.zzf(or0Var) - 1;
            if (iZzf == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iZzf == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (iZzf == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iZzf != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            zzl zzlVar = or0Var.f7644d;
            a("ragent", zzlVar.zzp);
            a("rtype", zzq.zzb(zzq.zzc(zzlVar)));
        }
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f3253a.put(str, str2);
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            a("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            a("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
