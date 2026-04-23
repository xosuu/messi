package m1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f15433a;

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        long j10;
        RecyclerView recyclerView = this.f15433a;
        l0 l0Var = recyclerView.T;
        if (l0Var != null) {
            k kVar = (k) l0Var;
            ArrayList arrayList2 = kVar.f15509h;
            boolean z9 = !arrayList2.isEmpty();
            ArrayList arrayList3 = kVar.f15511j;
            boolean z10 = !arrayList3.isEmpty();
            ArrayList arrayList4 = kVar.f15512k;
            boolean z11 = !arrayList4.isEmpty();
            ArrayList arrayList5 = kVar.f15510i;
            boolean z12 = !arrayList5.isEmpty();
            if (z9 || z10 || z12 || z11) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    arrayList = arrayList3;
                    j10 = kVar.f15535d;
                    if (!zHasNext) {
                        break;
                    }
                    e1 e1Var = (e1) it.next();
                    View view = e1Var.f15445a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    kVar.f15518q.add(e1Var);
                    viewPropertyAnimatorAnimate.setDuration(j10).alpha(0.0f).setListener(new f(kVar, e1Var, viewPropertyAnimatorAnimate, view)).start();
                    arrayList3 = arrayList;
                }
                arrayList2.clear();
                if (z10) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(arrayList);
                    kVar.f15514m.add(arrayList6);
                    arrayList.clear();
                    e eVar = new e(kVar, arrayList6, 0);
                    if (z9) {
                        View view2 = ((j) arrayList6.get(0)).f15501a.f15445a;
                        WeakHashMap weakHashMap = o0.v0.f16075a;
                        o0.d0.n(view2, eVar, j10);
                    } else {
                        eVar.run();
                    }
                }
                if (z11) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    kVar.f15515n.add(arrayList7);
                    arrayList4.clear();
                    e eVar2 = new e(kVar, arrayList7, 1);
                    if (z9) {
                        View view3 = ((i) arrayList7.get(0)).f15488a.f15445a;
                        WeakHashMap weakHashMap2 = o0.v0.f16075a;
                        o0.d0.n(view3, eVar2, j10);
                    } else {
                        eVar2.run();
                    }
                }
                if (z12) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.addAll(arrayList5);
                    kVar.f15513l.add(arrayList8);
                    arrayList5.clear();
                    e eVar3 = new e(kVar, arrayList8, 2);
                    if (z9 || z10 || z11) {
                        if (!z9) {
                            j10 = 0;
                        }
                        long jMax = Math.max(z10 ? kVar.f15536e : 0L, z11 ? kVar.f15537f : 0L) + j10;
                        View view4 = ((e1) arrayList8.get(0)).f15445a;
                        WeakHashMap weakHashMap3 = o0.v0.f16075a;
                        o0.d0.n(view4, eVar3, jMax);
                    } else {
                        eVar3.run();
                    }
                }
            }
        }
        recyclerView.f1069u0 = false;
    }
}
