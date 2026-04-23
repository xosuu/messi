package u;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f17466d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f17463a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17464b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17465c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17467e = false;

    public c(j2.h hVar) {
        this.f17466d = new a(this, hVar);
    }

    public final void a(d dVar, int i10) {
        this.f17466d.h(dVar.j(i10), 1.0f);
        this.f17466d.h(dVar.j(i10), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i10) {
        boolean z9;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            } else {
                z9 = false;
            }
            this.f17464b = i10;
            if (z9) {
                this.f17466d.h(iVar, 1.0f);
                this.f17466d.h(iVar2, -1.0f);
                this.f17466d.h(iVar3, -1.0f);
                return;
            }
        }
        this.f17466d.h(iVar, -1.0f);
        this.f17466d.h(iVar2, 1.0f);
        this.f17466d.h(iVar3, 1.0f);
    }

    public final void c(i iVar, i iVar2, i iVar3, int i10) {
        boolean z9;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            } else {
                z9 = false;
            }
            this.f17464b = i10;
            if (z9) {
                this.f17466d.h(iVar, 1.0f);
                this.f17466d.h(iVar2, -1.0f);
                this.f17466d.h(iVar3, 1.0f);
                return;
            }
        }
        this.f17466d.h(iVar, -1.0f);
        this.f17466d.h(iVar2, 1.0f);
        this.f17466d.h(iVar3, -1.0f);
    }

    public i d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f17463a == null && this.f17464b == 0.0f && this.f17466d.d() == 0;
    }

    public final i f(boolean[] zArr, i iVar) {
        int i10;
        int iD = this.f17466d.d();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < iD; i11++) {
            float fA = this.f17466d.a(i11);
            if (fA < 0.0f) {
                i iVarI = this.f17466d.i(i11);
                if ((zArr == null || !zArr[iVarI.f17496b]) && iVarI != iVar && (((i10 = iVarI.f17506x) == 3 || i10 == 4) && fA < f10)) {
                    f10 = fA;
                    iVar2 = iVarI;
                }
            }
        }
        return iVar2;
    }

    public final void g(i iVar) {
        i iVar2 = this.f17463a;
        if (iVar2 != null) {
            this.f17466d.h(iVar2, -1.0f);
            this.f17463a.f17497d = -1;
            this.f17463a = null;
        }
        float fB = this.f17466d.b(iVar, true) * (-1.0f);
        this.f17463a = iVar;
        if (fB == 1.0f) {
            return;
        }
        this.f17464b /= fB;
        this.f17466d.j(fB);
    }

    public final void h(d dVar, i iVar, boolean z9) {
        if (iVar == null || !iVar.f17500q) {
            return;
        }
        float fG = this.f17466d.g(iVar);
        this.f17464b = (iVar.f17499h * fG) + this.f17464b;
        this.f17466d.b(iVar, z9);
        if (z9) {
            iVar.d(this);
        }
        if (this.f17466d.d() == 0) {
            this.f17467e = true;
            dVar.f17470a = true;
        }
    }

    public void i(d dVar, c cVar, boolean z9) {
        float fC = this.f17466d.c(cVar, z9);
        this.f17464b = (cVar.f17464b * fC) + this.f17464b;
        if (z9) {
            cVar.f17463a.d(this);
        }
        if (this.f17463a == null || this.f17466d.d() != 0) {
            return;
        }
        this.f17467e = true;
        dVar.f17470a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            u.i r0 = r10.f17463a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            u.i r1 = r10.f17463a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = g1.a.y(r0, r1)
            float r1 = r10.f17464b
            r2 = 1
            r3 = 0
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = g1.a.s(r0)
            float r1 = r10.f17464b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            u.b r5 = r10.f17466d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9d
            u.b r6 = r10.f17466d
            u.i r6 = r6.i(r3)
            if (r6 != 0) goto L47
            goto L9a
        L47:
            u.b r7 = r10.f17466d
            float r7 = r7.a(r3)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L9a
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L67
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L77
            java.lang.String r1 = "- "
            java.lang.String r0 = g1.a.y(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L77
        L67:
            if (r8 <= 0) goto L70
            java.lang.String r1 = " + "
            java.lang.String r0 = g1.a.y(r0, r1)
            goto L77
        L70:
            java.lang.String r1 = " - "
            java.lang.String r0 = g1.a.y(r0, r1)
            goto L64
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L82
            java.lang.String r0 = g1.a.y(r0, r6)
            goto L99
        L82:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L99:
            r1 = 1
        L9a:
            int r3 = r3 + 1
            goto L3c
        L9d:
            if (r1 != 0) goto La5
            java.lang.String r1 = "0.0"
            java.lang.String r0 = g1.a.y(r0, r1)
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.toString():java.lang.String");
    }
}
