package w1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0.j0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Cloneable {
    public static final int[] G = {2, 1, 3, 4};
    public static final d5.e H = new d5.e(26);
    public static final ThreadLocal I = new ThreadLocal();
    public q7.b E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f18134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f18135x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18124a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18125b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18126d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TimeInterpolator f18127f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f18128h = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f18129q = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j2.h f18130s = new j2.h(6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j2.h f18131t = new j2.h(6);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public v f18132u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f18133v = G;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f18136y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18137z = 0;
    public boolean A = false;
    public boolean B = false;
    public ArrayList C = null;
    public ArrayList D = new ArrayList();
    public d5.e F = H;

    public static void c(j2.h hVar, View view, x xVar) {
        ((s.b) hVar.f14297a).put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) hVar.f14298b).indexOfKey(id) >= 0) {
                ((SparseArray) hVar.f14298b).put(id, null);
            } else {
                ((SparseArray) hVar.f14298b).put(id, view);
            }
        }
        WeakHashMap weakHashMap = v0.f16075a;
        String strK = j0.k(view);
        if (strK != null) {
            if (((s.b) hVar.f14300f).containsKey(strK)) {
                ((s.b) hVar.f14300f).put(strK, null);
            } else {
                ((s.b) hVar.f14300f).put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                s.e eVar = (s.e) hVar.f14299d;
                if (eVar.f16599a) {
                    eVar.d();
                }
                if (s.d.b(eVar.f16600b, eVar.f16602f, itemIdAtPosition) < 0) {
                    o0.d0.r(view, true);
                    ((s.e) hVar.f14299d).f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ((s.e) hVar.f14299d).e(itemIdAtPosition, null);
                if (view2 != null) {
                    o0.d0.r(view2, false);
                    ((s.e) hVar.f14299d).f(itemIdAtPosition, null);
                }
            }
        }
    }

    public static s.b o() {
        ThreadLocal threadLocal = I;
        s.b bVar = (s.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        s.b bVar2 = new s.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean t(x xVar, x xVar2, String str) {
        Object obj = xVar.f18147a.get(str);
        Object obj2 = xVar2.f18147a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(q7.b bVar) {
        this.E = bVar;
    }

    public void B(TimeInterpolator timeInterpolator) {
        this.f18127f = timeInterpolator;
    }

    public void C(d5.e eVar) {
        if (eVar == null) {
            this.F = H;
        } else {
            this.F = eVar;
        }
    }

    public void D() {
    }

    public void E(long j10) {
        this.f18125b = j10;
    }

    public final void F() {
        if (this.f18137z == 0) {
            ArrayList arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.C.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p) arrayList2.get(i10)).a();
                }
            }
            this.B = false;
        }
        this.f18137z++;
    }

    public String G(String str) {
        StringBuilder sbS = g1.a.s(str);
        sbS.append(getClass().getSimpleName());
        sbS.append("@");
        sbS.append(Integer.toHexString(hashCode()));
        sbS.append(": ");
        String string = sbS.toString();
        if (this.f18126d != -1) {
            StringBuilder sbK = l.a0.k(string, "dur(");
            sbK.append(this.f18126d);
            sbK.append(") ");
            string = sbK.toString();
        }
        if (this.f18125b != -1) {
            StringBuilder sbK2 = l.a0.k(string, "dly(");
            sbK2.append(this.f18125b);
            sbK2.append(") ");
            string = sbK2.toString();
        }
        if (this.f18127f != null) {
            StringBuilder sbK3 = l.a0.k(string, "interp(");
            sbK3.append(this.f18127f);
            sbK3.append(") ");
            string = sbK3.toString();
        }
        ArrayList arrayList = this.f18128h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f18129q;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strY = g1.a.y(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    strY = g1.a.y(strY, ", ");
                }
                StringBuilder sbS2 = g1.a.s(strY);
                sbS2.append(arrayList.get(i10));
                strY = sbS2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 > 0) {
                    strY = g1.a.y(strY, ", ");
                }
                StringBuilder sbS3 = g1.a.s(strY);
                sbS3.append(arrayList2.get(i11));
                strY = sbS3.toString();
            }
        }
        return g1.a.y(strY, ")");
    }

    public void a(p pVar) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(pVar);
    }

    public void b(View view) {
        this.f18129q.add(view);
    }

    public abstract void d(x xVar);

    public final void e(View view, boolean z9) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x xVar = new x(view);
            if (z9) {
                g(xVar);
            } else {
                d(xVar);
            }
            xVar.f18149c.add(this);
            f(xVar);
            if (z9) {
                c(this.f18130s, view, xVar);
            } else {
                c(this.f18131t, view, xVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z9);
            }
        }
    }

    public void f(x xVar) {
    }

    public abstract void g(x xVar);

    public final void h(ViewGroup viewGroup, boolean z9) {
        i(z9);
        ArrayList arrayList = this.f18128h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f18129q;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z9);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                x xVar = new x(viewFindViewById);
                if (z9) {
                    g(xVar);
                } else {
                    d(xVar);
                }
                xVar.f18149c.add(this);
                f(xVar);
                if (z9) {
                    c(this.f18130s, viewFindViewById, xVar);
                } else {
                    c(this.f18131t, viewFindViewById, xVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            x xVar2 = new x(view);
            if (z9) {
                g(xVar2);
            } else {
                d(xVar2);
            }
            xVar2.f18149c.add(this);
            f(xVar2);
            if (z9) {
                c(this.f18130s, view, xVar2);
            } else {
                c(this.f18131t, view, xVar2);
            }
        }
    }

    public final void i(boolean z9) {
        if (z9) {
            ((s.b) this.f18130s.f14297a).clear();
            ((SparseArray) this.f18130s.f14298b).clear();
            ((s.e) this.f18130s.f14299d).b();
        } else {
            ((s.b) this.f18131t.f14297a).clear();
            ((SparseArray) this.f18131t.f14298b).clear();
            ((s.e) this.f18131t.f14299d).b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public q clone() {
        try {
            q qVar = (q) super.clone();
            qVar.D = new ArrayList();
            qVar.f18130s = new j2.h(6);
            qVar.f18131t = new j2.h(6);
            qVar.f18134w = null;
            qVar.f18135x = null;
            return qVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, j2.h hVar, j2.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorK;
        int i10;
        View view;
        x xVar;
        Animator animator;
        s.b bVarO = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            x xVar2 = (x) arrayList.get(i11);
            x xVar3 = (x) arrayList2.get(i11);
            x xVar4 = null;
            if (xVar2 != null && !xVar2.f18149c.contains(this)) {
                xVar2 = null;
            }
            if (xVar3 != null && !xVar3.f18149c.contains(this)) {
                xVar3 = null;
            }
            if (!(xVar2 == null && xVar3 == null) && ((xVar2 == null || xVar3 == null || r(xVar2, xVar3)) && (animatorK = k(viewGroup, xVar2, xVar3)) != null)) {
                String str = this.f18124a;
                if (xVar3 != null) {
                    String[] strArrP = p();
                    view = xVar3.f18148b;
                    if (strArrP != null && strArrP.length > 0) {
                        xVar = new x(view);
                        x xVar5 = (x) ((s.b) hVar2.f14297a).getOrDefault(view, null);
                        i10 = size;
                        if (xVar5 != null) {
                            int i12 = 0;
                            while (i12 < strArrP.length) {
                                HashMap map = xVar.f18147a;
                                String str2 = strArrP[i12];
                                map.put(str2, xVar5.f18147a.get(str2));
                                i12++;
                                strArrP = strArrP;
                            }
                        }
                        int i13 = bVarO.f16626d;
                        for (int i14 = 0; i14 < i13; i14++) {
                            animator = null;
                            o oVar = (o) bVarO.getOrDefault((Animator) bVarO.h(i14), null);
                            if (oVar.f18121c != null && oVar.f18119a == view && oVar.f18120b.equals(str) && oVar.f18121c.equals(xVar)) {
                                break;
                            }
                        }
                    } else {
                        i10 = size;
                        xVar = null;
                    }
                    animator = animatorK;
                    animatorK = animator;
                    xVar4 = xVar;
                } else {
                    i10 = size;
                    view = xVar2.f18148b;
                }
                if (animatorK != null) {
                    a0 a0Var = y.f18150a;
                    h0 h0Var = new h0(viewGroup);
                    o oVar2 = new o();
                    oVar2.f18119a = view;
                    oVar2.f18120b = str;
                    oVar2.f18121c = xVar4;
                    oVar2.f18122d = h0Var;
                    oVar2.f18123e = this;
                    bVarO.put(animatorK, oVar2);
                    this.D.add(animatorK);
                }
            } else {
                i10 = size;
            }
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator2 = (Animator) this.D.get(sparseIntArray.keyAt(i15));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i10 = this.f18137z - 1;
        this.f18137z = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.C.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((p) arrayList2.get(i11)).b(this);
                }
            }
            for (int i12 = 0; i12 < ((s.e) this.f18130s.f14299d).g(); i12++) {
                View view = (View) ((s.e) this.f18130s.f14299d).h(i12);
                if (view != null) {
                    WeakHashMap weakHashMap = v0.f16075a;
                    o0.d0.r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((s.e) this.f18131t.f14299d).g(); i13++) {
                View view2 = (View) ((s.e) this.f18131t.f14299d).h(i13);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = v0.f16075a;
                    o0.d0.r(view2, false);
                }
            }
            this.B = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f18135x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f18134w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (w1.x) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w1.x n(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            w1.v r0 = r5.f18132u
            if (r0 == 0) goto L9
            w1.x r6 = r0.n(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f18134w
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f18135x
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            w1.x r4 = (w1.x) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f18148b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f18135x
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f18134w
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            w1.x r1 = (w1.x) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.q.n(android.view.View, boolean):w1.x");
    }

    public String[] p() {
        return null;
    }

    public final x q(View view, boolean z9) {
        v vVar = this.f18132u;
        if (vVar != null) {
            return vVar.q(view, z9);
        }
        return (x) ((s.b) (z9 ? this.f18130s : this.f18131t).f14297a).getOrDefault(view, null);
    }

    public boolean r(x xVar, x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        String[] strArrP = p();
        if (strArrP == null) {
            Iterator it = xVar.f18147a.keySet().iterator();
            while (it.hasNext()) {
                if (t(xVar, xVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrP) {
            if (!t(xVar, xVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f18128h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f18129q;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return G(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public void u(View view) {
        if (this.B) {
            return;
        }
        s.b bVarO = o();
        int i10 = bVarO.f16626d;
        a0 a0Var = y.f18150a;
        WindowId windowId = view.getWindowId();
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            o oVar = (o) bVarO.j(i11);
            if (oVar.f18119a != null) {
                i0 i0Var = oVar.f18122d;
                if ((i0Var instanceof h0) && ((h0) i0Var).f18105a.equals(windowId)) {
                    ((Animator) bVarO.h(i11)).pause();
                }
            }
        }
        ArrayList arrayList = this.C;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.C.clone();
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((p) arrayList2.get(i12)).c();
            }
        }
        this.A = true;
    }

    public void v(p pVar) {
        ArrayList arrayList = this.C;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(pVar);
        if (this.C.size() == 0) {
            this.C = null;
        }
    }

    public void w(View view) {
        this.f18129q.remove(view);
    }

    public void x(ViewGroup viewGroup) {
        if (this.A) {
            if (!this.B) {
                s.b bVarO = o();
                int i10 = bVarO.f16626d;
                a0 a0Var = y.f18150a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    o oVar = (o) bVarO.j(i11);
                    if (oVar.f18119a != null) {
                        i0 i0Var = oVar.f18122d;
                        if ((i0Var instanceof h0) && ((h0) i0Var).f18105a.equals(windowId)) {
                            ((Animator) bVarO.h(i11)).resume();
                        }
                    }
                }
                ArrayList arrayList = this.C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.C.clone();
                    int size = arrayList2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((p) arrayList2.get(i12)).d();
                    }
                }
            }
            this.A = false;
        }
    }

    public void y() {
        F();
        s.b bVarO = o();
        for (Animator animator : this.D) {
            if (bVarO.containsKey(animator)) {
                F();
                if (animator != null) {
                    animator.addListener(new n(this, bVarO));
                    long j10 = this.f18126d;
                    if (j10 >= 0) {
                        animator.setDuration(j10);
                    }
                    long j11 = this.f18125b;
                    if (j11 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f18127f;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new l.d(1, this));
                    animator.start();
                }
            }
        }
        this.D.clear();
        m();
    }

    public void z(long j10) {
        this.f18126d = j10;
    }
}
