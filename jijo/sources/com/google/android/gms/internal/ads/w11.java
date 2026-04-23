package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class w11 extends i11 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t3.i f10030v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c.a f10031w = new c.a(w11.class);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile Set f10032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile int f10033u;

    static {
        Throwable th;
        t3.i g11Var;
        try {
            g11Var = new v11(AtomicReferenceFieldUpdater.newUpdater(w11.class, Set.class, "t"), AtomicIntegerFieldUpdater.newUpdater(w11.class, "u"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            g11Var = new g11();
        }
        Throwable th3 = th;
        f10030v = g11Var;
        if (th3 != null) {
            f10031w.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
