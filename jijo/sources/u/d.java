package u;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.ur0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f17468p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f17469q = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f17472c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c[] f17475f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j2.h f17481l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f17484o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17470a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17471b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17473d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17474e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17476g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f17477h = new boolean[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17478i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17479j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17480k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i[] f17482m = new i[f17469q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17483n = 0;

    public d() {
        this.f17475f = null;
        this.f17475f = new c[32];
        s();
        j2.h hVar = new j2.h(2);
        this.f17481l = hVar;
        g gVar = new g(hVar);
        gVar.f17490f = new i[NotificationCompat.FLAG_HIGH_PRIORITY];
        gVar.f17491g = new i[NotificationCompat.FLAG_HIGH_PRIORITY];
        gVar.f17492h = 0;
        gVar.f17493i = new ur0(gVar, gVar);
        this.f17472c = gVar;
        this.f17484o = new c(hVar);
    }

    public static int n(w.c cVar) {
        i iVar = cVar.f17981i;
        if (iVar != null) {
            return (int) (iVar.f17499h + 0.5f);
        }
        return 0;
    }

    public final i a(int i10) {
        i iVar = (i) ((e) this.f17481l.f14299d).a();
        if (iVar == null) {
            iVar = new i(i10);
            iVar.f17506x = i10;
        } else {
            iVar.e();
            iVar.f17506x = i10;
        }
        int i11 = this.f17483n;
        int i12 = f17469q;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f17469q = i13;
            this.f17482m = (i[]) Arrays.copyOf(this.f17482m, i13);
        }
        i[] iVarArr = this.f17482m;
        int i14 = this.f17483n;
        this.f17483n = i14 + 1;
        iVarArr[i14] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        c cVarL = l();
        if (iVar2 == iVar3) {
            cVarL.f17466d.h(iVar, 1.0f);
            cVarL.f17466d.h(iVar4, 1.0f);
            cVarL.f17466d.h(iVar2, -2.0f);
        } else if (f10 == 0.5f) {
            cVarL.f17466d.h(iVar, 1.0f);
            cVarL.f17466d.h(iVar2, -1.0f);
            cVarL.f17466d.h(iVar3, -1.0f);
            cVarL.f17466d.h(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                cVarL.f17464b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            cVarL.f17466d.h(iVar, -1.0f);
            cVarL.f17466d.h(iVar2, 1.0f);
            cVarL.f17464b = i10;
        } else if (f10 >= 1.0f) {
            cVarL.f17466d.h(iVar4, -1.0f);
            cVarL.f17466d.h(iVar3, 1.0f);
            cVarL.f17464b = -i11;
        } else {
            float f11 = 1.0f - f10;
            cVarL.f17466d.h(iVar, f11 * 1.0f);
            cVarL.f17466d.h(iVar2, f11 * (-1.0f));
            cVarL.f17466d.h(iVar3, (-1.0f) * f10);
            cVarL.f17466d.h(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                cVarL.f17464b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            cVarL.a(this, i12);
        }
        c(cVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(u.c r17) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.c(u.c):void");
    }

    public final void d(i iVar, int i10) {
        int i11 = iVar.f17497d;
        if (i11 == -1) {
            iVar.f(this, i10);
            for (int i12 = 0; i12 < this.f17471b + 1; i12++) {
                i iVar2 = ((i[]) this.f17481l.f14300f)[i12];
            }
            return;
        }
        if (i11 == -1) {
            c cVarL = l();
            cVarL.f17463a = iVar;
            float f10 = i10;
            iVar.f17499h = f10;
            cVarL.f17464b = f10;
            cVarL.f17467e = true;
            c(cVarL);
            return;
        }
        c cVar = this.f17475f[i11];
        if (cVar.f17467e) {
            cVar.f17464b = i10;
            return;
        }
        if (cVar.f17466d.d() == 0) {
            cVar.f17467e = true;
            cVar.f17464b = i10;
            return;
        }
        c cVarL2 = l();
        if (i10 < 0) {
            cVarL2.f17464b = i10 * (-1);
            cVarL2.f17466d.h(iVar, 1.0f);
        } else {
            cVarL2.f17464b = i10;
            cVarL2.f17466d.h(iVar, -1.0f);
        }
        c(cVarL2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(u.i r6, u.i r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L15
            boolean r1 = r7.f17500q
            if (r1 == 0) goto L15
            int r1 = r6.f17497d
            r2 = -1
            if (r1 != r2) goto L15
            float r7 = r7.f17499h
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.f(r5, r7)
            return
        L15:
            u.c r1 = r5.l()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L37
            if (r8 >= 0) goto L25
            int r8 = r8 * (-1)
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            float r8 = (float) r8
            r1.f17464b = r8
            if (r4 != 0) goto L2c
            goto L37
        L2c:
            u.b r8 = r1.f17466d
            r8.h(r6, r2)
            u.b r6 = r1.f17466d
            r6.h(r7, r3)
            goto L41
        L37:
            u.b r8 = r1.f17466d
            r8.h(r6, r3)
            u.b r6 = r1.f17466d
            r6.h(r7, r2)
        L41:
            if (r9 == r0) goto L46
            r1.a(r5, r9)
        L46:
            r5.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.e(u.i, u.i, int, int):void");
    }

    public final void f(i iVar, i iVar2, int i10, int i11) {
        c cVarL = l();
        i iVarM = m();
        iVarM.f17498f = 0;
        cVarL.b(iVar, iVar2, iVarM, i10);
        if (i11 != 8) {
            cVarL.f17466d.h(j(i11), (int) (cVarL.f17466d.g(iVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void g(i iVar, i iVar2, int i10, int i11) {
        c cVarL = l();
        i iVarM = m();
        iVarM.f17498f = 0;
        cVarL.c(iVar, iVar2, iVarM, i10);
        if (i11 != 8) {
            cVarL.f17466d.h(j(i11), (int) (cVarL.f17466d.g(iVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void h(c cVar) {
        int i10;
        if (cVar.f17467e) {
            cVar.f17463a.f(this, cVar.f17464b);
        } else {
            c[] cVarArr = this.f17475f;
            int i11 = this.f17479j;
            cVarArr[i11] = cVar;
            i iVar = cVar.f17463a;
            iVar.f17497d = i11;
            this.f17479j = i11 + 1;
            iVar.g(this, cVar);
        }
        if (this.f17470a) {
            int i12 = 0;
            while (i12 < this.f17479j) {
                if (this.f17475f[i12] == null) {
                    System.out.getClass();
                }
                c cVar2 = this.f17475f[i12];
                if (cVar2 != null && cVar2.f17467e) {
                    cVar2.f17463a.f(this, cVar2.f17464b);
                    ((e) this.f17481l.f14298b).b(cVar2);
                    this.f17475f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f17479j;
                        if (i13 >= i10) {
                            break;
                        }
                        c[] cVarArr2 = this.f17475f;
                        int i15 = i13 - 1;
                        c cVar3 = cVarArr2[i13];
                        cVarArr2[i15] = cVar3;
                        i iVar2 = cVar3.f17463a;
                        if (iVar2.f17497d == i13) {
                            iVar2.f17497d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f17475f[i14] = null;
                    }
                    this.f17479j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f17470a = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f17479j; i10++) {
            c cVar = this.f17475f[i10];
            cVar.f17463a.f17499h = cVar.f17464b;
        }
    }

    public final i j(int i10) {
        if (this.f17478i + 1 >= this.f17474e) {
            o();
        }
        i iVarA = a(4);
        int i11 = this.f17471b + 1;
        this.f17471b = i11;
        this.f17478i++;
        iVarA.f17496b = i11;
        iVarA.f17498f = i10;
        ((i[]) this.f17481l.f14300f)[i11] = iVarA;
        g gVar = this.f17472c;
        gVar.f17493i.f9600b = iVarA;
        float[] fArr = iVarA.f17502t;
        Arrays.fill(fArr, 0.0f);
        fArr[iVarA.f17498f] = 1.0f;
        gVar.j(iVarA);
        return iVarA;
    }

    public final i k(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f17478i + 1 >= this.f17474e) {
            o();
        }
        if (obj instanceof w.c) {
            w.c cVar = (w.c) obj;
            iVar = cVar.f17981i;
            if (iVar == null) {
                cVar.k();
                iVar = cVar.f17981i;
            }
            int i10 = iVar.f17496b;
            j2.h hVar = this.f17481l;
            if (i10 == -1 || i10 > this.f17471b || ((i[]) hVar.f14300f)[i10] == null) {
                if (i10 != -1) {
                    iVar.e();
                }
                int i11 = this.f17471b + 1;
                this.f17471b = i11;
                this.f17478i++;
                iVar.f17496b = i11;
                iVar.f17506x = 1;
                ((i[]) hVar.f14300f)[i11] = iVar;
            }
        }
        return iVar;
    }

    public final c l() {
        j2.h hVar = this.f17481l;
        c cVar = (c) ((e) hVar.f14298b).a();
        if (cVar == null) {
            return new c(hVar);
        }
        cVar.f17463a = null;
        cVar.f17466d.clear();
        cVar.f17464b = 0.0f;
        cVar.f17467e = false;
        return cVar;
    }

    public final i m() {
        if (this.f17478i + 1 >= this.f17474e) {
            o();
        }
        i iVarA = a(3);
        int i10 = this.f17471b + 1;
        this.f17471b = i10;
        this.f17478i++;
        iVarA.f17496b = i10;
        ((i[]) this.f17481l.f14300f)[i10] = iVarA;
        return iVarA;
    }

    public final void o() {
        int i10 = this.f17473d * 2;
        this.f17473d = i10;
        this.f17475f = (c[]) Arrays.copyOf(this.f17475f, i10);
        j2.h hVar = this.f17481l;
        hVar.f14300f = (i[]) Arrays.copyOf((i[]) hVar.f14300f, this.f17473d);
        int i11 = this.f17473d;
        this.f17477h = new boolean[i11];
        this.f17474e = i11;
        this.f17480k = i11;
    }

    public final void p() {
        g gVar = this.f17472c;
        if (gVar.e()) {
            i();
            return;
        }
        if (!this.f17476g) {
            q(gVar);
            return;
        }
        for (int i10 = 0; i10 < this.f17479j; i10++) {
            if (!this.f17475f[i10].f17467e) {
                q(gVar);
                return;
            }
        }
        i();
    }

    public final void q(g gVar) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.f17479j) {
                break;
            }
            c cVar = this.f17475f[i10];
            int i11 = 1;
            if (cVar.f17463a.f17506x != 1) {
                float f10 = 0.0f;
                if (cVar.f17464b < 0.0f) {
                    boolean z9 = false;
                    int i12 = 0;
                    while (!z9) {
                        i12 += i11;
                        float f11 = Float.MAX_VALUE;
                        int i13 = 0;
                        int i14 = -1;
                        int i15 = -1;
                        int i16 = 0;
                        while (i13 < this.f17479j) {
                            c cVar2 = this.f17475f[i13];
                            if (cVar2.f17463a.f17506x != i11 && !cVar2.f17467e && cVar2.f17464b < f10) {
                                int iD = cVar2.f17466d.d();
                                int i17 = 0;
                                while (i17 < iD) {
                                    i iVarI = cVar2.f17466d.i(i17);
                                    float fG = cVar2.f17466d.g(iVarI);
                                    if (fG > f10) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f12 = iVarI.f17501s[i18] / fG;
                                            if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i15 = iVarI.f17496b;
                                                i14 = i13;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i17++;
                                    f10 = 0.0f;
                                }
                            }
                            i13++;
                            f10 = 0.0f;
                            i11 = 1;
                        }
                        if (i14 != -1) {
                            c cVar3 = this.f17475f[i14];
                            cVar3.f17463a.f17497d = -1;
                            cVar3.g(((i[]) this.f17481l.f14300f)[i15]);
                            i iVar = cVar3.f17463a;
                            iVar.f17497d = i14;
                            iVar.g(this, cVar3);
                        } else {
                            z9 = true;
                        }
                        if (i12 > this.f17478i / 2) {
                            z9 = true;
                        }
                        f10 = 0.0f;
                        i11 = 1;
                    }
                }
            }
            i10++;
        }
        r(gVar);
        i();
    }

    public final void r(c cVar) {
        for (int i10 = 0; i10 < this.f17478i; i10++) {
            this.f17477h[i10] = false;
        }
        boolean z9 = false;
        int i11 = 0;
        while (!z9) {
            i11++;
            if (i11 >= this.f17478i * 2) {
                return;
            }
            i iVar = cVar.f17463a;
            if (iVar != null) {
                this.f17477h[iVar.f17496b] = true;
            }
            i iVarD = cVar.d(this.f17477h);
            if (iVarD != null) {
                boolean[] zArr = this.f17477h;
                int i12 = iVarD.f17496b;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (iVarD != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f17479j; i14++) {
                    c cVar2 = this.f17475f[i14];
                    if (cVar2.f17463a.f17506x != 1 && !cVar2.f17467e && cVar2.f17466d.e(iVarD)) {
                        float fG = cVar2.f17466d.g(iVarD);
                        if (fG < 0.0f) {
                            float f11 = (-cVar2.f17464b) / fG;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    c cVar3 = this.f17475f[i13];
                    cVar3.f17463a.f17497d = -1;
                    cVar3.g(iVarD);
                    i iVar2 = cVar3.f17463a;
                    iVar2.f17497d = i13;
                    iVar2.g(this, cVar3);
                }
            } else {
                z9 = true;
            }
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f17479j; i10++) {
            c cVar = this.f17475f[i10];
            if (cVar != null) {
                ((e) this.f17481l.f14298b).b(cVar);
            }
            this.f17475f[i10] = null;
        }
    }

    public final void t() {
        j2.h hVar;
        int i10 = 0;
        while (true) {
            hVar = this.f17481l;
            i[] iVarArr = (i[]) hVar.f14300f;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.e();
            }
            i10++;
        }
        e eVar = (e) hVar.f14299d;
        i[] iVarArr2 = this.f17482m;
        int length = this.f17483n;
        eVar.getClass();
        if (length > iVarArr2.length) {
            length = iVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            i iVar2 = iVarArr2[i11];
            int i12 = eVar.f17487c;
            Object[] objArr = eVar.f17486b;
            if (i12 < objArr.length) {
                objArr[i12] = iVar2;
                eVar.f17487c = i12 + 1;
            }
        }
        this.f17483n = 0;
        Arrays.fill((i[]) hVar.f14300f, (Object) null);
        this.f17471b = 0;
        g gVar = this.f17472c;
        gVar.f17492h = 0;
        gVar.f17464b = 0.0f;
        this.f17478i = 1;
        for (int i13 = 0; i13 < this.f17479j; i13++) {
            c cVar = this.f17475f[i13];
        }
        s();
        this.f17479j = 0;
        this.f17484o = new c(hVar);
    }
}
