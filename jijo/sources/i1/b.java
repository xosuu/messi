package i1;

import android.content.Context;
import android.os.Build;
import b7.b0;
import com.google.android.gms.internal.ads.en1;
import d7.m;
import g4.a0;
import g4.d0;
import k1.d;
import k1.e;
import k1.g;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f14163a;

    public b(g gVar) {
        this.f14163a = gVar;
    }

    public static final b a(Context context) {
        g dVar;
        a0.f(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        f1.a aVar = f1.a.f13053a;
        if ((i10 >= 30 ? aVar.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) j1.b.s());
            a0.e(systemService, "context.getSystemService…opicsManager::class.java)");
            dVar = new e(j1.b.j(systemService));
        } else if (i10 < 30 || aVar.a() != 4) {
            dVar = null;
        } else {
            Object systemService2 = context.getSystemService((Class<Object>) j1.b.s());
            a0.e(systemService2, "context.getSystemService…opicsManager::class.java)");
            dVar = new d(j1.b.j(systemService2));
        }
        if (dVar != null) {
            return new b(dVar);
        }
        return null;
    }

    public n5.a b(k1.a aVar) {
        a0.f(aVar, "request");
        e7.d dVar = b0.f1396a;
        return d0.b(en1.c(en1.a(m.f12508a), new a(this, aVar, null)));
    }
}
