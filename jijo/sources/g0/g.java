package g0;

import android.content.res.Resources;
import android.os.Build;
import k.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f13608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s.f f13609b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f13608a = new l(5);
        } else if (i10 >= 28) {
            f13608a = new k();
        } else if (i10 >= 26) {
            f13608a = new j();
        } else if (i10 < 24 || i.f13617h == null) {
            f13608a = new h(5);
        } else {
            f13608a = new i(5);
        }
        f13609b = new s.f(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r19, f0.f r20, android.content.res.Resources r21, int r22, java.lang.String r23, int r24, int r25, q7.b r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.g.a(android.content.Context, f0.f, android.content.res.Resources, int, java.lang.String, int, int, q7.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
