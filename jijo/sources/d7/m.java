package d7;

import b7.v0;
import com.google.android.gms.internal.ads.fb1;
import g4.a0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f12508a;

    static {
        String property;
        Object next;
        int i10 = q.f12510a;
        v0 v0VarB = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        Iterator itY = fb1.y();
        a0.f(itY, "<this>");
        z6.d dVar = new z6.d(itY);
        boolean z9 = dVar instanceof z6.a;
        z6.b aVar = dVar;
        if (!z9) {
            aVar = new z6.a(dVar);
        }
        List listO0 = z6.c.O0(aVar);
        Iterator it = listO0.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iC = ((l) next).c();
                do {
                    Object next2 = it.next();
                    int iC2 = ((l) next2).c();
                    if (iC < iC2) {
                        next = next2;
                        iC = iC2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        l lVar = (l) next;
        if (lVar != null) {
            try {
                v0VarB = lVar.b(listO0);
            } catch (Throwable unused2) {
                lVar.a();
            }
            if (v0VarB != null) {
                f12508a = v0VarB;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
