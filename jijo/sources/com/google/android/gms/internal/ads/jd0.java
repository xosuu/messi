package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jd0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hd0 f5914f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5910b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5911c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5912d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzj f5909a = zzu.zzo().d();

    public jd0(String str, hd0 hd0Var) {
        this.f5913e = str;
        this.f5914f = hd0Var;
    }

    public final synchronized void a(String str, String str2) {
        if (((Boolean) zzba.zzc().a(eg.P1)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            mapE.put("rqe", str2);
            this.f5910b.add(mapE);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) zzba.zzc().a(eg.P1)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_started");
            mapE.put("ancn", str);
            this.f5910b.add(mapE);
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) zzba.zzc().a(eg.P1)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            this.f5910b.add(mapE);
        }
    }

    public final synchronized void d() {
        if (((Boolean) zzba.zzc().a(eg.P1)).booleanValue() && !this.f5911c) {
            HashMap mapE = e();
            mapE.put("action", "init_started");
            this.f5910b.add(mapE);
            this.f5911c = true;
        }
    }

    public final HashMap e() {
        hd0 hd0Var = this.f5914f;
        hd0Var.getClass();
        HashMap map = new HashMap(hd0Var.f5568a);
        ((y3.b) zzu.zzB()).getClass();
        map.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        map.put("tid", this.f5909a.zzS() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.f5913e);
        return map;
    }
}
