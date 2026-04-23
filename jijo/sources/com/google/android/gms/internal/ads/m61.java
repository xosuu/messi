package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m61 f6878b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6879a = new HashMap();

    static {
        k61 k61Var = new k61(0);
        m61 m61Var = new m61();
        try {
            m61Var.b(k61Var, h61.class);
            f6878b = m61Var;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public final t.a a(l31 l31Var, Integer num) {
        t.a aVarA;
        synchronized (this) {
            l61 l61Var = (l61) this.f6879a.get(l31Var.getClass());
            if (l61Var == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + l31Var.toString() + ": no key creator for this class was registered.");
            }
            aVarA = ((k61) l61Var).a(l31Var, num);
        }
        return aVarA;
    }

    public final synchronized void b(l61 l61Var, Class cls) {
        try {
            l61 l61Var2 = (l61) this.f6879a.get(cls);
            if (l61Var2 != null && !l61Var2.equals(l61Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f6879a.put(cls, l61Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
