package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class d3 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14845b;

    public /* synthetic */ d3(View view, int i10) {
        this.f14844a = i10;
        this.f14845b = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        Object item;
        int i11 = this.f14844a;
        View view2 = this.f14845b;
        switch (i11) {
            case 0:
                ((SearchView) view2).p(i10);
                break;
            default:
                h5.u uVar = (h5.u) view2;
                if (i10 < 0) {
                    k2 k2Var = uVar.f14098h;
                    item = !k2Var.L.isShowing() ? null : k2Var.f14910d.getSelectedItem();
                } else {
                    item = uVar.getAdapter().getItem(i10);
                }
                h5.u uVar2 = (h5.u) view2;
                h5.u.a(uVar2, item);
                AdapterView.OnItemClickListener onItemClickListener = uVar2.getOnItemClickListener();
                k2 k2Var2 = uVar2.f14098h;
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        view = k2Var2.L.isShowing() ? k2Var2.f14910d.getSelectedView() : null;
                        i10 = !k2Var2.L.isShowing() ? -1 : k2Var2.f14910d.getSelectedItemPosition();
                        j10 = !k2Var2.L.isShowing() ? Long.MIN_VALUE : k2Var2.f14910d.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(k2Var2.f14910d, view, i10, j10);
                }
                k2Var2.dismiss();
                break;
        }
    }
}
