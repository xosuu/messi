package m6;

import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a0 {
    public static final void H(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        a0.f(objArr, "<this>");
        a0.f(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }
}
