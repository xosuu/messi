package k;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.google.android.gms.internal.ads.gp0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements d0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f14546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f14547b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f14548d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExpandedMenuView f14549f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f14550h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f14551q;

    public k(Context context) {
        this.f14546a = context;
        this.f14547b = LayoutInflater.from(context);
    }

    @Override // k.d0
    public final void b(o oVar, boolean z9) {
        c0 c0Var = this.f14550h;
        if (c0Var != null) {
            c0Var.b(oVar, z9);
        }
    }

    @Override // k.d0
    public final boolean c(r rVar) {
        return false;
    }

    @Override // k.d0
    public final boolean d(j0 j0Var) {
        if (!j0Var.hasVisibleItems()) {
            return false;
        }
        p pVar = new p();
        pVar.f14583a = j0Var;
        Context context = j0Var.f14559a;
        gp0 gp0Var = new gp0(context);
        k kVar = new k(((f.j) gp0Var.f5026d).f12851a);
        pVar.f14585d = kVar;
        kVar.f14550h = pVar;
        j0Var.b(kVar, context);
        k kVar2 = pVar.f14585d;
        if (kVar2.f14551q == null) {
            kVar2.f14551q = new j(kVar2);
        }
        j jVar = kVar2.f14551q;
        f.j jVar2 = (f.j) gp0Var.f5026d;
        jVar2.f12865o = jVar;
        jVar2.f12866p = pVar;
        View view = j0Var.f14573o;
        if (view != null) {
            jVar2.f12856f = view;
        } else {
            jVar2.f12854d = j0Var.f14572n;
            gp0Var.q(j0Var.f14571m);
        }
        ((f.j) gp0Var.f5026d).f12864n = pVar;
        f.n nVarE = gp0Var.e();
        pVar.f14584b = nVarE;
        nVarE.setOnDismissListener(pVar);
        WindowManager.LayoutParams attributes = pVar.f14584b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pVar.f14584b.show();
        c0 c0Var = this.f14550h;
        if (c0Var == null) {
            return true;
        }
        c0Var.i(j0Var);
        return true;
    }

    @Override // k.d0
    public final boolean f(r rVar) {
        return false;
    }

    @Override // k.d0
    public final void g(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f14549f.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // k.d0
    public final void h() {
        j jVar = this.f14551q;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // k.d0
    public final void j(c0 c0Var) {
        this.f14550h = c0Var;
    }

    @Override // k.d0
    public final int k() {
        return 0;
    }

    @Override // k.d0
    public final void l(Context context, o oVar) {
        if (this.f14546a != null) {
            this.f14546a = context;
            if (this.f14547b == null) {
                this.f14547b = LayoutInflater.from(context);
            }
        }
        this.f14548d = oVar;
        j jVar = this.f14551q;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // k.d0
    public final boolean m() {
        return false;
    }

    @Override // k.d0
    public final Parcelable n() {
        if (this.f14549f == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f14549f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f14548d.q(this.f14551q.getItem(i10), this, 0);
    }
}
