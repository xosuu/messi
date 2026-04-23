package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cg implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f3266g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3260a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConditionVariable f3261b = new ConditionVariable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f3262c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f3263d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f3264e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f3265f = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JSONObject f3267h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3268i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3269j = false;

    public final Object a(yf yfVar) {
        if (!this.f3261b.block(5000L)) {
            synchronized (this.f3260a) {
                try {
                    if (!this.f3263d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f3262c || this.f3264e == null || this.f3269j) {
            synchronized (this.f3260a) {
                if (this.f3262c && this.f3264e != null && !this.f3269j) {
                }
                return yfVar.g();
            }
        }
        int i10 = yfVar.f10864a;
        if (i10 != 2) {
            return (i10 == 1 && this.f3267h.has(yfVar.f10865b)) ? yfVar.a(this.f3267h) : y3.c.h(new m20(this, 8, yfVar));
        }
        Bundle bundle = this.f3265f;
        if (bundle == null) {
            return yfVar.g();
        }
        xf xfVar = (xf) yfVar;
        int i11 = xfVar.f10545e;
        String str = xfVar.f10865b;
        switch (i11) {
            case 0:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) xfVar.g();
            case 1:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str))) : (Integer) xfVar.g();
            case 2:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str))) : (Long) xfVar.g();
            case 3:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str))) : (Float) xfVar.g();
            default:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str)) : (String) xfVar.g();
        }
    }

    public final Object b(xf xfVar) {
        return (this.f3262c || this.f3263d) ? a(xfVar) : xfVar.g();
    }

    public final void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.f3267h = new JSONObject((String) y3.c.h(new rk0(3, sharedPreferences)));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            c(sharedPreferences);
        }
    }
}
