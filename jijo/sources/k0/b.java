package k0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f14627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14628c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f14626a) {
                    return;
                }
                this.f14626a = true;
                this.f14628c = true;
                a aVar = this.f14627b;
                if (aVar != null) {
                    try {
                        aVar.b();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f14628c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.f14628c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            while (this.f14628c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f14627b == aVar) {
                return;
            }
            this.f14627b = aVar;
            if (this.f14626a) {
                aVar.b();
            }
        }
    }
}
