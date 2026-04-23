package s3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.b0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.emoji2.text.k, r1.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f16691b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16692a;

    public /* synthetic */ g(Context context) {
        this.f16692a = context;
    }

    public static void c(Context context) {
        z3.a.l(context);
        synchronized (g.class) {
            try {
                if (f16691b == null) {
                    o.a(context);
                    g gVar = new g();
                    gVar.f16692a = context.getApplicationContext();
                    f16691b = gVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final k g(PackageInfo packageInfo, k... kVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        l lVar = new l(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < kVarArr.length; i10++) {
            if (kVarArr[i10].equals(lVar)) {
                return kVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean h(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z9;
        if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z9 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            } else {
                z9 = true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
            z9 = true;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z9 ? g(packageInfo2, n.f16703a) : g(packageInfo2, n.f16703a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.emoji2.text.k
    public void a(b4.f fVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.emoji2.text.m(this, fVar, threadPoolExecutor, 0));
    }

    public ApplicationInfo b(int i10, String str) {
        return this.f16692a.getPackageManager().getApplicationInfo(str, i10);
    }

    public PackageInfo d(int i10, String str) {
        return this.f16692a.getPackageManager().getPackageInfo(str, i10);
    }

    @Override // r1.c
    public r1.d e(r1.b bVar) {
        String str = bVar.f16493b;
        b0 b0Var = bVar.f16494c;
        if (b0Var == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f16692a;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        r1.b bVar2 = new r1.b();
        bVar2.f16492a = context;
        bVar2.f16493b = str;
        bVar2.f16494c = b0Var;
        bVar2.f16495d = true;
        return new s1.e(bVar2.f16492a, bVar2.f16493b, bVar2.f16494c, bVar2.f16495d);
    }

    public boolean f() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f16692a;
        if (callingUid == iMyUid) {
            return z3.a.N(context);
        }
        if (!z3.a.K() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public /* synthetic */ g(Context context, int i10) {
        if (i10 != 1) {
            this.f16692a = context.getApplicationContext();
        } else {
            this.f16692a = context;
        }
    }
}
