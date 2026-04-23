package g4;

import android.app.Application;
import com.google.android.gms.internal.ads.tp1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13724a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f13725b;

    public h(s0 s0Var) {
        this.f13725b = s0Var;
    }

    @Override // g4.t0
    public final Object zza() {
        int i10 = this.f13724a;
        t0 t0Var = this.f13725b;
        switch (i10) {
            case 0:
                return new g((Application) t0Var.zza());
            default:
                tp1.K(c0.f13709b);
                return new l(t0Var);
        }
    }

    public h(s0 s0Var, int i10) {
        this.f13725b = s0Var;
    }
}
