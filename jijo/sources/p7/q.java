package p7;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.go;
import com.google.android.gms.internal.ads.sf;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import l.u2;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static go f16301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f16302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f16303c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static boolean a(g0.f[] fVarArr, g0.f[] fVarArr2) {
        if (fVarArr == null || fVarArr2 == null || fVarArr.length != fVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            g0.f fVar = fVarArr[i10];
            char c10 = fVar.f13606a;
            g0.f fVar2 = fVarArr2[i10];
            if (c10 != fVar2.f13606a || fVar.f13607b.length != fVar2.f13607b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d A[Catch: NumberFormatException -> 0x00b1, LOOP:3: B:29:0x006f->B:48:0x009d, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b1, blocks: (B:26:0x005b, B:29:0x006f, B:31:0x0075, B:35:0x0081, B:48:0x009d, B:50:0x00a3, B:56:0x00b8, B:57:0x00bb), top: B:71:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3 A[Catch: NumberFormatException -> 0x00b1, TryCatch #0 {NumberFormatException -> 0x00b1, blocks: (B:26:0x005b, B:29:0x006f, B:31:0x0075, B:35:0x0081, B:48:0x009d, B:50:0x00a3, B:56:0x00b8, B:57:0x00bb), top: B:71:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8 A[Catch: NumberFormatException -> 0x00b1, TryCatch #0 {NumberFormatException -> 0x00b1, blocks: (B:26:0x005b, B:29:0x006f, B:31:0x0075, B:35:0x0081, B:48:0x009d, B:50:0x00a3, B:56:0x00b8, B:57:0x00bb), top: B:71:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g0.f[] c(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.q.c(java.lang.String):g0.f[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        g0.f[] fVarArrC = c(str);
        if (fVarArrC == null) {
            return null;
        }
        try {
            g0.f.b(fVarArrC, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException(g1.a.q("Error in parsing ", str), e10);
        }
    }

    public static g0.f[] e(g0.f[] fVarArr) {
        if (fVarArr == null) {
            return null;
        }
        g0.f[] fVarArr2 = new g0.f[fVarArr.length];
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            g0.f fVar = fVarArr[i10];
            g0.f fVar2 = new g0.f();
            fVar2.f13606a = fVar.f13606a;
            float[] fArr = fVar.f13607b;
            fVar2.f13607b = b(fArr, fArr.length);
            fVarArr2[i10] = fVar2;
        }
        return fVarArr2;
    }

    public static InvocationHandler f() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = b2.e.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static Drawable g(Context context, int i10) {
        return u2.d().f(context, i10);
    }

    public static Intent h(Activity activity) {
        Intent intentA = androidx.core.app.l.a(activity);
        if (intentA != null) {
            return intentA;
        }
        try {
            String strJ = j(activity, activity.getComponentName());
            if (strJ == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strJ);
            try {
                return j(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Intent i(Context context, ComponentName componentName) {
        String strJ = j(context, componentName);
        if (strJ == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strJ);
        return j(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String j(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i10 >= 29 ? 269222528 : i10 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static String k(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return fb1.g("unknown status code: ", i10);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case sf.zzm /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            if (i10 >= 30) {
                String str = Build.VERSION.CODENAME;
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    if (str.toUpperCase(locale).compareTo("S".toUpperCase(locale)) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean m() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 32) {
                String str = Build.VERSION.CODENAME;
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void n(go goVar) {
        if (((go) goVar.f5006f) != null || ((go) goVar.f5007g) != null) {
            throw new IllegalArgumentException();
        }
        if (goVar.f5003c) {
            return;
        }
        synchronized (q.class) {
            try {
                long j10 = f16302b + 8192;
                if (j10 > 65536) {
                    return;
                }
                f16302b = j10;
                goVar.f5006f = f16301a;
                goVar.f5002b = 0;
                goVar.f5001a = 0;
                f16301a = goVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static go o() {
        synchronized (q.class) {
            try {
                go goVar = f16301a;
                if (goVar == null) {
                    return new go();
                }
                f16301a = (go) goVar.f5006f;
                goVar.f5006f = null;
                f16302b -= 8192;
                return goVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
