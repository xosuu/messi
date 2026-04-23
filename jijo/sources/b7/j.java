package b7;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6.l f1420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f1422d;

    public j(Object obj, t6.l lVar, Object obj2, Throwable th) {
        this.f1419a = obj;
        this.f1420b = lVar;
        this.f1421c = obj2;
        this.f1422d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return g4.a0.b(this.f1419a, jVar.f1419a) && g4.a0.b(null, null) && g4.a0.b(this.f1420b, jVar.f1420b) && g4.a0.b(this.f1421c, jVar.f1421c) && g4.a0.b(this.f1422d, jVar.f1422d);
    }

    public final int hashCode() {
        Object obj = this.f1419a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        t6.l lVar = this.f1420b;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f1421c;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1422d;
        return iHashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1419a + ", cancelHandler=null, onCancellation=" + this.f1420b + ", idempotentResume=" + this.f1421c + ", cancelCause=" + this.f1422d + ')';
    }

    public /* synthetic */ j(Object obj, t6.l lVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
