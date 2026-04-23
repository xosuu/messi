package m1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15424a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15425b;

    public final void a(int i10) {
        if (i10 < 64) {
            this.f15424a &= ~(1 << i10);
            return;
        }
        c cVar = this.f15425b;
        if (cVar != null) {
            cVar.a(i10 - 64);
        }
    }

    public final int b(int i10) {
        c cVar = this.f15425b;
        if (cVar == null) {
            return i10 >= 64 ? Long.bitCount(this.f15424a) : Long.bitCount(this.f15424a & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f15424a & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f15424a) + cVar.b(i10 - 64);
    }

    public final void c() {
        if (this.f15425b == null) {
            this.f15425b = new c();
        }
    }

    public final boolean d(int i10) {
        if (i10 < 64) {
            return (this.f15424a & (1 << i10)) != 0;
        }
        c();
        return this.f15425b.d(i10 - 64);
    }

    public final void e(int i10, boolean z9) {
        if (i10 >= 64) {
            c();
            this.f15425b.e(i10 - 64, z9);
            return;
        }
        long j10 = this.f15424a;
        boolean z10 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.f15424a = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z9) {
            h(i10);
        } else {
            a(i10);
        }
        if (z10 || this.f15425b != null) {
            c();
            this.f15425b.e(0, z10);
        }
    }

    public final boolean f(int i10) {
        if (i10 >= 64) {
            c();
            return this.f15425b.f(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f15424a;
        boolean z9 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.f15424a = j12;
        long j13 = j10 - 1;
        this.f15424a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = this.f15425b;
        if (cVar != null) {
            if (cVar.d(0)) {
                h(63);
            }
            this.f15425b.f(0);
        }
        return z9;
    }

    public final void g() {
        this.f15424a = 0L;
        c cVar = this.f15425b;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h(int i10) {
        if (i10 < 64) {
            this.f15424a |= 1 << i10;
        } else {
            c();
            this.f15425b.h(i10 - 64);
        }
    }

    public final String toString() {
        if (this.f15425b == null) {
            return Long.toBinaryString(this.f15424a);
        }
        return this.f15425b.toString() + "xx" + Long.toBinaryString(this.f15424a);
    }
}
