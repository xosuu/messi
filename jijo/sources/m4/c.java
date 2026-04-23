package m4;

import android.animation.TimeInterpolator;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f15749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15751e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f15749c;
        return timeInterpolator != null ? timeInterpolator : a.f15741b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15747a == cVar.f15747a && this.f15748b == cVar.f15748b && this.f15750d == cVar.f15750d && this.f15751e == cVar.f15751e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f15747a;
        long j11 = this.f15748b;
        return ((((a().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f15750d) * 31) + this.f15751e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f15747a);
        sb.append(" duration: ");
        sb.append(this.f15748b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f15750d);
        sb.append(" repeatMode: ");
        return a0.h(sb, this.f15751e, "}\n");
    }
}
