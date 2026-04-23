package g4;

import android.app.Application;
import android.os.Handler;
import com.google.android.gms.internal.ads.tp1;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f13682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f13683b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f13684d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t0 f13685f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f13686h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t0 f13687q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t0 f13688s;

    public a1(s0 s0Var, s0 s0Var2, s0 s0Var3, s0 s0Var4, s0 s0Var5, s0 s0Var6, s0 s0Var7) {
        this.f13682a = s0Var;
        this.f13683b = s0Var2;
        this.f13684d = s0Var3;
        this.f13685f = s0Var4;
        this.f13686h = s0Var5;
        this.f13687q = s0Var6;
        this.f13688s = s0Var7;
    }

    @Override // g4.t0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z0 zza() {
        Application application = (Application) this.f13682a.zza();
        Handler handler = c0.f13708a;
        tp1.K(handler);
        b0 b0Var = c0.f13709b;
        tp1.K(b0Var);
        return new z0(application, handler, b0Var, (g) this.f13684d.zza(), (l) this.f13685f.zza(), ((x0) this.f13686h).zza(), ((a) this.f13687q).zza(), (u0) this.f13688s.zza());
    }
}
