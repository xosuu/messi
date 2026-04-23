package p1;

import java.util.List;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f16222c;

    public e(String str, List list, boolean z9) {
        this.f16220a = str;
        this.f16221b = z9;
        this.f16222c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f16221b != eVar.f16221b || !this.f16222c.equals(eVar.f16222c)) {
            return false;
        }
        String str = this.f16220a;
        boolean zStartsWith = str.startsWith("index_");
        String str2 = eVar.f16220a;
        return zStartsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f16220a;
        return this.f16222c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f16221b ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Index{name='");
        sb.append(this.f16220a);
        sb.append("', unique=");
        sb.append(this.f16221b);
        sb.append(", columns=");
        return a0.i(sb, this.f16222c, '}');
    }
}
