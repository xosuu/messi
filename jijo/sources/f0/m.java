package f0;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f13031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f13032b;

    public m(Resources resources, Resources.Theme theme) {
        this.f13031a = resources;
        this.f13032b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13031a.equals(mVar.f13031a) && n0.b.a(this.f13032b, mVar.f13032b);
    }

    public final int hashCode() {
        return n0.b.b(this.f13031a, this.f13032b);
    }
}
