package w1;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.fb1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f18141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f18142c;

    static {
        a aVar = new a();
        aVar.K = false;
        aVar.H(new h(2));
        aVar.H(new f());
        aVar.H(new h(1));
        f18140a = aVar;
        f18141b = new ThreadLocal();
        f18142c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, q qVar) {
        ArrayList arrayList = f18142c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = v0.f16075a;
        if (o0.g0.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (qVar == null) {
                qVar = f18140a;
            }
            q qVarClone = qVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).u(viewGroup);
                }
            }
            if (qVarClone != null) {
                qVarClone.h(viewGroup, true);
            }
            fb1.t(viewGroup.getTag(R.id.xd));
            viewGroup.setTag(R.id.xd, null);
            if (qVarClone != null) {
                s sVar = new s();
                sVar.f18138a = qVarClone;
                sVar.f18139b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(sVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(sVar);
            }
        }
    }

    public static s.b b() {
        s.b bVar;
        ThreadLocal threadLocal = f18141b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (s.b) weakReference.get()) != null) {
            return bVar;
        }
        s.b bVar2 = new s.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
