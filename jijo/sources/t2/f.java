package t2;

import p7.s;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p7.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16830b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16831d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f16832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, s sVar) {
        super(sVar);
        this.f16832f = gVar;
        this.f16830b = 0L;
        this.f16831d = 0L;
    }

    @Override // p7.s
    public final void h(p7.e eVar, long j10) {
        this.f16282a.h(eVar, j10);
        long j11 = this.f16831d;
        g gVar = this.f16832f;
        if (j11 == 0) {
            this.f16831d = gVar.f16833b.h();
        }
        long j12 = this.f16830b + j10;
        this.f16830b = j12;
        b bVar = gVar.f16835d;
        if (bVar != null) {
            bVar.obtainMessage(1, new u2.a(j12, this.f16831d)).sendToTarget();
        }
    }
}
