package m1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f15507s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f15509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f15510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f15511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f15512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f15513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f15514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f15515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f15516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f15517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f15518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f15519r;

    public k() {
        this.f15532a = null;
        this.f15533b = new ArrayList();
        this.f15534c = 120L;
        this.f15535d = 120L;
        this.f15536e = 250L;
        this.f15537f = 250L;
        this.f15508g = true;
        this.f15509h = new ArrayList();
        this.f15510i = new ArrayList();
        this.f15511j = new ArrayList();
        this.f15512k = new ArrayList();
        this.f15513l = new ArrayList();
        this.f15514m = new ArrayList();
        this.f15515n = new ArrayList();
        this.f15516o = new ArrayList();
        this.f15517p = new ArrayList();
        this.f15518q = new ArrayList();
        this.f15519r = new ArrayList();
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((e1) arrayList.get(size)).f15445a.animate().cancel();
        }
    }

    @Override // m1.l0
    public final boolean a(e1 e1Var, e1 e1Var2, k0 k0Var, k0 k0Var2) {
        int i10;
        int i11;
        int i12 = k0Var.f15520a;
        int i13 = k0Var.f15521b;
        if (e1Var2.q()) {
            int i14 = k0Var.f15520a;
            i11 = k0Var.f15521b;
            i10 = i14;
        } else {
            i10 = k0Var2.f15520a;
            i11 = k0Var2.f15521b;
        }
        if (e1Var == e1Var2) {
            return g(e1Var, i12, i13, i10, i11);
        }
        View view = e1Var.f15445a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(e1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(e1Var2);
        float f10 = -((int) ((i10 - i12) - translationX));
        View view2 = e1Var2.f15445a;
        view2.setTranslationX(f10);
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f15512k;
        i iVar = new i();
        iVar.f15488a = e1Var;
        iVar.f15489b = e1Var2;
        iVar.f15490c = i12;
        iVar.f15491d = i13;
        iVar.f15492e = i10;
        iVar.f15493f = i11;
        arrayList.add(iVar);
        return true;
    }

    @Override // m1.l0
    public final void d(e1 e1Var) {
        View view = e1Var.f15445a;
        view.animate().cancel();
        ArrayList arrayList = this.f15511j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) arrayList.get(size)).f15501a == e1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(e1Var);
                arrayList.remove(size);
            }
        }
        j(e1Var, this.f15512k);
        if (this.f15509h.remove(e1Var)) {
            view.setAlpha(1.0f);
            c(e1Var);
        }
        if (this.f15510i.remove(e1Var)) {
            view.setAlpha(1.0f);
            c(e1Var);
        }
        ArrayList arrayList2 = this.f15515n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(e1Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f15514m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList5.get(size4)).f15501a == e1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(e1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f15513l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(e1Var)) {
                view.setAlpha(1.0f);
                c(e1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f15518q.remove(e1Var);
        this.f15516o.remove(e1Var);
        this.f15519r.remove(e1Var);
        this.f15517p.remove(e1Var);
        i();
    }

    @Override // m1.l0
    public final void e() {
        ArrayList arrayList = this.f15511j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) arrayList.get(size);
            View view = jVar.f15501a.f15445a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(jVar.f15501a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f15509h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((e1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f15510i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            e1 e1Var = (e1) arrayList3.get(size3);
            e1Var.f15445a.setAlpha(1.0f);
            c(e1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f15512k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            i iVar = (i) arrayList4.get(size4);
            e1 e1Var2 = iVar.f15488a;
            if (e1Var2 != null) {
                k(iVar, e1Var2);
            }
            e1 e1Var3 = iVar.f15489b;
            if (e1Var3 != null) {
                k(iVar, e1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f15514m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList6.get(size6);
                    View view2 = jVar2.f15501a.f15445a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(jVar2.f15501a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f15513l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    e1 e1Var4 = (e1) arrayList8.get(size8);
                    e1Var4.f15445a.setAlpha(1.0f);
                    c(e1Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f15515n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    i iVar2 = (i) arrayList10.get(size10);
                    e1 e1Var5 = iVar2.f15488a;
                    if (e1Var5 != null) {
                        k(iVar2, e1Var5);
                    }
                    e1 e1Var6 = iVar2.f15489b;
                    if (e1Var6 != null) {
                        k(iVar2, e1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f15518q);
            h(this.f15517p);
            h(this.f15516o);
            h(this.f15519r);
            ArrayList arrayList11 = this.f15533b;
            if (arrayList11.size() > 0) {
                fb1.t(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // m1.l0
    public final boolean f() {
        return (this.f15510i.isEmpty() && this.f15512k.isEmpty() && this.f15511j.isEmpty() && this.f15509h.isEmpty() && this.f15517p.isEmpty() && this.f15518q.isEmpty() && this.f15516o.isEmpty() && this.f15519r.isEmpty() && this.f15514m.isEmpty() && this.f15513l.isEmpty() && this.f15515n.isEmpty()) ? false : true;
    }

    public final boolean g(e1 e1Var, int i10, int i11, int i12, int i13) {
        View view = e1Var.f15445a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) e1Var.f15445a.getTranslationY());
        l(e1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(e1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.f15511j;
        j jVar = new j();
        jVar.f15501a = e1Var;
        jVar.f15502b = translationX;
        jVar.f15503c = translationY;
        jVar.f15504d = i12;
        jVar.f15505e = i13;
        arrayList.add(jVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f15533b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            fb1.t(arrayList.get(0));
            throw null;
        }
    }

    public final void j(e1 e1Var, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (k(iVar, e1Var) && iVar.f15488a == null && iVar.f15489b == null) {
                arrayList.remove(iVar);
            }
        }
    }

    public final boolean k(i iVar, e1 e1Var) {
        if (iVar.f15489b == e1Var) {
            iVar.f15489b = null;
        } else {
            if (iVar.f15488a != e1Var) {
                return false;
            }
            iVar.f15488a = null;
        }
        e1Var.f15445a.setAlpha(1.0f);
        View view = e1Var.f15445a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(e1Var);
        return true;
    }

    public final void l(e1 e1Var) {
        if (f15507s == null) {
            f15507s = new ValueAnimator().getInterpolator();
        }
        e1Var.f15445a.animate().setInterpolator(f15507s);
        d(e1Var);
    }
}
