package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class x9 extends w9 {
    public static final Object L = new Object();
    public static boolean M;
    public static long N;
    public static aa O;
    public static pa P;
    public static u Q;
    public final boolean H;
    public final String I;
    public na J;
    public final HashMap K;

    public x9(Context context, String str, boolean z9) {
        super(context);
        this.H = false;
        this.K = new HashMap();
        this.I = str;
        this.H = z9;
    }

    public static ja g(Context context, boolean z9) {
        if (w9.G == null) {
            synchronized (L) {
                try {
                    if (w9.G == null) {
                        ja jaVarB = ja.b(context, z9);
                        if (jaVarB.f5865p) {
                            try {
                                if (((Boolean) zzba.zzc().a(eg.U2)).booleanValue()) {
                                    jaVarB.d("8E4cUkgIY9w8/0qt+Oeyh9wfu9tQKpeKsR+Ou+hsYewuB4uFdKW1FI4W+bAZwe0B", "JAIugkcNQRXP51pRzjbhWzeihtmzLSCJCmT0+GTbkts=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            jaVarB.d("FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", Context.class);
                            jaVarB.d("LYoHKR17UvbUNibqKPKJklawQJNaw1zk7CnhZAC68YBTzC7x4MYQVXp9Sihs98Ok", "ngqbGKXcQCvq0ft27xRzOzNoEVN+ei+Vq2+CNx9QQMc=", Context.class);
                            jaVarB.d("/W2ZEuHT/JiI5/Zhh6jV6ATrrvF8IBtmITl+4IJczntAr46Ow/LitCqqOR0RyWN9", "0yxvRSsGg+/BBPRqwe1F54W0T+vv1NRnE+jebtT36Vo=", Context.class);
                            jaVarB.d("2/TrxXzdli4Us4FPDPyGZmc5MrxtH8QgmFF/OAjS44SLVVLbzYRftaNDX3sVzVmu", "9ObkV+9nuY0gPBNLH25GoxM7YATuF1pi7IORvVFb3+Q=", Context.class);
                            jaVarB.d("I0TLK4/NNf4PWI9wQGA/sSwUTUIPgbxkHrNqtFLC41yDeZSimeJq/+llE4fAA31b", "eUrWQVF8FAlcOLX3Auj55rxdEWjF+0P5JAPLCHVKKQw=", Context.class);
                            Class cls = Boolean.TYPE;
                            jaVarB.d("WfvM4SeNDVyFarUKUVpVTE2MRQkjnaN4GpgwC5lMrmyQkCennlTSSkgCAZvzOVXK", "Kq6mcF8LH4HqXGyg5/DR3VvLtDExNTPXoCRIPhkdOGM=", Context.class, cls);
                            jaVarB.d("5HcA415u1KU8m2yVlDZBhQQK+0IFNRmmWPxuAq0DnfPzSdJ/uWlnYMD1kKfkH6cZ", "u7Ufq5yuXkEXg69T8jpWuOOX55Q9g2DSVI1gtbNUvY8=", Context.class);
                            jaVarB.d("d7YRusR2mxxBt1bBYjK2gXVvJl/MfqFw2IiZZVeFOFqksQBErGXLOKgf56kYtWpK", "q4VBjxb/Ij/RcUKEcmQK+TpC64QFNLpq6sfIawaWN1g=", Context.class);
                            jaVarB.d("16uR6W3k1bZ4BnJYWpDTlOvAXuv/RI3aMtmw+ik1GAP8KUG8+/FyCO/dw3r9C2K9", "t+CAjrsoEFEWDgC/oCfdqxFl31lIReQPqb6CaFb+1Y0=", MotionEvent.class, DisplayMetrics.class);
                            jaVarB.d("gYgEHbtWs2qrOou4Pi9x8/evNQKl7xufkAwk8FBwpKpll2nmAbj5wvKo77J2SETY", "/hRWEzoUI9HOo/QM2sB1bqBByMO5aBMH0t/CqMPWarY=", MotionEvent.class, DisplayMetrics.class);
                            jaVarB.d("Rx5KxmHu63h8QT7T4cYR2mu7F4LQnYkocG/Azb9HP8ZHyjUHnRxxCuB99BIp3kbl", "3fysZeGzwX+hqd2f4+qtlSho+oF+DeFl9kzKrTFOSWo=", new Class[0]);
                            jaVarB.d("5kY1EQ+6snGNdZX1BEywItRy0EAwZ4DbRiPucqHAgfZR8kr75HzXIMEIf0cE9z11", "NtWyZSC7qBNyKPaXbOjRpNaZGUUAwpDpvYkB4v1ZH9M=", new Class[0]);
                            jaVarB.d("+pOuZc4XP/KXmz3ZcR0Th/zrptiqFMKeADXdr6ffDtBODTAlpCvFIUU/DK0sXoAh", "l4qa5EABhdRHJHltXD4U8dy0wNZl4oyoZ9TbFONnMI4=", new Class[0]);
                            jaVarB.d("KvkOAolI09ZSAixqGUOtipMDBdKXVlslzVnQOpfDZOEJW+xbFKrK173Gu3h1RVkI", "SkMlFTLt8H3eQLYvgf87g2pXBfp4xPpxL3RMs974XSU=", new Class[0]);
                            jaVarB.d("tnRfJM39LV6MDlXml8e8fAfi5JhKcsRyFSmagsP97rbE/0XgA5fRVLlLbAYUcu57", "TvLSh+Eka5RyCXMK4IvAvP4vfksx/KqJwxjzSKu7qQs=", new Class[0]);
                            jaVarB.d("6JHAw9/xzu8LcH4q9f7Udi9sTntehS9dfukXhX8DEHhp54WYBhd6ZhWkqnOAMGmY", "bFK3lRg0oaTUwYDrSsMiLa/j4LG9nRlI5KKEyt63x08=", new Class[0]);
                            jaVarB.d("iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", Context.class, cls, String.class);
                            jaVarB.d("9douHjmTTjq3N4YYUdzzHaKyxIqsB5K92p8t26vKQB1HahpVak+32YHan4LmgLPE", "q6oLc2ULDKRAR1VDdX5lO9/kb0NHjx7PMACMr/7cZL8=", StackTraceElement[].class);
                            jaVarB.d("fHaUCxrr3fcbpdQPVJw6OSoHeHoizr6wmxmAsnLvDUhuNG2u8ebKX4VPxAoXSx4W", "K/sgHSTVeE1LLZ4HP+m5KF6ND+k7W4ID3M3VTul8bAI=", View.class, DisplayMetrics.class, cls, cls);
                            jaVarB.d("vvYcBqgI4aoC3GZZ7n1bdLp71k52s6EJLh0/nA6ME39LmvOZf3TBZ+H4xg1YfQXg", "6jGSPrUM0+2YrTO2vsTOKq3+XL/IfUFs5oxZaSEvsQg=", Context.class, cls);
                            jaVarB.d("GC4CZUnPsyUcm5NrWw7C8gSktjb/gtBCDrSKBLlqImuOnQy7zHyo6XlIzkH3EMVH", "Kx8fghNUQq+sA+EfmK6qh0KjuKvw753ECuaCFV8szVM=", View.class, Activity.class, cls);
                            jaVarB.d("1LUIVO6lhWmBJfHw9DMAIriIU/Yodc7yYpCjENKu6ENqSuhgH3MJrJCpj/jKq6Pa", "V8P78mWO+MxnWR283vMX+BSDXEvrm8XlQCYXMpvUe5w=", Long.TYPE);
                            jaVarB.d("g3h/WBQ8k1SqFyNwcX6aXlyabMyZPKS0QgL4qcVfix1XI+70++CdiHkDZKRlUPQw", "8DR7pqgII7Dvg/rx7G/5VQ7MbFexA62WxQA5oVjQDIU=", new Class[0]);
                            try {
                                if (((Boolean) zzba.zzc().a(eg.X2)).booleanValue()) {
                                    jaVarB.d("0njjbCFUq6vJ1UgnErUI7KEtLgZLN7V9IJ5yZ3QtzXmjMaTjzKInpeDNakYTgh0P", "C8NIMy/t/HZjKrbJt0Xe/Cv+czK1jvEhHHQsIVfXSJE=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            jaVarB.d("SHfJbyMgI7MrHewwYoTmYsM7CTkziBSZ0pvzhPCRWcLGoNw6AaEZWLqlKa0dpKuD", "SxHy+zpC+eGmQUPW4BYYcldQdVxiSSVnY0gIrWauGKU=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) zzba.zzc().a(eg.Y2)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        jaVarB.d("gAg/p/cQzJRjYz9LhE8cRk72DVV1Cpozf/TbzvACqLcTgM3sRjMEb3DCmwYhMmhP", "avDZD6/xoSbFYvWCy23XLncB75oD5DxKdrTKFY2O0hY=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) zzba.zzc().a(eg.f4136t2)).booleanValue()) {
                                    jaVarB.d("QcEEfK1PwFv2Eb+NZQ+4kWKAUUVvycYqoBzmAjBexJV/sKEjaFlajeD5MAZYWXy5", "361aY1ErIwpwsXwpamiiDSCpkl/IcdBM93dd8sW9a/Y=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            if (((Boolean) zzba.zzc().a(eg.f4126s2)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                jaVarB.d("ZdMwT5n8r4APV4u4GhQlb1VCwOIVHkTm7kF7LnArEpyZnsv+C3G3q6fVFgtTcqcc", "O+vmm8flr2e7ZrTWUx/T8ClWwcEwLlJlfjM8sMGjZbg=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) zzba.zzc().a(eg.f4116r2)).booleanValue()) {
                                        jaVarB.d("SKSJAjN3UKeguXyEasCGg04d/yJuUN8XZYgactMp4rfMtHcIJcD0mydl5RKvI49M", "lnMUlT0qopStslq/RfZHkyvg0xAUTVuMPsMot4SEaYA=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused5) {
                                }
                            }
                        }
                        w9.G = jaVarB;
                    }
                } finally {
                }
            }
        }
        return w9.G;
    }

    public static ka h(ja jaVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzavf {
        Method methodC = jaVar.c("16uR6W3k1bZ4BnJYWpDTlOvAXuv/RI3aMtmw+ik1GAP8KUG8+/FyCO/dw3r9C2K9", "t+CAjrsoEFEWDgC/oCfdqxFl31lIReQPqb6CaFb+1Y0=");
        if (methodC == null || motionEvent == null) {
            throw new zzavf();
        }
        try {
            return new ka((String) methodC.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new zzavf(e10);
        }
    }

    public static ArrayList i(ja jaVar, Context context, j8 j8Var) {
        long j10;
        long j11;
        int iA = jaVar.a();
        ArrayList arrayList = new ArrayList();
        if (!jaVar.f5865p) {
            j8Var.d();
            x8.K0((x8) j8Var.f9462b, 16384L);
            return arrayList;
        }
        arrayList.add(new ta(jaVar, j8Var, iA, context));
        arrayList.add(new va(jaVar, j8Var, N, iA));
        arrayList.add(new cb(jaVar, j8Var, iA));
        arrayList.add(new qa(jaVar, j8Var, iA, context));
        arrayList.add(new fb(jaVar, "5kY1EQ+6snGNdZX1BEywItRy0EAwZ4DbRiPucqHAgfZR8kr75HzXIMEIf0cE9z11", "NtWyZSC7qBNyKPaXbOjRpNaZGUUAwpDpvYkB4v1ZH9M=", j8Var, iA, 33));
        arrayList.add(new sa(jaVar, j8Var, iA, context));
        arrayList.add(new ra(jaVar, j8Var, iA, 2));
        arrayList.add(new ra(jaVar, j8Var, iA, 4));
        arrayList.add(new ra(jaVar, j8Var, iA, 5));
        arrayList.add(new ua(jaVar, j8Var, iA));
        arrayList.add(new ab(jaVar, j8Var, iA));
        arrayList.add(new ra(jaVar, j8Var, iA, 8));
        arrayList.add(new ra(jaVar, j8Var, iA, 1));
        arrayList.add(new ra(jaVar, j8Var, iA, 7));
        arrayList.add(new db(jaVar, j8Var, iA));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) zzba.zzc().a(eg.Y2)).booleanValue()) {
                pa paVar = P;
                if (paVar != null) {
                    long j12 = paVar.f7843d ? paVar.f7841b - paVar.f7840a : -1L;
                    long j13 = paVar.f7842c;
                    paVar.f7842c = -1L;
                    j11 = j13;
                    j10 = j12;
                } else {
                    j10 = -1;
                    j11 = -1;
                }
                arrayList.add(new bb(jaVar, j8Var, iA, O, j10, j11));
            }
        }
        if (((Boolean) zzba.zzc().a(eg.X2)).booleanValue()) {
            arrayList.add(new ra(jaVar, j8Var, iA, 6));
        }
        arrayList.add(new ra(jaVar, j8Var, iA, 3));
        if (((Boolean) zzba.zzc().a(eg.f3948b3)).booleanValue()) {
            arrayList.add(new ra(jaVar, j8Var, iA, 0));
        }
        return arrayList;
    }

    public static synchronized void k(Context context, boolean z9) {
        try {
            if (M) {
                return;
            }
            N = System.currentTimeMillis() / 1000;
            w9.G = g(context, z9);
            if (((Boolean) zzba.zzc().a(eg.Y2)).booleanValue()) {
                O = context != null ? new aa((ConnectivityManager) context.getSystemService("connectivity")) : null;
            }
            ExecutorService executorService = w9.G.f5851b;
            if (((Boolean) zzba.zzc().a(eg.Z2)).booleanValue() && executorService != null) {
                P = pa.a(context, executorService);
            }
            if (((Boolean) zzba.zzc().a(eg.f4126s2)).booleanValue()) {
                Q = new u();
            }
            M = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final void l(List list) {
        ExecutorService executorService;
        if (w9.G == null || (executorService = w9.G.f5851b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) zzba.zzc().a(eg.f4077n2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            String.format("class methods got exception: %s", stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.w9
    public final long a(StackTraceElement[] stackTraceElementArr) throws zzavf {
        Method methodC = w9.G.c("9douHjmTTjq3N4YYUdzzHaKyxIqsB5K92p8t26vKQB1HahpVak+32YHan4LmgLPE", "q6oLc2ULDKRAR1VDdX5lO9/kb0NHjx7PMACMr/7cZL8=");
        if (methodC == null || stackTraceElementArr == null) {
            throw new zzavf();
        }
        try {
            return new z9((String) methodC.invoke(null, stackTraceElementArr), 1).f11185b.longValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new zzavf(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.w9
    public final j8 b(Context context, View view, Activity activity) {
        pa paVar = P;
        if (paVar != null && paVar.f7843d) {
            paVar.f7841b = System.currentTimeMillis();
        }
        if (((Boolean) zzba.zzc().a(eg.f4126s2)).booleanValue()) {
            Q.b();
        }
        j8 j8VarA0 = x8.a0();
        String str = this.I;
        if (!TextUtils.isEmpty(str)) {
            j8VarA0.d();
            x8.A0((x8) j8VarA0.f9462b, str);
        }
        j(g(context, this.H), j8VarA0, view, activity, true, context);
        return j8VarA0;
    }

    @Override // com.google.android.gms.internal.ads.w9
    public final j8 c(Context context) {
        ArrayList arrayListI;
        pa paVar = P;
        if (paVar != null && paVar.f7843d) {
            paVar.f7841b = System.currentTimeMillis();
        }
        if (((Boolean) zzba.zzc().a(eg.f4126s2)).booleanValue()) {
            u uVar = Q;
            uVar.f9322c = uVar.f9321b;
            uVar.f9321b = SystemClock.uptimeMillis();
        }
        j8 j8VarA0 = x8.a0();
        String str = this.I;
        if (!TextUtils.isEmpty(str)) {
            j8VarA0.d();
            x8.A0((x8) j8VarA0.f9462b, str);
        }
        ja jaVarG = g(context, this.H);
        if (jaVarG.f5851b != null) {
            if (this.H) {
                int iA = jaVarG.a();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(i(jaVarG, context, j8VarA0));
                arrayList.add(new wa(jaVarG, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", j8VarA0, iA, 24));
                arrayListI = arrayList;
            } else {
                arrayListI = i(jaVarG, context, j8VarA0);
            }
            l(arrayListI);
        }
        return j8VarA0;
    }

    @Override // com.google.android.gms.internal.ads.w9
    public final ka d(MotionEvent motionEvent) throws zzavf {
        Method methodC = w9.G.c("gYgEHbtWs2qrOou4Pi9x8/evNQKl7xufkAwk8FBwpKpll2nmAbj5wvKo77J2SETY", "/hRWEzoUI9HOo/QM2sB1bqBByMO5aBMH0t/CqMPWarY=");
        if (methodC == null || motionEvent == null) {
            throw new zzavf();
        }
        try {
            return new ka((String) methodC.invoke(null, motionEvent, this.E));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new zzavf(e10);
        }
    }

    public final void j(ja jaVar, j8 j8Var, View view, Activity activity, boolean z9, Context context) {
        List listAsList;
        int i10 = 0;
        if (jaVar.f5865p) {
            m(jaVar, j8Var);
            ArrayList arrayList = new ArrayList();
            if (jaVar.f5851b != null) {
                int iA = jaVar.a();
                arrayList.add(new xa(jaVar, i10, j8Var));
                arrayList.add(new cb(jaVar, j8Var, iA));
                arrayList.add(new va(jaVar, j8Var, N, iA));
                arrayList.add(new ua(jaVar, j8Var, iA));
                arrayList.add(new ra(jaVar, j8Var, iA, 4));
                arrayList.add(new ra(jaVar, j8Var, iA, 5));
                arrayList.add(new ab(jaVar, j8Var, iA));
                arrayList.add(new ra(jaVar, j8Var, iA, 2));
                arrayList.add(new ra(jaVar, j8Var, iA, 8));
                arrayList.add(new ra(jaVar, j8Var, iA, 1));
                arrayList.add(new ra(jaVar, j8Var, iA, 7));
                arrayList.add(new ya(jaVar, j8Var, iA, new Throwable().getStackTrace()));
                arrayList.add(new ya(jaVar, j8Var, iA, view));
                arrayList.add(new db(jaVar, j8Var, iA));
                if (((Boolean) zzba.zzc().a(eg.f4087o2)).booleanValue()) {
                    arrayList.add(new qa(jaVar, j8Var, iA, view, activity));
                }
                if (((Boolean) zzba.zzc().a(eg.f3948b3)).booleanValue()) {
                    arrayList.add(new ra(jaVar, j8Var, iA, 0));
                }
                if (!z9) {
                    try {
                        if (((Boolean) zzba.zzc().a(eg.f4116r2)).booleanValue()) {
                            arrayList.add(new za(jaVar, j8Var, iA, this.K, view, context));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        if (((Boolean) zzba.zzc().a(eg.f4126s2)).booleanValue()) {
                            arrayList.add(new ya(jaVar, j8Var, iA, Q));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                    if (((Boolean) zzba.zzc().a(eg.f4136t2)).booleanValue()) {
                        arrayList.add(new ya(jaVar, j8Var, iA, this.F));
                    }
                } else if (((Boolean) zzba.zzc().a(eg.f4106q2)).booleanValue()) {
                    arrayList.add(new eb(jaVar, j8Var, iA, this.J));
                }
            }
            listAsList = arrayList;
        } else {
            j8Var.d();
            x8.K0((x8) j8Var.f9462b, 16384L);
            listAsList = Arrays.asList(new xa(jaVar, i10, j8Var));
        }
        l(listAsList);
    }

    public final synchronized void m(ja jaVar, j8 j8Var) {
        MotionEvent motionEvent;
        try {
            try {
                ka kaVarH = h(jaVar, this.f10110a, this.E);
                Long l9 = kaVarH.f6218a;
                if (l9 != null) {
                    long jLongValue = l9.longValue();
                    j8Var.d();
                    x8.G0((x8) j8Var.f9462b, jLongValue);
                }
                Long l10 = kaVarH.f6219b;
                if (l10 != null) {
                    long jLongValue2 = l10.longValue();
                    j8Var.d();
                    x8.H0((x8) j8Var.f9462b, jLongValue2);
                }
                Long l11 = kaVarH.f6220c;
                if (l11 != null) {
                    long jLongValue3 = l11.longValue();
                    j8Var.d();
                    x8.I0((x8) j8Var.f9462b, jLongValue3);
                }
                if (this.D) {
                    Long l12 = kaVarH.f6221d;
                    if (l12 != null) {
                        long jLongValue4 = l12.longValue();
                        j8Var.d();
                        x8.D((x8) j8Var.f9462b, jLongValue4);
                    }
                    Long l13 = kaVarH.f6222e;
                    if (l13 != null) {
                        long jLongValue5 = l13.longValue();
                        j8Var.d();
                        x8.E((x8) j8Var.f9462b, jLongValue5);
                    }
                }
            } catch (zzavf unused) {
            }
            t8 t8VarA = u8.A();
            if (this.f10112d > 0) {
                DisplayMetrics displayMetrics = this.E;
                char[] cArr = la.f6543a;
                if (displayMetrics != null && displayMetrics.density != 0.0f) {
                    long jA = la.a(this.f10119v, displayMetrics);
                    t8VarA.d();
                    u8.M((u8) t8VarA.f9462b, jA);
                    long jA2 = la.a(this.A - this.f10122y, this.E);
                    t8VarA.d();
                    u8.N((u8) t8VarA.f9462b, jA2);
                    long jA3 = la.a(this.B - this.f10123z, this.E);
                    t8VarA.d();
                    u8.O((u8) t8VarA.f9462b, jA3);
                    long jA4 = la.a(this.f10122y, this.E);
                    t8VarA.d();
                    u8.R((u8) t8VarA.f9462b, jA4);
                    long jA5 = la.a(this.f10123z, this.E);
                    t8VarA.d();
                    u8.S((u8) t8VarA.f9462b, jA5);
                    if (this.D && (motionEvent = this.f10110a) != null) {
                        long jA6 = la.a(((this.f10122y - this.A) + motionEvent.getRawX()) - this.f10110a.getX(), this.E);
                        if (jA6 != 0) {
                            t8VarA.d();
                            u8.P((u8) t8VarA.f9462b, jA6);
                        }
                        long jA7 = la.a(((this.f10123z - this.B) + this.f10110a.getRawY()) - this.f10110a.getY(), this.E);
                        if (jA7 != 0) {
                            t8VarA.d();
                            u8.Q((u8) t8VarA.f9462b, jA7);
                        }
                    }
                }
            }
            try {
                ka kaVarD = d(this.f10110a);
                Long l14 = kaVarD.f6218a;
                if (l14 != null) {
                    long jLongValue6 = l14.longValue();
                    t8VarA.d();
                    u8.B((u8) t8VarA.f9462b, jLongValue6);
                }
                Long l15 = kaVarD.f6219b;
                if (l15 != null) {
                    long jLongValue7 = l15.longValue();
                    t8VarA.d();
                    u8.C((u8) t8VarA.f9462b, jLongValue7);
                }
                long jLongValue8 = kaVarD.f6220c.longValue();
                t8VarA.d();
                u8.I((u8) t8VarA.f9462b, jLongValue8);
                if (this.D) {
                    Long l16 = kaVarD.f6222e;
                    if (l16 != null) {
                        long jLongValue9 = l16.longValue();
                        t8VarA.d();
                        u8.D((u8) t8VarA.f9462b, jLongValue9);
                    }
                    Long l17 = kaVarD.f6221d;
                    if (l17 != null) {
                        long jLongValue10 = l17.longValue();
                        t8VarA.d();
                        u8.G((u8) t8VarA.f9462b, jLongValue10);
                    }
                    Long l18 = kaVarD.f6223f;
                    if (l18 != null) {
                        int i10 = l18.longValue() != 0 ? 2 : 1;
                        t8VarA.d();
                        u8.T((u8) t8VarA.f9462b, i10);
                    }
                    long j10 = this.f10113f;
                    if (j10 > 0) {
                        DisplayMetrics displayMetrics2 = this.E;
                        char[] cArr2 = la.f6543a;
                        Long lValueOf = (displayMetrics2 == null || displayMetrics2.density == 0.0f) ? null : Long.valueOf(Math.round(this.f10118u / j10));
                        if (lValueOf != null) {
                            long jLongValue11 = lValueOf.longValue();
                            t8VarA.d();
                            u8.E((u8) t8VarA.f9462b, jLongValue11);
                        } else {
                            t8VarA.d();
                            u8.F((u8) t8VarA.f9462b);
                        }
                        long jRound = Math.round(this.f10117t / this.f10113f);
                        t8VarA.d();
                        u8.H((u8) t8VarA.f9462b, jRound);
                    }
                    Long l19 = kaVarD.f6226i;
                    if (l19 != null) {
                        long jLongValue12 = l19.longValue();
                        t8VarA.d();
                        u8.K((u8) t8VarA.f9462b, jLongValue12);
                    }
                    Long l20 = kaVarD.f6227j;
                    if (l20 != null) {
                        long jLongValue13 = l20.longValue();
                        t8VarA.d();
                        u8.J((u8) t8VarA.f9462b, jLongValue13);
                    }
                    Long l21 = kaVarD.f6228k;
                    if (l21 != null) {
                        int i11 = l21.longValue() != 0 ? 2 : 1;
                        t8VarA.d();
                        u8.U((u8) t8VarA.f9462b, i11);
                    }
                }
            } catch (zzavf unused2) {
            }
            long j11 = this.f10116s;
            if (j11 > 0) {
                t8VarA.d();
                u8.L((u8) t8VarA.f9462b, j11);
            }
            u8 u8Var = (u8) t8VarA.b();
            j8Var.d();
            x8.Q((x8) j8Var.f9462b, u8Var);
            long j12 = this.f10112d;
            if (j12 > 0) {
                j8Var.d();
                x8.H((x8) j8Var.f9462b, j12);
            }
            long j13 = this.f10113f;
            if (j13 > 0) {
                j8Var.d();
                x8.G((x8) j8Var.f9462b, j13);
            }
            long j14 = this.f10114h;
            if (j14 > 0) {
                j8Var.d();
                x8.F((x8) j8Var.f9462b, j14);
            }
            long j15 = this.f10115q;
            if (j15 > 0) {
                j8Var.d();
                x8.I((x8) j8Var.f9462b, j15);
            }
            try {
                int size = this.f10111b.size() - 1;
                if (size > 0) {
                    j8Var.d();
                    x8.S((x8) j8Var.f9462b);
                    for (int i12 = 0; i12 < size; i12++) {
                        ka kaVarH2 = h(w9.G, (MotionEvent) this.f10111b.get(i12), this.E);
                        t8 t8VarA2 = u8.A();
                        long jLongValue14 = kaVarH2.f6218a.longValue();
                        t8VarA2.d();
                        u8.B((u8) t8VarA2.f9462b, jLongValue14);
                        long jLongValue15 = kaVarH2.f6219b.longValue();
                        t8VarA2.d();
                        u8.C((u8) t8VarA2.f9462b, jLongValue15);
                        u8 u8Var2 = (u8) t8VarA2.b();
                        j8Var.d();
                        x8.R((x8) j8Var.f9462b, u8Var2);
                    }
                }
            } catch (zzavf unused3) {
                j8Var.d();
                x8.S((x8) j8Var.f9462b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzo(View view) {
        if (((Boolean) zzba.zzc().a(eg.f4106q2)).booleanValue()) {
            if (this.J == null) {
                ja jaVar = w9.G;
                this.J = new na(jaVar.f5850a, jaVar.f5866q);
            }
            this.J.a(view);
        }
    }
}
