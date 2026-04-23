package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n1 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f7097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f7098c;

    public n1(int i10) {
        this.f7096a = i10;
        if (i10 == 1) {
            this.f7097b = new ik0(4);
            this.f7098c = new x0(-1, -1, "image/heif");
        } else if (i10 != 2) {
            this.f7097b = new ik0(4);
            this.f7098c = new x0(-1, -1, "image/avif");
        } else {
            this.f7097b = new ik0(4);
            this.f7098c = new x0(-1, -1, "image/webp");
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        int i10 = this.f7096a;
        x0 x0Var = this.f7098c;
        switch (i10) {
            case 0:
                x0Var.c(j10, j11);
                break;
            case 1:
                x0Var.c(j10, j11);
                break;
            default:
                x0Var.c(j10, j11);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final int d(h0 h0Var, k0 k0Var) {
        int i10 = this.f7096a;
        x0 x0Var = this.f7098c;
        switch (i10) {
        }
        return x0Var.d(h0Var, k0Var);
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        int i10 = this.f7096a;
        x0 x0Var = this.f7098c;
        switch (i10) {
            case 0:
                x0Var.e(i0Var);
                break;
            case 1:
                x0Var.e(i0Var);
                break;
            default:
                x0Var.e(i0Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        ik0 ik0Var = this.f7097b;
        switch (this.f7096a) {
            case 0:
                a0 a0Var = (a0) h0Var;
                a0Var.i(4, false);
                ik0Var.f(4);
                a0Var.m(ik0Var.f5633a, 0, 4, false);
                if (ik0Var.D() == 1718909296) {
                    ik0Var.f(4);
                    a0Var.m(ik0Var.f5633a, 0, 4, false);
                    if (ik0Var.D() == 1635150182) {
                    }
                }
                break;
            case 1:
                a0 a0Var2 = (a0) h0Var;
                a0Var2.i(4, false);
                ik0Var.f(4);
                a0Var2.m(ik0Var.f5633a, 0, 4, false);
                if (ik0Var.D() == 1718909296) {
                    ik0Var.f(4);
                    a0Var2.m(ik0Var.f5633a, 0, 4, false);
                    if (ik0Var.D() == 1751476579) {
                    }
                }
                break;
            default:
                ik0Var.f(4);
                a0 a0Var3 = (a0) h0Var;
                a0Var3.m(ik0Var.f5633a, 0, 4, false);
                if (ik0Var.D() == 1380533830) {
                    a0Var3.i(4, false);
                    ik0Var.f(4);
                    a0Var3.m(ik0Var.f5633a, 0, 4, false);
                    if (ik0Var.D() == 1464156752) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final /* synthetic */ g0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final List zzd() {
        switch (this.f7096a) {
            case 0:
                zy0 zy0Var = bz0.f3132b;
                break;
            case 1:
                zy0 zy0Var2 = bz0.f3132b;
                break;
            default:
                zy0 zy0Var3 = bz0.f3132b;
                break;
        }
        return wz0.f10382h;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void zzf() {
    }
}
