package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj0 f9607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f9611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lr0 f9612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mr0 f9613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y3.a f9614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y9 f9615i;

    public ut0(tj0 tj0Var, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, lr0 lr0Var, mr0 mr0Var, y3.a aVar, y9 y9Var) {
        this.f9607a = tj0Var;
        this.f9608b = versionInfoParcel.afmaVersion;
        this.f9609c = str;
        this.f9610d = str2;
        this.f9611e = context;
        this.f9612f = lr0Var;
        this.f9613g = mr0Var;
        this.f9614h = aVar;
        this.f9615i = y9Var;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(kr0 kr0Var, fr0 fr0Var, List list) {
        return b(kr0Var, fr0Var, false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, list);
    }

    public final ArrayList b(kr0 kr0Var, fr0 fr0Var, boolean z9, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z10 = true;
            String strC = c(c(c((String) it.next(), "@gw_adlocid@", ((or0) kr0Var.f6382a.f6060b).f7646f), "@gw_adnetrefresh@", true != z9 ? "0" : "1"), "@gw_sdkver@", this.f9608b);
            if (fr0Var != null) {
                strC = t3.i.N(c(c(c(strC, "@gw_qdata@", fr0Var.f4647y), "@gw_adnetid@", fr0Var.f4646x), "@gw_allocid@", fr0Var.f4644w), this.f9611e, fr0Var.W, fr0Var.f4645w0);
            }
            tj0 tj0Var = this.f9607a;
            String strC2 = c(c(c(c(strC, "@gw_adnetstatus@", tj0Var.c()), "@gw_ttr@", Long.toString(tj0Var.a(), 10)), "@gw_seqnum@", this.f9609c), "@gw_sessid@", this.f9610d);
            boolean z11 = false;
            if (((Boolean) zzba.zzc().a(eg.f3993f3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z11 = true;
            }
            boolean z12 = !TextUtils.isEmpty(str2);
            if (z11) {
                z10 = z12;
            } else {
                if (z12) {
                }
                arrayList.add(strC2);
            }
            if (this.f9615i.c(Uri.parse(strC2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strC2).buildUpon();
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z10) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strC2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strC2);
        }
        return arrayList;
    }
}
