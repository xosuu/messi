package k6;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Serializable, Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f14715h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f14717b = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14718d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14719f;

    public f() {
        int i10 = f14715h;
        f14715h = i10 + 1;
        this.f14719f = i10;
    }

    public final void a(f fVar) {
        if (fVar.f14716a) {
            this.f14716a = true;
        }
        Iterator it = fVar.f14717b.iterator();
        while (it.hasNext()) {
            this.f14717b.add((h) it.next());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((f) obj).f14719f - this.f14719f;
    }

    public final void d(h hVar) {
        this.f14717b.add(hVar);
    }

    public final f e(char c10) {
        for (h hVar : this.f14717b) {
            if (hVar.f14723a <= c10 && c10 <= hVar.f14724b) {
                return hVar.f14725d;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("state ");
        sb.append(this.f14718d);
        sb.append(this.f14716a ? " [accept]" : " [reject]");
        sb.append(":\n");
        for (h hVar : this.f14717b) {
            sb.append("  ");
            sb.append(hVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
