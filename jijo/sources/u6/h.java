package u6;

import b7.u;
import g4.a0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements y6.b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient g f17654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17655b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f17656d = u.class;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17657f = "classSimpleName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17658h = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f17659q = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f17660s = false;

    public h(Object obj) {
        this.f17655b = obj;
    }

    public final a b() {
        a bVar;
        Class cls = this.f17656d;
        if (cls == null) {
            return null;
        }
        if (this.f17659q) {
            j.f17662a.getClass();
            bVar = new f(cls);
        } else {
            j.f17662a.getClass();
            bVar = new b(cls);
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return b().equals(hVar.b()) && this.f17657f.equals(hVar.f17657f) && this.f17658h.equals(hVar.f17658h) && a0.b(this.f17655b, hVar.f17655b);
        }
        if (!(obj instanceof y6.b)) {
            return false;
        }
        if (this.f17660s) {
            obj2 = this;
        } else {
            Object obj3 = this.f17654a;
            obj2 = obj3;
            if (obj3 == null) {
                g gVar = (g) this;
                j.f17662a.getClass();
                this.f17654a = gVar;
                obj2 = gVar;
            }
        }
        return obj.equals(obj2);
    }

    public final int hashCode() {
        return this.f17658h.hashCode() + ((this.f17657f.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        h hVar;
        if (this.f17660s) {
            hVar = this;
        } else {
            g gVar = this.f17654a;
            hVar = gVar;
            if (gVar == null) {
                g gVar2 = (g) this;
                j.f17662a.getClass();
                this.f17654a = gVar2;
                hVar = gVar2;
            }
        }
        return hVar != this ? hVar.toString() : g1.a.r(new StringBuilder("property "), this.f17657f, " (Kotlin reflection is not available)");
    }
}
