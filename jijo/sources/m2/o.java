package m2;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class o implements c2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2.a f15726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2.a f15727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2.l f15728c;

    static {
        c2.n.l("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, k2.a aVar, o2.a aVar2) {
        this.f15727b = aVar;
        this.f15726a = aVar2;
        this.f15728c = workDatabase.n();
    }
}
