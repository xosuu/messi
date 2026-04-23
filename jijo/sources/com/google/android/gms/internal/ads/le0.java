package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class le0 implements ve0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me0 f6578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final we0 f6579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de0 f6580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ie0 f6581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n6 f6582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final te0 f6583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ot f6584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ot f6585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f6587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6588k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public JSONObject f6593p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6597t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6598u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f6589l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f6590m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f6591n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f6592o = "{}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6594q = Long.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public je0 f6595r = je0.f5919a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ke0 f6599v = ke0.f6263a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f6600w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f6601x = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public le0(me0 me0Var, we0 we0Var, de0 de0Var, Context context, VersionInfoParcel versionInfoParcel, ie0 ie0Var, te0 te0Var, ot otVar, ot otVar2, String str) {
        this.f6578a = me0Var;
        this.f6579b = we0Var;
        this.f6580c = de0Var;
        this.f6582e = new n6(context);
        this.f6586i = versionInfoParcel.afmaVersion;
        this.f6588k = str;
        this.f6581d = ie0Var;
        this.f6583f = te0Var;
        this.f6584g = otVar;
        this.f6585h = otVar2;
        this.f6587j = context;
        zzu.zzs().zzg(this);
    }

    public final synchronized qu a(String str) {
        qu quVar;
        try {
            quVar = new qu();
            if (this.f6590m.containsKey(str)) {
                quVar.b((fe0) this.f6590m.get(str));
            } else {
                if (!this.f6591n.containsKey(str)) {
                    this.f6591n.put(str, new ArrayList());
                }
                ((List) this.f6591n.get(str)).add(quVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return quVar;
    }

    public final synchronized void b(String str, fe0 fe0Var) {
        if (((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue() && f()) {
            if (this.f6597t >= ((Integer) zzba.zzc().a(eg.f3964c8)).intValue()) {
                zzm.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f6589l.containsKey(str)) {
                this.f6589l.put(str, new ArrayList());
            }
            this.f6597t++;
            ((List) this.f6589l.get(str)).add(fe0Var);
            if (((Boolean) zzba.zzc().a(eg.y8)).booleanValue()) {
                String str2 = fe0Var.f4494d;
                this.f6590m.put(str2, fe0Var);
                if (this.f6591n.containsKey(str2)) {
                    List list = (List) this.f6591n.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((qu) it.next()).b(fe0Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void c() {
        if (((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.f4102p8)).booleanValue() && zzu.zzo().d().zzR()) {
                i();
                return;
            }
            String strZzn = zzu.zzo().d().zzn();
            if (TextUtils.isEmpty(strZzn)) {
                return;
            }
            try {
                if (new JSONObject(strZzn).optBoolean("isTestMode", false)) {
                    i();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void d(zzda zzdaVar, ke0 ke0Var) {
        if (!f()) {
            try {
                zzdaVar.zze(en1.u0(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzm.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue()) {
            this.f6599v = ke0Var;
            this.f6578a.a(zzdaVar, new xk(this, 1), new ok(3, this.f6583f), new xk(this, 0));
            return;
        } else {
            try {
                zzdaVar.zze(en1.u0(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzm.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final void e(boolean z9) {
        if (!this.f6598u && z9) {
            i();
        }
        l(z9, true);
    }

    public final synchronized boolean f() {
        if (((Boolean) zzba.zzc().a(eg.f4102p8)).booleanValue()) {
            return this.f6596s || zzu.zzs().zzl();
        }
        return this.f6596s;
    }

    public final synchronized boolean g() {
        return this.f6596s;
    }

    public final synchronized JSONObject h() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f6589l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (fe0 fe0Var : (List) entry.getValue()) {
                    if (fe0Var.f4496h != ee0.f3913a) {
                        jSONArray.put(fe0Var.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void i() {
        this.f6598u = true;
        ie0 ie0Var = this.f6581d;
        ie0Var.getClass();
        j3.s sVar = new j3.s(ie0Var);
        be0 be0Var = ie0Var.f5579a;
        be0Var.getClass();
        be0Var.f3001e.a(new vm(be0Var, 27, sVar), be0Var.f3006j);
        this.f6578a.f6923d = this;
        this.f6579b.f10164f = this;
        this.f6580c.f3630i = this;
        this.f6583f.f9147q = this;
        xf xfVar = eg.D8;
        if (!TextUtils.isEmpty((CharSequence) zzba.zzc().a(xfVar))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f6587j);
            List listAsList = Arrays.asList(((String) zzba.zzc().a(xfVar)).split(","));
            ot otVar = this.f6584g;
            otVar.f7669c = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(otVar);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                otVar.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        xf xfVar2 = eg.E8;
        if (!TextUtils.isEmpty((CharSequence) zzba.zzc().a(xfVar2))) {
            SharedPreferences sharedPreferences = this.f6587j.getSharedPreferences("admob", 0);
            List listAsList2 = Arrays.asList(((String) zzba.zzc().a(xfVar2)).split(","));
            ot otVar2 = this.f6585h;
            otVar2.f7669c = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(otVar2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                otVar2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String strZzn = zzu.zzo().d().zzn();
        synchronized (this) {
            if (!TextUtils.isEmpty(strZzn)) {
                try {
                    JSONObject jSONObject = new JSONObject(strZzn);
                    l(jSONObject.optBoolean("isTestMode", false), false);
                    k((je0) Enum.valueOf(je0.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f6592o = jSONObject.optString("networkExtras", "{}");
                    this.f6594q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        this.f6601x = zzu.zzo().d().zzo();
    }

    public final void j() {
        String string;
        zzj zzjVarD = zzu.zzo().d();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.f6596s);
                jSONObject.put("gesture", this.f6595r);
                long j10 = this.f6594q;
                ((y3.b) zzu.zzB()).getClass();
                if (j10 > System.currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.f6592o);
                    jSONObject.put("networkExtrasExpirationSecs", this.f6594q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        zzjVarD.zzG(string);
    }

    public final synchronized void k(je0 je0Var, boolean z9) {
        try {
            if (this.f6595r != je0Var) {
                if (f()) {
                    m();
                }
                this.f6595r = je0Var;
                if (f()) {
                    n();
                }
                if (z9) {
                    j();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void l(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f6596s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f6596s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.xf r2 = com.google.android.gms.internal.ads.eg.f4102p8     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.cg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzu.zzs()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.n()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.f()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.m()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.j()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.le0.l(boolean, boolean):void");
    }

    public final synchronized void m() {
        int iOrdinal = this.f6595r.ordinal();
        if (iOrdinal == 1) {
            this.f6579b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f6580c.b();
        }
    }

    public final synchronized void n() {
        int iOrdinal = this.f6595r.ordinal();
        if (iOrdinal == 1) {
            this.f6579b.c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f6580c.c();
        }
    }
}
