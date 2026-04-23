package e2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import c2.n;
import c2.w;
import com.google.android.gms.internal.ads.ur0;
import d2.c;
import d2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.q;
import l2.j;
import m2.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c, h2.b, d2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f12635b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2.c f12636d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f12638h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12639q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f12641t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f12637f = new HashSet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f12640s = new Object();

    static {
        n.l("GreedyScheduler");
    }

    public b(Context context, c2.b bVar, ur0 ur0Var, k kVar) {
        this.f12634a = context;
        this.f12635b = kVar;
        this.f12636d = new h2.c(context, ur0Var, this);
        this.f12638h = new a(this, bVar.f1510e);
    }

    @Override // d2.a
    public final void a(String str, boolean z9) {
        synchronized (this.f12640s) {
            try {
                Iterator it = this.f12637f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    j jVar = (j) it.next();
                    if (jVar.f15142a.equals(str)) {
                        n nVarI = n.i();
                        String.format("Stopping tracking for %s", str);
                        nVarI.g(new Throwable[0]);
                        this.f12637f.remove(jVar);
                        this.f12636d.c(this.f12637f);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d2.c
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.f12641t;
        k kVar = this.f12635b;
        if (bool == null) {
            this.f12641t = Boolean.valueOf(h.a(this.f12634a, kVar.f12331d));
        }
        if (!this.f12641t.booleanValue()) {
            n.i().j(new Throwable[0]);
            return;
        }
        if (!this.f12639q) {
            kVar.f12335h.b(this);
            this.f12639q = true;
        }
        n nVarI = n.i();
        String.format("Cancelling work ID %s", str);
        nVarI.g(new Throwable[0]);
        a aVar = this.f12638h;
        if (aVar != null && (runnable = (Runnable) aVar.f12633c.remove(str)) != null) {
            ((Handler) aVar.f12632b.f14587b).removeCallbacks(runnable);
        }
        kVar.x0(str);
    }

    @Override // h2.b
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n nVarI = n.i();
            String.format("Constraints not met: Cancelling work ID %s", str);
            nVarI.g(new Throwable[0]);
            this.f12635b.x0(str);
        }
    }

    @Override // h2.b
    public final void d(List list) {
        for (String str : (ArrayList) list) {
            n nVarI = n.i();
            String.format("Constraints met: Scheduling work ID %s", str);
            nVarI.g(new Throwable[0]);
            this.f12635b.w0(str, null);
        }
    }

    @Override // d2.c
    public final void e(j... jVarArr) {
        if (this.f12641t == null) {
            this.f12641t = Boolean.valueOf(h.a(this.f12634a, this.f12635b.f12331d));
        }
        if (!this.f12641t.booleanValue()) {
            n.i().j(new Throwable[0]);
            return;
        }
        if (!this.f12639q) {
            this.f12635b.f12335h.b(this);
            this.f12639q = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (j jVar : jVarArr) {
            long jA = jVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jVar.f15143b == w.f1547a) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f12638h;
                    if (aVar != null) {
                        HashMap map = aVar.f12633c;
                        Runnable runnable = (Runnable) map.remove(jVar.f15142a);
                        q qVar = aVar.f12632b;
                        if (runnable != null) {
                            ((Handler) qVar.f14587b).removeCallbacks(runnable);
                        }
                        l.j jVar2 = new l.j(aVar, 10, jVar);
                        map.put(jVar.f15142a, jVar2);
                        ((Handler) qVar.f14587b).postDelayed(jVar2, jVar.a() - System.currentTimeMillis());
                    }
                } else if (jVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && jVar.f15151j.f1517c) {
                        n nVarI = n.i();
                        String.format("Ignoring WorkSpec %s, Requires device idle.", jVar);
                        nVarI.g(new Throwable[0]);
                    } else if (i10 < 24 || jVar.f15151j.f1522h.f1525a.size() <= 0) {
                        hashSet.add(jVar);
                        hashSet2.add(jVar.f15142a);
                    } else {
                        n nVarI2 = n.i();
                        String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", jVar);
                        nVarI2.g(new Throwable[0]);
                    }
                } else {
                    n nVarI3 = n.i();
                    String.format("Starting work for %s", jVar.f15142a);
                    nVarI3.g(new Throwable[0]);
                    this.f12635b.w0(jVar.f15142a, null);
                }
            }
        }
        synchronized (this.f12640s) {
            try {
                if (!hashSet.isEmpty()) {
                    n nVarI4 = n.i();
                    String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2));
                    nVarI4.g(new Throwable[0]);
                    this.f12637f.addAll(hashSet);
                    this.f12636d.c(this.f12637f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d2.c
    public final boolean f() {
        return false;
    }
}
