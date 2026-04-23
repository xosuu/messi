package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class i7 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n7 f5511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5512b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5513d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5514f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f5515h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k7 f5516q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f5517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j7 f5518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z6 f5520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xq f5521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b7 f5522x;

    public i7(int i10, String str, k7 k7Var) {
        Uri uri;
        String host;
        this.f5511a = n7.f7184c ? new n7() : null;
        this.f5515h = new Object();
        int iHashCode = 0;
        this.f5519u = false;
        this.f5520v = null;
        this.f5512b = i10;
        this.f5513d = str;
        this.f5516q = k7Var;
        b7 b7Var = new b7();
        b7Var.f2929a = 2500;
        this.f5522x = b7Var;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f5514f = iHashCode;
    }

    public abstract l7 a(h7 h7Var);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f5517s.intValue() - ((i7) obj).f5517s.intValue();
    }

    public abstract void d(Object obj);

    public final void e(String str) {
        j7 j7Var = this.f5518t;
        if (j7Var != null) {
            synchronized (j7Var.f5814b) {
                j7Var.f5814b.remove(this);
            }
            synchronized (j7Var.f5821i) {
                Iterator it = j7Var.f5821i.iterator();
                if (it.hasNext()) {
                    fb1.t(it.next());
                    throw null;
                }
            }
            j7Var.b();
        }
        if (n7.f7184c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new n(this, str, id));
            } else {
                this.f5511a.a(id, str);
                this.f5511a.b(toString());
            }
        }
    }

    public final void f() {
        xq xqVar;
        synchronized (this.f5515h) {
            xqVar = this.f5521w;
        }
        if (xqVar != null) {
            xqVar.e(this);
        }
    }

    public final void g(l7 l7Var) {
        xq xqVar;
        synchronized (this.f5515h) {
            xqVar = this.f5521w;
        }
        if (xqVar != null) {
            xqVar.l(this, l7Var);
        }
    }

    public final void h(int i10) {
        j7 j7Var = this.f5518t;
        if (j7Var != null) {
            j7Var.b();
        }
    }

    public final void i(xq xqVar) {
        synchronized (this.f5515h) {
            this.f5521w = xqVar;
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f5514f));
        zzw();
        return "[ ] " + this.f5513d + " " + "0x".concat(strValueOf) + " NORMAL " + this.f5517s;
    }

    public final int zza() {
        return this.f5512b;
    }

    public final int zzb() {
        return this.f5522x.f2929a;
    }

    public final int zzc() {
        return this.f5514f;
    }

    public final z6 zzd() {
        return this.f5520v;
    }

    public final i7 zze(z6 z6Var) {
        this.f5520v = z6Var;
        return this;
    }

    public final i7 zzf(j7 j7Var) {
        this.f5518t = j7Var;
        return this;
    }

    public final i7 zzg(int i10) {
        this.f5517s = Integer.valueOf(i10);
        return this;
    }

    public final String zzj() {
        int i10 = this.f5512b;
        String str = this.f5513d;
        return i10 != 0 ? fb1.x(Integer.toString(1), "-", str) : str;
    }

    public final String zzk() {
        return this.f5513d;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (n7.f7184c) {
            this.f5511a.a(Thread.currentThread().getId(), str);
        }
    }

    public final void zzn(zzapq zzapqVar) {
        k7 k7Var;
        synchronized (this.f5515h) {
            k7Var = this.f5516q;
        }
        k7Var.e(zzapqVar);
    }

    public final void zzq() {
        synchronized (this.f5515h) {
            this.f5519u = true;
        }
    }

    public final boolean zzv() {
        boolean z9;
        synchronized (this.f5515h) {
            z9 = this.f5519u;
        }
        return z9;
    }

    public final boolean zzw() {
        synchronized (this.f5515h) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final b7 zzy() {
        return this.f5522x;
    }
}
