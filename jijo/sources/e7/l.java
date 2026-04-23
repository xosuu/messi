package e7;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12778b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12779c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12780d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12781e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f12782a = new AtomicReferenceArray(NotificationCompat.FLAG_HIGH_PRIORITY);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12779c;
        if (atomicIntegerFieldUpdater.get(this) - f12780d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f12767b.f1536a == 1) {
            f12781e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f12782a;
            if (atomicReferenceArray.get(i10) == null) {
                atomicReferenceArray.lazySet(i10, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12780d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f12779c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f12782a.getAndSet(i11, null)) != null) {
                if (hVar.f12767b.f1536a == 1) {
                    f12781e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i10, boolean z9) {
        int i11 = i10 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f12782a;
        h hVar = (h) atomicReferenceArray.get(i11);
        if (hVar != null) {
            if ((hVar.f12767b.f1536a == 1) == z9) {
                while (!atomicReferenceArray.compareAndSet(i11, hVar, null)) {
                    if (atomicReferenceArray.get(i11) != hVar) {
                    }
                }
                if (z9) {
                    f12781e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
