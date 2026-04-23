package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class z51 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f11153c = Logger.getLogger(z51.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z51 f11154d = new z51();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f11155a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11156b = new ConcurrentHashMap();

    public final synchronized void a(e61 e61Var) {
        b(e61Var, 1);
    }

    public final synchronized void b(e61 e61Var, int i10) {
        if (!tp1.N(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        d(e61Var);
    }

    public final synchronized e61 c(String str) {
        if (!this.f11155a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (e61) this.f11155a.get(str);
    }

    public final synchronized void d(e61 e61Var) {
        try {
            String str = e61Var.f3873a;
            if (this.f11156b.containsKey(str) && !((Boolean) this.f11156b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((e61) this.f11155a.get(str)) != null && !e61.class.equals(e61.class)) {
                f11153c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, e61.class.getName(), e61.class.getName()));
            }
            this.f11155a.putIfAbsent(str, e61Var);
            this.f11156b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }
}
