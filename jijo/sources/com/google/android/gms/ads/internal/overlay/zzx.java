package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.bx0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.ek0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.ks0;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.ou;
import com.google.android.gms.internal.ads.qw0;
import com.google.android.gms.internal.ads.sw0;
import com.google.android.gms.internal.ads.tw0;
import com.google.android.gms.internal.ads.uw0;
import com.google.android.gms.internal.ads.ww0;
import com.google.android.gms.internal.ads.xw0;
import com.google.android.gms.internal.ads.zw0;
import java.util.HashMap;
import java.util.Map;
import k.q;
import l0.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzx {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f2092f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fx f2089c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2091e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2087a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ks0 f2090d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2088b = null;

    public final void a(final String str, final HashMap map) {
        nu.f7387e.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzv
            @Override // java.lang.Runnable
            public final void run() {
                zzx zzxVar = this.zza;
                String str2 = str;
                Map map2 = map;
                fx fxVar = zzxVar.f2089c;
                if (fxVar != null) {
                    fxVar.j(str2, map2);
                }
            }
        });
    }

    public final void b(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.f2089c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            a("onError", map);
        }
    }

    public final uw0 c() {
        String str;
        String str2 = null;
        if (!((Boolean) zzba.zzc().a(eg.Ca)).booleanValue() || TextUtils.isEmpty(this.f2088b)) {
            String str3 = this.f2087a;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                b("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = this.f2088b;
        }
        return new uw0(str2, str);
    }

    public final synchronized void zza(fx fxVar, Context context) {
        this.f2089c = fxVar;
        if (!zzk(context)) {
            b("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        a("on_play_store_bind", map);
    }

    public final void zzb() {
        ks0 ks0Var;
        if (!this.f2091e || (ks0Var = this.f2090d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        uw0 uw0VarC = c();
        q qVar = this.f2092f;
        ww0 ww0Var = (ww0) ks0Var.f6384a;
        ek0 ek0Var = ww0Var.f10366a;
        if (ek0Var == null) {
            ww0.f10364c.b("error: %s", "Play Store not found.");
        } else {
            ek0Var.c(new zw0(ek0Var, new iw(ww0Var, uw0VarC, 2, qVar), 1));
        }
        a("onLMDOverlayCollapse", new HashMap());
    }

    public final void zzc() {
        ks0 ks0Var;
        String str;
        if (!this.f2091e || (ks0Var = this.f2090d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        String str2 = null;
        if (!((Boolean) zzba.zzc().a(eg.Ca)).booleanValue() || TextUtils.isEmpty(this.f2088b)) {
            String str3 = this.f2087a;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                b("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = this.f2088b;
        }
        qw0 qw0Var = new qw0(str2, str);
        q qVar = this.f2092f;
        ww0 ww0Var = (ww0) ks0Var.f6384a;
        ek0 ek0Var = ww0Var.f10366a;
        if (ek0Var == null) {
            ww0.f10364c.b("error: %s", "Play Store not found.");
        } else {
            ek0Var.c(new zw0(ek0Var, new a(ww0Var, qw0Var, qVar, 20, 0), 1));
        }
    }

    public final void zzg() {
        ks0 ks0Var;
        if (!this.f2091e || (ks0Var = this.f2090d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        uw0 uw0VarC = c();
        q qVar = this.f2092f;
        ww0 ww0Var = (ww0) ks0Var.f6384a;
        ek0 ek0Var = ww0Var.f10366a;
        int i10 = 1;
        if (ek0Var == null) {
            ww0.f10364c.b("error: %s", "Play Store not found.");
        } else {
            ek0Var.c(new zw0(ek0Var, new iw(ww0Var, uw0VarC, i10, qVar), 1));
        }
        a("onLMDOverlayExpand", new HashMap());
    }

    public final void zzj(fx fxVar, xw0 xw0Var) {
        if (fxVar == null) {
            b("adWebview missing", "onLMDShow");
            return;
        }
        this.f2089c = fxVar;
        if (!this.f2091e && !zzk(fxVar.getContext())) {
            b("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().a(eg.Ca)).booleanValue()) {
            this.f2088b = ((sw0) xw0Var).f8985b;
        }
        if (this.f2092f == null) {
            this.f2092f = new q(18, this);
        }
        ks0 ks0Var = this.f2090d;
        if (ks0Var != null) {
            q qVar = this.f2092f;
            ww0 ww0Var = (ww0) ks0Var.f6384a;
            ou ouVar = ww0.f10364c;
            ek0 ek0Var = ww0Var.f10366a;
            if (ek0Var == null) {
                ouVar.b("error: %s", "Play Store not found.");
            } else if (((sw0) xw0Var).f8985b != null) {
                ek0Var.c(new zw0(ek0Var, new a(ww0Var, xw0Var, qVar, 19, 0), 1));
            } else {
                ouVar.b("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
                qVar.B(new tw0(8160, null));
            }
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!bx0.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f2090d = new ks0(new ww0(context));
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzu.zzo().i("LastMileDeliveryOverlay.bindLastMileDeliveryService", e10);
        }
        if (this.f2090d == null) {
            this.f2091e = false;
            return false;
        }
        if (this.f2092f == null) {
            this.f2092f = new q(18, this);
        }
        this.f2091e = true;
        return true;
    }
}
