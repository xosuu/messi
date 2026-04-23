package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class e2 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14849b;

    public /* synthetic */ e2(int i10, Object obj) {
        this.f14848a = i10;
        this.f14849b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        x1 x1Var;
        int i11 = this.f14848a;
        Object obj = this.f14849b;
        switch (i11) {
            case 0:
                if (i10 != -1 && (x1Var = ((k2) obj).f14910d) != null) {
                    x1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).q(i10);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
