package x;

import java.util.ArrayList;
import java.util.Iterator;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f18235d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18238g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f18232a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18233b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18234c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18236e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18239h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f18240i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18241j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f18242k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f18243l = new ArrayList();

    public f(p pVar) {
        this.f18235d = pVar;
    }

    @Override // x.d
    public final void a(d dVar) {
        ArrayList<f> arrayList = this.f18243l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f18241j) {
                return;
            }
        }
        this.f18234c = true;
        p pVar = this.f18232a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f18233b) {
            this.f18235d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : arrayList) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f18241j) {
            g gVar = this.f18240i;
            if (gVar != null) {
                if (!gVar.f18241j) {
                    return;
                } else {
                    this.f18237f = this.f18239h * gVar.f18238g;
                }
            }
            d(fVar.f18238g + this.f18237f);
        }
        p pVar2 = this.f18232a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f18242k.add(dVar);
        if (this.f18241j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f18243l.clear();
        this.f18242k.clear();
        this.f18241j = false;
        this.f18238g = 0;
        this.f18234c = false;
        this.f18233b = false;
    }

    public void d(int i10) {
        if (this.f18241j) {
            return;
        }
        this.f18241j = true;
        this.f18238g = i10;
        for (d dVar : this.f18242k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18235d.f18266b.f17997h0);
        sb.append(":");
        sb.append(a0.w(this.f18236e));
        sb.append("(");
        sb.append(this.f18241j ? Integer.valueOf(this.f18238g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f18243l.size());
        sb.append(":d=");
        sb.append(this.f18242k.size());
        sb.append(">");
        return sb.toString();
    }
}
