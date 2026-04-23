package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yn1 implements ep1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wz0 f10957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10958b;

    public yn1(List list, List list2) {
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        tc1.K(list.size() == list2.size());
        int i11 = 0;
        while (i10 < list.size()) {
            xn1 xn1Var = new xn1((ep1) list.get(i10), (List) list2.get(i10));
            int i12 = i11 + 1;
            int length = objArrCopyOf.length;
            if (length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, vy0.d(length, i12));
            }
            objArrCopyOf[i11] = xn1Var;
            i10++;
            i11 = i12;
        }
        this.f10957a = bz0.j(i11, objArrCopyOf);
        this.f10958b = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final void b(long j10) {
        int i10 = 0;
        while (true) {
            wz0 wz0Var = this.f10957a;
            if (i10 >= wz0Var.size()) {
                return;
            }
            ((xn1) wz0Var.get(i10)).b(j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean g(fj1 fj1Var) {
        boolean zG;
        boolean z9 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zG = false;
            while (true) {
                wz0 wz0Var = this.f10957a;
                if (i10 >= wz0Var.size()) {
                    break;
                }
                long jZzc2 = ((xn1) wz0Var.get(i10)).zzc();
                boolean z10 = jZzc2 != Long.MIN_VALUE && jZzc2 <= fj1Var.f4538a;
                if (jZzc2 == jZzc || z10) {
                    zG |= ((xn1) wz0Var.get(i10)).g(fj1Var);
                }
                i10++;
            }
            z9 |= zG;
        } while (zG);
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzb() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            wz0 wz0Var = this.f10957a;
            if (i10 >= wz0Var.size()) {
                break;
            }
            xn1 xn1Var = (xn1) wz0Var.get(i10);
            long jZzb = xn1Var.zzb();
            if ((xn1Var.c().contains(1) || xn1Var.c().contains(2) || xn1Var.c().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f10958b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f10958b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzc() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            wz0 wz0Var = this.f10957a;
            if (i10 >= wz0Var.size()) {
                break;
            }
            long jZzc = ((xn1) wz0Var.get(i10)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean zzp() {
        int i10 = 0;
        while (true) {
            wz0 wz0Var = this.f10957a;
            if (i10 >= wz0Var.size()) {
                return false;
            }
            if (((xn1) wz0Var.get(i10)).zzp()) {
                return true;
            }
            i10++;
        }
    }
}
