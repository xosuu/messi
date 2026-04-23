package e7;

import c2.n;
import d7.q;
import g4.a0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f12770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f12773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f12774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f12775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f12776h;

    static {
        String property;
        int i10 = q.f12510a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f12769a = property;
        f12770b = a0.B("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = q.f12510a;
        if (i11 < 2) {
            i11 = 2;
        }
        f12771c = a0.C("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
        f12772d = a0.C("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f12773e = TimeUnit.SECONDS.toNanos(a0.B("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f12774f = f.f12764x;
        f12775g = new n(0);
        f12776h = new n(1);
    }
}
