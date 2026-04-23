package p7;

import com.google.android.gms.internal.ads.go;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r extends h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient byte[][] f16304q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int[] f16305s;

    public r(e eVar, int i10) {
        super(null);
        w.a(eVar.f16276b, 0L, i10);
        go goVar = eVar.f16275a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = goVar.f5002b;
            int i15 = goVar.f5001a;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            goVar = (go) goVar.f5006f;
        }
        this.f16304q = new byte[i13][];
        this.f16305s = new int[i13 * 2];
        go goVar2 = eVar.f16275a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f16304q;
            bArr[i16] = (byte[]) goVar2.f5005e;
            int i17 = goVar2.f5002b;
            int i18 = goVar2.f5001a;
            int i19 = (i17 - i18) + i11;
            i11 = i19 > i10 ? i10 : i19;
            int[] iArr = this.f16305s;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            goVar2.f5003c = true;
            i16++;
            goVar2 = (go) goVar2.f5006f;
        }
    }

    @Override // p7.h
    public final String a() {
        throw null;
    }

    @Override // p7.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.size() == size() && l(hVar, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // p7.h
    public final byte h(int i10) {
        byte[][] bArr = this.f16304q;
        int length = bArr.length - 1;
        int[] iArr = this.f16305s;
        w.a(iArr[length], i10, 1L);
        int iQ = q(i10);
        return bArr[iQ][(i10 - (iQ == 0 ? 0 : iArr[iQ - 1])) + iArr[bArr.length + iQ]];
    }

    @Override // p7.h
    public final int hashCode() {
        int i10 = this.f16280b;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f16304q;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < length) {
            byte[] bArr2 = bArr[i11];
            int[] iArr = this.f16305s;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i12) + i14;
            while (i14 < i16) {
                i13 = (i13 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i12 = i15;
        }
        this.f16280b = i13;
        return i13;
    }

    @Override // p7.h
    public final String i() {
        return r().i();
    }

    @Override // p7.h
    public final boolean k(int i10, int i11, int i12, byte[] bArr) {
        if (i10 < 0 || i10 > size() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iQ = q(i10);
        while (i12 > 0) {
            int[] iArr = this.f16305s;
            int i13 = iQ == 0 ? 0 : iArr[iQ - 1];
            int iMin = Math.min(i12, ((iArr[iQ] - i13) + i13) - i10);
            byte[][] bArr2 = this.f16304q;
            int i14 = (i10 - i13) + iArr[bArr2.length + iQ];
            byte[] bArr3 = bArr2[iQ];
            Charset charset = w.f16310a;
            for (int i15 = 0; i15 < iMin; i15++) {
                if (bArr3[i15 + i14] != bArr[i15 + i11]) {
                    return false;
                }
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iQ++;
        }
        return true;
    }

    @Override // p7.h
    public final boolean l(h hVar, int i10) {
        if (size() - i10 < 0) {
            return false;
        }
        int iQ = q(0);
        int i11 = 0;
        int i12 = 0;
        while (i10 > 0) {
            int[] iArr = this.f16305s;
            int i13 = iQ == 0 ? 0 : iArr[iQ - 1];
            int iMin = Math.min(i10, ((iArr[iQ] - i13) + i13) - i11);
            byte[][] bArr = this.f16304q;
            if (!hVar.k(i12, (i11 - i13) + iArr[bArr.length + iQ], iMin, bArr[iQ])) {
                return false;
            }
            i11 += iMin;
            i12 += iMin;
            i10 -= iMin;
            iQ++;
        }
        return true;
    }

    @Override // p7.h
    public final h m() {
        return r().m();
    }

    @Override // p7.h
    public final h n() {
        return r().n();
    }

    @Override // p7.h
    public final String o() {
        return r().o();
    }

    @Override // p7.h
    public final void p(e eVar) {
        byte[][] bArr = this.f16304q;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f16305s;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            go goVar = new go(bArr[i10], i12, (i12 + i13) - i11);
            go goVar2 = eVar.f16275a;
            if (goVar2 == null) {
                goVar.f5007g = goVar;
                goVar.f5006f = goVar;
                eVar.f16275a = goVar;
            } else {
                ((go) goVar2.f5007g).b(goVar);
            }
            i10++;
            i11 = i13;
        }
        eVar.f16276b += (long) i11;
    }

    public final int q(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.f16305s, 0, this.f16304q.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    public final h r() {
        byte[][] bArr = this.f16304q;
        int length = bArr.length - 1;
        int[] iArr = this.f16305s;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length2) {
            int i12 = iArr[length2 + i10];
            int i13 = iArr[i10];
            System.arraycopy(bArr[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return new h(bArr2);
    }

    @Override // p7.h
    public final int size() {
        return this.f16305s[this.f16304q.length - 1];
    }

    @Override // p7.h
    public final String toString() {
        return r().toString();
    }
}
