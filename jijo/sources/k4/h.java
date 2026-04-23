package k4;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f14676a;

    public h(i iVar) {
        this.f14676a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14676a.f14679d) {
            Object obj = this.f14676a.f14680f;
            if (((g) obj) != null) {
                ((g) obj).f14675f.g();
            }
        }
    }
}
