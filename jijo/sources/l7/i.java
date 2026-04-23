package l7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends m2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15277d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f15278f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f15279h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Object[] objArr, int i10, long j10) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f15279h = rVar;
        this.f15277d = i10;
        this.f15278f = j10;
    }

    @Override // m2.c
    public final void b() {
        r rVar = this.f15279h;
        try {
            rVar.D.H(this.f15277d, this.f15278f);
        } catch (IOException unused) {
            rVar.c();
        }
    }
}
