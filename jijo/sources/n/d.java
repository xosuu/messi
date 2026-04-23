package n;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15812b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f15813d;

    public d(g gVar) {
        this.f15813d = gVar;
    }

    @Override // n.f
    public final void a(c cVar) {
        c cVar2 = this.f15811a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f15810f;
            this.f15811a = cVar3;
            this.f15812b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15812b) {
            return this.f15813d.f15816a != null;
        }
        c cVar = this.f15811a;
        return (cVar == null || cVar.f15809d == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15812b) {
            this.f15812b = false;
            this.f15811a = this.f15813d.f15816a;
        } else {
            c cVar = this.f15811a;
            this.f15811a = cVar != null ? cVar.f15809d : null;
        }
        return this.f15811a;
    }
}
