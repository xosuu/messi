package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qg extends p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f8170a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8171b = Arrays.asList(((String) zzba.zzc().a(eg.V8)).split(","));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg f8172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p.a f8173d;

    public qg(sg sgVar, p.a aVar) {
        this.f8173d = aVar;
        this.f8172c = sgVar;
    }

    @Override // p.a
    public final void a(Bundle bundle, String str) {
        p.a aVar = this.f8173d;
        if (aVar != null) {
            aVar.a(bundle, str);
        }
    }

    @Override // p.a
    public final Bundle b(Bundle bundle, String str) {
        p.a aVar = this.f8173d;
        if (aVar != null) {
            return aVar.b(bundle, str);
        }
        return null;
    }

    @Override // p.a
    public final void c(Bundle bundle) {
        this.f8170a.set(false);
        p.a aVar = this.f8173d;
        if (aVar != null) {
            aVar.c(bundle);
        }
    }

    @Override // p.a
    public final void d(int i10, Bundle bundle) {
        this.f8170a.set(false);
        p.a aVar = this.f8173d;
        if (aVar != null) {
            aVar.d(i10, bundle);
        }
        ((y3.b) zzu.zzB()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        sg sgVar = this.f8172c;
        sgVar.f8859h = jCurrentTimeMillis;
        List list = this.f8171b;
        if (list == null || !list.contains(String.valueOf(i10))) {
            return;
        }
        ((y3.b) zzu.zzB()).getClass();
        sgVar.f8858g = SystemClock.elapsedRealtime() + ((long) ((Integer) zzba.zzc().a(eg.S8)).intValue());
        if (sgVar.f8854c == null) {
            sgVar.f8854c = new s9(9, sgVar);
        }
        sgVar.d();
    }

    @Override // p.a
    public final void e(Bundle bundle, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f8170a.set(true);
                this.f8172c.c(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e10) {
            zze.zzb("Message is not in JSON format: ", e10);
        }
        p.a aVar = this.f8173d;
        if (aVar != null) {
            aVar.e(bundle, str);
        }
    }

    @Override // p.a
    public final void f(int i10, Uri uri, boolean z9, Bundle bundle) {
        p.a aVar = this.f8173d;
        if (aVar != null) {
            aVar.f(i10, uri, z9, bundle);
        }
    }
}
