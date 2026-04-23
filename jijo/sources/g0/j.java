package g0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Class f13619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Constructor f13620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Method f13621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Method f13622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Method f13623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Method f13624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Method f13625z;

    public j() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodK;
        Method methodL;
        Method method2;
        Method methodM;
        super(5);
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodK = K(cls);
            methodL = L(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodM = M(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            methodK = null;
            methodL = null;
            method2 = null;
            methodM = null;
        }
        this.f13619t = cls;
        this.f13620u = constructor;
        this.f13621v = methodK;
        this.f13622w = methodL;
        this.f13623x = method2;
        this.f13624y = method;
        this.f13625z = methodM;
    }

    public static Method K(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method L(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final void F(Object obj) {
        try {
            this.f13624y.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean G(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f13621v.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface H(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f13619t, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f13625z.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean I(Object obj) {
        try {
            return ((Boolean) this.f13623x.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object J() {
        try {
            return this.f13620u.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method M(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // g0.h, k.q
    public final Typeface s(Context context, f0.g gVar, Resources resources, int i10) {
        if (this.f13621v == null) {
            return super.s(context, gVar, resources, i10);
        }
        Object objJ = J();
        if (objJ == null) {
            return null;
        }
        for (f0.h hVar : gVar.f13017a) {
            if (!G(context, objJ, hVar.f13018a, hVar.f13022e, hVar.f13019b, hVar.f13020c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.f13021d))) {
                F(objJ);
                return null;
            }
        }
        if (I(objJ)) {
            return H(objJ);
        }
        return null;
    }

    @Override // g0.h, k.q
    public final Typeface t(Context context, l0.i[] iVarArr, int i10) {
        Typeface typefaceH;
        if (iVarArr.length < 1) {
            return null;
        }
        if (this.f13621v == null) {
            l0.i iVarX = x(i10, iVarArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVarX.f15114a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVarX.f15116c).setItalic(iVarX.f15117d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (l0.i iVar : iVarArr) {
            if (iVar.f15118e == 0) {
                Uri uri = iVar.f15114a;
                if (!map.containsKey(uri)) {
                    map.put(uri, z3.a.P(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objJ = J();
        if (objJ == null) {
            return null;
        }
        boolean z9 = false;
        for (l0.i iVar2 : iVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.f15114a);
            if (byteBuffer != null) {
                if (!((Boolean) this.f13622w.invoke(objJ, byteBuffer, Integer.valueOf(iVar2.f15115b), null, Integer.valueOf(iVar2.f15116c), Integer.valueOf(iVar2.f15117d ? 1 : 0))).booleanValue()) {
                    F(objJ);
                    return null;
                }
                z9 = true;
            }
        }
        if (!z9) {
            F(objJ);
            return null;
        }
        if (I(objJ) && (typefaceH = H(objJ)) != null) {
            return Typeface.create(typefaceH, i10);
        }
        return null;
    }

    @Override // k.q
    public final Typeface v(Context context, Resources resources, int i10, String str, int i11) {
        if (this.f13621v == null) {
            return super.v(context, resources, i10, str, i11);
        }
        Object objJ = J();
        if (objJ == null) {
            return null;
        }
        if (!G(context, objJ, str, 0, -1, -1, null)) {
            F(objJ);
            return null;
        }
        if (I(objJ)) {
            return H(objJ);
        }
        return null;
    }
}
