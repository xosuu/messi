package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jj0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u21 f5960c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public uj0 f5963f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tj0 f5967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fr0 f5968k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5958a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5959b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5961d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f5962e = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5964g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5969l = false;

    public jj0(kr0 kr0Var, tj0 tj0Var, u21 u21Var) {
        this.f5966i = ((hr0) kr0Var.f6383b.f10631d).f5387r;
        this.f5967j = tj0Var;
        this.f5960c = u21Var;
        this.f5965h = wj0.a(kr0Var);
        List list = (List) kr0Var.f6383b.f10630b;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f5958a.put((fr0) list.get(i10), Integer.valueOf(i10));
        }
        this.f5959b.addAll(list);
    }

    public final synchronized fr0 a() {
        try {
            if (i()) {
                for (int i10 = 0; i10 < this.f5959b.size(); i10++) {
                    fr0 fr0Var = (fr0) this.f5959b.get(i10);
                    String str = fr0Var.f4639t0;
                    if (!this.f5962e.contains(str)) {
                        if (fr0Var.f4643v0) {
                            this.f5969l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f5962e.add(str);
                        }
                        this.f5961d.add(fr0Var);
                        return (fr0) this.f5959b.remove(i10);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(fr0 fr0Var) {
        this.f5969l = false;
        this.f5961d.remove(fr0Var);
        this.f5962e.remove(fr0Var.f4639t0);
        if (d() || h()) {
            return;
        }
        e();
    }

    public final synchronized void c(uj0 uj0Var, fr0 fr0Var) {
        this.f5969l = false;
        this.f5961d.remove(fr0Var);
        if (d()) {
            uj0Var.zzr();
            return;
        }
        Integer num = (Integer) this.f5958a.get(fr0Var);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (numValueOf.intValue() > this.f5964g) {
            this.f5967j.g(fr0Var);
            return;
        }
        if (this.f5963f != null) {
            this.f5967j.g(this.f5968k);
        }
        this.f5964g = numValueOf.intValue();
        this.f5963f = uj0Var;
        this.f5968k = fr0Var;
        if (h()) {
            return;
        }
        e();
    }

    public final synchronized boolean d() {
        return this.f5960c.isDone();
    }

    public final synchronized void e() {
        this.f5967j.d(this.f5968k);
        uj0 uj0Var = this.f5963f;
        if (uj0Var != null) {
            this.f5960c.f(uj0Var);
        } else {
            this.f5960c.g(new zzeir(3, this.f5965h));
        }
    }

    public final synchronized boolean f(boolean z9) {
        try {
            for (fr0 fr0Var : this.f5959b) {
                Integer num = (Integer) this.f5958a.get(fr0Var);
                Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                if (z9 || !this.f5962e.contains(fr0Var.f4639t0)) {
                    if (numValueOf.intValue() < this.f5964g) {
                        return true;
                    }
                    if (numValueOf.intValue() > this.f5964g) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g() {
        try {
            Iterator it = this.f5961d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f5958a.get((fr0) it.next());
                if (Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.f5964g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean h() {
        if (!f(true)) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized boolean i() {
        if (this.f5969l) {
            return false;
        }
        if (!this.f5959b.isEmpty() && ((fr0) this.f5959b.get(0)).f4643v0 && !this.f5961d.isEmpty()) {
            return false;
        }
        if (!d()) {
            ArrayList arrayList = this.f5961d;
            if (arrayList.size() < this.f5966i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
