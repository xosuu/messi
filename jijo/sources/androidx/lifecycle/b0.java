package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b0 f947u = new b0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f952h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f948a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f949b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f950d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f951f = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f953q = new s(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.activity.e f954s = new androidx.activity.e(9, this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m2.f f955t = new m2.f(16, this);

    public final void b() {
        int i10 = this.f949b + 1;
        this.f949b = i10;
        if (i10 == 1) {
            if (!this.f950d) {
                this.f952h.removeCallbacks(this.f954s);
            } else {
                this.f953q.e(k.ON_RESUME);
                this.f950d = false;
            }
        }
    }

    @Override // androidx.lifecycle.q
    public final s h() {
        return this.f953q;
    }
}
