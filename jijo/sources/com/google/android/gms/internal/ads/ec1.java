package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ec1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc1 f3903b = new cc1(ed1.f3911b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3904a = 0;

    static {
        int i10 = xb1.f10533a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.ec1 e(java.util.Iterator r8, int r9) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ec1.e(java.util.Iterator, int):com.google.android.gms.internal.ads.ec1");
    }

    public static int n(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(fb1.h("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(l.a0.f("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(l.a0.f("End index: ", i11, " >= ", i12));
    }

    public static ec1 p(ArrayList arrayList) {
        int size;
        if (arrayList instanceof Collection) {
            size = arrayList.size();
        } else {
            Iterator it = arrayList.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f3903b : e(arrayList.iterator(), size);
    }

    public static cc1 q(int i10, byte[] bArr, int i11) {
        n(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new cc1(bArr2);
    }

    public static void r(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(l.a0.f("Index > length: ", i10, ", ", i11));
            }
            throw new ArrayIndexOutOfBoundsException(fb1.g("Index < 0: ", i10));
        }
    }

    public final byte[] b() {
        int iF = f();
        if (iF == 0) {
            return ed1.f3911b;
        }
        byte[] bArr = new byte[iF];
        g(0, 0, iF, bArr);
        return bArr;
    }

    public abstract byte c(int i10);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract void g(int i10, int i11, int i12, byte[] bArr);

    public abstract int h();

    public final int hashCode() {
        int iJ = this.f3904a;
        if (iJ == 0) {
            int iF = f();
            iJ = j(iF, 0, iF);
            if (iJ == 0) {
                iJ = 1;
            }
            this.f3904a = iJ;
        }
        return iJ;
    }

    public abstract boolean i();

    public abstract int j(int i10, int i11, int i12);

    public abstract ec1 k(int i10, int i11);

    public abstract ic1 l();

    public abstract void m(b4.f fVar);

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m01 iterator() {
        return new ac1(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(f());
        objArr[2] = f() <= 50 ? en1.T(this) : en1.T(k(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
