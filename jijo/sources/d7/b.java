package d7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12483a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f12478a;

    @Override // d7.n
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12483a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        v3.k kVar = a.f12478a;
        if (obj2 == kVar) {
            v3.k kVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == kVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVarC)) {
                        obj2 = kVarC;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != kVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract v3.k c(Object obj);
}
