package l0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.google.android.gms.internal.ads.gp0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.f f15110a = new s.f(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f15111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s.k f15113d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f15111b = threadPoolExecutor;
        f15112c = new Object();
        f15113d = new s.k();
    }

    public static g a(String str, Context context, q qVar, int i10) throws Throwable {
        s.f fVar = f15110a;
        Typeface typeface = (Typeface) fVar.a(str);
        if (typeface != null) {
            return new g(typeface);
        }
        try {
            gp0 gp0VarA = d.a(context, qVar);
            int i11 = gp0VarA.f5025b;
            int i12 = 1;
            if (i11 != 0) {
                i12 = i11 != 1 ? -3 : -2;
            } else {
                i[] iVarArr = (i[]) gp0VarA.f5026d;
                if (iVarArr != null && iVarArr.length != 0) {
                    int length = iVarArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            i12 = 0;
                            break;
                        }
                        int i14 = iVarArr[i13].f15118e;
                        if (i14 == 0) {
                            i13++;
                        } else if (i14 >= 0) {
                            i12 = i14;
                        }
                    }
                }
            }
            if (i12 != 0) {
                return new g(i12);
            }
            Typeface typefaceT = g0.g.f13608a.t(context, (i[]) gp0VarA.f5026d, i10);
            if (typefaceT == null) {
                return new g(-3);
            }
            fVar.b(str, typefaceT);
            return new g(typefaceT);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        }
    }
}
