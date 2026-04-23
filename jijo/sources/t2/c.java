package t2;

import f7.a0;
import f7.b0;
import f7.r;
import f7.z;

/* JADX INFO: loaded from: classes.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2.c f16825b;

    public /* synthetic */ c(q2.c cVar, int i10) {
        this.f16824a = i10;
        this.f16825b = cVar;
    }

    @Override // f7.r
    public final b0 a(j7.g gVar) {
        z zVar = gVar.f14456f;
        int i10 = this.f16824a;
        q2.c cVar = this.f16825b;
        switch (i10) {
            case 0:
                b0 b0VarA = gVar.a(zVar);
                a0 a0VarC = b0VarA.c();
                cVar.getClass();
                a0VarC.f13212g = new i(b0VarA.f13225s, new q2.b(cVar, 1));
                return a0VarC.a();
            default:
                b0 b0VarA2 = gVar.a(zVar);
                a0 a0VarC2 = b0VarA2.c();
                cVar.getClass();
                a0VarC2.f13212g = new i(b0VarA2.f13225s, new q2.b(cVar, 1));
                return a0VarC2.a();
        }
    }
}
