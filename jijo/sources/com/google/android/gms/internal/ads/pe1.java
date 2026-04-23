package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class pe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f7864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f7865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oe1 f7866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f7867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f7868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f7869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f7870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f7871h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    static {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe1.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f7868e) {
            return ((Unsafe) f7866c.f7565a).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f7868e) {
            ((Unsafe) f7866c.f7565a).arrayIndexScale(cls);
        }
    }

    public static void c(Object obj, long j10, byte b10) {
        oe1 oe1Var = f7866c;
        long j11 = (-4) & j10;
        int i10 = ((Unsafe) oe1Var.f7565a).getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        ((Unsafe) oe1Var.f7565a).putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void d(Object obj, long j10, byte b10) {
        oe1 oe1Var = f7866c;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        ((Unsafe) oe1Var.f7565a).putInt(obj, j11, ((255 & b10) << i10) | (((Unsafe) oe1Var.f7565a).getInt(obj, j11) & (~(255 << i10))));
    }

    public static double e(long j10, Object obj) {
        return f7866c.x0(j10, obj);
    }

    public static float f(long j10, Object obj) {
        return f7866c.z0(j10, obj);
    }

    public static int g(long j10, Object obj) {
        return ((Unsafe) f7866c.f7565a).getInt(obj, j10);
    }

    public static long h(ByteBuffer byteBuffer) {
        return ((Unsafe) f7866c.f7565a).getLong(byteBuffer, f7870g);
    }

    public static long i(long j10, Object obj) {
        return ((Unsafe) f7866c.f7565a).getLong(obj, j10);
    }

    public static Object j(Class cls) {
        try {
            return f7864a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object k(long j10, Object obj) {
        return ((Unsafe) f7866c.f7565a).getObject(obj, j10);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new le1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(Object obj, long j10, boolean z9) {
        f7866c.B0(obj, j10, z9);
    }

    public static void n(byte[] bArr, long j10, byte b10) {
        f7866c.C0(bArr, f7869f + j10, b10);
    }

    public static void o(Object obj, long j10, double d10) {
        f7866c.D0(obj, j10, d10);
    }

    public static void p(Object obj, long j10, float f10) {
        f7866c.E0(obj, j10, f10);
    }

    public static void q(long j10, Object obj, int i10) {
        ((Unsafe) f7866c.f7565a).putInt(obj, j10, i10);
    }

    public static void r(Object obj, long j10, long j11) {
        ((Unsafe) f7866c.f7565a).putLong(obj, j10, j11);
    }

    public static void s(Object obj, long j10, Object obj2) {
        ((Unsafe) f7866c.f7565a).putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean t(long j10, Object obj) {
        return ((byte) ((((Unsafe) f7866c.f7565a).getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean u(long j10, Object obj) {
        return ((byte) ((((Unsafe) f7866c.f7565a).getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean v(Class cls) {
        int i10 = xb1.f10533a;
        try {
            Class cls2 = f7865b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean w(long j10, Object obj) {
        return f7866c.F0(j10, obj);
    }
}
