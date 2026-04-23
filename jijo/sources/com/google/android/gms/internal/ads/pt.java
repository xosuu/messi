package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f7964a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7965b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p80 f7967d;

    public pt(Context context, p80 p80Var) {
        this.f7966c = context;
        this.f7967d = p80Var;
    }

    public final synchronized void a(String str) {
        try {
            if (this.f7964a.containsKey(str)) {
                return;
            }
            int i10 = 0;
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f7966c) : this.f7966c.getSharedPreferences(str, 0);
            ot otVar = new ot(this, str, i10);
            this.f7964a.put(str, otVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(otVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(nt ntVar) {
        this.f7965b.add(ntVar);
    }
}
