package f;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f12838b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f12839d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f12840f;

    public /* synthetic */ g(m mVar, View view, View view2, int i10) {
        this.f12837a = i10;
        this.f12840f = mVar;
        this.f12838b = view;
        this.f12839d = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f12837a;
        View view = this.f12839d;
        View view2 = this.f12838b;
        m mVar = this.f12840f;
        switch (i10) {
            case 0:
                m.b(mVar.f12939w, view2, view);
                break;
            default:
                m.b(mVar.f12923g, view2, view);
                break;
        }
    }
}
