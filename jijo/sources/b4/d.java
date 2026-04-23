package b4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import b7.u;
import c2.n;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f1314d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f1315e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1316f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f1317g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f1318h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static k f1322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static l f1323m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1324a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f1319i = new ThreadLocal();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f1320j = new h(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f1321k = new n(3, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f1312b = new n(4, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f1313c = new n(7, 0);

    public d(Context context) {
        this.f1324a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (u.i(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e10) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage()));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #1 {all -> 0x0190, blocks: (B:5:0x002c, B:15:0x0052, B:124:0x01e8, B:125:0x01f9, B:98:0x0188, B:99:0x018f, B:107:0x019e, B:109:0x01a5, B:111:0x01b4, B:122:0x01e0, B:123:0x01e7, B:104:0x0195, B:105:0x0196, B:106:0x019d, B:126:0x01fa, B:127:0x0224, B:20:0x0068, B:26:0x0074, B:29:0x007d, B:33:0x0083, B:35:0x008b, B:37:0x008f, B:38:0x009d, B:45:0x00ac, B:47:0x00b2, B:49:0x00cf, B:51:0x00d7, B:59:0x00e8, B:60:0x00ef, B:48:0x00c1, B:63:0x00f2, B:64:0x00f3, B:65:0x00fa, B:66:0x00fb, B:67:0x0102, B:70:0x0105, B:71:0x0106, B:73:0x010c, B:75:0x011f, B:77:0x0127, B:83:0x0155, B:85:0x015b, B:86:0x0164, B:87:0x016b, B:78:0x0138, B:79:0x013f, B:81:0x0142, B:82:0x014c, B:88:0x016c, B:89:0x0173, B:90:0x0174, B:91:0x017b, B:97:0x0187), top: B:141:0x002c, inners: #4, #7, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b4.d c(android.content.Context r18, c2.n r19, java.lang.String r20) throws com.google.android.gms.dynamite.DynamiteModule$LoadingException {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.d.c(android.content.Context, c2.n, java.lang.String):b4.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01b1 A[Catch: all -> 0x00d4, TryCatch #8 {all -> 0x00d4, blocks: (B:3:0x0002, B:64:0x00c9, B:66:0x00cf, B:73:0x00dc, B:102:0x014f, B:111:0x015e, B:126:0x01b1, B:127:0x01b4, B:122:0x01aa, B:71:0x00d8, B:129:0x01b6, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c6, B:21:0x0049, B:45:0x00a0, B:48:0x00a3, B:55:0x00bb, B:63:0x00c8, B:61:0x00c1), top: B:141:0x0002, inners: #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[Catch: all -> 0x0036, TryCatch #10 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b8, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00af, B:17:0x003e), top: B:144:0x0026, inners: #13 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.d.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[PHI: r9
      0x0097: PHI (r9v8 boolean) = (r9v7 boolean), (r9v12 boolean), (r9v12 boolean) binds: [B:11:0x0055, B:29:0x008e, B:31:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.d.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void f(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        l lVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                lVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                lVar = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            f1323m = lVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f1318h)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f1318h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (s3.d.f16687b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f1318h = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f1316f = true;
            }
        }
        return zBooleanValue;
    }

    public static k h(Context context) {
        k kVar;
        synchronized (d.class) {
            k kVar2 = f1322l;
            if (kVar2 != null) {
                return kVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (kVar != null) {
                    f1322l = kVar;
                    return kVar;
                }
            } catch (Exception e10) {
                e10.getMessage();
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f1324a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e10);
        }
    }
}
