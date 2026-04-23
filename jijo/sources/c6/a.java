package c6;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Logger f1578a;

    public static final a a(Class cls) {
        a aVar = new a();
        aVar.f1578a = Logger.getLogger(cls.getName());
        return aVar;
    }

    public final void b(int i10, String str) {
        this.f1578a.log(i10 <= 20 ? Level.FINE : i10 <= 50 ? Level.FINER : Level.FINEST, str);
    }
}
