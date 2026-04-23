package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.eq;
import com.google.android.gms.internal.ads.hq;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.ml;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.xs;
import com.google.android.gms.internal.ads.zi;
import j3.a;
import j3.b;
import j3.c;
import j3.d;
import j3.e;
import j3.g;
import j3.i;
import j3.j;
import j3.l;
import j3.m;
import j3.n;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzk f1956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzi f1957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzeq f1958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik f1959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eq f1960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jk f1961f;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, ik ikVar, xs xsVar, eq eqVar, jk jkVar) {
        this.f1956a = zzkVar;
        this.f1957b = zziVar;
        this.f1958c = zzeqVar;
        this.f1959d = ikVar;
        this.f1960e = eqVar;
        this.f1961f = jkVar;
    }

    public static /* bridge */ /* synthetic */ void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzo(context, zzay.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, rn rnVar) {
        return (zzbq) new j(this, context, str, rnVar).d(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, rn rnVar) {
        return (zzbu) new g(this, context, zzqVar, str, rnVar).d(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, rn rnVar) {
        return (zzbu) new i(this, context, zzqVar, str, rnVar).d(context, false);
    }

    public final zzdj zzf(Context context, rn rnVar) {
        return (zzdj) new b(context, rnVar).d(context, false);
    }

    public final ti zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (ti) new l(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final zi zzi(View view, HashMap map, HashMap map2) {
        return (zi) new m(this, view, map, map2).d(view.getContext(), false);
    }

    public final ml zzl(Context context, rn rnVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (ml) new e(context, rnVar, onH5AdsEventListener).d(context, false);
    }

    public final aq zzm(Context context, rn rnVar) {
        return (aq) new d(context, rnVar).d(context, false);
    }

    public final hq zzo(Activity activity) {
        a aVar = new a(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (hq) aVar.d(activity, booleanExtra);
    }

    public final ns zzq(Context context, String str, rn rnVar) {
        return (ns) new n(context, str, rnVar).d(context, false);
    }

    public final ut zzr(Context context, rn rnVar) {
        return (ut) new c(context, rnVar).d(context, false);
    }
}
