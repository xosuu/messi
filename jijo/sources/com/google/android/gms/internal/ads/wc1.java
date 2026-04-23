package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class wc1 extends vb1 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Object, wc1> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd;
    protected ke1 zzt;

    public wc1() {
        this.zzq = 0;
        this.zzd = -1;
        this.zzt = ke1.f6268f;
    }

    public static dd1 h(dd1 dd1Var) {
        int size = dd1Var.size();
        return dd1Var.a(size == 0 ? 10 : size + size);
    }

    public static Object j(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static wc1 p(Class cls) {
        wc1 wc1Var = zzc.get(cls);
        if (wc1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wc1Var = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (wc1Var == null) {
            wc1Var = (wc1) ((wc1) pe1.j(cls)).x(6, null);
            if (wc1Var == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, wc1Var);
        }
        return wc1Var;
    }

    public static wc1 r(wc1 wc1Var, ec1 ec1Var, pc1 pc1Var) {
        ic1 ic1VarL = ec1Var.l();
        wc1 wc1VarS = s(wc1Var, ic1VarL, pc1Var);
        ic1VarL.y();
        y(wc1VarS);
        return wc1VarS;
    }

    public static wc1 s(wc1 wc1Var, ic1 ic1Var, pc1 pc1Var) throws zzgyn {
        wc1 wc1VarQ = wc1Var.q();
        try {
            ge1 ge1VarA = yd1.f10857c.a(wc1VarQ.getClass());
            jc1 jc1Var = ic1Var.f5562b;
            if (jc1Var == null) {
                jc1Var = new jc1(ic1Var);
            }
            ge1VarA.e(wc1VarQ, jc1Var, pc1Var);
            ge1VarA.b(wc1VarQ);
            return wc1VarQ;
        } catch (zzgyn e10) {
            if (e10.f11646a) {
                throw new zzgyn(e10.getMessage(), e10);
            }
            throw e10;
        } catch (zzhar e11) {
            throw new zzgyn(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgyn) {
                throw ((zzgyn) e12.getCause());
            }
            throw new zzgyn(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzgyn) {
                throw ((zzgyn) e13.getCause());
            }
            throw e13;
        }
    }

    public static void t(Class cls, wc1 wc1Var) {
        wc1Var.n();
        zzc.put(cls, wc1Var);
    }

    public static final boolean u(wc1 wc1Var, boolean z9) {
        byte bByteValue = ((Byte) wc1Var.x(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = yd1.f10857c.a(wc1Var.getClass()).f(wc1Var);
        if (z9) {
            wc1Var.x(2, true == zF ? wc1Var : null);
        }
        return zF;
    }

    public static void y(wc1 wc1Var) {
        if (wc1Var != null && !u(wc1Var, true)) {
            throw new zzgyn(new zzhar().getMessage());
        }
    }

    public static wc1 z(wc1 wc1Var, byte[] bArr, int i10, pc1 pc1Var) throws zzgyn {
        if (i10 == 0) {
            return wc1Var;
        }
        wc1 wc1VarQ = wc1Var.q();
        try {
            ge1 ge1VarA = yd1.f10857c.a(wc1VarQ.getClass());
            ge1VarA.h(wc1VarQ, bArr, 0, i10, new s7(pc1Var));
            ge1VarA.b(wc1VarQ);
            return wc1VarQ;
        } catch (zzgyn e10) {
            if (e10.f11646a) {
                throw new zzgyn(e10.getMessage(), e10);
            }
            throw e10;
        } catch (zzhar e11) {
            throw new zzgyn(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgyn) {
                throw ((zzgyn) e12.getCause());
            }
            throw new zzgyn(e12.getMessage(), e12);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgyn.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.vb1
    public final int a(ge1 ge1Var) {
        int iZza;
        int iZza2;
        if (v()) {
            if (ge1Var == null) {
                iZza2 = yd1.f10857c.a(getClass()).zza(this);
            } else {
                iZza2 = ge1Var.zza(this);
            }
            if (iZza2 >= 0) {
                return iZza2;
            }
            throw new IllegalStateException(fb1.g("serialized size must be non-negative, was ", iZza2));
        }
        int i10 = this.zzd;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (ge1Var == null) {
            iZza = yd1.f10857c.a(getClass()).zza(this);
        } else {
            iZza = ge1Var.zza(this);
        }
        f(iZza);
        return iZza;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return yd1.f10857c.a(getClass()).c(this, (wc1) obj);
    }

    public final void f(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(fb1.g("serialized size must be non-negative, was ", i10));
        }
        this.zzd = i10 | (this.zzd & zza);
    }

    public final uc1 g() {
        return (uc1) x(5, null);
    }

    public final int hashCode() {
        if (v()) {
            return yd1.f10857c.a(getClass()).a(this);
        }
        if (this.zzq == 0) {
            this.zzq = yd1.f10857c.a(getClass()).a(this);
        }
        return this.zzq;
    }

    public final wd1 i() {
        return (wd1) x(7, null);
    }

    public final void k() {
        this.zzq = 0;
    }

    public final void l() {
        f(Integer.MAX_VALUE);
    }

    public final void m() {
        yd1.f10857c.a(getClass()).b(this);
        n();
    }

    public final void n() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final uc1 o() {
        uc1 uc1Var = (uc1) x(5, null);
        if (!uc1Var.f9461a.equals(this)) {
            uc1Var.d();
            wc1 wc1Var = uc1Var.f9462b;
            yd1.f10857c.a(wc1Var.getClass()).d(wc1Var, this);
        }
        return uc1Var;
    }

    public final wc1 q() {
        return (wc1) x(4, null);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = sd1.f8846a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        sd1.c(this, sb, 0);
        return sb.toString();
    }

    public final boolean v() {
        return (this.zzd & zza) != 0;
    }

    public final void w(mc1 mc1Var) {
        ge1 ge1VarA = yd1.f10857c.a(getClass());
        nc1 nc1Var = mc1Var.f6902c;
        if (nc1Var == null) {
            nc1Var = new nc1(mc1Var);
        }
        ge1VarA.g(this, nc1Var);
    }

    public abstract Object x(int i10, wc1 wc1Var);
}
