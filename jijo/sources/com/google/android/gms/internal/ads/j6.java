package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1[] f5808c;

    public j6(int i10, List list) {
        this.f5806a = i10;
        if (i10 != 1) {
            this.f5807b = list;
            this.f5808c = new b1[list.size()];
        } else {
            this.f5807b = list;
            this.f5808c = new b1[list.size()];
        }
    }

    public final void a(long j10, ik0 ik0Var) {
        int i10 = this.f5806a;
        b1[] b1VarArr = this.f5808c;
        switch (i10) {
            case 0:
                t3.i.F(j10, ik0Var, b1VarArr);
                break;
            default:
                if (ik0Var.n() >= 9) {
                    int iQ = ik0Var.q();
                    int iQ2 = ik0Var.q();
                    int iV = ik0Var.v();
                    if (iQ == 434 && iQ2 == 1195456820 && iV == 3) {
                        t3.i.L(j10, ik0Var, b1VarArr);
                        break;
                    }
                }
                break;
        }
    }

    public final void b(i0 i0Var, q2.d dVar) {
        int i10 = this.f5806a;
        List list = this.f5807b;
        b1[] b1VarArr = this.f5808c;
        switch (i10) {
            case 0:
                for (int i11 = 0; i11 < b1VarArr.length; i11++) {
                    dVar.c();
                    dVar.d();
                    b1 b1VarJ = i0Var.j(dVar.f16414c, 3);
                    y1 y1Var = (y1) list.get(i11);
                    String str = y1Var.f10714m;
                    tc1.Q("Invalid closed caption MIME type provided: ".concat(String.valueOf(str)), "application/cea-608".equals(str) || "application/cea-708".equals(str));
                    String str2 = y1Var.f10702a;
                    if (str2 == null) {
                        dVar.d();
                        str2 = dVar.f16416e;
                    }
                    q0 q0Var = new q0();
                    q0Var.f8041a = str2;
                    q0Var.f(str);
                    q0Var.f8045e = y1Var.f10706e;
                    q0Var.f8044d = y1Var.f10705d;
                    q0Var.D = y1Var.E;
                    q0Var.f8054n = y1Var.f10716o;
                    b1VarJ.c(new y1(q0Var));
                    b1VarArr[i11] = b1VarJ;
                }
                break;
            default:
                for (int i12 = 0; i12 < b1VarArr.length; i12++) {
                    dVar.c();
                    dVar.d();
                    b1 b1VarJ2 = i0Var.j(dVar.f16414c, 3);
                    y1 y1Var2 = (y1) list.get(i12);
                    String str3 = y1Var2.f10714m;
                    tc1.Q("Invalid closed caption MIME type provided: ".concat(String.valueOf(str3)), "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                    q0 q0Var2 = new q0();
                    dVar.d();
                    q0Var2.f8041a = dVar.f16416e;
                    q0Var2.f(str3);
                    q0Var2.f8045e = y1Var2.f10706e;
                    q0Var2.f8044d = y1Var2.f10705d;
                    q0Var2.D = y1Var2.E;
                    q0Var2.f8054n = y1Var2.f10716o;
                    b1VarJ2.c(new y1(q0Var2));
                    b1VarArr[i12] = b1VarJ2;
                }
                break;
        }
    }
}
