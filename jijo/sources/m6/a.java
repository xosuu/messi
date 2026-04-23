package m6;

import java.util.AbstractList;
import java.util.List;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractList implements List {
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b bVar = (b) this;
        int i11 = bVar.f15777d;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.f("index: ", i10, ", size: ", i11));
        }
        if (i10 == bVar.size() - 1) {
            return bVar.removeLast();
        }
        if (i10 == 0) {
            return bVar.removeFirst();
        }
        int iE = bVar.e(bVar.f15775a + i10);
        Object[] objArr = bVar.f15776b;
        Object obj = objArr[iE];
        if (i10 < (bVar.f15777d >> 1)) {
            int i12 = bVar.f15775a;
            if (iE >= i12) {
                c.H(i12 + 1, i12, iE, objArr, objArr);
            } else {
                c.H(1, 0, iE, objArr, objArr);
                Object[] objArr2 = bVar.f15776b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = bVar.f15775a;
                c.H(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = bVar.f15776b;
            int i14 = bVar.f15775a;
            objArr3[i14] = null;
            bVar.f15775a = bVar.d(i14);
        } else {
            int iE2 = bVar.e((bVar.size() - 1) + bVar.f15775a);
            if (iE <= iE2) {
                Object[] objArr4 = bVar.f15776b;
                c.H(iE, iE + 1, iE2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = bVar.f15776b;
                c.H(iE, iE + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = bVar.f15776b;
                objArr6[objArr6.length - 1] = objArr6[0];
                c.H(0, 1, iE2 + 1, objArr6, objArr6);
            }
            bVar.f15776b[iE2] = null;
        }
        bVar.f15777d--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((b) this).f15777d;
    }
}
