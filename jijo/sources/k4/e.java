package k4;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14669a = new l();

    public final void a(Exception exc) {
        l lVar = this.f14669a;
        lVar.getClass();
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (lVar.f14682a) {
            try {
                if (lVar.f14684c) {
                    return;
                }
                lVar.f14684c = true;
                lVar.f14687f = exc;
                lVar.f14683b.h(lVar);
            } finally {
            }
        }
    }
}
