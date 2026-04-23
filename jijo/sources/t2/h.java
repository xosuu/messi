package t2;

import p7.j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16836b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f16837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, p7.g gVar) {
        super(gVar);
        this.f16837d = iVar;
    }

    @Override // p7.t
    public final long x(p7.e eVar, long j10) {
        long jX = this.f16283a.x(eVar, j10);
        long j11 = this.f16836b + (jX != -1 ? jX : 0L);
        this.f16836b = j11;
        i iVar = this.f16837d;
        b bVar = iVar.f16840d;
        if (bVar != null) {
            bVar.obtainMessage(1, new u2.a(j11, iVar.f16838a.a())).sendToTarget();
        }
        return jX;
    }
}
