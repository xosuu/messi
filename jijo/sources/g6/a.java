package g6;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f13882b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = ((a) obj).f13881a;
        long j11 = this.f13881a;
        if (j11 > j10) {
            return 1;
        }
        return j11 == j10 ? 0 : -1;
    }
}
