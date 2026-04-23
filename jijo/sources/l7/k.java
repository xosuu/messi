package l7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15282d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p7.e f15283f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15284h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f15285q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, Object[] objArr, int i10, p7.e eVar, int i11, boolean z9) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f15285q = rVar;
        this.f15282d = i10;
        this.f15283f = eVar;
        this.f15284h = i11;
    }

    @Override // m2.c
    public final void b() {
        try {
            d5.e eVar = this.f15285q.f15311v;
            p7.e eVar2 = this.f15283f;
            int i10 = this.f15284h;
            eVar.getClass();
            eVar2.i(i10);
            this.f15285q.D.E(this.f15282d, a.CANCEL);
            synchronized (this.f15285q) {
                this.f15285q.F.remove(Integer.valueOf(this.f15282d));
            }
        } catch (IOException unused) {
        }
    }
}
