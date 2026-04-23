package d7;

import com.google.android.gms.internal.ads.fb1;
import g4.a0;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f12485a;

    static {
        Iterator itL = fb1.l();
        a0.f(itL, "<this>");
        z6.d dVar = new z6.d(itL);
        boolean z9 = dVar instanceof z6.a;
        z6.b aVar = dVar;
        if (!z9) {
            aVar = new z6.a(dVar);
        }
        f12485a = z6.c.O0(aVar);
    }
}
