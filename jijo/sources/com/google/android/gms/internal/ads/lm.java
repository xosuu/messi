package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lm implements im, zm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx f6659a;

    public lm(Context context, VersionInfoParcel versionInfoParcel) {
        zzu.zzz();
        nx nxVarA = lx.a(context, versionInfoParcel, null, null, new b4.c(0, 0, 0, 3), null, new kd(), null, null, null, null, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false);
        this.f6659a = nxVarA;
        nxVarA.setWillNotDraw(true);
    }

    public static final void L(jm jmVar) {
        zzay.zzb();
        if (zzf.zzv()) {
            zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            jmVar.run();
        } else {
            zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (zzt.zza.post(jmVar)) {
                return;
            }
            zzm.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.hm
    public final /* synthetic */ void E(JSONObject jSONObject, String str) {
        b4.f.e0(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void S(String str, wk wkVar) {
        this.f6659a.l0(str, new km(this, wkVar));
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void T(JSONObject jSONObject, String str) {
        a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void a(String str, String str2) {
        zza(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.hm
    public final void j(String str, Map map) {
        try {
            E(zzay.zzb().zzj(map), str);
        } catch (JSONException unused) {
            zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void z(String str, wk wkVar) {
        this.f6659a.x(str, new i10(6, wkVar));
    }

    @Override // com.google.android.gms.internal.ads.im, com.google.android.gms.internal.ads.mm
    public final void zza(String str) {
        zze.zza("invokeJavascript on adWebView from js");
        L(new jm(this, str, 1));
    }
}
