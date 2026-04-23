package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class fz0 extends wy0 implements Set {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4738d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient bz0 f4739b;

    public static int i(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            en1.F0("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static ez0 k(int i10) {
        ez0 ez0Var = new ez0(i10);
        ez0Var.f4343d = new Object[i(i10)];
        return ez0Var;
    }

    public static fz0 l(eo0 eo0Var, eo0 eo0Var2, eo0 eo0Var3, eo0 eo0Var4, co0 co0Var, kn0 kn0Var, Object... objArr) {
        Object[] objArr2 = new Object[11];
        objArr2[0] = eo0Var;
        objArr2[1] = eo0Var2;
        objArr2[2] = eo0Var3;
        objArr2[3] = eo0Var4;
        objArr2[4] = co0Var;
        objArr2[5] = kn0Var;
        System.arraycopy(objArr, 0, objArr2, 6, 5);
        return m(11, objArr2);
    }

    public static fz0 m(int i10, Object... objArr) {
        if (i10 == 0) {
            return c01.f3144v;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new j01(obj);
        }
        int i11 = i(i10);
        Object[] objArr2 = new Object[i11];
        int i12 = i11 - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            Object obj2 = objArr[i15];
            if (obj2 == null) {
                throw new NullPointerException(fb1.g("at index ", i15));
            }
            int iHashCode = obj2.hashCode();
            int iR = tp1.r(iHashCode);
            while (true) {
                int i16 = iR & i12;
                Object obj3 = objArr2[i16];
                if (obj3 == null) {
                    objArr[i14] = obj2;
                    objArr2[i16] = obj2;
                    i13 += iHashCode;
                    i14++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iR++;
                }
            }
        }
        Arrays.fill(objArr, i14, i10, (Object) null);
        if (i14 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new j01(obj4);
        }
        if (i(i14) < i11 / 2) {
            return m(i14, objArr);
        }
        int length = objArr.length;
        if (i14 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new c01(i13, i12, i14, objArr, objArr2);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public bz0 e() {
        bz0 bz0Var = this.f4739b;
        if (bz0Var != null) {
            return bz0Var;
        }
        bz0 bz0VarJ = j();
        this.f4739b = bz0VarJ;
        return bz0VarJ;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof fz0) && (this instanceof c01)) {
            fz0 fz0Var = (fz0) obj;
            fz0Var.getClass();
            if ((fz0Var instanceof c01) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return tp1.l0(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return tp1.t(this);
    }

    public bz0 j() {
        Object[] array = toArray(wy0.f10380a);
        zy0 zy0Var = bz0.f3132b;
        return bz0.j(array.length, array);
    }
}
