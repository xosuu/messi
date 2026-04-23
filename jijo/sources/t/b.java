package t;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f16772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f16773c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f16774a;

    static {
        if (h.f16789f) {
            f16773c = null;
            f16772b = null;
        } else {
            f16773c = new b(null, false);
            f16772b = new b(null, true);
        }
    }

    public b(Throwable th, boolean z9) {
        this.f16774a = th;
    }
}
