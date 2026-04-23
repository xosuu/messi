package r2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f16497b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f16498a = new d();

    public static c a() {
        if (f16497b == null) {
            synchronized (c.class) {
                try {
                    if (f16497b == null) {
                        f16497b = new c();
                    }
                } finally {
                }
            }
        }
        return f16497b;
    }
}
