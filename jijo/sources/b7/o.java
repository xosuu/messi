package b7;

/* JADX INFO: loaded from: classes.dex */
public final class o extends u6.e implements t6.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f1433d = new o(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f1434f = new o(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10) {
        super(1);
        this.f1435b = i10;
    }

    @Override // t6.l
    public final Object d(Object obj) {
        switch (this.f1435b) {
            case 0:
                n6.h hVar = (n6.h) obj;
                if (hVar instanceof q) {
                    return (q) hVar;
                }
                return null;
            default:
                n6.h hVar2 = (n6.h) obj;
                if (hVar2 instanceof h0) {
                    return (h0) hVar2;
                }
                return null;
        }
    }
}
