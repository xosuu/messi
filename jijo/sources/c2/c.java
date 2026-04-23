package c2;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f1514i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1519e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f1515a = o.f1537a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1520f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1521g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f1522h = new e();

    static {
        o oVar = o.f1537a;
        e eVar = new e();
        c cVar = new c();
        cVar.f1515a = oVar;
        cVar.f1520f = -1L;
        cVar.f1521g = -1L;
        cVar.f1522h = new e();
        cVar.f1516b = false;
        int i10 = Build.VERSION.SDK_INT;
        cVar.f1517c = false;
        cVar.f1515a = oVar;
        cVar.f1518d = false;
        cVar.f1519e = false;
        if (i10 >= 24) {
            cVar.f1522h = eVar;
            cVar.f1520f = -1L;
            cVar.f1521g = -1L;
        }
        f1514i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1516b == cVar.f1516b && this.f1517c == cVar.f1517c && this.f1518d == cVar.f1518d && this.f1519e == cVar.f1519e && this.f1520f == cVar.f1520f && this.f1521g == cVar.f1521g && this.f1515a == cVar.f1515a) {
            return this.f1522h.equals(cVar.f1522h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f1515a.hashCode() * 31) + (this.f1516b ? 1 : 0)) * 31) + (this.f1517c ? 1 : 0)) * 31) + (this.f1518d ? 1 : 0)) * 31) + (this.f1519e ? 1 : 0)) * 31;
        long j10 = this.f1520f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f1521g;
        return this.f1522h.f1525a.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }
}
