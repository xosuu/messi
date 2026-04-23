package u;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f17454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2.h f17455c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17453a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17456d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f17457e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f17458f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f17459g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17460h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17461i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17462j = false;

    public a(c cVar, j2.h hVar) {
        this.f17454b = cVar;
        this.f17455c = hVar;
    }

    @Override // u.b
    public final float a(int i10) {
        int i11 = this.f17460h;
        for (int i12 = 0; i11 != -1 && i12 < this.f17453a; i12++) {
            if (i12 == i10) {
                return this.f17459g[i11];
            }
            i11 = this.f17458f[i11];
        }
        return 0.0f;
    }

    @Override // u.b
    public final float b(i iVar, boolean z9) {
        int i10 = this.f17460h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f17453a) {
            if (this.f17457e[i10] == iVar.f17496b) {
                if (i10 == this.f17460h) {
                    this.f17460h = this.f17458f[i10];
                } else {
                    int[] iArr = this.f17458f;
                    iArr[i12] = iArr[i10];
                }
                if (z9) {
                    iVar.d(this.f17454b);
                }
                iVar.f17505w--;
                this.f17453a--;
                this.f17457e[i10] = -1;
                if (this.f17462j) {
                    this.f17461i = i10;
                }
                return this.f17459g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f17458f[i10];
        }
        return 0.0f;
    }

    @Override // u.b
    public final float c(c cVar, boolean z9) {
        float fG = g(cVar.f17463a);
        b(cVar.f17463a, z9);
        b bVar = cVar.f17466d;
        int iD = bVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i iVarI = bVar.i(i10);
            f(iVarI, bVar.g(iVarI) * fG, z9);
        }
        return fG;
    }

    @Override // u.b
    public final void clear() {
        int i10 = this.f17460h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17453a; i11++) {
            i iVar = ((i[]) this.f17455c.f14300f)[this.f17457e[i10]];
            if (iVar != null) {
                iVar.d(this.f17454b);
            }
            i10 = this.f17458f[i10];
        }
        this.f17460h = -1;
        this.f17461i = -1;
        this.f17462j = false;
        this.f17453a = 0;
    }

    @Override // u.b
    public final int d() {
        return this.f17453a;
    }

    @Override // u.b
    public final boolean e(i iVar) {
        int i10 = this.f17460h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f17453a; i11++) {
            if (this.f17457e[i10] == iVar.f17496b) {
                return true;
            }
            i10 = this.f17458f[i10];
        }
        return false;
    }

    @Override // u.b
    public final void f(i iVar, float f10, boolean z9) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f17460h;
            c cVar = this.f17454b;
            if (i10 == -1) {
                this.f17460h = 0;
                this.f17459g[0] = f10;
                this.f17457e[0] = iVar.f17496b;
                this.f17458f[0] = -1;
                iVar.f17505w++;
                iVar.a(cVar);
                this.f17453a++;
                if (this.f17462j) {
                    return;
                }
                int i11 = this.f17461i + 1;
                this.f17461i = i11;
                int[] iArr = this.f17457e;
                if (i11 >= iArr.length) {
                    this.f17462j = true;
                    this.f17461i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f17453a; i13++) {
                int i14 = this.f17457e[i10];
                int i15 = iVar.f17496b;
                if (i14 == i15) {
                    float[] fArr = this.f17459g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f17460h) {
                            this.f17460h = this.f17458f[i10];
                        } else {
                            int[] iArr2 = this.f17458f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z9) {
                            iVar.d(cVar);
                        }
                        if (this.f17462j) {
                            this.f17461i = i10;
                        }
                        iVar.f17505w--;
                        this.f17453a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f17458f[i10];
            }
            int length = this.f17461i;
            int i16 = length + 1;
            if (this.f17462j) {
                int[] iArr3 = this.f17457e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f17457e;
            if (length >= iArr4.length && this.f17453a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f17457e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f17457e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f17456d * 2;
                this.f17456d = i18;
                this.f17462j = false;
                this.f17461i = length - 1;
                this.f17459g = Arrays.copyOf(this.f17459g, i18);
                this.f17457e = Arrays.copyOf(this.f17457e, this.f17456d);
                this.f17458f = Arrays.copyOf(this.f17458f, this.f17456d);
            }
            this.f17457e[length] = iVar.f17496b;
            this.f17459g[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f17458f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f17458f[length] = this.f17460h;
                this.f17460h = length;
            }
            iVar.f17505w++;
            iVar.a(cVar);
            this.f17453a++;
            if (!this.f17462j) {
                this.f17461i++;
            }
            int i19 = this.f17461i;
            int[] iArr8 = this.f17457e;
            if (i19 >= iArr8.length) {
                this.f17462j = true;
                this.f17461i = iArr8.length - 1;
            }
        }
    }

    @Override // u.b
    public final float g(i iVar) {
        int i10 = this.f17460h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17453a; i11++) {
            if (this.f17457e[i10] == iVar.f17496b) {
                return this.f17459g[i10];
            }
            i10 = this.f17458f[i10];
        }
        return 0.0f;
    }

    @Override // u.b
    public final void h(i iVar, float f10) {
        if (f10 == 0.0f) {
            b(iVar, true);
            return;
        }
        int i10 = this.f17460h;
        c cVar = this.f17454b;
        if (i10 == -1) {
            this.f17460h = 0;
            this.f17459g[0] = f10;
            this.f17457e[0] = iVar.f17496b;
            this.f17458f[0] = -1;
            iVar.f17505w++;
            iVar.a(cVar);
            this.f17453a++;
            if (this.f17462j) {
                return;
            }
            int i11 = this.f17461i + 1;
            this.f17461i = i11;
            int[] iArr = this.f17457e;
            if (i11 >= iArr.length) {
                this.f17462j = true;
                this.f17461i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f17453a; i13++) {
            int i14 = this.f17457e[i10];
            int i15 = iVar.f17496b;
            if (i14 == i15) {
                this.f17459g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f17458f[i10];
        }
        int length = this.f17461i;
        int i16 = length + 1;
        if (this.f17462j) {
            int[] iArr2 = this.f17457e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f17457e;
        if (length >= iArr3.length && this.f17453a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f17457e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f17457e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f17456d * 2;
            this.f17456d = i18;
            this.f17462j = false;
            this.f17461i = length - 1;
            this.f17459g = Arrays.copyOf(this.f17459g, i18);
            this.f17457e = Arrays.copyOf(this.f17457e, this.f17456d);
            this.f17458f = Arrays.copyOf(this.f17458f, this.f17456d);
        }
        this.f17457e[length] = iVar.f17496b;
        this.f17459g[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f17458f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f17458f[length] = this.f17460h;
            this.f17460h = length;
        }
        iVar.f17505w++;
        iVar.a(cVar);
        int i19 = this.f17453a + 1;
        this.f17453a = i19;
        if (!this.f17462j) {
            this.f17461i++;
        }
        int[] iArr7 = this.f17457e;
        if (i19 >= iArr7.length) {
            this.f17462j = true;
        }
        if (this.f17461i >= iArr7.length) {
            this.f17462j = true;
            this.f17461i = iArr7.length - 1;
        }
    }

    @Override // u.b
    public final i i(int i10) {
        int i11 = this.f17460h;
        for (int i12 = 0; i11 != -1 && i12 < this.f17453a; i12++) {
            if (i12 == i10) {
                return ((i[]) this.f17455c.f14300f)[this.f17457e[i11]];
            }
            i11 = this.f17458f[i11];
        }
        return null;
    }

    @Override // u.b
    public final void j(float f10) {
        int i10 = this.f17460h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17453a; i11++) {
            float[] fArr = this.f17459g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f17458f[i10];
        }
    }

    @Override // u.b
    public final void k() {
        int i10 = this.f17460h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17453a; i11++) {
            float[] fArr = this.f17459g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f17458f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f17460h;
        String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        for (int i11 = 0; i10 != -1 && i11 < this.f17453a; i11++) {
            StringBuilder sbS = g1.a.s(g1.a.y(string, " -> "));
            sbS.append(this.f17459g[i10]);
            sbS.append(" : ");
            StringBuilder sbS2 = g1.a.s(sbS.toString());
            sbS2.append(((i[]) this.f17455c.f14300f)[this.f17457e[i10]]);
            string = sbS2.toString();
            i10 = this.f17458f[i10];
        }
        return string;
    }
}
