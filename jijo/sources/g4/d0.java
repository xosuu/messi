package g4;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EdgeEffect;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.List;
import l.a4;
import l.y3;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f13711a;

    /* JADX WARN: Removed duplicated region for block: B:185:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x069c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x06e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0706 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(w.e r36, u.d r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d0.a(w.e, u.d, java.util.ArrayList, int):void");
    }

    public static t.k b(b7.y yVar) {
        t.i iVar = new t.i();
        iVar.f16798c = new t.l();
        t.k kVar = new t.k(iVar);
        iVar.f16797b = kVar;
        iVar.f16796a = g1.a.class;
        try {
            yVar.r(false, true, new g1.b(iVar, yVar));
            iVar.f16796a = "Deferred.asListenableFuture";
        } catch (Exception e10) {
            kVar.f16802b.h(e10);
        }
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r2 != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(android.content.Context r8, java.lang.String r9) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r8.getPackageName()
            int r0 = r8.checkPermission(r9, r0, r1)
            r3 = -1
            if (r0 != r3) goto L15
            goto L84
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 < r4) goto L20
            java.lang.String r9 = androidx.core.app.h.d(r9)
            goto L21
        L20:
            r9 = 0
        L21:
            r5 = 0
            if (r9 != 0) goto L26
        L24:
            r3 = 0
            goto L84
        L26:
            if (r2 != 0) goto L38
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L84
            int r6 = r2.length
            if (r6 > 0) goto L36
            goto L84
        L36:
            r2 = r2[r5]
        L38:
            int r3 = android.os.Process.myUid()
            java.lang.String r6 = r8.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r7 = android.app.AppOpsManager.class
            if (r3 != r1) goto L73
            boolean r3 = n0.b.a(r6, r2)
            if (r3 == 0) goto L73
            r3 = 29
            if (r0 < r3) goto L66
            android.app.AppOpsManager r0 = androidx.core.app.i.c(r8)
            int r3 = android.os.Binder.getCallingUid()
            int r2 = androidx.core.app.i.a(r0, r9, r3, r2)
            if (r2 == 0) goto L5d
            goto L7f
        L5d:
            java.lang.String r8 = androidx.core.app.i.b(r8)
            int r2 = androidx.core.app.i.a(r0, r9, r1, r8)
            goto L7f
        L66:
            if (r0 < r4) goto L82
            java.lang.Object r8 = androidx.core.app.h.a(r8, r7)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r2 = androidx.core.app.h.c(r8, r9, r2)
            goto L7f
        L73:
            if (r0 < r4) goto L82
            java.lang.Object r8 = androidx.core.app.h.a(r8, r7)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r2 = androidx.core.app.h.c(r8, r9, r2)
        L7f:
            if (r2 != 0) goto L82
            goto L24
        L82:
            r8 = -2
            r3 = -2
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d0.c(android.content.Context, java.lang.String):int");
    }

    public static int d(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static int e(Context context, float f10) {
        return Math.round(f10 * context.getResources().getDisplayMetrics().density);
    }

    public static float f(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s0.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float g(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s0.e.c(edgeEffect, f10, f11);
        }
        s0.d.a(edgeEffect, f10, f11);
        return f10;
    }

    public static int h(File file) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            channel.close();
            return i10;
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }

    public static void i(Resources.Theme theme) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f0.p.a(theme);
            return;
        }
        if (i10 >= 23) {
            synchronized (f0.o.f13036a) {
                if (!f0.o.f13038c) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        f0.o.f13037b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    f0.o.f13038c = true;
                }
                Method method = f0.o.f13037b;
                if (method != null) {
                    try {
                        method.invoke(theme, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        f0.o.f13037b = null;
                    }
                }
            }
        }
    }

    public static void j(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            y3.a(view, charSequence);
            return;
        }
        a4 a4Var = a4.f14776w;
        if (a4Var != null && a4Var.f14778a == view) {
            a4.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new a4(view, charSequence);
            return;
        }
        a4 a4Var2 = a4.f14777x;
        if (a4Var2 != null && a4Var2.f14778a == view) {
            a4Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void k(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iT = t(parcel, i10);
        parcel.writeBundle(bundle);
        u(parcel, iT);
    }

    public static void l(Parcel parcel, int i10, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iT = t(parcel, i10);
        parcel.writeByteArray(bArr);
        u(parcel, iT);
    }

    public static void m(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iT = t(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        u(parcel, iT);
    }

    public static void n(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int iT = t(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        u(parcel, iT);
    }

    public static void o(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int iT = t(parcel, i10);
        parcel.writeString(str);
        u(parcel, iT);
    }

    public static void p(Parcel parcel, int i10, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iT = t(parcel, i10);
        parcel.writeStringArray(strArr);
        u(parcel, iT);
    }

    public static void q(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iT = t(parcel, i10);
        parcel.writeStringList(list);
        u(parcel, iT);
    }

    public static void r(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iT = t(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        u(parcel, iT);
    }

    public static void s(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iT = t(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        u(parcel, iT);
    }

    public static int t(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void u(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static void v(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }
}
