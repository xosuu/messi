package d7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12499a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_cur");
    private volatile Object _cur = new k(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12499a;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            int iA = kVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                k kVarC = kVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVarC) && atomicReferenceFieldUpdater.get(this) == kVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12499a;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            if (kVar.b()) {
                return;
            }
            k kVarC = kVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVarC) && atomicReferenceFieldUpdater.get(this) == kVar) {
            }
        }
    }

    public final int c() {
        k kVar = (k) f12499a.get(this);
        kVar.getClass();
        long j10 = k.f12502f.get(kVar);
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12499a;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            Object objD = kVar.d();
            if (objD != k.f12503g) {
                return objD;
            }
            k kVarC = kVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVarC) && atomicReferenceFieldUpdater.get(this) == kVar) {
            }
        }
    }
}
