package n2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f15906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5.a f15907b;

    public e(g gVar, n5.a aVar) {
        this.f15906a = gVar;
        this.f15907b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15906a.f15915a != this) {
            return;
        }
        if (g.f15913q.c(this.f15906a, this, g.f(this.f15907b))) {
            g.c(this.f15906a);
        }
    }
}
