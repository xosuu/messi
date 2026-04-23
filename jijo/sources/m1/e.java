package m1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15442b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f15443d;

    public /* synthetic */ e(k kVar, ArrayList arrayList, int i10) {
        this.f15441a = i10;
        this.f15443d = kVar;
        this.f15442b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i10 = this.f15441a;
        k kVar = this.f15443d;
        ArrayList<j> arrayList = this.f15442b;
        switch (i10) {
            case 0:
                for (j jVar : arrayList) {
                    e1 e1Var = jVar.f15501a;
                    kVar.getClass();
                    View view = e1Var.f15445a;
                    int i11 = jVar.f15504d - jVar.f15502b;
                    int i12 = jVar.f15505e - jVar.f15503c;
                    if (i11 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i12 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    kVar.f15517p.add(e1Var);
                    viewPropertyAnimatorAnimate.setDuration(kVar.f15536e).setListener(new g(kVar, e1Var, i11, view, i12, viewPropertyAnimatorAnimate)).start();
                }
                arrayList.clear();
                kVar.f15514m.remove(arrayList);
                break;
            case 1:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    kVar.getClass();
                    e1 e1Var2 = iVar.f15488a;
                    View view2 = e1Var2 == null ? null : e1Var2.f15445a;
                    e1 e1Var3 = iVar.f15489b;
                    View view3 = e1Var3 != null ? e1Var3.f15445a : null;
                    ArrayList arrayList2 = kVar.f15519r;
                    long j11 = kVar.f15537f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j11);
                        arrayList2.add(iVar.f15488a);
                        duration.translationX(iVar.f15492e - iVar.f15490c);
                        duration.translationY(iVar.f15493f - iVar.f15491d);
                        j10 = j11;
                        duration.alpha(0.0f).setListener(new h(kVar, iVar, duration, view2, 0)).start();
                    } else {
                        j10 = j11;
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        arrayList2.add(iVar.f15489b);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j10).alpha(1.0f).setListener(new h(kVar, iVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                    }
                }
                arrayList.clear();
                kVar.f15515n.remove(arrayList);
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    e1 e1Var4 = (e1) it2.next();
                    kVar.getClass();
                    View view4 = e1Var4.f15445a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    kVar.f15516o.add(e1Var4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(kVar.f15534c).setListener(new f(kVar, e1Var4, view4, viewPropertyAnimatorAnimate3, 1)).start();
                }
                arrayList.clear();
                kVar.f15513l.remove(arrayList);
                break;
        }
    }
}
