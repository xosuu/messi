package g4;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f13815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f13816b;

    public x0(s0 s0Var, s0 s0Var2) {
        this.f13815a = s0Var;
        this.f13816b = s0Var2;
    }

    @Override // g4.t0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w0 zza() {
        return new w0((Application) this.f13815a.zza(), (g) this.f13816b.zza());
    }
}
