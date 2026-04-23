package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3.a f9171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ep f9172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt0 f9173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9174d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9175e = ((Boolean) zzba.zzc().a(eg.f4018h6)).booleanValue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gi0 f9176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9179i;

    public tj0(y3.a aVar, ep epVar, gi0 gi0Var, vt0 vt0Var) {
        this.f9171a = aVar;
        this.f9172b = epVar;
        this.f9176f = gi0Var;
        this.f9173c = vt0Var;
    }

    public static boolean h(tj0 tj0Var, fr0 fr0Var) {
        synchronized (tj0Var) {
            sj0 sj0Var = (sj0) tj0Var.f9174d.get(fr0Var);
            if (sj0Var != null) {
                if (sj0Var.f8879c == 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized long a() {
        return this.f9178h;
    }

    public final synchronized void b(kr0 kr0Var, fr0 fr0Var, n5.a aVar, ut0 ut0Var) {
        hr0 hr0Var = (hr0) kr0Var.f6383b.f10631d;
        ((y3.b) this.f9171a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = fr0Var.f4644w;
        if (str != null) {
            this.f9174d.put(fr0Var, new sj0(str, fr0Var.f4611f0, 9, 0L, null));
            tc1.u0(aVar, new rj0(this, jElapsedRealtime, hr0Var, fr0Var, str, ut0Var, kr0Var), nu.f7388f);
        }
    }

    public final synchronized String c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f9174d.entrySet().iterator();
            while (it.hasNext()) {
                sj0 sj0Var = (sj0) ((Map.Entry) it.next()).getValue();
                if (sj0Var.f8879c != Integer.MAX_VALUE) {
                    arrayList.add(sj0Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void d(fr0 fr0Var) {
        try {
            ((y3.b) this.f9171a).getClass();
            this.f9178h = SystemClock.elapsedRealtime() - this.f9179i;
            if (fr0Var != null) {
                this.f9176f.a(fr0Var);
            }
            this.f9177g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(List list) {
        ((y3.b) this.f9171a).getClass();
        this.f9179i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fr0 fr0Var = (fr0) it.next();
            if (!TextUtils.isEmpty(fr0Var.f4644w)) {
                this.f9174d.put(fr0Var, new sj0(fr0Var.f4644w, fr0Var.f4611f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void f() {
        ((y3.b) this.f9171a).getClass();
        this.f9179i = SystemClock.elapsedRealtime();
    }

    public final synchronized void g(fr0 fr0Var) {
        sj0 sj0Var = (sj0) this.f9174d.get(fr0Var);
        if (sj0Var == null || this.f9177g) {
            return;
        }
        sj0Var.f8879c = 8;
    }
}
