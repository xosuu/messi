package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.cd0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.hd0;
import com.google.android.gms.internal.ads.nu;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n3.e;
import org.json.JSONException;
import org.json.JSONObject;
import y3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzl {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hd0 f2421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f2422i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f2419f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f2420g = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2414a = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4071m6)).intValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2415b = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4081n6)).longValue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2416c = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4120r6)).booleanValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2417d = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4110q6)).booleanValue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f2418e = Collections.synchronizedMap(new e(this));

    public zzl(hd0 hd0Var) {
        this.f2421h = hd0Var;
    }

    public final synchronized void a(final cd0 cd0Var) {
        if (this.f2416c) {
            ArrayDeque arrayDeque = this.f2420g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f2419f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            nu.f7383a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    zzl zzlVar = this.zza;
                    cd0 cd0Var2 = cd0Var;
                    ArrayDeque arrayDeque3 = arrayDequeClone;
                    ArrayDeque arrayDeque4 = arrayDequeClone2;
                    zzlVar.b(cd0Var2, arrayDeque3, "to");
                    zzlVar.b(cd0Var2, arrayDeque4, "of");
                }
            });
        }
    }

    public final void b(cd0 cd0Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(cd0Var.f3253a);
            this.f2422i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f2422i.put("e_r", str);
            this.f2422i.put("e_id", (String) pair2.first);
            if (this.f2417d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzq.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
                ConcurrentHashMap concurrentHashMap2 = this.f2422i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f2422i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f2421h.a(this.f2422i, false);
        }
    }

    public final synchronized void c() {
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f2418e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((zzk) entry.getValue()).zza.longValue() <= this.f2415b) {
                    break;
                }
                this.f2420g.add(new Pair((String) entry.getKey(), ((zzk) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            com.google.android.gms.ads.internal.zzu.zzo().i("QueryJsonMap.removeExpiredEntries", e10);
        }
    }

    public final synchronized String zzb(String str, cd0 cd0Var) {
        try {
            zzk zzkVar = (zzk) this.f2418e.get(str);
            cd0Var.f3253a.put("request_id", str);
            if (zzkVar == null) {
                cd0Var.f3253a.put("mhit", "false");
                return null;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.L6)).booleanValue()) {
                this.f2418e.remove(str);
            }
            String str2 = zzkVar.zzb;
            cd0Var.f3253a.put("mhit", "true");
            return str2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(String str, String str2, cd0 cd0Var) {
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        this.f2418e.put(str, new zzk(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        c();
        a(cd0Var);
    }

    public final synchronized void zzf(String str) {
        this.f2418e.remove(str);
    }

    public final synchronized boolean zzg(String str, String str2, int i10) {
        zzk zzkVar = (zzk) this.f2418e.get(str);
        if (zzkVar == null) {
            return false;
        }
        zzkVar.zzc.add(str2);
        return zzkVar.zzc.size() < i10;
    }

    public final synchronized boolean zzh(String str, String str2) {
        zzk zzkVar = (zzk) this.f2418e.get(str);
        if (zzkVar != null) {
            if (zzkVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
