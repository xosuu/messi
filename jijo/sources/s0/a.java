package s0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16639i;

    public final float a(long j10) {
        if (j10 < this.f16635e) {
            return 0.0f;
        }
        long j11 = this.f16637g;
        if (j11 < 0 || j10 < j11) {
            return g.b((j10 - r0) / this.f16631a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f16638h;
        return (g.b((j10 - j11) / this.f16639i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
