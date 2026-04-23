package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ra extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8553h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(ja jaVar, j8 j8Var, int i10, int i11) {
        super(jaVar, "g3h/WBQ8k1SqFyNwcX6aXlyabMyZPKS0QgL4qcVfix1XI+70++CdiHkDZKRlUPQw", "8DR7pqgII7Dvg/rx7G/5VQ7MbFexA62WxQA5oVjQDIU=", j8Var, i10, 89);
        this.f8553h = i11;
        switch (i11) {
            case 1:
                super(jaVar, "d7YRusR2mxxBt1bBYjK2gXVvJl/MfqFw2IiZZVeFOFqksQBErGXLOKgf56kYtWpK", "q4VBjxb/Ij/RcUKEcmQK+TpC64QFNLpq6sfIawaWN1g=", j8Var, i10, 49);
                break;
            case 2:
                super(jaVar, "2/TrxXzdli4Us4FPDPyGZmc5MrxtH8QgmFF/OAjS44SLVVLbzYRftaNDX3sVzVmu", "9ObkV+9nuY0gPBNLH25GoxM7YATuF1pi7IORvVFb3+Q=", j8Var, i10, 5);
                break;
            case 3:
                super(jaVar, "SHfJbyMgI7MrHewwYoTmYsM7CTkziBSZ0pvzhPCRWcLGoNw6AaEZWLqlKa0dpKuD", "SxHy+zpC+eGmQUPW4BYYcldQdVxiSSVnY0gIrWauGKU=", j8Var, i10, 76);
                break;
            case 4:
                super(jaVar, "I0TLK4/NNf4PWI9wQGA/sSwUTUIPgbxkHrNqtFLC41yDeZSimeJq/+llE4fAA31b", "eUrWQVF8FAlcOLX3Auj55rxdEWjF+0P5JAPLCHVKKQw=", j8Var, i10, 12);
                break;
            case 5:
                super(jaVar, "WfvM4SeNDVyFarUKUVpVTE2MRQkjnaN4GpgwC5lMrmyQkCennlTSSkgCAZvzOVXK", "Kq6mcF8LH4HqXGyg5/DR3VvLtDExNTPXoCRIPhkdOGM=", j8Var, i10, 3);
                break;
            case 6:
                super(jaVar, "0njjbCFUq6vJ1UgnErUI7KEtLgZLN7V9IJ5yZ3QtzXmjMaTjzKInpeDNakYTgh0P", "C8NIMy/t/HZjKrbJt0Xe/Cv+czK1jvEhHHQsIVfXSJE=", j8Var, i10, 73);
                break;
            case 7:
                super(jaVar, "6JHAw9/xzu8LcH4q9f7Udi9sTntehS9dfukXhX8DEHhp54WYBhd6ZhWkqnOAMGmY", "bFK3lRg0oaTUwYDrSsMiLa/j4LG9nRlI5KKEyt63x08=", j8Var, i10, 51);
                break;
            case 8:
                super(jaVar, "5HcA415u1KU8m2yVlDZBhQQK+0IFNRmmWPxuAq0DnfPzSdJ/uWlnYMD1kKfkH6cZ", "u7Ufq5yuXkEXg69T8jpWuOOX55Q9g2DSVI1gtbNUvY8=", j8Var, i10, 48);
                break;
            default:
                break;
        }
    }

    private final void c() {
        String str = (String) this.f5556e.invoke(null, new Object[0]);
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            j8Var.d();
            x8.f0((x8) j8Var.f9462b, str);
        }
    }

    private final void d() {
        j8 j8Var = this.f5555d;
        j8Var.d();
        x8.C0((x8) j8Var.f9462b, -1L);
        j8 j8Var2 = this.f5555d;
        j8Var2.d();
        x8.D0((x8) j8Var2.f9462b, -1L);
        int[] iArr = (int[]) this.f5556e.invoke(null, this.f5552a.f5850a);
        synchronized (this.f5555d) {
            try {
                j8 j8Var3 = this.f5555d;
                long j10 = iArr[0];
                j8Var3.d();
                x8.C0((x8) j8Var3.f9462b, j10);
                j8 j8Var4 = this.f5555d;
                long j11 = iArr[1];
                j8Var4.d();
                x8.D0((x8) j8Var4.f9462b, j11);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    j8 j8Var5 = this.f5555d;
                    j8Var5.d();
                    x8.U((x8) j8Var5.f9462b, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        String str = (String) this.f5556e.invoke(null, this.f5552a.f5850a, Boolean.valueOf(((Boolean) zzba.zzc().a(eg.f4145u2)).booleanValue()));
        ca caVar = new ca();
        caVar.f3235a = -1L;
        caVar.f3236b = -1L;
        HashMap mapA = i9.a(str);
        if (mapA != null) {
            caVar.f3235a = ((Long) mapA.get(0)).longValue();
            caVar.f3236b = ((Long) mapA.get(1)).longValue();
        }
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            long j10 = caVar.f3235a;
            j8Var.d();
            x8.B0((x8) j8Var.f9462b, j10);
            j8 j8Var2 = this.f5555d;
            long j11 = caVar.f3236b;
            j8Var2.d();
            x8.V((x8) j8Var2.f9462b, j11);
        }
    }

    private final void f() {
        synchronized (this.f5555d) {
            String str = (String) this.f5556e.invoke(null, new Object[0]);
            ga gaVar = new ga();
            HashMap mapA = i9.a(str);
            if (mapA != null) {
                gaVar.f4853a = (Long) mapA.get(0);
                gaVar.f4854b = (Long) mapA.get(1);
            }
            j8 j8Var = this.f5555d;
            long jLongValue = gaVar.f4853a.longValue();
            j8Var.d();
            x8.N((x8) j8Var.f9462b, jLongValue);
            j8 j8Var2 = this.f5555d;
            long jLongValue2 = gaVar.f4854b.longValue();
            j8Var2.d();
            x8.O((x8) j8Var2.f9462b, jLongValue2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() throws InvocationTargetException {
        int i10;
        switch (this.f8553h) {
            case 0:
                c();
                return;
            case 1:
                j8 j8Var = this.f5555d;
                j8Var.d();
                x8.o0((x8) j8Var.f9462b, 3);
                try {
                    i10 = true != ((Boolean) this.f5556e.invoke(null, this.f5552a.f5850a)).booleanValue() ? 1 : 2;
                    j8Var.d();
                    x8.o0((x8) j8Var.f9462b, i10);
                    return;
                } catch (InvocationTargetException e10) {
                    if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e10;
                    }
                    return;
                }
            case 2:
                d();
                return;
            case 3:
                i10 = true != ((Boolean) this.f5556e.invoke(null, this.f5552a.f5850a)).booleanValue() ? 1 : 2;
                j8 j8Var2 = this.f5555d;
                j8Var2.d();
                x8.r0((x8) j8Var2.f9462b, i10);
                return;
            case 4:
                j8 j8Var3 = this.f5555d;
                j8Var3.d();
                x8.F0((x8) j8Var3.f9462b, -1L);
                long jLongValue = ((Long) this.f5556e.invoke(null, this.f5552a.f5850a)).longValue();
                j8Var3.d();
                x8.F0((x8) j8Var3.f9462b, jLongValue);
                return;
            case 5:
                e();
                return;
            case 6:
                j8 j8Var4 = this.f5555d;
                try {
                    i10 = true != ((Boolean) this.f5556e.invoke(null, this.f5552a.f5850a)).booleanValue() ? 1 : 2;
                    j8Var4.d();
                    x8.q0((x8) j8Var4.f9462b, i10);
                    return;
                } catch (InvocationTargetException unused) {
                    j8Var4.d();
                    x8.q0((x8) j8Var4.f9462b, 3);
                    return;
                }
            case 7:
                f();
                return;
            default:
                j8 j8Var5 = this.f5555d;
                j8Var5.d();
                x8.n0((x8) j8Var5.f9462b, 3);
                boolean zBooleanValue = ((Boolean) this.f5556e.invoke(null, this.f5552a.f5850a)).booleanValue();
                synchronized (this.f5555d) {
                    try {
                        if (zBooleanValue) {
                            j8 j8Var6 = this.f5555d;
                            j8Var6.d();
                            x8.n0((x8) j8Var6.f9462b, 2);
                        } else {
                            j8 j8Var7 = this.f5555d;
                            j8Var7.d();
                            x8.n0((x8) j8Var7.f9462b, 1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
