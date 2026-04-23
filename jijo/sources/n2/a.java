package n2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15892d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f15894b;

    static {
        if (g.f15911f) {
            f15892d = null;
            f15891c = null;
        } else {
            f15892d = new a(null, false);
            f15891c = new a(null, true);
        }
    }

    public a(Throwable th, boolean z9) {
        this.f15893a = z9;
        this.f15894b = th;
    }
}
