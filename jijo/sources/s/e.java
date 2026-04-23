package s;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f16598h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16599a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f16600b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f16601d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16602f;

    public e() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 80;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (80 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f16600b = new long[i13];
        this.f16601d = new Object[i13];
    }

    public final void a(long j10, Long l9) {
        int i10 = this.f16602f;
        if (i10 != 0 && j10 <= this.f16600b[i10 - 1]) {
            f(j10, l9);
            return;
        }
        if (this.f16599a && i10 >= this.f16600b.length) {
            d();
        }
        int i11 = this.f16602f;
        if (i11 >= this.f16600b.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr = new Object[i15];
            long[] jArr2 = this.f16600b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f16601d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f16600b = jArr;
            this.f16601d = objArr;
        }
        this.f16600b[i11] = j10;
        this.f16601d[i11] = l9;
        this.f16602f = i11 + 1;
    }

    public final void b() {
        int i10 = this.f16602f;
        Object[] objArr = this.f16601d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f16602f = 0;
        this.f16599a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final e clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f16600b = (long[]) this.f16600b.clone();
            eVar.f16601d = (Object[]) this.f16601d.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i10 = this.f16602f;
        long[] jArr = this.f16600b;
        Object[] objArr = this.f16601d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f16598h) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f16599a = false;
        this.f16602f = i11;
    }

    public final Object e(long j10, Long l9) {
        Object obj;
        int iB = d.b(this.f16600b, this.f16602f, j10);
        return (iB < 0 || (obj = this.f16601d[iB]) == f16598h) ? l9 : obj;
    }

    public final void f(long j10, Object obj) {
        int iB = d.b(this.f16600b, this.f16602f, j10);
        if (iB >= 0) {
            this.f16601d[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f16602f;
        if (i10 < i11) {
            Object[] objArr = this.f16601d;
            if (objArr[i10] == f16598h) {
                this.f16600b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f16599a && i11 >= this.f16600b.length) {
            d();
            i10 = ~d.b(this.f16600b, this.f16602f, j10);
        }
        int i12 = this.f16602f;
        if (i12 >= this.f16600b.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f16600b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f16601d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16600b = jArr;
            this.f16601d = objArr2;
        }
        int i17 = this.f16602f - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f16600b;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f16601d;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f16602f - i10);
        }
        this.f16600b[i10] = j10;
        this.f16601d[i10] = obj;
        this.f16602f++;
    }

    public final int g() {
        if (this.f16599a) {
            d();
        }
        return this.f16602f;
    }

    public final Object h(int i10) {
        if (this.f16599a) {
            d();
        }
        return this.f16601d[i10];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16602f * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16602f; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            if (this.f16599a) {
                d();
            }
            sb.append(this.f16600b[i10]);
            sb.append('=');
            Object objH = h(i10);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
