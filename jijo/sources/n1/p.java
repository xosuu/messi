package n1;

import android.database.Cursor;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile r1.a f15863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f15864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r1.d f15865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f15866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f15869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f15870h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f15871i = new ThreadLocal();

    public p() {
        new ConcurrentHashMap();
        this.f15866d = d();
    }

    public final void a() {
        if (!this.f15867e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((s1.b) this.f15865c.y()).f16664a.inTransaction() && this.f15871i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        r1.a aVarY = this.f15865c.y();
        this.f15866d.c(aVarY);
        ((s1.b) aVarY).a();
    }

    public abstract i d();

    public abstract r1.d e(a aVar);

    public final void f() {
        ((s1.b) this.f15865c.y()).c();
        if (((s1.b) this.f15865c.y()).f16664a.inTransaction()) {
            return;
        }
        i iVar = this.f15866d;
        if (iVar.f15840d.compareAndSet(false, true)) {
            iVar.f15839c.f15864b.execute(iVar.f15845i);
        }
    }

    public final Cursor g(r1.e eVar) {
        a();
        b();
        return ((s1.b) this.f15865c.y()).A(eVar);
    }

    public final void h() {
        ((s1.b) this.f15865c.y()).D();
    }
}
