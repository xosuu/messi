package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gd0 implements ys0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cd0 f4885b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y3.a f4886d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4884a = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f4887f = new HashMap();

    public gd0(cd0 cd0Var, Set set, y3.a aVar) {
        this.f4885b = cd0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            fd0 fd0Var = (fd0) it.next();
            HashMap map = this.f4887f;
            fd0Var.getClass();
            map.put(ws0.f10331h, fd0Var);
        }
        this.f4886d = aVar;
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void E(ws0 ws0Var, String str, Throwable th) {
        HashMap map = this.f4884a;
        if (map.containsKey(ws0Var)) {
            ((y3.b) this.f4886d).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(ws0Var)).longValue();
            String strValueOf = String.valueOf(str);
            this.f4885b.f3253a.put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f4887f.containsKey(ws0Var)) {
            b(ws0Var, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void a(String str) {
    }

    public final void b(ws0 ws0Var, boolean z9) {
        HashMap map = this.f4887f;
        ws0 ws0Var2 = ((fd0) map.get(ws0Var)).f4482b;
        HashMap map2 = this.f4884a;
        if (map2.containsKey(ws0Var2)) {
            String str = true != z9 ? "f." : "s.";
            ((y3.b) this.f4886d).getClass();
            this.f4885b.f3253a.put("label.".concat(((fd0) map.get(ws0Var)).f4481a), str.concat(String.valueOf(Long.toString(SystemClock.elapsedRealtime() - ((Long) map2.get(ws0Var2)).longValue()))));
        }
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void j(ws0 ws0Var, String str) {
        ((y3.b) this.f4886d).getClass();
        this.f4884a.put(ws0Var, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void k(ws0 ws0Var, String str) {
        HashMap map = this.f4884a;
        if (map.containsKey(ws0Var)) {
            ((y3.b) this.f4886d).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(ws0Var)).longValue();
            String strValueOf = String.valueOf(str);
            this.f4885b.f3253a.put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f4887f.containsKey(ws0Var)) {
            b(ws0Var, true);
        }
    }
}
