package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w80 implements q90 {
    public com.google.android.gms.ads.internal.client.zzcs C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r90 f10085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f10086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tb0 f10087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n90 f10088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y9 f10089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v40 f10090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j40 f10091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p70 f10092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fr0 f10093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final VersionInfoParcel f10094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final or0 f10095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y00 f10096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z90 f10097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y3.a f10098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o70 f10099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vt0 f10100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nc0 f10101r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ft0 f10102s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qh0 f10103t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10105v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10104u = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10106w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10107x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Point f10108y = new Point();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Point f10109z = new Point();
    public long A = 0;
    public long B = 0;

    public w80(Context context, r90 r90Var, JSONObject jSONObject, tb0 tb0Var, n90 n90Var, y9 y9Var, v40 v40Var, j40 j40Var, p70 p70Var, fr0 fr0Var, VersionInfoParcel versionInfoParcel, or0 or0Var, y00 y00Var, z90 z90Var, y3.a aVar, o70 o70Var, vt0 vt0Var, ft0 ft0Var, qh0 qh0Var, nc0 nc0Var) {
        this.f10084a = context;
        this.f10085b = r90Var;
        this.f10086c = jSONObject;
        this.f10087d = tb0Var;
        this.f10088e = n90Var;
        this.f10089f = y9Var;
        this.f10090g = v40Var;
        this.f10091h = j40Var;
        this.f10092i = p70Var;
        this.f10093j = fr0Var;
        this.f10094k = versionInfoParcel;
        this.f10095l = or0Var;
        this.f10096m = y00Var;
        this.f10097n = z90Var;
        this.f10098o = aVar;
        this.f10099p = o70Var;
        this.f10100q = vt0Var;
        this.f10102s = ft0Var;
        this.f10103t = qh0Var;
        this.f10101r = nc0Var;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void a(Bundle bundle) {
        if (bundle == null) {
            zzm.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!s("touch_reporting")) {
            zzm.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f10089f.f10801b.zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final JSONObject b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10084a;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = zzbv.zzg(context, view);
        JSONObject jSONObjectZzf = zzbv.zzf(view);
        JSONObject jSONObjectZze = zzbv.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e10) {
            zzm.zzh("Unable to create native ad view signals JSON.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void c(dk dkVar) {
        if (!this.f10086c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzm.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        z90 z90Var = this.f10097n;
        z90Var.f11190d = dkVar;
        tk tkVar = z90Var.f11191f;
        tb0 tb0Var = z90Var.f11188a;
        if (tkVar != null) {
            tb0Var.d("/unconfirmedClick", tkVar);
        }
        tk tkVar2 = new tk(z90Var, 3, dkVar);
        z90Var.f11191f = tkVar2;
        tb0Var.c("/unconfirmedClick", tkVar2);
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void d(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.C = zzcsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.ads.q90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.view.View r17, android.view.View r18, java.util.Map r19, java.util.Map r20, boolean r21, android.widget.ImageView.ScaleType r22, int r23) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w80.e(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean, android.widget.ImageView$ScaleType, int):void");
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void f(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10084a;
        t(zzbv.zzg(context, view), zzbv.zzd(context, map, map2, view, scaleType), zzbv.zzf(view), zzbv.zze(context, view), q(view), null, zzbv.zzh(context, this.f10093j));
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final boolean g(Bundle bundle) {
        if (s("impression_reporting")) {
            return t(null, null, null, null, ((Boolean) zzba.zzc().a(eg.Aa)).booleanValue() ? q(null) : null, zzay.zzb().zzk(bundle, null), false);
        }
        zzm.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void h(View view) {
        if (!this.f10086c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzm.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            z90 z90Var = this.f10097n;
            view.setOnClickListener(z90Var);
            view.setClickable(true);
            z90Var.f11194s = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void i(MotionEvent motionEvent, View view) {
        this.f10108y = zzbv.zza(motionEvent, view);
        ((y3.b) this.f10098o).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.B = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f10101r.f7243a = motionEvent;
            this.A = jCurrentTimeMillis;
            this.f10109z = this.f10108y;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f10108y;
        motionEventObtain.setLocation(point.x, point.y);
        this.f10089f.f10801b.zzk(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void j(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f10108y = new Point();
        this.f10109z = new Point();
        if (!this.f10105v) {
            this.f10099p.J0(view);
            this.f10105v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        y00 y00Var = this.f10096m;
        y00Var.getClass();
        y00Var.f10701v = new WeakReference(this);
        boolean zZzi = zzbv.zzi(this.f10094k.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void k(View view) {
        this.f10108y = new Point();
        this.f10109z = new Point();
        if (view != null) {
            o70 o70Var = this.f10099p;
            synchronized (o70Var) {
                if (o70Var.f7524b.containsKey(view)) {
                    ((xb) o70Var.f7524b.get(view)).f10529x.remove(o70Var);
                    o70Var.f7524b.remove(view);
                }
            }
        }
        this.f10105v = false;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void l(String str) {
        u(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void m(zzcw zzcwVar) {
        zzel zzelVar;
        try {
            if (this.f10106w) {
                return;
            }
            ft0 ft0Var = this.f10102s;
            vt0 vt0Var = this.f10100q;
            if (zzcwVar == null) {
                n90 n90Var = this.f10088e;
                synchronized (n90Var) {
                    zzelVar = n90Var.f7204g;
                }
                if (zzelVar != null) {
                    this.f10106w = true;
                    vt0Var.a(n90Var.H().zzf(), ft0Var);
                    zzg();
                    return;
                }
            }
            this.f10106w = true;
            vt0Var.a(zzcwVar.zzf(), ft0Var);
            zzg();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final JSONObject n(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectB = b(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f10107x && this.f10086c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectB != null) {
                jSONObject.put("nas", jSONObjectB);
            }
        } catch (JSONException e10) {
            zzm.zzh("Unable to create native click meta data JSON.", e10);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void o(View view, View view2, Map map, Map map2, boolean z9, ImageView.ScaleType scaleType) {
        Context context = this.f10084a;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = zzbv.zzg(context, view2);
        JSONObject jSONObjectZzf = zzbv.zzf(view2);
        JSONObject jSONObjectZze = zzbv.zze(context, view2);
        String strR = r(view, map);
        u(true == ((Boolean) zzba.zzc().a(eg.f4068m3)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strR, zzbv.zzc(strR, context, this.f10109z, this.f10108y), null, z9, false);
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void p(Bundle bundle) {
        if (bundle == null) {
            zzm.zze("Click data is null. No click is reported.");
        } else if (!s("click_reporting")) {
            zzm.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            u(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzay.zzb().zzk(bundle, null), false, false);
        }
    }

    public final String q(View view) {
        if (!((Boolean) zzba.zzc().a(eg.f3993f3)).booleanValue()) {
            return null;
        }
        try {
            return this.f10089f.f10801b.zzh(this.f10084a, view, null);
        } catch (Exception unused) {
            zzm.zzg("Exception getting data.");
            return null;
        }
    }

    public final String r(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iB = this.f10088e.B();
        if (iB == 1) {
            return "1099";
        }
        if (iB == 2) {
            return "2099";
        }
        if (iB != 6) {
            return null;
        }
        return "3099";
    }

    public final boolean s(String str) {
        JSONObject jSONObjectOptJSONObject = this.f10086c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    public final boolean t(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z9) {
        Context context = this.f10084a;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f10086c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzba.zzc().a(eg.f3993f3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z9);
            JSONObject jSONObject7 = new JSONObject();
            zzu.zzp();
            DisplayMetrics displayMetricsZzt = zzt.zzt((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzay.zzb().zzb(context, displayMetricsZzt.widthPixels));
                jSONObject7.put("height", zzay.zzb().zzb(context, displayMetricsZzt.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.K7)).booleanValue();
            tb0 tb0Var = this.f10087d;
            if (zBooleanValue) {
                tb0Var.c("/clickRecorded", new v80(this, 0));
            } else {
                tb0Var.c("/logScionEvent", new v80(this));
            }
            tb0Var.c("/nativeImpression", new v80(this, (Object) null));
            b4.f.Z(tb0Var.a(jSONObject6, "google.afma.nativeAds.handleImpression"), "Error during performing handleImpression");
            if (this.f10104u) {
                return true;
            }
            this.f10104u = zzu.zzs().zzn(context, this.f10094k.afmaVersion, this.f10093j.C.toString(), this.f10095l.f7646f);
            return true;
        } catch (JSONException e10) {
            zzm.zzh("Unable to create impression JSON.", e10);
            return false;
        }
    }

    public final void u(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z9, boolean z10) {
        List list;
        String strZze;
        y3.a aVar = this.f10098o;
        r90 r90Var = this.f10085b;
        JSONObject jSONObject7 = this.f10086c;
        n90 n90Var = this.f10088e;
        try {
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            jSONObject8.put("has_custom_click_handler", ((oj) r90Var.f8543g.getOrDefault(n90Var.a(), null)) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", n90Var.B());
            jSONObject9.put("view_aware_api_used", z9);
            zzbes zzbesVar = this.f10095l.f7649i;
            jSONObject9.put("custom_mute_requested", zzbesVar != null && zzbesVar.f11482s);
            synchronized (n90Var) {
                list = n90Var.f7203f;
            }
            jSONObject9.put("custom_mute_enabled", (list.isEmpty() || n90Var.H() == null) ? false : true);
            if (this.f10097n.f11190d != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            ((y3.b) aVar).getClass();
            jSONObject9.put("timestamp", System.currentTimeMillis());
            if (this.f10107x && this.f10086c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z10) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((oj) r90Var.f8543g.getOrDefault(n90Var.a(), null)) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZze = this.f10089f.f10801b.zze(this.f10084a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                zzm.zzh("Exception obtaining click signals", e10);
                strZze = null;
            }
            jSONObject9.put("click_signals", strZze);
            if (((Boolean) zzba.zzc().a(eg.f3983e4)).booleanValue()) {
                jSONObject9.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzba.zzc().a(eg.O7)).booleanValue() && z3.a.L()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzba.zzc().a(eg.P7)).booleanValue() && z3.a.L()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            ((y3.b) aVar).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.A);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.B);
            jSONObject8.put("touch_signal", jSONObject10);
            if (this.f10093j.f4617i0) {
                JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.f10103t.v1(string, n90Var);
                }
            }
            b4.f.Z(this.f10087d.a(jSONObject8, "google.afma.nativeAds.handleClick"), "Error during performing handleClick");
        } catch (JSONException e11) {
            zzm.zzh("Unable to create click JSON.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) zzba.zzc().a(eg.Ea)).booleanValue()) {
            return this.f10095l.f7649i.f11485v;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final boolean zzB() {
        return this.f10086c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final int zza() {
        or0 or0Var = this.f10095l;
        if (or0Var.f7649i == null) {
            return 0;
        }
        if (((Boolean) zzba.zzc().a(eg.Ea)).booleanValue()) {
            return or0Var.f7649i.f11484u;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzg() {
        try {
            com.google.android.gms.ads.internal.client.zzcs zzcsVar = this.C;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzh() {
        View view;
        if (this.f10086c.optBoolean("custom_one_point_five_click_enabled", false)) {
            z90 z90Var = this.f10097n;
            if (z90Var.f11190d == null || z90Var.f11193q == null) {
                return;
            }
            z90Var.f11192h = null;
            z90Var.f11193q = null;
            WeakReference weakReference = z90Var.f11194s;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                z90Var.f11194s = null;
            }
            try {
                z90Var.f11190d.zze();
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzi() {
        tb0 tb0Var = this.f10087d;
        synchronized (tb0Var) {
            s11 s11Var = tb0Var.f9108m;
            if (s11Var != null) {
                tc1.u0(s11Var, new k70(), tb0Var.f9100e);
                tb0Var.f9108m = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f10086c);
            b4.f.Z(this.f10087d.a(jSONObject, "google.afma.nativeAds.handleDownloadedImpression"), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzr() {
        t(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzv() {
        this.f10107x = true;
    }
}
