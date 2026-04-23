package d2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import c2.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12309a = 0;

    static {
        n.l("Schedulers");
    }

    public static void a(c2.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        l2.l lVarN = workDatabase.n();
        workDatabase.c();
        try {
            int i10 = Build.VERSION.SDK_INT;
            int i11 = bVar.f1513h;
            if (i10 == 23) {
                i11 /= 2;
            }
            ArrayList arrayListB = lVarN.b(i11);
            ArrayList arrayListA = lVarN.a();
            if (arrayListB.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    lVarN.k(jCurrentTimeMillis, ((l2.j) it.next()).f15142a);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListB.size() > 0) {
                l2.j[] jVarArr = (l2.j[]) arrayListB.toArray(new l2.j[arrayListB.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar = (c) it2.next();
                    if (cVar.f()) {
                        cVar.e(jVarArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                l2.j[] jVarArr2 = (l2.j[]) arrayListA.toArray(new l2.j[arrayListA.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    c cVar2 = (c) it3.next();
                    if (!cVar2.f()) {
                        cVar2.e(jVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
