package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class gi0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hr0 f4928d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fr0 f4929e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzu f4930f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4926b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4925a = Collections.synchronizedList(new ArrayList());

    public gi0(String str) {
        this.f4927c = str;
    }

    public static String b(fr0 fr0Var) {
        return ((Boolean) zzba.zzc().a(eg.f4026i3)).booleanValue() ? fr0Var.f4631p0 : fr0Var.f4644w;
    }

    public final void a(fr0 fr0Var) {
        String strB = b(fr0Var);
        Map map = this.f4926b;
        Object obj = map.get(strB);
        List list = this.f4925a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f4930f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f4930f = (zzu) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            zzu zzuVar = (zzu) list.get(iIndexOf);
            zzuVar.zzb = 0L;
            zzuVar.zzc = null;
        }
    }

    public final synchronized void c(fr0 fr0Var, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.f4926b;
        String strB = b(fr0Var);
        if (map.containsKey(strB)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = fr0Var.f4642v.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, fr0Var.f4642v.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) zzba.zzc().a(eg.f3974d6)).booleanValue()) {
            str = fr0Var.F;
            str2 = fr0Var.G;
            str3 = fr0Var.H;
            str4 = fr0Var.I;
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzu zzuVar = new zzu(fr0Var.E, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.f4925a.add(i10, zzuVar);
        } catch (IndexOutOfBoundsException e10) {
            com.google.android.gms.ads.internal.zzu.zzo().i("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e10);
        }
        this.f4926b.put(strB, zzuVar);
    }

    public final void d(fr0 fr0Var, long j10, zze zzeVar, boolean z9) {
        String strB = b(fr0Var);
        Map map = this.f4926b;
        if (map.containsKey(strB)) {
            if (this.f4929e == null) {
                this.f4929e = fr0Var;
            }
            zzu zzuVar = (zzu) map.get(strB);
            zzuVar.zzb = j10;
            zzuVar.zzc = zzeVar;
            if (((Boolean) zzba.zzc().a(eg.f3985e6)).booleanValue() && z9) {
                this.f4930f = zzuVar;
            }
        }
    }
}
