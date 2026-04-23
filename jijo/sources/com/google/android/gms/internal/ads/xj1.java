package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xj1 extends wv {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10584k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fp1 f10586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f10589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f10590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wv[] f10591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object[] f10592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f10593j;

    /* JADX WARN: Illegal instructions before constructor call */
    public xj1(List list, fp1 fp1Var) {
        wv[] wvVarArr = new wv[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            wvVarArr[i11] = ((kj1) it.next()).zza();
            i11++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((kj1) it2.next()).zzb();
            i10++;
        }
        this(wvVarArr, objArr, fp1Var);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f10593j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iA = this.f10591h[iIntValue].a(obj3)) == -1) {
            return -1;
        }
        return this.f10589f[iIntValue] + iA;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int b() {
        return this.f10588e;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int c() {
        return this.f10587d;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final vu d(int i10, vu vuVar, boolean z9) {
        int[] iArr = this.f10589f;
        int iK = yn0.k(iArr, i10 + 1, false, false);
        int i11 = this.f10590g[iK];
        this.f10591h[iK].d(i10 - iArr[iK], vuVar, z9);
        vuVar.f9970c += i11;
        if (z9) {
            Object obj = this.f10592i[iK];
            Object obj2 = vuVar.f9969b;
            obj2.getClass();
            vuVar.f9969b = Pair.create(obj, obj2);
        }
        return vuVar;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final hv e(int i10, hv hvVar, long j10) {
        int[] iArr = this.f10590g;
        int iK = yn0.k(iArr, i10 + 1, false, false);
        int i11 = iArr[iK];
        int i12 = this.f10589f[iK];
        this.f10591h[iK].e(i10 - i11, hvVar, j10);
        Object objCreate = this.f10592i[iK];
        if (!hv.f5405m.equals(hvVar.f5407a)) {
            objCreate = Pair.create(objCreate, hvVar.f5407a);
        }
        hvVar.f5407a = objCreate;
        hvVar.f5417k += i12;
        hvVar.f5418l += i12;
        return hvVar;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final Object f(int i10) {
        int[] iArr = this.f10589f;
        int iK = yn0.k(iArr, i10 + 1, false, false);
        return Pair.create(this.f10592i[iK], this.f10591h[iK].f(i10 - iArr[iK]));
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int g(boolean z9) {
        if (this.f10585b == 0) {
            return -1;
        }
        int iP = 0;
        if (z9) {
            int[] iArr = this.f10586c.f4597b;
            iP = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            wv[] wvVarArr = this.f10591h;
            if (!wvVarArr[iP].o()) {
                return this.f10590g[iP] + wvVarArr[iP].g(z9);
            }
            iP = p(iP, z9);
        } while (iP != -1);
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int h(boolean z9) {
        int iQ;
        int i10 = this.f10585b;
        if (i10 == 0) {
            return -1;
        }
        if (z9) {
            int[] iArr = this.f10586c.f4597b;
            int length = iArr.length;
            iQ = length > 0 ? iArr[length - 1] : -1;
        } else {
            iQ = i10 - 1;
        }
        do {
            wv[] wvVarArr = this.f10591h;
            if (!wvVarArr[iQ].o()) {
                return this.f10590g[iQ] + wvVarArr[iQ].h(z9);
            }
            iQ = q(iQ, z9);
        } while (iQ != -1);
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int j(int i10, int i11, boolean z9) {
        int[] iArr = this.f10590g;
        int iK = yn0.k(iArr, i10 + 1, false, false);
        int i12 = iArr[iK];
        wv[] wvVarArr = this.f10591h;
        int iJ = wvVarArr[iK].j(i10 - i12, i11 != 2 ? i11 : 0, z9);
        if (iJ != -1) {
            return i12 + iJ;
        }
        int iP = p(iK, z9);
        while (iP != -1 && wvVarArr[iP].o()) {
            iP = p(iP, z9);
        }
        if (iP != -1) {
            return wvVarArr[iP].g(z9) + iArr[iP];
        }
        if (i11 == 2) {
            return g(z9);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int k(int i10) {
        int[] iArr = this.f10590g;
        int iK = yn0.k(iArr, i10 + 1, false, false);
        int i11 = iArr[iK];
        wv[] wvVarArr = this.f10591h;
        int iK2 = wvVarArr[iK].k(i10 - i11);
        if (iK2 != -1) {
            return i11 + iK2;
        }
        int iQ = q(iK, false);
        while (iQ != -1 && wvVarArr[iQ].o()) {
            iQ = q(iQ, false);
        }
        if (iQ == -1) {
            return -1;
        }
        return wvVarArr[iQ].h(false) + iArr[iQ];
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final vu n(Object obj, vu vuVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f10593j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = this.f10590g[iIntValue];
        this.f10591h[iIntValue].n(obj3, vuVar);
        vuVar.f9970c += i10;
        vuVar.f9969b = obj;
        return vuVar;
    }

    public final int p(int i10, boolean z9) {
        if (!z9) {
            if (i10 >= this.f10585b - 1) {
                return -1;
            }
            return i10 + 1;
        }
        fp1 fp1Var = this.f10586c;
        int i11 = fp1Var.f4598c[i10] + 1;
        int[] iArr = fp1Var.f4597b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int q(int i10, boolean z9) {
        if (!z9) {
            if (i10 <= 0) {
                return -1;
            }
            return (-1) + i10;
        }
        fp1 fp1Var = this.f10586c;
        int i11 = fp1Var.f4598c[i10] - 1;
        if (i11 >= 0) {
            return fp1Var.f4597b[i11];
        }
        return -1;
    }

    public xj1(wv[] wvVarArr, Object[] objArr, fp1 fp1Var) {
        this.f10586c = fp1Var;
        this.f10585b = fp1Var.f4597b.length;
        this.f10591h = wvVarArr;
        int length = wvVarArr.length;
        this.f10589f = new int[length];
        this.f10590g = new int[length];
        this.f10592i = objArr;
        this.f10593j = new HashMap();
        int i10 = 0;
        int iC = 0;
        int iB = 0;
        int i11 = 0;
        while (i10 < wvVarArr.length) {
            wv wvVar = wvVarArr[i10];
            this.f10591h[i11] = wvVar;
            this.f10590g[i11] = iC;
            this.f10589f[i11] = iB;
            iC += wvVar.c();
            iB += this.f10591h[i11].b();
            this.f10593j.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f10587d = iC;
        this.f10588e = iB;
    }
}
