package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import b4.f;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.cu;
import com.google.android.gms.internal.ads.ed0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.en;
import com.google.android.gms.internal.ads.fn;
import com.google.android.gms.internal.ads.gt0;
import com.google.android.gms.internal.ads.hn;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.pu;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.r11;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.xf;
import com.google.android.gms.internal.ads.y11;
import n5.a;
import org.json.JSONException;
import org.json.JSONObject;
import y3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f2220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2221b = 0;

    public static final void b(ed0 ed0Var, String str, long j10) {
        if (ed0Var != null) {
            if (((Boolean) zzba.zzc().a(eg.Ib)).booleanValue()) {
                m20 m20VarA = ed0Var.a();
                m20VarA.f("action", "lat_init");
                m20VarA.f(str, Long.toString(j10));
                m20VarA.h();
            }
        }
    }

    public final void a(Context context, VersionInfoParcel versionInfoParcel, boolean z9, cu cuVar, String str, String str2, Runnable runnable, final gt0 gt0Var, final ed0 ed0Var, final Long l9) {
        PackageInfo packageInfoD;
        ((b) zzu.zzB()).getClass();
        if (SystemClock.elapsedRealtime() - this.f2221b < 5000) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Not retrying to fetch app settings");
            return;
        }
        ((b) zzu.zzB()).getClass();
        this.f2221b = SystemClock.elapsedRealtime();
        if (cuVar != null && !TextUtils.isEmpty(cuVar.f3444e)) {
            long j10 = cuVar.f3445f;
            ((b) zzu.zzB()).getClass();
            if (System.currentTimeMillis() - j10 <= ((Long) zzba.zzc().a(eg.J3)).longValue() && cuVar.f3447h) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f2220a = applicationContext;
        final bt0 bt0VarD = tc1.d(context, 4);
        bt0VarD.zzi();
        fn fnVarA = zzu.zzf().a(this.f2220a, versionInfoParcel, gt0Var);
        pe peVar = en.f4244b;
        hn hnVarA = fnVarA.a("google.afma.config.fetchAppSettings", peVar, peVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z9);
            jSONObject.put("pn", context.getPackageName());
            xf xfVar = eg.f3933a;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().a()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            try {
                ApplicationInfo applicationInfo = this.f2220a.getApplicationInfo();
                if (applicationInfo != null && (packageInfoD = z3.b.a(context).d(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoD.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            a aVarA = hnVarA.a(jSONObject);
            y11 y11Var = new y11(this) { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.y11
                public final a zza(Object obj) throws JSONException {
                    Long l10 = l9;
                    ed0 ed0Var2 = ed0Var;
                    gt0 gt0Var2 = gt0Var;
                    bt0 bt0Var = bt0VarD;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        zzu.zzo().d().zzv(jSONObject2.getString("appSettingsJson"));
                        if (l10 != null) {
                            ((b) zzu.zzB()).getClass();
                            zzf.b(ed0Var2, "cld_s", SystemClock.elapsedRealtime() - l10.longValue());
                        }
                    }
                    bt0Var.x(zOptBoolean);
                    gt0Var2.b(bt0Var.zzm());
                    return tc1.d0(null);
                }
            };
            mu muVar = nu.f7388f;
            r11 r11VarQ0 = tc1.q0(aVarA, y11Var, muVar);
            if (runnable != null) {
                ((qu) aVarA).a(runnable, muVar);
            }
            if (l9 != null) {
                ((qu) aVarA).a(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        ed0 ed0Var2 = ed0Var;
                        Long l10 = l9;
                        ((b) zzu.zzB()).getClass();
                        zzf.b(ed0Var2, "cld_r", SystemClock.elapsedRealtime() - l10.longValue());
                    }
                }, muVar);
            }
            String str3 = "ConfigLoader.maybeFetchNewAppSettings";
            if (((Boolean) zzba.zzc().a(eg.T6)).booleanValue()) {
                tc1.u0(r11VarQ0, new pu(str3), muVar);
            } else {
                f.Z(r11VarQ0, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error requesting application settings", e10);
            bt0VarD.e(e10);
            bt0VarD.x(false);
            gt0Var.b(bt0VarD.zzm());
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, gt0 gt0Var, ed0 ed0Var, Long l9) {
        a(context, versionInfoParcel, true, null, str, null, runnable, gt0Var, ed0Var, l9);
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, cu cuVar, gt0 gt0Var) {
        a(context, versionInfoParcel, false, cuVar, cuVar != null ? cuVar.f3443d : null, str, null, gt0Var, null, null);
    }
}
