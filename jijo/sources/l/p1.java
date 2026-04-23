package l;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f14960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f14961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f14962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f14963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f14964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Field f14965f;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    static {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android.graphics.Insets"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.ClassNotFoundException -> L4c java.lang.NoSuchMethodException -> L50
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            java.lang.String r5 = "getOpticalInsets"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.ClassNotFoundException -> L4c java.lang.NoSuchMethodException -> L50
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.ClassNotFoundException -> L4c java.lang.NoSuchMethodException -> L50
            java.lang.String r5 = "left"
            java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3c java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L44
            java.lang.String r6 = "top"
            java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L32 java.lang.ClassNotFoundException -> L36 java.lang.NoSuchMethodException -> L39
            java.lang.String r7 = "right"
            java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = "bottom"
            java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2d
            r8 = 1
            goto L56
        L2d:
            goto L54
        L2f:
            r7 = r1
            goto L54
        L32:
            r6 = r1
        L34:
            r7 = r6
            goto L54
        L36:
            r6 = r1
            goto L34
        L39:
            r6 = r1
            goto L34
        L3c:
            r5 = r1
        L3e:
            r6 = r5
            goto L34
        L40:
            r5 = r1
        L42:
            r6 = r5
            goto L34
        L44:
            r5 = r1
        L46:
            r6 = r5
            goto L34
        L48:
            r4 = r1
            r5 = r4
            goto L3e
        L4c:
            r4 = r1
            r5 = r4
            goto L42
        L50:
            r4 = r1
            r5 = r4
            goto L46
        L54:
            r3 = r1
            r8 = 0
        L56:
            if (r8 == 0) goto L65
            l.p1.f14961b = r4
            l.p1.f14962c = r5
            l.p1.f14963d = r6
            l.p1.f14964e = r7
            l.p1.f14965f = r3
            l.p1.f14960a = r0
            goto L71
        L65:
            l.p1.f14961b = r1
            l.p1.f14962c = r1
            l.p1.f14963d = r1
            l.p1.f14964e = r1
            l.p1.f14965f = r1
            l.p1.f14960a = r2
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.p1.<clinit>():void");
    }
}
