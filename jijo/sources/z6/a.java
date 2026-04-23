package z6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20726a;

    public a(d dVar) {
        this.f20726a = new AtomicReference(dVar);
    }

    @Override // z6.b
    public final Iterator iterator() {
        b bVar = (b) this.f20726a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
