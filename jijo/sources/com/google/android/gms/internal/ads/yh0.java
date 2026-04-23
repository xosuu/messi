package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f10885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fr0 f10886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx f10887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cu0 f10888e;

    public yh0(Context context, VersionInfoParcel versionInfoParcel, fr0 fr0Var, fx fxVar) {
        this.f10884a = context;
        this.f10885b = versionInfoParcel;
        this.f10886c = fr0Var;
        this.f10887d = fxVar;
    }

    public final synchronized void a() {
        fx fxVar;
        if (this.f10888e == null || (fxVar = this.f10887d) == null) {
            return;
        }
        fxVar.j("onSdkImpression", b01.f2859s);
    }

    public final synchronized void b() {
        fx fxVar;
        try {
            cu0 cu0Var = this.f10888e;
            if (cu0Var == null || (fxVar = this.f10887d) == null) {
                return;
            }
            for (View view : fxVar.o0()) {
                ((k70) zzu.zzA()).getClass();
                k70.m(new vh0(cu0Var, 1, view));
            }
            this.f10887d.j("onSdkLoaded", b01.f2859s);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean c() {
        if (this.f10886c.T) {
            if (((Boolean) zzba.zzc().a(eg.f4194z4)).booleanValue()) {
                if (((Boolean) zzba.zzc().a(eg.C4)).booleanValue() && this.f10887d != null) {
                    if (this.f10888e != null) {
                        zzm.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!((k70) zzu.zzA()).f(this.f10884a)) {
                        zzm.zzj("Unable to initialize omid.");
                        return false;
                    }
                    aa aaVar = this.f10886c.V;
                    aaVar.getClass();
                    if (((JSONObject) aaVar.f2626b).optBoolean((String) zzba.zzc().a(eg.D4), true)) {
                        VersionInfoParcel versionInfoParcel = this.f10885b;
                        fx fxVar = this.f10887d;
                        xh0 xh0VarZzA = zzu.zzA();
                        WebView webViewQ = fxVar.q();
                        ((k70) xh0VarZzA).getClass();
                        cu0 cu0Var = (cu0) k70.l(new m20(versionInfoParcel, webViewQ));
                        if (cu0Var == null) {
                            zzm.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        zzm.zzi("Created omid javascript session service.");
                        this.f10888e = cu0Var;
                        this.f10887d.y(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
