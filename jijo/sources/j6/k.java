package j6;

import java.math.BigInteger;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f14397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14398b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14399d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14400f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BigInteger f14401h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public BigInteger f14402q;

    public k(l5.f fVar, boolean z9) {
        this.f14399d = z9;
        this.f14397a = BigInteger.valueOf(l5.f.b(fVar.f15222b));
        this.f14398b = fVar.f15223c;
        this.f14400f = true;
    }

    public final boolean a(k kVar) {
        BigInteger bigIntegerD = d();
        BigInteger bigIntegerG = g();
        return (bigIntegerD.compareTo(kVar.d()) != 1) && (bigIntegerG.compareTo(kVar.g()) != -1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        int iCompareTo = d().compareTo(kVar.d());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i10 = this.f14398b;
        int i11 = kVar.f14398b;
        if (i10 > i11) {
            return -1;
        }
        return i11 == i10 ? 0 : 1;
    }

    public final BigInteger d() {
        if (this.f14401h == null) {
            this.f14401h = h(false);
        }
        return this.f14401h;
    }

    public final String e() {
        long jLongValue = this.f14397a.longValue();
        return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf((jLongValue >> 24) % 256), Long.valueOf((jLongValue >> 16) % 256), Long.valueOf((jLongValue >> 8) % 256), Long.valueOf(jLongValue % 256));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return super.equals(obj);
        }
        k kVar = (k) obj;
        return this.f14398b == kVar.f14398b && kVar.d().equals(d());
    }

    public final String f() {
        BigInteger bigIntegerShiftRight = this.f14397a;
        String str = null;
        boolean z9 = true;
        while (bigIntegerShiftRight.compareTo(BigInteger.ZERO) == 1) {
            long jLongValue = bigIntegerShiftRight.mod(BigInteger.valueOf(65536L)).longValue();
            if (str != null || jLongValue != 0) {
                if (str == null && !z9) {
                    str = ":";
                }
                str = z9 ? String.format(Locale.US, "%x", Long.valueOf(jLongValue), str) : String.format(Locale.US, "%x:%s", Long.valueOf(jLongValue), str);
            }
            bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(16);
            z9 = false;
        }
        return str == null ? "::" : str;
    }

    public final BigInteger g() {
        if (this.f14402q == null) {
            this.f14402q = h(true);
        }
        return this.f14402q;
    }

    public final BigInteger h(boolean z9) {
        boolean z10 = this.f14400f;
        int i10 = this.f14398b;
        int i11 = z10 ? 32 - i10 : 128 - i10;
        BigInteger bit = this.f14397a;
        for (int i12 = 0; i12 < i11; i12++) {
            bit = z9 ? bit.setBit(i12) : bit.clearBit(i12);
        }
        return bit;
    }

    public final k[] i() {
        BigInteger bigIntegerD = d();
        int i10 = this.f14398b;
        boolean z9 = this.f14399d;
        boolean z10 = this.f14400f;
        k kVar = new k(bigIntegerD, i10 + 1, z9, z10);
        return new k[]{kVar, new k(kVar.g().add(BigInteger.ONE), i10 + 1, z9, z10)};
    }

    public final String toString() {
        boolean z9 = this.f14400f;
        int i10 = this.f14398b;
        return z9 ? String.format(Locale.US, "%s/%d", e(), Integer.valueOf(i10)) : String.format(Locale.US, "%s/%d", f(), Integer.valueOf(i10));
    }

    public k(BigInteger bigInteger, int i10, boolean z9, boolean z10) {
        this.f14397a = bigInteger;
        this.f14398b = i10;
        this.f14399d = z9;
        this.f14400f = z10;
    }
}
