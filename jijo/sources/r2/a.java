package r2;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.e f16496a;

    public a(t2.e eVar) {
        super(eVar, null);
        this.f16496a = eVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t2.e eVar = this.f16496a;
        q2.f fVar = eVar.f16827a;
        t2.e eVar2 = ((a) obj).f16496a;
        q2.f fVar2 = eVar2.f16827a;
        return fVar == fVar2 ? eVar.f16828b - eVar2.f16828b : fVar2.ordinal() - fVar.ordinal();
    }
}
