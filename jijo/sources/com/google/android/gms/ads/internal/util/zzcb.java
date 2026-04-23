package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.eg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l3.g;

/* JADX INFO: loaded from: classes.dex */
public final class zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2159a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2160b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2161c;

    public zzcb(Context context) {
        this.f2161c = context;
    }

    public final synchronized void a(zzbz zzbzVar) {
        this.f2160b.add(zzbzVar);
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.z9)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            Map mapZzv = zzt.zzv((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.E9));
            for (String str : mapZzv.keySet()) {
                synchronized (this) {
                    try {
                        if (!this.f2159a.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f2161c) : this.f2161c.getSharedPreferences(str, 0);
                            g gVar = new g(this, str);
                            this.f2159a.put(str, gVar);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(gVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            a(new zzbz(mapZzv));
        }
    }
}
