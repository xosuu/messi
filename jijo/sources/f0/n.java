package f0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13034b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13035d;

    public /* synthetic */ n(int i10, int i11, Object obj) {
        this.f13033a = i11;
        this.f13035d = obj;
        this.f13034b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13033a;
        int i11 = this.f13034b;
        Object obj = this.f13035d;
        switch (i10) {
            case 0:
                ((q7.b) obj).m(i11);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f11944n.get();
                if (view != null) {
                    sideSheetBehavior.u(i11, view, false);
                }
                break;
        }
    }
}
