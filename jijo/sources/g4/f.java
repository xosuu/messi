package g4;

import android.app.Application;
import com.google.android.gms.internal.ads.tp1;

/* JADX INFO: loaded from: classes.dex */
public final class f implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f13717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f13718b;

    public f(s0 s0Var, s0 s0Var2) {
        this.f13717a = s0Var;
        this.f13718b = s0Var2;
    }

    @Override // g4.t0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e zza() {
        Application application = (Application) this.f13717a.zza();
        g gVar = (g) this.f13718b.zza();
        b0 b0Var = c0.f13709b;
        tp1.K(b0Var);
        return new e(application, gVar, b0Var);
    }
}
