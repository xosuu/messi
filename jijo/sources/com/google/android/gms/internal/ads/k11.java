package com.google.android.gms.internal.ads;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class k11 extends t3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f6138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f6140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f6141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f6142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f6143g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new j11());
        }
        try {
            f6140d = unsafe.objectFieldOffset(m11.class.getDeclaredField("d"));
            f6139c = unsafe.objectFieldOffset(m11.class.getDeclaredField("b"));
            f6141e = unsafe.objectFieldOffset(m11.class.getDeclaredField("a"));
            f6142f = unsafe.objectFieldOffset(l11.class.getDeclaredField("a"));
            f6143g = unsafe.objectFieldOffset(l11.class.getDeclaredField("b"));
            f6138b = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // t3.i
    public final d11 D(m11 m11Var) {
        d11 d11Var;
        d11 d11Var2 = d11.f3534d;
        do {
            d11Var = m11Var.f6806b;
            if (d11Var2 == d11Var) {
                break;
            }
        } while (!U(m11Var, d11Var, d11Var2));
        return d11Var;
    }

    @Override // t3.i
    public final l11 K(m11 m11Var) {
        l11 l11Var;
        l11 l11Var2 = l11.f6453c;
        do {
            l11Var = m11Var.f6807d;
            if (l11Var2 == l11Var) {
                break;
            }
        } while (!W(m11Var, l11Var, l11Var2));
        return l11Var;
    }

    @Override // t3.i
    public final void O(l11 l11Var, l11 l11Var2) {
        f6138b.putObject(l11Var, f6143g, l11Var2);
    }

    @Override // t3.i
    public final void T(l11 l11Var, Thread thread) {
        f6138b.putObject(l11Var, f6142f, thread);
    }

    @Override // t3.i
    public final boolean U(m11 m11Var, d11 d11Var, d11 d11Var2) {
        return p11.a(f6138b, m11Var, f6139c, d11Var, d11Var2);
    }

    @Override // t3.i
    public final boolean V(m11 m11Var, Object obj, Object obj2) {
        return p11.a(f6138b, m11Var, f6141e, obj, obj2);
    }

    @Override // t3.i
    public final boolean W(m11 m11Var, l11 l11Var, l11 l11Var2) {
        return p11.a(f6138b, m11Var, f6140d, l11Var, l11Var2);
    }
}
