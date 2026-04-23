package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzdx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f1995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f1996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f1997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SearchAdRequest f2000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f2002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f2003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f2004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2008p = 0;

    public zzdx(zzdw zzdwVar, SearchAdRequest searchAdRequest) {
        this.f1993a = zzdwVar.f1985g;
        this.f1994b = zzdwVar.f1986h;
        this.f1995c = Collections.unmodifiableSet(zzdwVar.f1979a);
        this.f1996d = zzdwVar.f1980b;
        this.f1997e = Collections.unmodifiableMap(zzdwVar.f1981c);
        this.f1998f = zzdwVar.f1987i;
        this.f1999g = zzdwVar.f1988j;
        this.f2000h = searchAdRequest;
        this.f2001i = zzdwVar.f1989k;
        this.f2002j = Collections.unmodifiableSet(zzdwVar.f1982d);
        this.f2003k = zzdwVar.f1983e;
        this.f2004l = Collections.unmodifiableSet(zzdwVar.f1984f);
        this.f2005m = zzdwVar.f1990l;
        this.f2006n = zzdwVar.f1991m;
        this.f2007o = zzdwVar.f1992n;
    }

    public final int zza() {
        return this.f2007o;
    }

    public final int zzb() {
        return this.f2001i;
    }

    public final long zzc() {
        return this.f2008p;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.f1996d.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.f2003k;
    }

    public final Bundle zzf(Class cls) {
        return this.f1996d.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.f1996d;
    }

    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.f1997e.get(cls);
    }

    public final SearchAdRequest zzi() {
        return this.f2000h;
    }

    public final String zzj() {
        return this.f2006n;
    }

    public final String zzk() {
        return this.f1993a;
    }

    public final String zzl() {
        return this.f1998f;
    }

    public final String zzm() {
        return this.f1999g;
    }

    public final List zzn() {
        return new ArrayList(this.f1994b);
    }

    public final Set zzo() {
        return this.f2004l;
    }

    public final Set zzp() {
        return this.f1995c;
    }

    public final void zzq(long j10) {
        this.f2008p = j10;
    }

    @Deprecated
    public final boolean zzr() {
        return this.f2005m;
    }

    public final boolean zzs(Context context) {
        RequestConfiguration requestConfigurationZzc = zzej.zzf().zzc();
        zzay.zzb();
        String strZzz = com.google.android.gms.ads.internal.util.client.zzf.zzz(context);
        return this.f2002j.contains(strZzz) || requestConfigurationZzc.getTestDeviceIds().contains(strZzz);
    }
}
