package g4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import b7.d1;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.consent_sdk.zzg;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static void A(Context context, h6.d dVar) {
        dVar.getClass();
        String packageName = context.getPackageName();
        Intent intent = new Intent(context, (Class<?>) OpenVPNService.class);
        intent.putExtra(g1.a.y(packageName, ".profileUUID"), dVar.f14141o0.toString());
        intent.putExtra(packageName + ".profileVersion", 0);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[PHI: r17
      0x007c: PHI (r17v3 long) = (r17v2 long), (r17v4 long) binds: [B:31:0x006e, B:35:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long B(java.lang.String r24, long r25, long r27, long r29) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.a0.B(java.lang.String, long, long, long):long");
    }

    public static int C(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) B(str, i10, i11, i12);
    }

    public static final void D(n6.e eVar, n6.j jVar) {
        if ((eVar instanceof p6.d) && jVar.A(d1.f1407a) != null) {
            p6.d dVarA = (p6.d) eVar;
            do {
                dVarA = dVarA.a();
            } while (dVarA != null);
        }
    }

    public static f.f E(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new f.f(strConcat, 23, str2);
    }

    public static String F(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.e9);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String G(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String strX = fb1.x(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strX), (Throwable) e10);
                    string = "<" + strX + " threw " + e10.getClass().getName() + ">";
                }
            }
            objArr[i11] = string;
            i11++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i12, iIndexOf);
            sb.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void a(Throwable th, Throwable th2) {
        f(th, "<this>");
        f(th2, "exception");
        if (th != th2) {
            q6.c.f16439a.a(th, th2);
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        z(a0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        z(a0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        z(a0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = a0.class.getName();
            int i10 = 0;
            while (!stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            while (stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            StringBuilder sbL = l.a0.l("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbL.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbL.toString());
            z(a0.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static Certificate[] g(String str) throws CertificateException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Vector vector = new Vector();
        if (!(str != null && (str.startsWith("[[INLINE]]") || str.startsWith("[[NAME]]")))) {
            return new Certificate[]{certificateFactory.generateCertificate(new FileInputStream(str))};
        }
        int iIndexOf = str.indexOf("-----BEGIN CERTIFICATE-----");
        do {
            int iMax = Math.max(0, iIndexOf);
            vector.add(certificateFactory.generateCertificate(new ByteArrayInputStream(str.substring(iMax).getBytes())));
            iIndexOf = str.indexOf("-----BEGIN CERTIFICATE-----", iMax + 1);
        } while (iIndexOf > 0);
        return (Certificate[]) vector.toArray(new Certificate[vector.size()]);
    }

    public static int h(Context context, int i10, int i11) {
        TypedValue typedValueU = u(context, i10);
        if (typedValueU == null) {
            return i11;
        }
        int i12 = typedValueU.resourceId;
        return i12 != 0 ? d0.f.b(context, i12) : typedValueU.data;
    }

    public static int i(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueY = y(i10, view.getContext(), view.getClass().getCanonicalName());
        int i11 = typedValueY.resourceId;
        return i11 != 0 ? d0.f.b(context, i11) : typedValueY.data;
    }

    public static float j(int i10, String[] strArr) {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static Object k(CopyOnWriteArraySet copyOnWriteArraySet, Random random) {
        int iNextInt = random.nextInt(copyOnWriteArraySet.size());
        Iterator it = copyOnWriteArraySet.iterator();
        for (int i10 = 0; i10 < iNextInt && it.hasNext(); i10++) {
            it.next();
        }
        return it.next();
    }

    public static SimpleDateFormat l(int i10, int i11) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i10 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i10 == 1) {
            str = "MMMM d, yyyy";
        } else if (i10 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(fb1.g("Unknown DateFormat style: ", i10));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i11 == 0 || i11 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i11 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException(fb1.g("Unknown DateFormat style: ", i11));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static /* synthetic */ b7.c0 m(b7.n0 n0Var, boolean z9, b7.q0 q0Var, int i10) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return ((b7.u0) n0Var).r(z9, (i10 & 2) != 0, q0Var);
    }

    public static boolean n(int i10) {
        if (i10 != 0) {
            ThreadLocal threadLocal = g0.a.f13599a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i10);
            int iGreen = Color.green(i10);
            int iBlue = Color.blue(i10);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d10 = ((double) iRed) / 255.0d;
            double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            double d11 = ((double) iGreen) / 255.0d;
            double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            double d12 = ((double) iBlue) / 255.0d;
            double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d13;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d13 / 100.0d > 0.5d) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int p(float f10, int i10, int i11) {
        return g0.a.b(g0.a.d(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static String q(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
                    StringBuilder sbK = fb1.k("<", str2, " threw ");
                    sbK.append(e10.getClass().getName());
                    sbK.append(">");
                    string = sbK.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb.append((CharSequence) str, i12, iIndexOf);
            sb.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void r(androidx.fragment.app.w wVar, l5.h hVar, l5.g gVar) {
        l lVar = (l) ((s0) c.c(wVar).f13701f).zza();
        lVar.getClass();
        Handler handler = c0.f13708a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
        m mVar = (m) lVar.f13749b.get();
        if (mVar == null) {
            gVar.d(new zzg(3, "No available form can be built.").a());
            return;
        }
        d dVar = (d) lVar.f13748a.zza();
        dVar.getClass();
        c cVar = dVar.f13710a;
        s0 s0VarA = q0.a(new k.q(25, (s0) cVar.f13697b));
        androidx.fragment.app.k kVar = new androidx.fragment.app.k(mVar);
        p0 p0Var = new p0();
        s0 s0Var = (s0) cVar.f13697b;
        s0 s0Var2 = (s0) cVar.f13703h;
        s0 s0Var3 = (s0) cVar.f13704i;
        s0 s0Var4 = (s0) cVar.f13698c;
        s0 s0VarA2 = q0.a(new l.u(s0Var, (s0) cVar.f13699d, s0VarA, s0Var4, kVar, new p(s0VarA, new s(s0Var, s0VarA, s0Var2, s0Var3, p0Var, s0Var4))));
        if (p0Var.f13774a != null) {
            throw new IllegalStateException();
        }
        p0Var.f13774a = s0VarA2;
        ((k) p0Var.zza()).b(hVar, gVar);
    }

    public static Typeface s(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, d0.d(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static void t(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static TypedValue u(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean v(Context context, int i10, boolean z9) {
        TypedValue typedValueU = u(context, i10);
        return (typedValueU == null || typedValueU.type != 18) ? z9 : typedValueU.data != 0;
    }

    public static int w(Context context, int i10, int i11) {
        TypedValue typedValueU = u(context, i10);
        return (typedValueU == null || typedValueU.type != 16) ? i11 : typedValueU.data;
    }

    public static TimeInterpolator x(Context context, int i10, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!o(strValueOf, "cubic-bezier") && !o(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!o(strValueOf, "cubic-bezier")) {
            if (o(strValueOf, "path")) {
                return q0.a.c(p7.q.d(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return q0.a.b(j(0, strArrSplit), j(1, strArrSplit), j(2, strArrSplit), j(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static TypedValue y(int i10, Context context, String str) {
        TypedValue typedValueU = u(context, i10);
        if (typedValueU != null) {
            return typedValueU;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static void z(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
    }
}
