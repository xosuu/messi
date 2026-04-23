package m2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d2.k f15689d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f15690f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15691h = false;

    public b(d2.k kVar) {
        this.f15689d = kVar;
    }

    @Override // m2.c
    public final void c() {
        d2.k kVar = this.f15689d;
        WorkDatabase workDatabase = kVar.f12332e;
        workDatabase.c();
        try {
            Iterator it = workDatabase.n().f(this.f15690f).iterator();
            while (it.hasNext()) {
                c.a(kVar, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f15691h) {
                d2.d.a(kVar.f12331d, kVar.f12332e, kVar.f12334g);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
