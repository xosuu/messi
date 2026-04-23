package c2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f1506a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f1507b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f1508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d5.e f1509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k.q f1510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1513h;

    public b(d5.e eVar) {
        int i10 = a0.f1505a;
        this.f1508c = new z();
        this.f1509d = new d5.e();
        this.f1510e = new k.q(16);
        this.f1511f = 4;
        this.f1512g = Integer.MAX_VALUE;
        this.f1513h = 20;
    }
}
