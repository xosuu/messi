package b7;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1475a = 0;

    static {
        String property;
        int i10 = d7.q.f12510a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null || !Boolean.parseBoolean(property)) {
            v vVar = v.f1473u;
            return;
        }
        e7.d dVar = b0.f1396a;
        n6.h hVar = d7.m.f12508a;
        c7.c cVar = ((c7.c) hVar).f1582q;
        if (hVar instanceof z) {
        } else {
            v vVar2 = v.f1473u;
        }
    }
}
