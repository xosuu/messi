package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nd0 implements AppEventListener, u50, zza, k40, w40, x40, e50, n40, ys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd0 f7246b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7247d;

    public nd0(kd0 kd0Var, gy gyVar) {
        this.f7246b = kd0Var;
        this.f7245a = Collections.singletonList(gyVar);
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void E(ws0 ws0Var, String str, Throwable th) {
        O(vs0.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void J(zzbvb zzbvbVar) {
        ((y3.b) zzu.zzB()).getClass();
        this.f7247d = SystemClock.elapsedRealtime();
        O(u50.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void L(Context context) {
        O(x40.class, "onResume", context);
    }

    public final void O(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f7245a;
        String strConcat = "Event-".concat(simpleName);
        kd0 kd0Var = this.f7246b;
        kd0Var.getClass();
        if (((Boolean) nh.f7263a.k()).booleanValue()) {
            ((y3.b) kd0Var.f6262a).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = objArr[i10];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e10) {
                zzm.zzh("unable to log", e10);
            }
            zzm.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void a(String str) {
        O(vs0.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void b(kr0 kr0Var) {
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void h(Context context) {
        O(x40.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void j(ws0 ws0Var, String str) {
        O(vs0.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void k(ws0 ws0Var, String str) {
        O(vs0.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void n(as asVar, String str, String str2) {
        O(k40.class, "onRewarded", asVar, str, str2);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        O(zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        O(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final void t(zze zzeVar) {
        O(n40.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void z(Context context) {
        O(x40.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zza() {
        O(k40.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzb() {
        O(k40.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzc() {
        O(k40.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zze() {
        O(k40.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzf() {
        O(k40.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final void zzr() {
        O(w40.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        ((y3.b) zzu.zzB()).getClass();
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (SystemClock.elapsedRealtime() - this.f7247d));
        O(e50.class, "onAdLoaded", new Object[0]);
    }
}
