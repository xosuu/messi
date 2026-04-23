package m5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object[] f15766t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final i f15767u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f15768d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f15769f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Object[] f15770h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient int f15771q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f15772s;

    static {
        Object[] objArr = new Object[0];
        f15767u = new i(0, 0, 0, objArr, objArr);
    }

    public i(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f15768d = objArr;
        this.f15769f = i10;
        this.f15770h = objArr2;
        this.f15771q = i11;
        this.f15772s = i12;
    }

    @Override // m5.b
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f15768d;
        int i10 = this.f15772s;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // m5.b
    public final Object[] c() {
        return this.f15768d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15770h;
            if (objArr.length != 0) {
                int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
                while (true) {
                    int i10 = this.f15771q & iRotateLeft;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iRotateLeft = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // m5.b
    public final int d() {
        return this.f15772s;
    }

    @Override // m5.b
    public final int e() {
        return 0;
    }

    public final h h() {
        c cVar = e.f15759b;
        int i10 = this.f15772s;
        return i10 == 0 ? h.f15763h : new h(i10, this.f15768d);
    }

    @Override // m5.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15769f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e eVarH = this.f15760b;
        if (eVarH == null) {
            eVarH = h();
            this.f15760b = eVarH;
        }
        return eVarH.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15772s;
    }
}
