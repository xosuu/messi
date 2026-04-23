package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class yx0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11067a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f11068b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11069d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11070f;

    public yx0(ay0 ay0Var, Iterator it) {
        this.f11068b = it;
        this.f11070f = ay0Var;
    }

    public final void a() {
        Object obj = this.f11070f;
        ((gy0) obj).c();
        if (((gy0) obj).f5108b != ((Collection) this.f11069d)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f11067a;
        Iterator it = this.f11068b;
        switch (i10) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f11067a;
        Iterator it = this.f11068b;
        switch (i10) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.f11069d = (Collection) entry.getValue();
                return ((zx0) this.f11070f).c(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.f11069d = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f11067a;
        Object obj = this.f11070f;
        Iterator it = this.f11068b;
        switch (i10) {
            case 0:
                en1.M0("no calls to next() since the last call to remove()", ((Collection) this.f11069d) != null);
                it.remove();
                ((zx0) obj).f11336f.f9993h -= ((Collection) this.f11069d).size();
                ((Collection) this.f11069d).clear();
                this.f11069d = null;
                break;
            case 1:
                en1.M0("no calls to next() since the last call to remove()", ((Map.Entry) this.f11069d) != null);
                Collection collection = (Collection) ((Map.Entry) this.f11069d).getValue();
                it.remove();
                ((ay0) obj).f2819b.f9993h -= collection.size();
                collection.clear();
                this.f11069d = null;
                break;
            default:
                it.remove();
                gy0 gy0Var = (gy0) obj;
                vx0 vx0Var = gy0Var.f5111h;
                vx0Var.f9993h--;
                gy0Var.d();
                break;
        }
    }

    public yx0(gy0 gy0Var, ListIterator listIterator) {
        this.f11070f = gy0Var;
        this.f11069d = gy0Var.f5108b;
        this.f11068b = listIterator;
    }

    public yx0(zx0 zx0Var) {
        this.f11070f = zx0Var;
        this.f11068b = zx0Var.f11335d.entrySet().iterator();
    }

    public yx0(gy0 gy0Var) {
        Iterator it;
        this.f11070f = gy0Var;
        Collection collection = gy0Var.f5108b;
        this.f11069d = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f11068b = it;
    }
}
