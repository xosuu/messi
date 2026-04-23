package h2;

import android.content.Context;
import c2.n;
import i2.d;
import i2.e;
import j2.f;
import j2.h;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f13941d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f13942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.c[] f13943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13944c;

    static {
        n.l("WorkConstraintsTracker");
    }

    public c(Context context, o2.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f13942a = bVar;
        this.f13943b = new i2.c[]{new i2.a(applicationContext, aVar, 0), new i2.a(applicationContext, aVar, 1), new i2.a(applicationContext, aVar, 4), new i2.a(applicationContext, aVar, 2), new i2.a(applicationContext, aVar, 3), new e((f) h.n(applicationContext, aVar).f14299d), new d((f) h.n(applicationContext, aVar).f14299d)};
        this.f13944c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f13944c) {
            try {
                for (i2.c cVar : this.f13943b) {
                    Object obj = cVar.f14166b;
                    if (obj != null && cVar.b(obj) && cVar.f14165a.contains(str)) {
                        n nVarI = n.i();
                        String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName());
                        nVarI.g(new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.f13944c) {
            b bVar = this.f13942a;
            if (bVar != null) {
                bVar.c(arrayList);
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.f13944c) {
            try {
                for (i2.c cVar : this.f13943b) {
                    if (cVar.f14168d != null) {
                        cVar.f14168d = null;
                        cVar.d(null, cVar.f14166b);
                    }
                }
                for (i2.c cVar2 : this.f13943b) {
                    cVar2.c(collection);
                }
                for (i2.c cVar3 : this.f13943b) {
                    if (cVar3.f14168d != this) {
                        cVar3.f14168d = this;
                        cVar3.d(this, cVar3.f14166b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f13944c) {
            try {
                for (i2.c cVar : this.f13943b) {
                    ArrayList arrayList = cVar.f14165a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f14167c.b(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
