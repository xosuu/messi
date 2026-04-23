package g4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends k0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object[] f13760t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n0 f13761u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f13762d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f13763f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Object[] f13764h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient int f13765q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f13766s;

    static {
        Object[] objArr = new Object[0];
        f13761u = new n0(0, 0, 0, objArr, objArr);
    }

    public n0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f13762d = objArr;
        this.f13763f = i10;
        this.f13764h = objArr2;
        this.f13765q = i11;
        this.f13766s = i12;
    }

    @Override // g4.g0
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f13762d;
        int i10 = this.f13766s;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // g4.g0
    public final int c() {
        return this.f13766s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f13764h;
            if (objArr.length != 0) {
                int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
                while (true) {
                    int i10 = this.f13765q & iRotateLeft;
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

    @Override // g4.g0
    public final int d() {
        return 0;
    }

    @Override // g4.g0
    public final Object[] e() {
        return this.f13762d;
    }

    public final m0 h() {
        h0 h0Var = j0.f13734b;
        int i10 = this.f13766s;
        return i10 == 0 ? m0.f13755h : new m0(i10, this.f13762d);
    }

    @Override // g4.k0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13763f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        j0 j0VarH = this.f13747b;
        if (j0VarH == null) {
            j0VarH = h();
            this.f13747b = j0VarH;
        }
        return j0VarH.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13766s;
    }
}
