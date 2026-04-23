package j2;

import android.content.Context;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import l.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f14283f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2.a f14284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14286c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f14287d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14288e;

    static {
        n.l("ConstraintTracker");
    }

    public d(Context context, o2.a aVar) {
        this.f14285b = context.getApplicationContext();
        this.f14284a = aVar;
    }

    public abstract Object a();

    public final void b(i2.c cVar) {
        synchronized (this.f14286c) {
            try {
                if (this.f14287d.remove(cVar) && this.f14287d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f14286c) {
            try {
                Object obj2 = this.f14288e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f14288e = obj;
                    ((Executor) ((ur0) this.f14284a).f9602f).execute(new j(this, 11, new ArrayList(this.f14287d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
