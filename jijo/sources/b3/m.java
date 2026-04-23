package b3;

import android.view.View;
import com.google.android.gms.internal.ads.av;
import com.google.android.gms.internal.ads.bv;
import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.xv;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1297b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1298d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f1299f;

    public /* synthetic */ m(View view, int i10, int i11, int i12) {
        this.f1296a = i12;
        this.f1299f = view;
        this.f1297b = i10;
        this.f1298d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1296a;
        int i11 = this.f1298d;
        int i12 = this.f1297b;
        View view = this.f1299f;
        switch (i10) {
            case 0:
                o oVar = (o) view;
                oVar.setSelectionFromTop(i12, i11);
                oVar.requestLayout();
                break;
            case 1:
                bv bvVar = ((av) view).B;
                if (bvVar != null) {
                    ((gv) bvVar).h(i12, i11);
                }
                break;
            default:
                bv bvVar2 = ((xv) view).f10658q;
                if (bvVar2 != null) {
                    ((gv) bvVar2).h(i12, i11);
                }
                break;
        }
    }
}
