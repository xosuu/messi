package t;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i10) {
        super(str);
        this.f16775a = i10;
    }

    private synchronized void a() {
    }

    private synchronized void b() {
    }

    private synchronized void c() {
    }

    private final synchronized void d() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f16775a) {
            case 0:
                a();
                return this;
            case 1:
                b();
                return this;
            case 2:
                c();
                return this;
            default:
                d();
                return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c() {
        super("Failure occurred while trying to finish a future.");
        this.f16775a = 3;
    }
}
