package g4;

import android.app.Application;
import android.os.Handler;
import com.google.android.gms.internal.ads.tp1;

/* JADX INFO: loaded from: classes.dex */
public final class s implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f13787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f13788b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f13789d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t0 f13790f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f13791h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t0 f13792q;

    public s(s0 s0Var, s0 s0Var2, s0 s0Var3, s0 s0Var4, s0 s0Var5, s0 s0Var6) {
        this.f13787a = s0Var;
        this.f13788b = s0Var2;
        this.f13789d = s0Var3;
        this.f13790f = s0Var4;
        this.f13791h = s0Var5;
        this.f13792q = s0Var6;
    }

    @Override // g4.t0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r zza() {
        Application application = (Application) this.f13787a.zza();
        q qVar = (q) this.f13788b.zza();
        Handler handler = c0.f13708a;
        tp1.K(handler);
        b0 b0Var = c0.f13709b;
        tp1.K(b0Var);
        return new r(application, qVar, handler, b0Var, (u0) this.f13789d.zza(), ((f) this.f13790f).zza(), (k) this.f13791h.zza(), (g) this.f13792q.zza());
    }
}
