package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cl implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzb f3323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ed0 f3324b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kp f3326f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lh0 f3327h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n00 f3328q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.google.android.gms.ads.internal.overlay.zzy f3329s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mu f3330t = nu.f7388f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzr f3325d = new zzr(null);

    public cl(zzb zzbVar, kp kpVar, lh0 lh0Var, ed0 ed0Var, n00 n00Var) {
        this.f3323a = zzbVar;
        this.f3326f = kpVar;
        this.f3327h = lh0Var;
        this.f3324b = ed0Var;
        this.f3328q = n00Var;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri c(Context context, y9 y9Var, Uri uri, View view, Activity activity, pr0 pr0Var) {
        if (y9Var == null) {
            return uri;
        }
        try {
            if (!((Boolean) zzba.zzc().a(eg.ab)).booleanValue() || pr0Var == null) {
                if (y9Var.b(uri)) {
                    uri = y9Var.a(uri, context, view, activity);
                }
            } else if (y9Var.b(uri)) {
                uri = pr0Var.a(uri, context, view, activity);
            }
        } catch (zzaup unused) {
        } catch (Exception e10) {
            zzu.zzo().i("OpenGmsgHandler.maybeAddClickSignalsToUri", e10);
        }
        return uri;
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            zzm.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e10);
        }
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.wk
    public final /* bridge */ /* synthetic */ void b(Object obj, Map map) {
        n00 n00Var;
        zza zzaVar = (zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        fx fxVar = (fx) zzaVar;
        if (fxVar.i() != null) {
            map2 = fxVar.i().f4645w0;
        }
        String strN = t3.i.N(str, fxVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzm.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzbVar = this.f3323a;
        if (zzbVar == null || zzbVar.zzc()) {
            tc1.u0((((Boolean) zzba.zzc().a(eg.f4010g9)).booleanValue() && (n00Var = this.f3328q) != null && n00.b(strN)) ? n00Var.a(strN, zzay.zze()) : tc1.d0(strN), new xq(this, map, zzaVar, str2), this.f3330t);
        } else {
            zzbVar.zzb(strN);
        }
    }

    public final void e(Context context, String str, String str2) {
        this.f3327h.a(str);
        ed0 ed0Var = this.f3324b;
        if (ed0Var != null) {
            lh0 lh0Var = this.f3327h;
            tp1.c0("dialog_not_shown_reason", str2);
            qh0.u1(context, ed0Var, lh0Var, str, "dialog_not_shown", b01.c(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0152, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.google.android.gms.ads.internal.client.zza r17, java.util.Map r18, boolean r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cl.f(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    public final void g(boolean z9) {
        kp kpVar = this.f3326f;
        if (kpVar != null) {
            kpVar.l(z9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.eg.E7)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.eg.D7)).booleanValue()) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cl.h(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void i(int i10) {
        String str;
        ed0 ed0Var = this.f3324b;
        if (ed0Var == null) {
            return;
        }
        m20 m20VarA = ed0Var.a();
        m20VarA.f("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            default:
                str = "WRONG_EXP_SETUP";
                break;
        }
        m20VarA.f("cct_open_status", str);
        m20VarA.h();
    }
}
