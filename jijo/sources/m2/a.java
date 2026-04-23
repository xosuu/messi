package m2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15686d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d2.k f15687f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f15688h;

    public /* synthetic */ a(d2.k kVar, Object obj, int i10) {
        this.f15686d = i10;
        this.f15687f = kVar;
        this.f15688h = obj;
    }

    @Override // m2.c
    public final void c() {
        WorkDatabase workDatabase;
        int i10 = this.f15686d;
        Object obj = this.f15688h;
        d2.k kVar = this.f15687f;
        switch (i10) {
            case 0:
                workDatabase = kVar.f12332e;
                workDatabase.c();
                try {
                    c.a(kVar, ((UUID) obj).toString());
                    workDatabase.h();
                    workDatabase.f();
                    d2.d.a(kVar.f12331d, kVar.f12332e, kVar.f12334g);
                    return;
                } finally {
                    workDatabase.f();
                }
            default:
                workDatabase = kVar.f12332e;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().g((String) obj).iterator();
                    while (it.hasNext()) {
                        c.a(kVar, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    d2.d.a(kVar.f12331d, kVar.f12332e, kVar.f12334g);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
