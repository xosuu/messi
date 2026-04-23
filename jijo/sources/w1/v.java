package w1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class v extends q {
    public int L;
    public ArrayList J = new ArrayList();
    public boolean K = true;
    public boolean M = false;
    public int N = 0;

    @Override // w1.q
    public final void A(q7.b bVar) {
        this.E = bVar;
        this.N |= 8;
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.J.get(i10)).A(bVar);
        }
    }

    @Override // w1.q
    public final void B(TimeInterpolator timeInterpolator) {
        this.N |= 1;
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((q) this.J.get(i10)).B(timeInterpolator);
            }
        }
        this.f18127f = timeInterpolator;
    }

    @Override // w1.q
    public final void C(d5.e eVar) {
        super.C(eVar);
        this.N |= 4;
        if (this.J != null) {
            for (int i10 = 0; i10 < this.J.size(); i10++) {
                ((q) this.J.get(i10)).C(eVar);
            }
        }
    }

    @Override // w1.q
    public final void D() {
        this.N |= 2;
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.J.get(i10)).D();
        }
    }

    @Override // w1.q
    public final void E(long j10) {
        this.f18125b = j10;
    }

    @Override // w1.q
    public final String G(String str) {
        String strG = super.G(str);
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            StringBuilder sbK = l.a0.k(strG, "\n");
            sbK.append(((q) this.J.get(i10)).G(str + "  "));
            strG = sbK.toString();
        }
        return strG;
    }

    public final void H(q qVar) {
        this.J.add(qVar);
        qVar.f18132u = this;
        long j10 = this.f18126d;
        if (j10 >= 0) {
            qVar.z(j10);
        }
        if ((this.N & 1) != 0) {
            qVar.B(this.f18127f);
        }
        if ((this.N & 2) != 0) {
            qVar.D();
        }
        if ((this.N & 4) != 0) {
            qVar.C(this.F);
        }
        if ((this.N & 8) != 0) {
            qVar.A(this.E);
        }
    }

    @Override // w1.q
    public final void a(p pVar) {
        super.a(pVar);
    }

    @Override // w1.q
    public final void b(View view) {
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            ((q) this.J.get(i10)).b(view);
        }
        this.f18129q.add(view);
    }

    @Override // w1.q
    public final void d(x xVar) {
        if (s(xVar.f18148b)) {
            for (q qVar : this.J) {
                if (qVar.s(xVar.f18148b)) {
                    qVar.d(xVar);
                    xVar.f18149c.add(qVar);
                }
            }
        }
    }

    @Override // w1.q
    public final void f(x xVar) {
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.J.get(i10)).f(xVar);
        }
    }

    @Override // w1.q
    public final void g(x xVar) {
        if (s(xVar.f18148b)) {
            for (q qVar : this.J) {
                if (qVar.s(xVar.f18148b)) {
                    qVar.g(xVar);
                    xVar.f18149c.add(qVar);
                }
            }
        }
    }

    @Override // w1.q
    /* JADX INFO: renamed from: j */
    public final q clone() {
        v vVar = (v) super.clone();
        vVar.J = new ArrayList();
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVarClone = ((q) this.J.get(i10)).clone();
            vVar.J.add(qVarClone);
            qVarClone.f18132u = vVar;
        }
        return vVar;
    }

    @Override // w1.q
    public final void l(ViewGroup viewGroup, j2.h hVar, j2.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j10 = this.f18125b;
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) this.J.get(i10);
            if (j10 > 0 && (this.K || i10 == 0)) {
                long j11 = qVar.f18125b;
                if (j11 > 0) {
                    qVar.E(j11 + j10);
                } else {
                    qVar.E(j10);
                }
            }
            qVar.l(viewGroup, hVar, hVar2, arrayList, arrayList2);
        }
    }

    @Override // w1.q
    public final void u(View view) {
        super.u(view);
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.J.get(i10)).u(view);
        }
    }

    @Override // w1.q
    public final void v(p pVar) {
        super.v(pVar);
    }

    @Override // w1.q
    public final void w(View view) {
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            ((q) this.J.get(i10)).w(view);
        }
        this.f18129q.remove(view);
    }

    @Override // w1.q
    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.J.get(i10)).x(viewGroup);
        }
    }

    @Override // w1.q
    public final void y() {
        if (this.J.isEmpty()) {
            F();
            m();
            return;
        }
        u uVar = new u();
        uVar.f18143a = this;
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(uVar);
        }
        this.L = this.J.size();
        if (this.K) {
            Iterator it2 = this.J.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).y();
            }
            return;
        }
        for (int i10 = 1; i10 < this.J.size(); i10++) {
            ((q) this.J.get(i10 - 1)).a(new g(this, 2, (q) this.J.get(i10)));
        }
        q qVar = (q) this.J.get(0);
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override // w1.q
    public final void z(long j10) {
        ArrayList arrayList;
        this.f18126d = j10;
        if (j10 < 0 || (arrayList = this.J) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.J.get(i10)).z(j10);
        }
    }
}
