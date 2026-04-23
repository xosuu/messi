package f7;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f13206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f13207b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f13210e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f13212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f13213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f13214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f13215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f13216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13217l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13208c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f13211f = new e();

    public static void b(String str, b0 b0Var) {
        if (b0Var.f13225s != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (b0Var.f13226t != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (b0Var.f13227u != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (b0Var.f13228v != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    public final b0 a() {
        if (this.f13206a == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f13207b == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f13208c >= 0) {
            if (this.f13209d != null) {
                return new b0(this);
            }
            throw new IllegalStateException("message == null");
        }
        throw new IllegalStateException("code < 0: " + this.f13208c);
    }
}
