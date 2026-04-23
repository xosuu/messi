package k1;

import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14643c;

    public c(long j10, long j11, int i10) {
        this.f14641a = j10;
        this.f14642b = j11;
        this.f14643c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14641a == cVar.f14641a && this.f14642b == cVar.f14642b && this.f14643c == cVar.f14643c;
    }

    public final int hashCode() {
        long j10 = this.f14641a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f14642b;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f14643c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f14641a);
        sb.append(", ModelVersion=");
        sb.append(this.f14642b);
        sb.append(", TopicCode=");
        return g1.a.q("Topic { ", a0.h(sb, this.f14643c, " }"));
    }
}
