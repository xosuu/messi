package g4;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f13776d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile s0 f13777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f13778b;

    public static s0 a(r0 r0Var) {
        if (r0Var instanceof q0) {
            return r0Var;
        }
        q0 q0Var = new q0();
        q0Var.f13778b = f13776d;
        q0Var.f13777a = r0Var;
        return q0Var;
    }

    @Override // g4.t0
    public final Object zza() {
        Object objZza = this.f13778b;
        Object obj = f13776d;
        if (objZza == obj) {
            synchronized (this) {
                try {
                    objZza = this.f13778b;
                    if (objZza == obj) {
                        objZza = this.f13777a.zza();
                        Object obj2 = this.f13778b;
                        if (obj2 != obj && obj2 != objZza) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                        }
                        this.f13778b = objZza;
                        this.f13777a = null;
                    }
                } finally {
                }
            }
        }
        return objZza;
    }
}
