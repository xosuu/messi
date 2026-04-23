package l;

/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15049h;

    public final void a(int i10, int i11) {
        this.f15044c = i10;
        this.f15045d = i11;
        this.f15049h = true;
        if (this.f15048g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15042a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15043b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15042a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15043b = i11;
        }
    }
}
