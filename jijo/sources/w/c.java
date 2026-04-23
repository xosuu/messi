package w;

import b7.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l.a0;
import x.o;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f17976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f17978f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u.i f17981i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f17973a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17979g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17980h = Integer.MIN_VALUE;

    public c(d dVar, int i10) {
        this.f17976d = dVar;
        this.f17977e = i10;
    }

    public final void a(c cVar, int i10) {
        b(cVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i10, int i11, boolean z9) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z9 && !i(cVar)) {
            return false;
        }
        this.f17978f = cVar;
        if (cVar.f17973a == null) {
            cVar.f17973a = new HashSet();
        }
        HashSet hashSet = this.f17978f.f17973a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f17979g = i10;
        this.f17980h = i11;
        return true;
    }

    public final void c(int i10, o oVar, ArrayList arrayList) {
        HashSet hashSet = this.f17973a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                u.j(((c) it.next()).f17976d, i10, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f17975c) {
            return this.f17974b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f17976d.f17995g0 == 8) {
            return 0;
        }
        int i10 = this.f17980h;
        return (i10 == Integer.MIN_VALUE || (cVar = this.f17978f) == null || cVar.f17976d.f17995g0 != 8) ? this.f17979g : i10;
    }

    public final c f() {
        int i10 = this.f17977e;
        int iB = u.h.b(i10);
        d dVar = this.f17976d;
        switch (iB) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(a0.t(i10));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f17973a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f17978f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i10 = this.f17977e;
        d dVar = cVar.f17976d;
        int i11 = cVar.f17977e;
        if (i11 == i10) {
            return i10 != 6 || (dVar.E && this.f17976d.E);
        }
        switch (u.h.b(i10)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z9 = i11 == 2 || i11 == 4;
                if (dVar instanceof h) {
                    return z9 || i11 == 8;
                }
                return z9;
            case 2:
            case 4:
                boolean z10 = i11 == 3 || i11 == 5;
                if (dVar instanceof h) {
                    return z10 || i11 == 9;
                }
                return z10;
            case 5:
                return (i11 == 2 || i11 == 4) ? false : true;
            case 6:
                return (i11 == 6 || i11 == 8 || i11 == 9) ? false : true;
            default:
                throw new AssertionError(a0.t(i10));
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f17978f;
        if (cVar != null && (hashSet = cVar.f17973a) != null) {
            hashSet.remove(this);
            if (this.f17978f.f17973a.size() == 0) {
                this.f17978f.f17973a = null;
            }
        }
        this.f17973a = null;
        this.f17978f = null;
        this.f17979g = 0;
        this.f17980h = Integer.MIN_VALUE;
        this.f17975c = false;
        this.f17974b = 0;
    }

    public final void k() {
        u.i iVar = this.f17981i;
        if (iVar == null) {
            this.f17981i = new u.i(1);
        } else {
            iVar.e();
        }
    }

    public final void l(int i10) {
        this.f17974b = i10;
        this.f17975c = true;
    }

    public final String toString() {
        return this.f17976d.f17997h0 + ":" + a0.t(this.f17977e);
    }
}
