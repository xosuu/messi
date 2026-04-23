package g0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import k.q;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Class f13615d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Constructor f13616f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Method f13617h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Method f13618q;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f13616f = constructor;
        f13615d = cls;
        f13617h = method2;
        f13618q = method;
    }

    public static boolean C(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z9) {
        try {
            return ((Boolean) f13617h.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface D(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f13615d, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f13618q.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005d A[SYNTHETIC] */
    @Override // k.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface s(android.content.Context r17, f0.g r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            r0 = 0
            java.lang.reflect.Constructor r2 = g0.i.f13616f     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r2 = r1
        Ld:
            if (r2 != 0) goto L10
            return r1
        L10:
            r3 = r18
            f0.h[] r3 = r3.f13017a
            int r4 = r3.length
            r5 = 0
        L16:
            if (r5 >= r4) goto L73
            r6 = r3[r5]
            int r0 = r6.f13023f
            java.io.File r7 = z3.a.F(r17)
            if (r7 != 0) goto L26
            r8 = r19
        L24:
            r0 = r1
            goto L5b
        L26:
            r8 = r19
            boolean r0 = z3.a.r(r7, r8, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L32
            r7.delete()
            goto L24
        L32:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6e
            r9.<init>(r7)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6e
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4b
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4b
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4b
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4b
            r9.close()     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6e
            goto L58
        L4b:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L51
            goto L56
        L51:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6e
        L56:
            throw r10     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6e
        L57:
            r0 = r1
        L58:
            r7.delete()
        L5b:
            if (r0 != 0) goto L5e
            return r1
        L5e:
            int r7 = r6.f13019b
            boolean r9 = r6.f13020c
            int r6 = r6.f13022e
            boolean r0 = C(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L6b
            return r1
        L6b:
            int r5 = r5 + 1
            goto L16
        L6e:
            r0 = move-exception
            r7.delete()
            throw r0
        L73:
            android.graphics.Typeface r0 = D(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.i.s(android.content.Context, f0.g, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // k.q
    public final Typeface t(Context context, l0.i[] iVarArr, int i10) {
        Object objNewInstance;
        try {
            objNewInstance = f13616f.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        s.k kVar = new s.k();
        for (l0.i iVar : iVarArr) {
            Uri uri = iVar.f15114a;
            ByteBuffer byteBufferP = (ByteBuffer) kVar.getOrDefault(uri, null);
            if (byteBufferP == null) {
                byteBufferP = z3.a.P(context, uri);
                kVar.put(uri, byteBufferP);
            }
            if (byteBufferP == null) {
                return null;
            }
            if (!C(objNewInstance, byteBufferP, iVar.f15115b, iVar.f15116c, iVar.f15117d)) {
                return null;
            }
        }
        Typeface typefaceD = D(objNewInstance);
        if (typefaceD == null) {
            return null;
        }
        return Typeface.create(typefaceD, i10);
    }
}
