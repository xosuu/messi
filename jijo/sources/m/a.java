package m;

import androidx.activity.e;
import b4.f;
import f.u0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f15363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u0 f15364e = new u0(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f15365c;

    public static a r0() {
        if (f15363d != null) {
            return f15363d;
        }
        synchronized (a.class) {
            try {
                if (f15363d == null) {
                    a aVar = new a();
                    aVar.f15365c = new c();
                    f15363d = aVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15363d;
    }

    public final void q0(Runnable runnable) {
        this.f15365c.r0(runnable);
    }

    public final void s0(e eVar) {
        this.f15365c.t0(eVar);
    }
}
