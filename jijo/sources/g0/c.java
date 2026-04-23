package g0;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f13600e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13604d;

    public c(int i10, int i11, int i12, int i13) {
        this.f13601a = i10;
        this.f13602b = i11;
        this.f13603c = i12;
        this.f13604d = i13;
    }

    public static c a(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f13600e : new c(i10, i11, i12, i13);
    }

    public static c b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return b.a(this.f13601a, this.f13602b, this.f13603c, this.f13604d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13604d == cVar.f13604d && this.f13601a == cVar.f13601a && this.f13603c == cVar.f13603c && this.f13602b == cVar.f13602b;
    }

    public final int hashCode() {
        return (((((this.f13601a * 31) + this.f13602b) * 31) + this.f13603c) * 31) + this.f13604d;
    }

    public final String toString() {
        return "Insets{left=" + this.f13601a + ", top=" + this.f13602b + ", right=" + this.f13603c + ", bottom=" + this.f13604d + '}';
    }
}
