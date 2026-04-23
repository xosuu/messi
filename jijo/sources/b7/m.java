package b7;

/* JADX INFO: loaded from: classes.dex */
public final class m extends u6.e implements t6.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f1430d = new m(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1431b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10) {
        super(2);
        this.f1431b = i10;
    }

    @Override // t6.p
    public final Object c(Object obj, Object obj2) {
        switch (this.f1431b) {
            case 0:
                return ((n6.j) obj).c((n6.h) obj2);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
        }
    }
}
