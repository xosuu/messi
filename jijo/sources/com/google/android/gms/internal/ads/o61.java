package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o61 f7520b = new o61();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f7521a = new HashMap();

    public final synchronized void a(x31 x31Var, Class cls) {
        try {
            n61 n61Var = (n61) this.f7521a.get(cls);
            if (n61Var != null && !n61Var.equals(x31Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f7521a.put(cls, x31Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
