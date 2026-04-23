package t2;

import com.androidnetworking.error.ANError;
import f7.b0;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.f f16827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16828b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q2.c f16829d;

    public e(q2.c cVar) {
        this.f16829d = cVar;
        this.f16828b = cVar.f16395d;
        this.f16827a = cVar.f16392a;
    }

    public final void a(q2.c cVar, ANError aNError) {
        r2.c.a().f16498a.f16502c.execute(new l0.a(this, cVar, aNError, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [f7.b0] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [f7.b0] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        b0 b0VarC;
        b0 b0VarD;
        this.f16829d.getClass();
        q2.c cVar = this.f16829d;
        int i10 = cVar.f16393b;
        ?? r22 = 0;
        b0 b0Var = null;
        ?? r23 = 0;
        b0 b0Var2 = null;
        try {
            if (i10 == 0) {
                try {
                    b0VarC = d.c(cVar);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    this.f16829d.getClass();
                } catch (Exception e11) {
                    e = e11;
                    b0Var2 = b0VarC;
                    a(this.f16829d, new ANError(e));
                    z3.a.o(b0Var2, this.f16829d);
                    r22 = b0Var2;
                } catch (Throwable th) {
                    th = th;
                    r22 = b0VarC;
                    z3.a.o(r22, this.f16829d);
                    throw th;
                }
                if (b0VarC.f13221d < 400) {
                    this.f16829d.getClass();
                    throw null;
                }
                q2.c cVar2 = this.f16829d;
                ANError aNError = new ANError(b0VarC);
                z.m(aNError, this.f16829d);
                a(cVar2, aNError);
                z3.a.o(b0VarC, this.f16829d);
                r22 = aNError;
            } else if (i10 != 1) {
                try {
                    if (i10 == 2) {
                        try {
                            b0VarD = d.d(cVar);
                        } catch (Exception e12) {
                            e = e12;
                        }
                        try {
                            this.f16829d.getClass();
                        } catch (Exception e13) {
                            e = e13;
                            b0Var = b0VarD;
                            a(this.f16829d, new ANError(e));
                            z3.a.o(b0Var, this.f16829d);
                            r23 = b0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            r23 = b0VarD;
                            z3.a.o(r23, this.f16829d);
                            throw th;
                        }
                        if (b0VarD.f13221d < 400) {
                            this.f16829d.getClass();
                            throw null;
                        }
                        q2.c cVar3 = this.f16829d;
                        ANError aNError2 = new ANError(b0VarD);
                        z.m(aNError2, this.f16829d);
                        a(cVar3, aNError2);
                        z3.a.o(b0VarD, this.f16829d);
                        r23 = aNError2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                try {
                    b0 b0VarB = d.b(cVar);
                    if (b0VarB.f13221d >= 400) {
                        ANError aNError3 = new ANError(b0VarB);
                        z.m(aNError3, cVar);
                        a(cVar, aNError3);
                    } else {
                        cVar.e();
                    }
                } catch (Exception e14) {
                    a(cVar, new ANError(e14));
                }
            }
            this.f16829d.getClass();
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
