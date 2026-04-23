package g4;

import android.os.Handler;
import com.google.android.gms.internal.ads.tp1;

/* JADX INFO: loaded from: classes.dex */
public final class p implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f13772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f13773b;

    public p(s0 s0Var, s0 s0Var2) {
        this.f13772a = s0Var;
        this.f13773b = s0Var2;
    }

    @Override // g4.t0
    public final Object zza() {
        q qVar = (q) this.f13772a.zza();
        Handler handler = c0.f13708a;
        tp1.K(handler);
        return new o(qVar, handler, ((s) this.f13773b).zza());
    }
}
