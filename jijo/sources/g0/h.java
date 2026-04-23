package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.q;

/* JADX INFO: loaded from: classes.dex */
public class h extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f13610d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Constructor f13611f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f13612h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Method f13613q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f13614s;

    public static boolean C(Object obj, String str, int i10, boolean z9) {
        D();
        try {
            return ((Boolean) f13612h.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void D() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f13614s) {
            return;
        }
        f13614s = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f13611f = constructor;
        f13610d = cls;
        f13612h = method2;
        f13613q = method;
    }

    @Override // k.q
    public Typeface s(Context context, f0.g gVar, Resources resources, int i10) {
        D();
        try {
            Object objNewInstance = f13611f.newInstance(new Object[0]);
            for (f0.h hVar : gVar.f13017a) {
                File fileF = z3.a.F(context);
                if (fileF == null) {
                    return null;
                }
                try {
                    if (!z3.a.r(fileF, resources, hVar.f13023f)) {
                        return null;
                    }
                    if (!C(objNewInstance, fileF.getPath(), hVar.f13019b, hVar.f13020c)) {
                        return null;
                    }
                    fileF.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileF.delete();
                }
            }
            D();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f13610d, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f13613q.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // k.q
    public Typeface t(Context context, l0.i[] iVarArr, int i10) {
        String str;
        if (iVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(x(i10, iVarArr).f15114a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceU = u(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceU;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
