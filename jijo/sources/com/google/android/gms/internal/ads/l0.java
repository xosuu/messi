package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6448c;

    public /* synthetic */ l0(Object obj, long j10, int i10) {
        this.f6446a = i10;
        this.f6448c = obj;
        this.f6447b = j10;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        int i10 = this.f6446a;
        Object obj = this.f6448c;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj;
                tc1.A(m0Var.f6794k);
                m20 m20Var = m0Var.f6794k;
                long[] jArr = (long[]) m20Var.f6809b;
                long[] jArr2 = (long[]) m20Var.f6810d;
                int iL = yn0.l(jArr, Math.max(0L, Math.min((((long) m0Var.f6788e) * j10) / 1000000, m0Var.f6793j - 1)), false);
                long j11 = iL == -1 ? 0L : jArr[iL];
                long j12 = iL != -1 ? jArr2[iL] : 0L;
                long j13 = (j11 * 1000000) / ((long) ((m0) obj).f6788e);
                long j14 = this.f6447b;
                w0 w0Var = new w0(j13, j12 + j14);
                if (j13 == j10 || iL == jArr.length - 1) {
                    return new u0(w0Var, w0Var);
                }
                int i11 = iL + 1;
                return new u0(w0Var, new w0((jArr[i11] * 1000000) / ((long) ((m0) obj).f6788e), j14 + jArr2[i11]));
            case 1:
                return (u0) obj;
            default:
                g1 g1Var = (g1) obj;
                u0 u0VarA = g1Var.f4752i[0].a(j10);
                int i12 = 1;
                while (true) {
                    j1[] j1VarArr = g1Var.f4752i;
                    if (i12 >= j1VarArr.length) {
                        return u0VarA;
                    }
                    u0 u0VarA2 = j1VarArr[i12].a(j10);
                    if (u0VarA2.f9329a.f10016b < u0VarA.f9329a.f10016b) {
                        u0VarA = u0VarA2;
                    }
                    i12++;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        switch (this.f6446a) {
            case 0:
                return ((m0) this.f6448c).a();
            default:
                return this.f6447b;
        }
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        switch (this.f6446a) {
            case 1:
                return false;
            default:
                return true;
        }
    }

    public l0(long j10, long j11) {
        this.f6446a = 1;
        this.f6447b = j10;
        w0 w0Var = j11 == 0 ? w0.f10014c : new w0(0L, j11);
        this.f6448c = new u0(w0Var, w0Var);
    }
}
