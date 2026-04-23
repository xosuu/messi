package androidx.work.impl;

import android.content.Context;
import com.google.android.gms.internal.ads.gp0;
import com.google.android.gms.internal.ads.ur0;
import j2.h;
import java.util.HashMap;
import l.b0;
import l2.c;
import l2.l;
import n1.a;
import n1.i;
import r1.b;
import r1.d;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f1180s = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile l f1181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile c f1182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile c f1183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile ur0 f1184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile c f1185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile h f1186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile c f1187r;

    @Override // n1.p
    public final i d() {
        return new i(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // n1.p
    public final d e(a aVar) {
        gp0 gp0Var = new gp0(this);
        int i10 = gp0Var.f5025b;
        b0 b0Var = new b0();
        b0Var.f14789a = i10;
        b0Var.f14790b = aVar;
        b0Var.f14791d = gp0Var;
        b0Var.f14792f = "c103703e120ae8cc73c9248622f3cd1e";
        b0Var.f14793h = "49f946663a8deb7054212b8adda248c6";
        Context context = aVar.f15824b;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        b bVar = new b();
        bVar.f16492a = context;
        bVar.f16493b = aVar.f15825c;
        bVar.f16494c = b0Var;
        bVar.f16495d = false;
        return aVar.f15823a.e(bVar);
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c i() {
        c cVar;
        if (this.f1182m != null) {
            return this.f1182m;
        }
        synchronized (this) {
            try {
                if (this.f1182m == null) {
                    this.f1182m = new c(this, 0);
                }
                cVar = this.f1182m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c j() {
        c cVar;
        if (this.f1187r != null) {
            return this.f1187r;
        }
        synchronized (this) {
            try {
                if (this.f1187r == null) {
                    this.f1187r = new c(this, 1);
                }
                cVar = this.f1187r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ur0 k() {
        ur0 ur0Var;
        if (this.f1184o != null) {
            return this.f1184o;
        }
        synchronized (this) {
            try {
                if (this.f1184o == null) {
                    this.f1184o = new ur0(this);
                }
                ur0Var = this.f1184o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ur0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c l() {
        c cVar;
        if (this.f1185p != null) {
            return this.f1185p;
        }
        synchronized (this) {
            try {
                if (this.f1185p == null) {
                    this.f1185p = new c(this, 2);
                }
                cVar = this.f1185p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h m() {
        h hVar;
        if (this.f1186q != null) {
            return this.f1186q;
        }
        synchronized (this) {
            try {
                if (this.f1186q == null) {
                    h hVar2 = new h();
                    hVar2.f14297a = this;
                    hVar2.f14298b = new l2.b(hVar2, this, 4);
                    hVar2.f14299d = new l2.h(hVar2, this, 0);
                    hVar2.f14300f = new l2.h(hVar2, this, 1);
                    this.f1186q = hVar2;
                }
                hVar = this.f1186q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l n() {
        l lVar;
        if (this.f1181l != null) {
            return this.f1181l;
        }
        synchronized (this) {
            try {
                if (this.f1181l == null) {
                    this.f1181l = new l(this);
                }
                lVar = this.f1181l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c o() {
        c cVar;
        if (this.f1183n != null) {
            return this.f1183n;
        }
        synchronized (this) {
            try {
                if (this.f1183n == null) {
                    this.f1183n = new c(this, 3);
                }
                cVar = this.f1183n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
