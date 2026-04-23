package l;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f14994b;

    public /* synthetic */ s3(Toolbar toolbar, int i10) {
        this.f14993a = i10;
        this.f14994b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14993a;
        Toolbar toolbar = this.f14994b;
        switch (i10) {
            case 0:
                toolbar.n();
                break;
            default:
                u3 u3Var = toolbar.f346b0;
                k.r rVar = u3Var == null ? null : u3Var.f15027b;
                if (rVar != null) {
                    rVar.collapseActionView();
                }
                break;
        }
    }
}
