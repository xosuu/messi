package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class iq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5678d;

    public iq1() {
        this.f5678d = 0;
        this.f5677c = new fq1[100];
    }

    public void a(int i10) {
        Object obj = this.f5677c;
        int i11 = this.f5676b;
        ((int[]) obj)[i11] = i10;
        int i12 = this.f5678d & (i11 + 1);
        this.f5676b = i12;
        int i13 = this.f5675a;
        if (i12 == i13) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i15];
            System.arraycopy(iArr, i13, iArr2, 0, i14);
            System.arraycopy((int[]) this.f5677c, 0, iArr2, i14, this.f5675a);
            this.f5677c = iArr2;
            this.f5675a = 0;
            this.f5676b = length;
            this.f5678d = i15 - 1;
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f5678d;
        int i13 = i12 * 2;
        Object obj = this.f5677c;
        if (((int[]) obj) == null) {
            int[] iArr = new int[4];
            this.f5677c = iArr;
            Arrays.fill(iArr, -1);
        } else if (i13 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int[] iArr3 = new int[i12 * 4];
            this.f5677c = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        }
        Object obj2 = this.f5677c;
        ((int[]) obj2)[i13] = i10;
        ((int[]) obj2)[i13 + 1] = i11;
        this.f5678d++;
    }

    public void c(RecyclerView recyclerView, boolean z9) {
        this.f5678d = 0;
        int[] iArr = (int[]) this.f5677c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        m1.p0 p0Var = recyclerView.f1074x;
        if (recyclerView.f1072w == null || p0Var == null || !p0Var.f15593i) {
            return;
        }
        if (z9) {
            if (!recyclerView.f1048f.g()) {
                p0Var.i(recyclerView.f1072w.a(), this);
            }
        } else if (!recyclerView.K()) {
            p0Var.h(this.f5675a, this.f5676b, recyclerView.f1059o0, this);
        }
        int i10 = this.f5678d;
        if (i10 > p0Var.f15594j) {
            p0Var.f15594j = i10;
            p0Var.f15595k = z9;
            recyclerView.f1042b.k();
        }
    }

    public boolean d(int i10) {
        if (((int[]) this.f5677c) != null) {
            int i11 = this.f5678d * 2;
            for (int i12 = 0; i12 < i11; i12 += 2) {
                if (((int[]) this.f5677c)[i12] == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public long e() {
        int i10 = this.f5676b;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f5677c;
        int i11 = this.f5675a;
        long j10 = jArr[i11];
        this.f5675a = this.f5678d & (i11 + 1);
        this.f5676b = i10 - 1;
        return j10;
    }

    public synchronized void f(int i10) {
        int i11 = this.f5675a;
        this.f5675a = i10;
        if (i10 < i11) {
            g();
        }
    }

    public synchronized void g() {
        int i10 = this.f5675a;
        int i11 = yn0.f10944a;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.f5676b);
        int i12 = this.f5678d;
        if (iMax >= i12) {
            return;
        }
        Arrays.fill((fq1[]) this.f5677c, iMax, i12, (Object) null);
        this.f5678d = iMax;
    }

    public /* synthetic */ iq1(int i10) {
        if (i10 != 1) {
            int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
            this.f5678d = iHighestOneBit - 1;
            this.f5677c = new int[iHighestOneBit];
        }
    }
}
