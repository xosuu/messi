package w1;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18077a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18078b;

    public d(ViewGroup viewGroup) {
        this.f18078b = viewGroup;
    }

    @Override // w1.p
    public final void b(q qVar) {
        if (!this.f18077a) {
            q7.b.u(this.f18078b, false);
        }
        qVar.v(this);
    }

    @Override // w1.r, w1.p
    public final void c() {
        q7.b.u(this.f18078b, false);
    }

    @Override // w1.r, w1.p
    public final void d() {
        q7.b.u(this.f18078b, true);
    }

    @Override // w1.r, w1.p
    public final void e() {
        q7.b.u(this.f18078b, false);
        this.f18077a = true;
    }
}
