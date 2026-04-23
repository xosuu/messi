package n0;

import u.e;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15822d;

    public d(int i10) {
        super(i10, 1);
        this.f15822d = new Object();
    }

    @Override // u.e
    public final Object a() {
        Object objA;
        synchronized (this.f15822d) {
            objA = super.a();
        }
        return objA;
    }

    @Override // u.e
    public final boolean b(Object obj) {
        boolean zB;
        synchronized (this.f15822d) {
            zB = super.b(obj);
        }
        return zB;
    }
}
