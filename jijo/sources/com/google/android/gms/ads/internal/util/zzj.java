package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.ch;
import com.google.android.gms.internal.ads.cu;
import com.google.android.gms.internal.ads.dh;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.nu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n5.a;
import org.json.JSONException;
import org.json.JSONObject;
import y3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzj implements zzg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2180b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f2182d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f2184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f2185g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2188j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2179a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2181c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fc f2183e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2186h = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2189k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2190l = "-1";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2191m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public cu f2192n = new cu(0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2193o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2194p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2195q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2196r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Set f2197s = Collections.emptySet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JSONObject f2198t = new JSONObject();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2199u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2200v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f2201w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f2202x = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2203y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f2204z = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String A = "{}";
    public int B = -1;
    public int C = -1;
    public long D = 0;

    public final void a() {
        a aVar = this.f2182d;
        if (aVar == null || aVar.isDone()) {
            return;
        }
        try {
            this.f2182d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void b() {
        nu.f7383a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(boolean z9) {
        a();
        synchronized (this.f2179a) {
            try {
                if (this.f2200v == z9) {
                    return;
                }
                this.f2200v = z9;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z9);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4102p8)).booleanValue()) {
            a();
            synchronized (this.f2179a) {
                try {
                    if (this.f2204z.equals(str)) {
                        return;
                    }
                    this.f2204z = str;
                    SharedPreferences.Editor editor = this.f2185g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f2185g.apply();
                    }
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(boolean z9) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4102p8)).booleanValue()) {
            a();
            synchronized (this.f2179a) {
                try {
                    if (this.f2203y == z9) {
                        return;
                    }
                    this.f2203y = z9;
                    SharedPreferences.Editor editor = this.f2185g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z9);
                        this.f2185g.apply();
                    }
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(String str) {
        a();
        synchronized (this.f2179a) {
            try {
                if (TextUtils.equals(this.f2201w, str)) {
                    return;
                }
                this.f2201w = str;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(long j10) {
        a();
        synchronized (this.f2179a) {
            try {
                if (this.f2194p == j10) {
                    return;
                }
                this.f2194p = j10;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(int i10) {
        a();
        synchronized (this.f2179a) {
            try {
                this.f2191m = i10;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    if (i10 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i10);
                    }
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f3942a8)).booleanValue()) {
            a();
            synchronized (this.f2179a) {
                try {
                    if (this.f2202x.equals(str)) {
                        return;
                    }
                    this.f2202x = str;
                    SharedPreferences.Editor editor = this.f2185g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f2185g.apply();
                    }
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.C8)).booleanValue()) {
            a();
            synchronized (this.f2179a) {
                try {
                    if (this.A.equals(str)) {
                        return;
                    }
                    this.A = str;
                    SharedPreferences.Editor editor = this.f2185g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f2185g.apply();
                    }
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(boolean z9) {
        a();
        synchronized (this.f2179a) {
            try {
                if (z9 == this.f2189k) {
                    return;
                }
                this.f2189k = z9;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z9);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(boolean z9) {
        a();
        synchronized (this.f2179a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.C9)).longValue();
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z9);
                    this.f2185g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        ((y3.b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        r3.put("timestamp_ms", java.lang.System.currentTimeMillis());
        r1.put(r2, r3);
        r7.f2198t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not update native advanced settings", r8);
     */
    @Override // com.google.android.gms.ads.internal.util.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzK(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r7.a()
            java.lang.Object r0 = r7.f2179a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f2198t     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L91
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = 0
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            java.lang.String r9 = "timestamp_ms"
            y3.a r10 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            y3.b r10 = (y3.b) r10     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            r10.getClass()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            org.json.JSONObject r9 = r7.f2198t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L72
            goto L78
        L72:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r9, r8)     // Catch: java.lang.Throwable -> L14
        L78:
            android.content.SharedPreferences$Editor r8 = r7.f2185g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L8c
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f2198t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.f2185g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L8c:
            r7.b()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L91:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzK(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(int i10) {
        a();
        synchronized (this.f2179a) {
            try {
                if (this.f2195q == i10) {
                    return;
                }
                this.f2195q = i10;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i10);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzM(int i10) {
        a();
        synchronized (this.f2179a) {
            try {
                if (this.C == i10) {
                    return;
                }
                this.C = i10;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i10);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzN(long j10) {
        a();
        synchronized (this.f2179a) {
            try {
                if (this.D == j10) {
                    return;
                }
                this.D = j10;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzO(String str) {
        a();
        synchronized (this.f2179a) {
            try {
                this.f2190l = str;
                if (this.f2185g != null) {
                    if (str.equals("-1")) {
                        this.f2185g.remove("IABTCF_TCString");
                    } else {
                        this.f2185g.putString("IABTCF_TCString", str);
                    }
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z9;
        a();
        synchronized (this.f2179a) {
            z9 = this.f2199u;
        }
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzQ() {
        boolean z9;
        a();
        synchronized (this.f2179a) {
            z9 = this.f2200v;
        }
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzR() {
        boolean z9;
        a();
        synchronized (this.f2179a) {
            z9 = this.f2203y;
        }
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzS() {
        boolean z9;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4085o0)).booleanValue()) {
            return false;
        }
        a();
        synchronized (this.f2179a) {
            z9 = this.f2189k;
        }
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzT() {
        a();
        synchronized (this.f2179a) {
            try {
                SharedPreferences sharedPreferences = this.f2184f;
                boolean z9 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f2184f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f2189k) {
                    z9 = true;
                }
                return z9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i10;
        a();
        synchronized (this.f2179a) {
            i10 = this.f2196r;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        a();
        return this.f2191m;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i10;
        a();
        synchronized (this.f2179a) {
            i10 = this.f2195q;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j10;
        a();
        synchronized (this.f2179a) {
            j10 = this.f2193o;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j10;
        a();
        synchronized (this.f2179a) {
            j10 = this.f2194p;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j10;
        a();
        synchronized (this.f2179a) {
            j10 = this.D;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final fc zzg() {
        if (!this.f2180b) {
            return null;
        }
        if ((zzP() && zzQ()) || !((Boolean) ch.f3272b.k()).booleanValue()) {
            return null;
        }
        synchronized (this.f2179a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f2183e == null) {
                    this.f2183e = new fc();
                }
                this.f2183e.c();
                com.google.android.gms.ads.internal.util.client.zzm.zzi("start fetching content...");
                return this.f2183e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final cu zzh() {
        cu cuVar;
        a();
        synchronized (this.f2179a) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.Na)).booleanValue() && this.f2192n.a()) {
                    Iterator it = this.f2181c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                cuVar = this.f2192n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cuVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final cu zzi() {
        cu cuVar;
        synchronized (this.f2179a) {
            cuVar = this.f2192n;
        }
        return cuVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        a();
        synchronized (this.f2179a) {
            str = this.f2187i;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        a();
        synchronized (this.f2179a) {
            str = this.f2188j;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        a();
        synchronized (this.f2179a) {
            str = this.f2204z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        a();
        synchronized (this.f2179a) {
            str = this.f2201w;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn() {
        String str;
        a();
        synchronized (this.f2179a) {
            str = this.f2202x;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        a();
        synchronized (this.f2179a) {
            str = this.A;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzp() {
        a();
        return this.f2190l;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzq() {
        JSONObject jSONObject;
        a();
        synchronized (this.f2179a) {
            jSONObject = this.f2198t;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(Runnable runnable) {
        this.f2181c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs(final Context context) {
        synchronized (this.f2179a) {
            try {
                if (this.f2184f != null) {
                    return;
                }
                final String str = "admob";
                this.f2182d = nu.f7383a.a(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                    public final /* synthetic */ Context zzb;
                    public final /* synthetic */ String zzc = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzj zzjVar = this.zza;
                        Context context2 = this.zzb;
                        zzjVar.getClass();
                        SharedPreferences sharedPreferences = context2.getSharedPreferences("admob", 0);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        try {
                            synchronized (zzjVar.f2179a) {
                                try {
                                    zzjVar.f2184f = sharedPreferences;
                                    zzjVar.f2185g = editorEdit;
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                                    }
                                    zzjVar.f2186h = zzjVar.f2184f.getBoolean("use_https", zzjVar.f2186h);
                                    zzjVar.f2199u = zzjVar.f2184f.getBoolean("content_url_opted_out", zzjVar.f2199u);
                                    zzjVar.f2187i = zzjVar.f2184f.getString("content_url_hashes", zzjVar.f2187i);
                                    zzjVar.f2189k = zzjVar.f2184f.getBoolean("gad_idless", zzjVar.f2189k);
                                    zzjVar.f2200v = zzjVar.f2184f.getBoolean("content_vertical_opted_out", zzjVar.f2200v);
                                    zzjVar.f2188j = zzjVar.f2184f.getString("content_vertical_hashes", zzjVar.f2188j);
                                    zzjVar.f2196r = zzjVar.f2184f.getInt("version_code", zzjVar.f2196r);
                                    if (((Boolean) dh.f3655g.k()).booleanValue() && com.google.android.gms.ads.internal.client.zzba.zzc().f3269j) {
                                        zzjVar.f2192n = new cu(0L, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                    } else {
                                        zzjVar.f2192n = new cu(zzjVar.f2184f.getLong("app_settings_last_update_ms", zzjVar.f2192n.f3445f), zzjVar.f2184f.getString("app_settings_json", zzjVar.f2192n.f3444e));
                                    }
                                    zzjVar.f2193o = zzjVar.f2184f.getLong("app_last_background_time_ms", zzjVar.f2193o);
                                    zzjVar.f2195q = zzjVar.f2184f.getInt("request_in_session_count", zzjVar.f2195q);
                                    zzjVar.f2194p = zzjVar.f2184f.getLong("first_ad_req_time_ms", zzjVar.f2194p);
                                    zzjVar.f2197s = zzjVar.f2184f.getStringSet("never_pool_slots", zzjVar.f2197s);
                                    zzjVar.f2201w = zzjVar.f2184f.getString("display_cutout", zzjVar.f2201w);
                                    zzjVar.B = zzjVar.f2184f.getInt("app_measurement_npa", zzjVar.B);
                                    zzjVar.C = zzjVar.f2184f.getInt("sd_app_measure_npa", zzjVar.C);
                                    zzjVar.D = zzjVar.f2184f.getLong("sd_app_measure_npa_ts", zzjVar.D);
                                    zzjVar.f2202x = zzjVar.f2184f.getString("inspector_info", zzjVar.f2202x);
                                    zzjVar.f2203y = zzjVar.f2184f.getBoolean("linked_device", zzjVar.f2203y);
                                    zzjVar.f2204z = zzjVar.f2184f.getString("linked_ad_unit", zzjVar.f2204z);
                                    zzjVar.A = zzjVar.f2184f.getString("inspector_ui_storage", zzjVar.A);
                                    zzjVar.f2190l = zzjVar.f2184f.getString("IABTCF_TCString", zzjVar.f2190l);
                                    zzjVar.f2191m = zzjVar.f2184f.getInt("gad_has_consent_for_cookies", zzjVar.f2191m);
                                    try {
                                        zzjVar.f2198t = new JSONObject(zzjVar.f2184f.getString("native_advanced_settings", "{}"));
                                    } catch (JSONException e10) {
                                        com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not convert native advanced settings to json object", e10);
                                    }
                                    zzjVar.b();
                                } finally {
                                }
                            }
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.zzu.zzo().i("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th);
                            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
                        }
                    }
                });
                this.f2180b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt() {
        a();
        synchronized (this.f2179a) {
            try {
                this.f2198t = new JSONObject();
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(long j10) {
        a();
        synchronized (this.f2179a) {
            try {
                if (this.f2193o == j10) {
                    return;
                }
                this.f2193o = j10;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j10);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(String str) {
        a();
        synchronized (this.f2179a) {
            try {
                ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (str != null && !str.equals(this.f2192n.f3444e)) {
                    this.f2192n = new cu(jCurrentTimeMillis, str);
                    SharedPreferences.Editor editor = this.f2185g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f2185g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                        this.f2185g.apply();
                    }
                    b();
                    Iterator it = this.f2181c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f2192n.f3445f = jCurrentTimeMillis;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(int i10) {
        a();
        synchronized (this.f2179a) {
            try {
                if (this.f2196r == i10) {
                    return;
                }
                this.f2196r = i10;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putInt("version_code", i10);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(String str) {
        a();
        synchronized (this.f2179a) {
            try {
                if (str.equals(this.f2187i)) {
                    return;
                }
                this.f2187i = str;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(boolean z9) {
        a();
        synchronized (this.f2179a) {
            try {
                if (this.f2199u == z9) {
                    return;
                }
                this.f2199u = z9;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z9);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(String str) {
        a();
        synchronized (this.f2179a) {
            try {
                if (str.equals(this.f2188j)) {
                    return;
                }
                this.f2188j = str;
                SharedPreferences.Editor editor = this.f2185g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f2185g.apply();
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
