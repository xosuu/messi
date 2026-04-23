package w;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f18061q0 = -1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f18062r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f18063s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f18064t0 = this.J;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f18065u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f18066v0;

    public h() {
        this.R.clear();
        this.R.add(this.f18064t0);
        int length = this.Q.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.Q[i10] = this.f18064t0;
        }
    }

    @Override // w.d
    public final boolean B() {
        return this.f18066v0;
    }

    @Override // w.d
    public final boolean C() {
        return this.f18066v0;
    }

    @Override // w.d
    public final void R(u.d dVar, boolean z9) {
        if (this.T == null) {
            return;
        }
        c cVar = this.f18064t0;
        dVar.getClass();
        int iN = u.d.n(cVar);
        if (this.f18065u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            M(this.T.l());
            P(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        P(this.T.r());
        M(0);
    }

    public final void S(int i10) {
        this.f18064t0.l(i10);
        this.f18066v0 = true;
    }

    public final void T(int i10) {
        if (this.f18065u0 == i10) {
            return;
        }
        this.f18065u0 = i10;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f18065u0 == 1) {
            this.f18064t0 = this.I;
        } else {
            this.f18064t0 = this.J;
        }
        arrayList.add(this.f18064t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            cVarArr[i11] = this.f18064t0;
        }
    }

    @Override // w.d
    public final void c(u.d dVar, boolean z9) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object objJ = eVar.j(2);
        Object objJ2 = eVar.j(4);
        d dVar2 = this.T;
        boolean z10 = dVar2 != null && dVar2.f18013p0[0] == 2;
        if (this.f18065u0 == 0) {
            objJ = eVar.j(3);
            objJ2 = eVar.j(5);
            d dVar3 = this.T;
            z10 = dVar3 != null && dVar3.f18013p0[1] == 2;
        }
        if (this.f18066v0) {
            c cVar = this.f18064t0;
            if (cVar.f17975c) {
                u.i iVarK = dVar.k(cVar);
                dVar.d(iVarK, this.f18064t0.d());
                if (this.f18062r0 != -1) {
                    if (z10) {
                        dVar.f(dVar.k(objJ2), iVarK, 0, 5);
                    }
                } else if (this.f18063s0 != -1 && z10) {
                    u.i iVarK2 = dVar.k(objJ2);
                    dVar.f(iVarK, dVar.k(objJ), 0, 5);
                    dVar.f(iVarK2, iVarK, 0, 5);
                }
                this.f18066v0 = false;
                return;
            }
        }
        if (this.f18062r0 != -1) {
            u.i iVarK3 = dVar.k(this.f18064t0);
            dVar.e(iVarK3, dVar.k(objJ), this.f18062r0, 8);
            if (z10) {
                dVar.f(dVar.k(objJ2), iVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f18063s0 != -1) {
            u.i iVarK4 = dVar.k(this.f18064t0);
            u.i iVarK5 = dVar.k(objJ2);
            dVar.e(iVarK4, iVarK5, -this.f18063s0, 8);
            if (z10) {
                dVar.f(iVarK4, dVar.k(objJ), 0, 5);
                dVar.f(iVarK5, iVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f18061q0 != -1.0f) {
            u.i iVarK6 = dVar.k(this.f18064t0);
            u.i iVarK7 = dVar.k(objJ2);
            float f10 = this.f18061q0;
            u.c cVarL = dVar.l();
            cVarL.f17466d.h(iVarK6, -1.0f);
            cVarL.f17466d.h(iVarK7, f10);
            dVar.c(cVarL);
        }
    }

    @Override // w.d
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018  */
    @Override // w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w.c j(int r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L20
            r1 = 1
            int r4 = r4 - r1
            if (r4 == r1) goto L18
            r2 = 2
            if (r4 == r2) goto L11
            r2 = 3
            if (r4 == r2) goto L18
            r1 = 4
            if (r4 == r1) goto L11
            goto L1f
        L11:
            int r4 = r3.f18065u0
            if (r4 != 0) goto L1f
            w.c r4 = r3.f18064t0
            return r4
        L18:
            int r4 = r3.f18065u0
            if (r4 != r1) goto L1f
            w.c r4 = r3.f18064t0
            return r4
        L1f:
            return r0
        L20:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.j(int):w.c");
    }
}
