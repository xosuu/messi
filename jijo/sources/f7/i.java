package f7;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f13288g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f13291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f13292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f5.b f13293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13294f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = g7.b.f13888a;
        f13288g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new g7.a("OkHttp ConnectionPool", true));
    }

    public i() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f13291c = new h(0, this);
        this.f13292d = new ArrayDeque();
        this.f13293e = new f5.b();
        this.f13289a = 5;
        this.f13290b = timeUnit.toNanos(5L);
    }

    public final long a(long j10) {
        synchronized (this) {
            try {
                i7.b bVar = null;
                long j11 = Long.MIN_VALUE;
                int i10 = 0;
                int i11 = 0;
                for (i7.b bVar2 : this.f13292d) {
                    if (b(bVar2, j10) > 0) {
                        i11++;
                    } else {
                        i10++;
                        long j12 = j10 - bVar2.f14194o;
                        if (j12 > j11) {
                            bVar = bVar2;
                            j11 = j12;
                        }
                    }
                }
                long j13 = this.f13290b;
                if (j11 < j13 && i10 <= this.f13289a) {
                    if (i10 > 0) {
                        return j13 - j11;
                    }
                    if (i11 > 0) {
                        return j13;
                    }
                    this.f13294f = false;
                    return -1L;
                }
                this.f13292d.remove(bVar);
                g7.b.e(bVar.f14184e);
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(i7.b bVar, long j10) {
        ArrayList arrayList = bVar.f14193n;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                m7.h.f15802a.l(((i7.c) reference).f14195a, "A connection to " + bVar.f14182c.f13251a.f13195a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i10);
                bVar.f14190k = true;
                if (arrayList.isEmpty()) {
                    bVar.f14194o = j10 - this.f13290b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
