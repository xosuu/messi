package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f14552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14553b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14554d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14555f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LayoutInflater f14556h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f14557q;

    public l(o oVar, LayoutInflater layoutInflater, boolean z9, int i10) {
        this.f14555f = z9;
        this.f14556h = layoutInflater;
        this.f14552a = oVar;
        this.f14557q = i10;
        a();
    }

    public final void a() {
        o oVar = this.f14552a;
        r rVar = oVar.f14580v;
        if (rVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f14568j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((r) arrayList.get(i10)) == rVar) {
                    this.f14553b = i10;
                    return;
                }
            }
        }
        this.f14553b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r getItem(int i10) {
        ArrayList arrayListL;
        boolean z9 = this.f14555f;
        o oVar = this.f14552a;
        if (z9) {
            oVar.i();
            arrayListL = oVar.f14568j;
        } else {
            arrayListL = oVar.l();
        }
        int i11 = this.f14553b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (r) arrayListL.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z9 = this.f14555f;
        o oVar = this.f14552a;
        if (z9) {
            oVar.i();
            arrayListL = oVar.f14568j;
        } else {
            arrayListL = oVar.l();
        }
        return this.f14553b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z9 = false;
        if (view == null) {
            view = this.f14556h.inflate(this.f14557q, viewGroup, false);
        }
        int i11 = getItem(i10).f14589b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f14589b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f14552a.m() && i11 != i13) {
            z9 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z9);
        e0 e0Var = (e0) view;
        if (this.f14554d) {
            listMenuItemView.setForceShowIcon(true);
        }
        e0Var.c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
