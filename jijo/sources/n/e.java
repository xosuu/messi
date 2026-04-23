package n;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Iterator, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15815b;

    @Override // n.f
    public final void a(c cVar) {
        c cVar2;
        c cVar3;
        c cVar4 = null;
        if (this.f15814a == cVar && cVar == this.f15815b) {
            this.f15815b = null;
            this.f15814a = null;
        }
        c cVar5 = this.f15814a;
        if (cVar5 == cVar) {
            switch (((b) this).f15806d) {
                case 0:
                    cVar3 = cVar5.f15810f;
                    break;
                default:
                    cVar3 = cVar5.f15809d;
                    break;
            }
            this.f15814a = cVar3;
        }
        c cVar6 = this.f15815b;
        if (cVar6 == cVar) {
            c cVar7 = this.f15814a;
            if (cVar6 != cVar7 && cVar7 != null) {
                switch (((b) this).f15806d) {
                    case 0:
                        cVar2 = cVar6.f15809d;
                        break;
                    default:
                        cVar2 = cVar6.f15810f;
                        break;
                }
                cVar4 = cVar2;
            }
            this.f15815b = cVar4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15815b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f15815b;
        c cVar3 = this.f15814a;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (((b) this).f15806d) {
                case 0:
                    cVar = cVar2.f15809d;
                    break;
                default:
                    cVar = cVar2.f15810f;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f15815b = cVar;
        return cVar2;
    }
}
