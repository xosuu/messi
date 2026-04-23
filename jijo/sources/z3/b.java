package z3;

import android.content.Context;
import s3.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f20696b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f20697a;

    static {
        b bVar = new b();
        bVar.f20697a = null;
        f20696b = bVar;
    }

    public static g a(Context context) {
        g gVar;
        b bVar = f20696b;
        synchronized (bVar) {
            try {
                if (bVar.f20697a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f20697a = new g(context);
                }
                gVar = bVar.f20697a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }
}
