package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k70 implements s60, k21, OnUserEarnedRewardListener, rs0, cn, dn, wh0, xh0, q20, j80, fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6205a;

    public k70() {
        this.f6205a = 10;
    }

    public static final Set c(nd0 nd0Var, mu muVar) {
        return ((Boolean) nh.f7263a.k()).booleanValue() ? Collections.singleton(new n70(nd0Var, muVar)) : Collections.emptySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zt0 g(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zt0 r4 = com.google.android.gms.internal.ads.zt0.f11323h
            return r4
        L40:
            com.google.android.gms.internal.ads.zt0 r4 = com.google.android.gms.internal.ads.zt0.f11322f
            return r4
        L43:
            com.google.android.gms.internal.ads.zt0 r4 = com.google.android.gms.internal.ads.zt0.f11321d
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k70.g(java.lang.String):com.google.android.gms.internal.ads.zt0");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.bu0 j(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.bu0 r4 = com.google.android.gms.internal.ads.bu0.f3115d
            return r4
        L3e:
            com.google.android.gms.internal.ads.bu0 r4 = com.google.android.gms.internal.ads.bu0.f3117h
            return r4
        L41:
            com.google.android.gms.internal.ads.bu0 r4 = com.google.android.gms.internal.ads.bu0.f3114b
            return r4
        L44:
            com.google.android.gms.internal.ads.bu0 r4 = com.google.android.gms.internal.ads.bu0.f3116f
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k70.j(java.lang.String):com.google.android.gms.internal.ads.bu0");
    }

    public static du0 k(String str) {
        return "native".equals(str) ? du0.f3748b : "javascript".equals(str) ? du0.f3749d : du0.f3750f;
    }

    public static final Object l(wh0 wh0Var) {
        try {
            return wh0Var.zza();
        } catch (RuntimeException e10) {
            zzu.zzo().h("omid exception", e10);
            return null;
        }
    }

    public static final void m(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            zzu.zzo().h("omid exception", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final JSONObject a(Object obj) throws JSONException {
        rg0 rg0Var = (rg0) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzba.zzc().a(eg.f4141t8)).booleanValue()) {
            jSONObject2.put("ad_request_url", rg0Var.f8593c.f9264f);
            jSONObject2.put("ad_request_post_body", rg0Var.f8593c.f9261c);
        }
        jSONObject2.put("base_url", rg0Var.f8593c.f9260b);
        jSONObject2.put("signals", rg0Var.f8592b);
        vg0 vg0Var = rg0Var.f8591a;
        jSONObject3.put("body", vg0Var.f9842c);
        jSONObject3.put("headers", zzay.zzb().zzj(vg0Var.f9841b));
        jSONObject3.put("response_code", vg0Var.f9840a);
        jSONObject3.put("latency", vg0Var.f9843d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", rg0Var.f8593c.f9266h);
        return jSONObject;
    }

    public final zh0 b(String str, WebView webView, String str2, int i10, int i11, String str3) {
        if (((Boolean) zzba.zzc().a(eg.f4194z4)).booleanValue() && tp1.f9254v.f1584b) {
            return (zh0) l(new th0(str, i11, str2, webView, str3, i10));
        }
        return null;
    }

    public final void d(yt0 yt0Var, View view) {
        m(new sh0(yt0Var, view, 1));
    }

    public final void e(yt0 yt0Var) {
        if (((Boolean) zzba.zzc().a(eg.f4194z4)).booleanValue() && tp1.f9254v.f1584b) {
            Objects.requireNonNull(yt0Var);
            m(new uh0(yt0Var, 0));
        }
    }

    public final boolean f(Context context) {
        if (((Boolean) zzba.zzc().a(eg.f4194z4)).booleanValue()) {
            Boolean bool = (Boolean) l(new y40(context));
            return bool != null && bool.booleanValue();
        }
        zzm.zzj("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void h(boolean z9, Context context, s40 s40Var) {
    }

    @Override // com.google.android.gms.internal.ads.cn
    public final Object i(JSONObject jSONObject) {
        switch (this.f6205a) {
        }
        return new tr(jSONObject);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
    }

    @Override // com.google.android.gms.internal.ads.wh0, com.google.android.gms.internal.ads.q20
    public final com.google.android.gms.ads.internal.client.zzdq zza() {
        return null;
    }

    public /* synthetic */ k70(int i10) {
        this.f6205a = i10;
    }

    @Override // com.google.android.gms.internal.ads.wh0, com.google.android.gms.internal.ads.q20
    public final Object zza() {
        return "a.1.4.10-google_20240110";
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final Object zza(Object obj) {
        switch (this.f6205a) {
            case 15:
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            case 16:
            default:
                JSONObject jSONObject = (JSONObject) obj;
                zze.zza("GMS AdRequest Signals: ");
                zze.zza(jSONObject.toString(2));
                return jSONObject;
            case 17:
                JSONObject jSONObject2 = (JSONObject) obj;
                zze.zza("Ad request signals:");
                zze.zza(jSONObject2.toString(2));
                return jSONObject2;
        }
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final void mo5zza(Object obj) {
        switch (this.f6205a) {
            case 0:
                ((m70) obj).zzt();
                break;
            case 1:
                ((q70) obj).V();
                break;
            case 2:
                ((q70) obj).L();
                break;
            case 3:
                s70 s70Var = (s70) obj;
                if (!s70Var.f8818c) {
                    s70Var.f8817b.b(s70Var.f8816a);
                    s70Var.f8818c = true;
                }
                break;
            case 4:
                ((fl) obj).zzc();
                break;
            case 5:
                ((fl) obj).zzb();
                break;
            case 6:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
                break;
            case 7:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
                break;
            case 8:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                break;
            case 9:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                break;
            case 26:
                ((zzbh) obj).zzg();
                break;
            case 27:
                ((zzbh) obj).zzd();
                break;
            case 28:
                ((zzci) obj).zzc();
                break;
            default:
                ((zzci) obj).zzb();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final /* synthetic */ void mo4a(Object obj) {
        ((fx) obj).destroy();
    }
}
