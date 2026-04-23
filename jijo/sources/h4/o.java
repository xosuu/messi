package h4;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13992b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13993d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f13994f;

    public o(r rVar, boolean z9) {
        this.f13994f = rVar;
        rVar.f14001b.getClass();
        this.f13991a = System.currentTimeMillis();
        rVar.f14001b.getClass();
        this.f13992b = SystemClock.elapsedRealtime();
        this.f13993d = z9;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f13994f;
        if (rVar.f14005f) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            rVar.a(e10, false, this.f13993d);
            b();
        }
    }
}
