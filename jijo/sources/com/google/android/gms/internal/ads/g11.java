package com.google.android.gms.internal.ads;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g11 extends t3.i {
    @Override // t3.i
    public int A(w11 w11Var) {
        int i10;
        synchronized (w11Var) {
            i10 = w11Var.f10033u - 1;
            w11Var.f10033u = i10;
        }
        return i10;
    }

    @Override // t3.i
    public d11 D(m11 m11Var) {
        d11 d11Var;
        d11 d11Var2 = d11.f3534d;
        synchronized (m11Var) {
            d11Var = m11Var.f6806b;
            if (d11Var != d11Var2) {
                m11Var.f6806b = d11Var2;
            }
        }
        return d11Var;
    }

    @Override // t3.i
    public l11 K(m11 m11Var) {
        l11 l11Var;
        l11 l11Var2 = l11.f6453c;
        synchronized (m11Var) {
            l11Var = m11Var.f6807d;
            if (l11Var != l11Var2) {
                m11Var.f6807d = l11Var2;
            }
        }
        return l11Var;
    }

    @Override // t3.i
    public void M(w11 w11Var, Set set) {
        synchronized (w11Var) {
            if (w11Var.f10032t == null) {
                w11Var.f10032t = set;
            }
        }
    }

    @Override // t3.i
    public void O(l11 l11Var, l11 l11Var2) {
        l11Var.f6455b = l11Var2;
    }

    @Override // t3.i
    public void T(l11 l11Var, Thread thread) {
        l11Var.f6454a = thread;
    }

    @Override // t3.i
    public boolean U(m11 m11Var, d11 d11Var, d11 d11Var2) {
        synchronized (m11Var) {
            try {
                if (m11Var.f6806b != d11Var) {
                    return false;
                }
                m11Var.f6806b = d11Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t3.i
    public boolean V(m11 m11Var, Object obj, Object obj2) {
        synchronized (m11Var) {
            try {
                if (m11Var.f6805a != obj) {
                    return false;
                }
                m11Var.f6805a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t3.i
    public boolean W(m11 m11Var, l11 l11Var, l11 l11Var2) {
        synchronized (m11Var) {
            try {
                if (m11Var.f6807d != l11Var) {
                    return false;
                }
                m11Var.f6807d = l11Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t3.i
    public boolean b(n2.g gVar, n2.c cVar, n2.c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f15916b != cVar) {
                    return false;
                }
                gVar.f15916b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t3.i
    public boolean c(n2.g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f15915a != obj) {
                    return false;
                }
                gVar.f15915a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t3.i
    public boolean d(n2.g gVar, n2.f fVar, n2.f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f15917d != fVar) {
                    return false;
                }
                gVar.f15917d = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t3.i
    public Intent j(androidx.activity.i iVar, Object obj) {
        Intent intent = (Intent) obj;
        g4.a0.f(iVar, "context");
        g4.a0.f(intent, "input");
        return intent;
    }

    @Override // t3.i
    public Object v(int i10, Intent intent) {
        return new ActivityResult(i10, intent);
    }

    @Override // t3.i
    public void w(n2.f fVar, n2.f fVar2) {
        fVar.f15910b = fVar2;
    }

    @Override // t3.i
    public void x(n2.f fVar, Thread thread) {
        fVar.f15909a = thread;
    }
}
