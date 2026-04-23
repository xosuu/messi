package u;

import com.google.android.gms.internal.ads.ur0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i[] f17490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i[] f17491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ur0 f17493i;

    @Override // u.c
    public final i d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f17492h; i11++) {
            i[] iVarArr = this.f17490f;
            i iVar = iVarArr[i11];
            if (!zArr[iVar.f17496b]) {
                ur0 ur0Var = this.f17493i;
                ur0Var.f9600b = iVar;
                int i12 = 8;
                if (i10 == -1) {
                    while (i12 >= 0) {
                        float f10 = ((i) ur0Var.f9600b).f17502t[i12];
                        if (f10 <= 0.0f) {
                            if (f10 < 0.0f) {
                                i10 = i11;
                                break;
                            }
                            i12--;
                        }
                    }
                } else {
                    i iVar2 = iVarArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f11 = iVar2.f17502t[i12];
                            float f12 = ((i) ur0Var.f9600b).f17502t[i12];
                            if (f12 == f11) {
                                i12--;
                            } else if (f12 < f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f17490f[i10];
    }

    @Override // u.c
    public final boolean e() {
        return this.f17492h == 0;
    }

    @Override // u.c
    public final void i(d dVar, c cVar, boolean z9) {
        i iVar = cVar.f17463a;
        if (iVar == null) {
            return;
        }
        b bVar = cVar.f17466d;
        int iD = bVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i iVarI = bVar.i(i10);
            float fA = bVar.a(i10);
            ur0 ur0Var = this.f17493i;
            ur0Var.f9600b = iVarI;
            boolean z10 = iVarI.f17495a;
            float[] fArr = iVar.f17502t;
            if (z10) {
                boolean z11 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((i) ur0Var.f9600b).f17502t;
                    float f10 = (fArr[i11] * fA) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((i) ur0Var.f9600b).f17502t[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((g) ur0Var.f9602f).k((i) ur0Var.f9600b);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * fA;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((i) ur0Var.f9600b).f17502t[i12] = f12;
                    } else {
                        ((i) ur0Var.f9600b).f17502t[i12] = 0.0f;
                    }
                }
                j(iVarI);
            }
            this.f17464b = (cVar.f17464b * fA) + this.f17464b;
        }
        k(iVar);
    }

    public final void j(i iVar) {
        int i10;
        int i11 = this.f17492h + 1;
        i[] iVarArr = this.f17490f;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f17490f = iVarArr2;
            this.f17491g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f17490f;
        int i12 = this.f17492h;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f17492h = i13;
        if (i13 > 1 && iVarArr3[i12].f17496b > iVar.f17496b) {
            int i14 = 0;
            while (true) {
                i10 = this.f17492h;
                if (i14 >= i10) {
                    break;
                }
                this.f17491g[i14] = this.f17490f[i14];
                i14++;
            }
            Arrays.sort(this.f17491g, 0, i10, new f(0, this));
            for (int i15 = 0; i15 < this.f17492h; i15++) {
                this.f17490f[i15] = this.f17491g[i15];
            }
        }
        iVar.f17495a = true;
        iVar.a(this);
    }

    public final void k(i iVar) {
        int i10 = 0;
        while (i10 < this.f17492h) {
            if (this.f17490f[i10] == iVar) {
                while (true) {
                    int i11 = this.f17492h;
                    if (i10 >= i11 - 1) {
                        this.f17492h = i11 - 1;
                        iVar.f17495a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f17490f;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // u.c
    public final String toString() {
        String str = " goal -> (" + this.f17464b + ") : ";
        for (int i10 = 0; i10 < this.f17492h; i10++) {
            i iVar = this.f17490f[i10];
            ur0 ur0Var = this.f17493i;
            ur0Var.f9600b = iVar;
            str = str + ur0Var + " ";
        }
        return str;
    }
}
