package q6;

import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16439a;

    static {
        b bVar;
        try {
            Object objNewInstance = s6.b.class.newInstance();
            a0.e(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    bVar = (b) objNewInstance;
                } catch (ClassCastException e10) {
                    ClassLoader classLoader = objNewInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = b.class.getClassLoader();
                    if (a0.b(classLoader, classLoader2)) {
                        throw e10;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                }
            } catch (ClassNotFoundException unused) {
                Object objNewInstance2 = r6.b.class.newInstance();
                a0.e(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        bVar = (b) objNewInstance2;
                    } catch (ClassNotFoundException unused2) {
                        bVar = new b();
                    }
                } catch (ClassCastException e11) {
                    ClassLoader classLoader3 = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = b.class.getClassLoader();
                    if (a0.b(classLoader3, classLoader4)) {
                        throw e11;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object objNewInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            a0.e(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    bVar = (b) objNewInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    a0.e(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        bVar = (b) objNewInstance4;
                    } catch (ClassCastException e12) {
                        ClassLoader classLoader5 = objNewInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = b.class.getClassLoader();
                        if (a0.b(classLoader5, classLoader6)) {
                            throw e12;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                    }
                }
            } catch (ClassCastException e13) {
                ClassLoader classLoader7 = objNewInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = b.class.getClassLoader();
                if (a0.b(classLoader7, classLoader8)) {
                    throw e13;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
            }
        }
        f16439a = bVar;
    }
}
