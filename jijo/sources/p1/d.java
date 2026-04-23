package p1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16217b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16218d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16219f;

    public d(String str, int i10, int i11, String str2) {
        this.f16216a = i10;
        this.f16217b = i11;
        this.f16218d = str;
        this.f16219f = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int i10 = this.f16216a - dVar.f16216a;
        return i10 == 0 ? this.f16217b - dVar.f16217b : i10;
    }
}
