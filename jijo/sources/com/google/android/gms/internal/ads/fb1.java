package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.tencent.mmkv.MMKV;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fb1 {
    public static void A(team.dev.epro.apkcustom.widgets.j jVar, StringBuilder sb, String str) {
        sb.append(jVar.D());
        sb.append(str);
    }

    public static int a(int i10) {
        if (i10 == -2) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int b(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return -2;
        }
        if (i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        throw null;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int d(int i10, int i11, int i12) {
        return mc1.s0(i10) + i11 + i12;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return i10 + i11 + i12 + i13;
    }

    public static a4.a f(Parcel parcel) {
        a4.a aVarT = a4.b.t(parcel.readStrongBinder());
        parcel.recycle();
        return aVarT;
    }

    public static String g(String str, int i10) {
        return str + i10;
    }

    public static String h(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, Integer num, char c10) {
        sb.append(num);
        sb.append(c10);
        return sb.toString();
    }

    public static StringBuilder k(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ Iterator l() {
        try {
            return Arrays.asList(new c7.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void m(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void n(View view) {
        if (view != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void o(dd1 dd1Var) {
        if (dd1Var != null) {
            throw new ClassCastException();
        }
    }

    public static void p(MMKV mmkv, String str, int i10) {
        mmkv.edit().putInt(str, i10).apply();
    }

    public static void q(MMKV mmkv, String str, String str2) {
        mmkv.edit().putString(str, str2).commit();
    }

    public static void r(MMKV mmkv, String str, String str2, StringBuilder sb, String str3) {
        sb.append(mmkv.getString(str, str2));
        sb.append(str3);
    }

    public static void s(MMKV mmkv, String str, boolean z9) {
        mmkv.edit().putBoolean(str, z9).apply();
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void u(String str, int i10) {
        fg0.f(str + i10);
    }

    public static void v(SimpleDateFormat simpleDateFormat, StringBuilder sb, String str, String str2) {
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(str);
        b7.u.r(str2, sb.toString());
    }

    public static void w(team.dev.epro.apkcustom.widgets.j jVar, StringBuilder sb, String str) {
        sb.append(jVar.C());
        sb.append(str);
    }

    public static String x(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ Iterator y() {
        try {
            return Arrays.asList(new c7.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void z(MMKV mmkv, String str, String str2) {
        mmkv.edit().putString(str, str2).apply();
    }
}
