package l7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends m2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15273d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15274f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f15275h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f15276q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(r rVar, String str, Object[] objArr, int i10, Object obj, int i11) {
        super(str, objArr);
        this.f15273d = i11;
        this.f15276q = rVar;
        this.f15274f = i10;
        this.f15275h = obj;
    }

    private void d() {
        this.f15276q.f15311v.getClass();
        synchronized (this.f15276q) {
            this.f15276q.F.remove(Integer.valueOf(this.f15274f));
        }
    }

    @Override // m2.c
    public final void b() {
        switch (this.f15273d) {
            case 0:
                r rVar = this.f15276q;
                try {
                    rVar.D.E(this.f15274f, (a) this.f15275h);
                } catch (IOException unused) {
                    rVar.c();
                    return;
                }
                break;
            case 1:
                d();
                break;
            default:
                this.f15276q.f15311v.getClass();
                try {
                    this.f15276q.D.E(this.f15274f, a.CANCEL);
                    synchronized (this.f15276q) {
                        this.f15276q.F.remove(Integer.valueOf(this.f15274f));
                        break;
                    }
                } catch (IOException unused2) {
                    return;
                }
                break;
        }
    }
}
