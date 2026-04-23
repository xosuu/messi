package l2;

import c2.n;
import c2.w;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f15143b = w.f1547a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2.f f15146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2.f f15147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c2.c f15151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f15154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f15155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f15156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f15157p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15158q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15159r;

    static {
        n.l("WorkSpec");
    }

    public j(String str, String str2) {
        c2.f fVar = c2.f.f1526b;
        this.f15146e = fVar;
        this.f15147f = fVar;
        this.f15151j = c2.c.f1514i;
        this.f15153l = 1;
        this.f15154m = 30000L;
        this.f15157p = -1L;
        this.f15159r = 1;
        this.f15142a = str;
        this.f15144c = str2;
    }

    public final long a() {
        int i10;
        if (this.f15143b == w.f1547a && (i10 = this.f15152k) > 0) {
            return Math.min(18000000L, this.f15153l == 2 ? this.f15154m * ((long) i10) : (long) Math.scalb(this.f15154m, i10 - 1)) + this.f15155n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f15155n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f15148g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.f15155n;
        if (j10 == 0) {
            j10 = this.f15148g + jCurrentTimeMillis2;
        }
        long j11 = this.f15150i;
        long j12 = this.f15149h;
        if (j11 != j12) {
            return j10 + j12 + (j10 == 0 ? j11 * (-1) : 0L);
        }
        return j10 + (j10 != 0 ? j12 : 0L);
    }

    public final boolean b() {
        return !c2.c.f1514i.equals(this.f15151j);
    }

    public final boolean c() {
        return this.f15149h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f15148g != jVar.f15148g || this.f15149h != jVar.f15149h || this.f15150i != jVar.f15150i || this.f15152k != jVar.f15152k || this.f15154m != jVar.f15154m || this.f15155n != jVar.f15155n || this.f15156o != jVar.f15156o || this.f15157p != jVar.f15157p || this.f15158q != jVar.f15158q || !this.f15142a.equals(jVar.f15142a) || this.f15143b != jVar.f15143b || !this.f15144c.equals(jVar.f15144c)) {
            return false;
        }
        String str = this.f15145d;
        if (str == null ? jVar.f15145d == null : str.equals(jVar.f15145d)) {
            return this.f15146e.equals(jVar.f15146e) && this.f15147f.equals(jVar.f15147f) && this.f15151j.equals(jVar.f15151j) && this.f15153l == jVar.f15153l && this.f15159r == jVar.f15159r;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f15144c.hashCode() + ((this.f15143b.hashCode() + (this.f15142a.hashCode() * 31)) * 31)) * 31;
        String str = this.f15145d;
        int iHashCode2 = (this.f15147f.hashCode() + ((this.f15146e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.f15148g;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f15149h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f15150i;
        int iB = (u.h.b(this.f15153l) + ((((this.f15151j.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f15152k) * 31)) * 31;
        long j13 = this.f15154m;
        int i12 = (iB + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f15155n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f15156o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f15157p;
        return u.h.b(this.f15159r) + ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f15158q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return g1.a.r(new StringBuilder("{WorkSpec: "), this.f15142a, "}");
    }
}
