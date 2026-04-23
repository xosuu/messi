package n1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends s {
    public abstract void d(s1.g gVar, Object obj);

    public final void e(Object obj) {
        s1.g gVarA = a();
        try {
            d(gVarA, obj);
            gVarA.f16678b.executeInsert();
        } finally {
            c(gVarA);
        }
    }
}
