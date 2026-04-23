package f;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f12969a = new t0(new u0(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12970b = -100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k0.h f12971d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static k0.h f12972f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f12973h = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f12974q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s.c f12975s = new s.c(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f12976t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f12977u = new Object();

    public static boolean d(Context context) {
        if (f12973h == null) {
            try {
                int i10 = r0.f12961a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) r0.class), Build.VERSION.SDK_INT >= 24 ? q0.a() | NotificationCompat.FLAG_HIGH_PRIORITY : 640).metaData;
                if (bundle != null) {
                    f12973h = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f12973h = Boolean.FALSE;
            }
        }
        return f12973h.booleanValue();
    }

    public static void h(u uVar) {
        synchronized (f12976t) {
            try {
                Iterator it = f12975s.iterator();
                while (it.hasNext()) {
                    u uVar2 = (u) ((WeakReference) it.next()).get();
                    if (uVar2 == uVar || uVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void b();

    public abstract void c();

    public abstract void e(Configuration configuration);

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int i10);

    public abstract void j(int i10);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
