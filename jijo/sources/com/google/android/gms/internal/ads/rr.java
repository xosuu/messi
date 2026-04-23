package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rr extends t.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8681b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f8682d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f8683f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hn f8684h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final VersionInfoParcel f8685q;

    public rr(Context context, hn hnVar, VersionInfoParcel versionInfoParcel) {
        super(1);
        this.f8681b = new Object();
        this.f8682d = context.getApplicationContext();
        this.f8685q = versionInfoParcel;
        this.f8684h = hnVar;
    }

    public static JSONObject q(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) lh.f6615b.k()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", lh.f6616c.k());
            jSONObject.put("cl", "661295874");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", b4.d.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // t.a
    public final n5.a p() {
        int i10;
        synchronized (this.f8681b) {
            try {
                i10 = 0;
                if (this.f8683f == null) {
                    this.f8683f = this.f8682d.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.f8683f;
        long j10 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        ((y3.b) zzu.zzB()).getClass();
        if (System.currentTimeMillis() - j10 < ((Long) lh.f6617d.k()).longValue()) {
            return tc1.d0(null);
        }
        return tc1.o0(this.f8684h.a(q(this.f8682d, this.f8685q)), new qr(i10, this), nu.f7388f);
    }
}
