package b6;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z5.e f1375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1376b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1377c;

    public f(g gVar, z5.e eVar) {
        this.f1377c = gVar;
        this.f1375a = eVar;
    }

    public final int a() {
        this.f1377c.getClass();
        int i10 = 2048 - this.f1376b;
        if (i10 > 0) {
            return i10;
        }
        z5.e eVar = this.f1375a;
        z5.e eVar2 = (z5.e) eVar.f20724d;
        if (eVar2 == null) {
            eVar2 = new z5.e(2048);
            eVar.f20724d = eVar2;
        }
        this.f1375a = eVar2;
        this.f1376b = 0;
        return 2048;
    }
}
