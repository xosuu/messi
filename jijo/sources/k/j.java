package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14543a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14544b;

    public j(k kVar) {
        this.f14544b = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f14544b.f14548d;
        r rVar = oVar.f14580v;
        if (rVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f14568j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((r) arrayList.get(i10)) == rVar) {
                    this.f14543a = i10;
                    return;
                }
            }
        }
        this.f14543a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r getItem(int i10) {
        k kVar = this.f14544b;
        o oVar = kVar.f14548d;
        oVar.i();
        ArrayList arrayList = oVar.f14568j;
        kVar.getClass();
        int i11 = this.f14543a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (r) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f14544b;
        o oVar = kVar.f14548d;
        oVar.i();
        int size = oVar.f14568j.size();
        kVar.getClass();
        return this.f14543a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f14544b.f14547b.inflate(R.layout.q, viewGroup, false);
        }
        ((e0) view).c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
