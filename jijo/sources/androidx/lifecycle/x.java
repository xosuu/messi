package androidx.lifecycle;

import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.fb1;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f1007k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1008a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n.g f1009b = new n.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1010c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f1012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f1013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.activity.e f1017j;

    public x() {
        Object obj = f1007k;
        this.f1013f = obj;
        this.f1017j = new androidx.activity.e(8, this);
        this.f1012e = obj;
        this.f1014g = -1;
    }

    public static void a(String str) {
        if (!m.a.r0().f15365c.s0()) {
            throw new IllegalStateException(fb1.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(w wVar) {
        if (wVar.f1004b) {
            if (!wVar.d()) {
                wVar.b(false);
                return;
            }
            int i10 = wVar.f1005c;
            int i11 = this.f1014g;
            if (i10 >= i11) {
                return;
            }
            wVar.f1005c = i11;
            androidx.fragment.app.k kVar = wVar.f1003a;
            Object obj = this.f1012e;
            kVar.getClass();
            if (((q) obj) != null) {
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) kVar.f808a;
                if (mVar.f825o0) {
                    View viewU = mVar.U();
                    if (viewU.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (mVar.f829s0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(mVar.f829s0);
                        }
                        mVar.f829s0.setContentView(viewU);
                    }
                }
            }
        }
    }

    public final void c(w wVar) {
        if (this.f1015h) {
            this.f1016i = true;
            return;
        }
        this.f1015h = true;
        do {
            this.f1016i = false;
            if (wVar != null) {
                b(wVar);
                wVar = null;
            } else {
                n.g gVar = this.f1009b;
                gVar.getClass();
                n.d dVar = new n.d(gVar);
                gVar.f15818d.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1016i) {
                        break;
                    }
                }
            }
        } while (this.f1016i);
        this.f1015h = false;
    }

    public final void d(androidx.fragment.app.k kVar) {
        Object obj;
        a("observeForever");
        v vVar = new v(this, kVar);
        n.g gVar = this.f1009b;
        n.c cVarB = gVar.b(kVar);
        if (cVarB != null) {
            obj = cVarB.f15808b;
        } else {
            n.c cVar = new n.c(kVar, vVar);
            gVar.f15819f++;
            n.c cVar2 = gVar.f15817b;
            if (cVar2 == null) {
                gVar.f15816a = cVar;
                gVar.f15817b = cVar;
            } else {
                cVar2.f15809d = cVar;
                cVar.f15810f = cVar2;
                gVar.f15817b = cVar;
            }
            obj = null;
        }
        w wVar = (w) obj;
        if (wVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (wVar != null) {
            return;
        }
        vVar.b(true);
    }

    public final void e(Object obj) {
        a("setValue");
        this.f1014g++;
        this.f1012e = obj;
        c(null);
    }
}
