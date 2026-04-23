package v5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f17816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f17817b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f17818d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f17819f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f17820h = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17821q = false;

    public f(b bVar) {
        this.f17816a = bVar;
    }

    public final void a(d dVar) {
        if (this.f17817b == null) {
            this.f17817b = new ArrayList();
            this.f17819f = new ArrayList();
        }
        this.f17817b.add(dVar);
        boolean zContains = this.f17819f.contains(dVar.f17811a);
        f fVar = dVar.f17811a;
        if (!zContains) {
            this.f17819f.add(fVar);
        }
        if (fVar.f17820h == null) {
            fVar.f17820h = new ArrayList();
        }
        fVar.f17820h.add(this);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        try {
            f fVar = (f) super.clone();
            fVar.f17816a = this.f17816a.b();
            return fVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
