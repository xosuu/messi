package s;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f16627f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f16628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16629b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16630d;

    public l() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f16628a = new int[i13];
        this.f16629b = new Object[i13];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f16630d;
        if (i11 != 0 && i10 <= this.f16628a[i11 - 1]) {
            d(i10, obj);
            return;
        }
        if (i11 >= this.f16628a.length) {
            int i12 = (i11 + 1) * 4;
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
            int i15 = i12 / 4;
            int[] iArr = new int[i15];
            Object[] objArr = new Object[i15];
            int[] iArr2 = this.f16628a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f16629b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f16628a = iArr;
            this.f16629b = objArr;
        }
        this.f16628a[i11] = i10;
        this.f16629b[i11] = obj;
        this.f16630d = i11 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f16628a = (int[]) this.f16628a.clone();
            lVar.f16629b = (Object[]) this.f16629b.clone();
            return lVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final Object c(int i10, Integer num) {
        Object obj;
        int iA = d.a(this.f16630d, i10, this.f16628a);
        return (iA < 0 || (obj = this.f16629b[iA]) == f16627f) ? num : obj;
    }

    public final void d(int i10, Object obj) {
        int iA = d.a(this.f16630d, i10, this.f16628a);
        if (iA >= 0) {
            this.f16629b[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f16630d;
        if (i11 < i12) {
            Object[] objArr = this.f16629b;
            if (objArr[i11] == f16627f) {
                this.f16628a[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f16628a.length) {
            int i13 = (i12 + 1) * 4;
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
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr2 = new Object[i16];
            int[] iArr2 = this.f16628a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f16629b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16628a = iArr;
            this.f16629b = objArr2;
        }
        int i17 = this.f16630d - i11;
        if (i17 != 0) {
            int[] iArr3 = this.f16628a;
            int i18 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i18, i17);
            Object[] objArr4 = this.f16629b;
            System.arraycopy(objArr4, i11, objArr4, i18, this.f16630d - i11);
        }
        this.f16628a[i11] = i10;
        this.f16629b[i11] = obj;
        this.f16630d++;
    }

    public final String toString() {
        int i10 = this.f16630d;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        for (int i11 = 0; i11 < this.f16630d; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(this.f16628a[i11]);
            sb.append('=');
            Object obj = this.f16629b[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
