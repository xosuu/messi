package p1;

import java.util.Collections;
import java.util.List;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f16215e;

    public c(String str, String str2, String str3, List list, List list2) {
        this.f16211a = str;
        this.f16212b = str2;
        this.f16213c = str3;
        this.f16214d = Collections.unmodifiableList(list);
        this.f16215e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f16211a.equals(cVar.f16211a) && this.f16212b.equals(cVar.f16212b) && this.f16213c.equals(cVar.f16213c) && this.f16214d.equals(cVar.f16214d)) {
            return this.f16215e.equals(cVar.f16215e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16215e.hashCode() + ((this.f16214d.hashCode() + ((this.f16213c.hashCode() + ((this.f16212b.hashCode() + (this.f16211a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
        sb.append(this.f16211a);
        sb.append("', onDelete='");
        sb.append(this.f16212b);
        sb.append("', onUpdate='");
        sb.append(this.f16213c);
        sb.append("', columnNames=");
        sb.append(this.f16214d);
        sb.append(", referenceColumnNames=");
        return a0.i(sb, this.f16215e, '}');
    }
}
