package i2;

import android.os.Build;
import c2.n;
import c2.o;
import l2.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {
    static {
        n.l("NetworkNotRoamingCtrlr");
    }

    @Override // i2.c
    public final boolean a(j jVar) {
        return jVar.f15151j.f1515a == o.f1540f;
    }

    @Override // i2.c
    public final boolean b(Object obj) {
        h2.a aVar = (h2.a) obj;
        boolean z9 = true;
        if (Build.VERSION.SDK_INT < 24) {
            n.i().g(new Throwable[0]);
            return !aVar.f13937a;
        }
        if (aVar.f13937a && aVar.f13940d) {
            z9 = false;
        }
        return z9;
    }
}
