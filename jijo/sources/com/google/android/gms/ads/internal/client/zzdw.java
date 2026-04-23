package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTimeConstants;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzdw {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1985g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1988j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1991m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f1979a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f1980b = new Bundle();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1981c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f1982d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f1983e = new Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f1984f = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1986h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1989k = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1992n = DateTimeConstants.MILLIS_PER_MINUTE;

    public final void zzA(String str) {
        this.f1987i = str;
    }

    public final void zzB(String str) {
        this.f1988j = str;
    }

    @Deprecated
    public final void zzC(boolean z9) {
        this.f1989k = z9 ? 1 : 0;
    }

    public final void zzn(String str) {
        this.f1984f.add(str);
    }

    public final void zzo(Class cls, Bundle bundle) {
        Bundle bundle2 = this.f1980b;
        if (bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            bundle2.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle3 = bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        a.l(bundle3);
        bundle3.putBundle(cls.getName(), bundle);
    }

    public final void zzp(String str, String str2) {
        this.f1983e.putString(str, str2);
    }

    public final void zzq(String str) {
        this.f1979a.add(str);
    }

    public final void zzr(Class cls, Bundle bundle) {
        this.f1980b.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void zzs(NetworkExtras networkExtras) {
        this.f1981c.put(networkExtras.getClass(), networkExtras);
    }

    public final void zzt(String str) {
        this.f1982d.add(str);
    }

    public final void zzu(String str) {
        this.f1982d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzv(String str) {
        this.f1991m = str;
    }

    public final void zzw(String str) {
        this.f1985g = str;
    }

    public final void zzx(int i10) {
        this.f1992n = i10;
    }

    @Deprecated
    public final void zzy(boolean z9) {
        this.f1990l = z9;
    }

    public final void zzz(List list) {
        ArrayList arrayList = this.f1986h;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }
}
