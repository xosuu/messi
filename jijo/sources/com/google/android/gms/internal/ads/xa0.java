package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class xa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ra0 f10502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y9 f10503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f10504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zza f10505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kd f10506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f10507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzbes f10508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fb0 f10509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kc0 f10510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f10511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xb0 f10512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ed0 f10513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vt0 f10514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lh0 f10515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qh0 f10516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pr0 f10517q;

    public xa0(Context context, ra0 ra0Var, y9 y9Var, VersionInfoParcel versionInfoParcel, zza zzaVar, kd kdVar, mu muVar, or0 or0Var, fb0 fb0Var, kc0 kc0Var, ScheduledExecutorService scheduledExecutorService, ed0 ed0Var, vt0 vt0Var, lh0 lh0Var, xb0 xb0Var, qh0 qh0Var, pr0 pr0Var) {
        this.f10501a = context;
        this.f10502b = ra0Var;
        this.f10503c = y9Var;
        this.f10504d = versionInfoParcel;
        this.f10505e = zzaVar;
        this.f10506f = kdVar;
        this.f10507g = muVar;
        this.f10508h = or0Var.f7649i;
        this.f10509i = fb0Var;
        this.f10510j = kc0Var;
        this.f10511k = scheduledExecutorService;
        this.f10513m = ed0Var;
        this.f10514n = vt0Var;
        this.f10515o = lh0Var;
        this.f10512l = xb0Var;
        this.f10516p = qh0Var;
        this.f10517q = pr0Var;
    }

    public static Integer d(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final zzel e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new zzel(strOptString, strOptString2);
    }

    public final n5.a a(JSONObject jSONObject, boolean z9) {
        if (jSONObject == null) {
            return tc1.d0(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return tc1.d0(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z9) {
            return tc1.d0(new fi(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        final ra0 ra0Var = this.f10502b;
        s11 s11VarO0 = tc1.o0(tc1.o0(ra0Var.f8554a.zza(strOptString), new gx0() { // from class: com.google.android.gms.internal.ads.qa0
            @Override // com.google.android.gms.internal.ads.gx0
            public final Object apply(Object obj) {
                ra0 ra0Var2 = ra0Var;
                ra0Var2.getClass();
                byte[] bArr = ((h7) obj).f5226b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (dOptDouble * 160.0d);
                if (!zOptBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                if (((Boolean) zzba.zzc().a(eg.f4186y5)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    ra0Var2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i10 = options.outWidth * options.outHeight;
                    if (i10 > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) zzba.zzc().a(eg.f4195z5)).intValue())) / 2);
                    }
                }
                return ra0Var2.a(bArr, options);
            }
        }, ra0Var.f8556c), new gx0() { // from class: com.google.android.gms.internal.ads.ua0
            @Override // com.google.android.gms.internal.ads.gx0
            public final Object apply(Object obj) {
                return new fi(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f10507g);
        int i10 = 2;
        return jSONObject.optBoolean("require") ? tc1.q0(s11VarO0, new va0(s11VarO0, i10), nu.f7388f) : tc1.V(s11VarO0, Exception.class, new f00(i10, 0), nu.f7388f);
    }

    public final n5.a b(JSONArray jSONArray, boolean z9, boolean z10) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return tc1.d0(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z10 ? jSONArray.length() : 1;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(a(jSONArray.optJSONObject(i10), z9));
        }
        return tc1.o0(new z11(bz0.k(arrayList), true), new b3(7), this.f10507g);
    }

    public final r11 c(JSONObject jSONObject, fr0 fr0Var, hr0 hr0Var) {
        zzq zzqVar;
        String strOptString = jSONObject.optString("base_url");
        String strOptString2 = jSONObject.optString("html");
        int i10 = 0;
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        if (iOptInt != 0) {
            zzqVar = new zzq(this.f10501a, new AdSize(iOptInt, iOptInt2));
        } else if (iOptInt2 != 0) {
            iOptInt = 0;
            zzqVar = new zzq(this.f10501a, new AdSize(iOptInt, iOptInt2));
        } else {
            zzqVar = zzq.zzc();
        }
        fb0 fb0Var = this.f10509i;
        fb0Var.getClass();
        r11 r11VarQ0 = tc1.q0(tc1.d0(null), new wa0(fb0Var, zzqVar, fr0Var, hr0Var, strOptString, strOptString2, 1), fb0Var.f4441b);
        return tc1.q0(r11VarQ0, new va0(r11VarQ0, i10), nu.f7388f);
    }
}
