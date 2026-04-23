package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10867d;

    public yf(int i10, String str, Object obj, Object obj2) {
        this.f10864a = i10;
        this.f10865b = str;
        this.f10866c = obj;
        this.f10867d = obj2;
        zzba.zza().f11227a.add(this);
    }

    public static xf b(String str, int i10, int i11) {
        return new xf(str, Integer.valueOf(i10), Integer.valueOf(i11), 1);
    }

    public static xf c(long j10, String str, long j11) {
        return new xf(str, Long.valueOf(j10), Long.valueOf(j11), 2);
    }

    public static xf d(int i10, String str, Boolean bool, Boolean bool2) {
        return new xf(i10, str, bool, bool2);
    }

    public static xf e(String str, String str2, String str3) {
        return new xf(str, str2, str3, 4);
    }

    public static void f() {
        zzba.zza().f11228b.add(e("gads:sdk_core_constants:experiment_id", null, null));
    }

    public abstract Object a(JSONObject jSONObject);

    public final Object g() {
        return zzba.zzc().f3268i ? this.f10867d : this.f10866c;
    }
}
