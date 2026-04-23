package androidx.fragment.app;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f857a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f858b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f859d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f860f;

    public p0(h hVar, ArrayList arrayList, b1 b1Var) {
        this.f860f = hVar;
        this.f858b = arrayList;
        this.f859d = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f857a;
        Object obj = this.f860f;
        Object obj2 = this.f859d;
        Object obj3 = this.f858b;
        switch (i10) {
            case 0:
                ((d0) obj3).c((s) obj2, (k0.b) obj);
                break;
            case 1:
                ((d0) obj3).c((s) obj2, (k0.b) obj);
                break;
            default:
                List list = (List) obj3;
                b1 b1Var = (b1) obj2;
                if (list.contains(b1Var)) {
                    list.remove(b1Var);
                    ((h) obj).getClass();
                    g1.a.a(b1Var.f732a, b1Var.f734c.S);
                }
                break;
        }
    }
}
