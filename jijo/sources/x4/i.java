package x4;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.j0;
import m1.e1;
import m1.g0;
import o0.d0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18429d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k.r f18430f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18431h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q f18432q;

    public i(q qVar) {
        this.f18432q = qVar;
        h();
    }

    @Override // m1.g0
    public final int a() {
        return this.f18429d.size();
    }

    @Override // m1.g0
    public final long b(int i10) {
        return i10;
    }

    @Override // m1.g0
    public final int c(int i10) {
        k kVar = (k) this.f18429d.get(i10);
        if (kVar instanceof l) {
            return 2;
        }
        if (kVar instanceof j) {
            return 3;
        }
        if (kVar instanceof m) {
            return ((m) kVar).f18435a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // m1.g0
    public final void e(e1 e1Var, int i10) {
        int iC = c(i10);
        ArrayList arrayList = this.f18429d;
        View view = ((p) e1Var).f15445a;
        q qVar = this.f18432q;
        if (iC != 0) {
            if (iC != 1) {
                if (iC == 2) {
                    l lVar = (l) arrayList.get(i10);
                    view.setPadding(qVar.D, lVar.f18433a, qVar.E, lVar.f18434b);
                    return;
                } else {
                    if (iC != 3) {
                        return;
                    }
                    v0.q(view, new h(this, i10, true));
                    return;
                }
            }
            TextView textView = (TextView) view;
            textView.setText(((m) arrayList.get(i10)).f18435a.f14592e);
            int i11 = qVar.f18444s;
            if (i11 != 0) {
                g4.z.B(textView, i11);
            }
            textView.setPadding(qVar.F, textView.getPaddingTop(), qVar.G, textView.getPaddingBottom());
            ColorStateList colorStateList = qVar.f18445t;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            v0.q(textView, new h(this, i10, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(qVar.f18448w);
        int i12 = qVar.f18446u;
        if (i12 != 0) {
            navigationMenuItemView.setTextAppearance(i12);
        }
        ColorStateList colorStateList2 = qVar.f18447v;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = qVar.f18449x;
        Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = v0.f16075a;
        d0.q(navigationMenuItemView, drawableNewDrawable);
        RippleDrawable rippleDrawable = qVar.f18450y;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        m mVar = (m) arrayList.get(i10);
        navigationMenuItemView.setNeedsEmptyIcon(mVar.f18436b);
        int i13 = qVar.f18451z;
        int i14 = qVar.A;
        navigationMenuItemView.setPadding(i13, i14, i13, i14);
        navigationMenuItemView.setIconPadding(qVar.B);
        if (qVar.H) {
            navigationMenuItemView.setIconSize(qVar.C);
        }
        navigationMenuItemView.setMaxLines(qVar.J);
        navigationMenuItemView.c(mVar.f18435a);
        v0.q(navigationMenuItemView, new h(this, i10, false));
    }

    @Override // m1.g0
    public final e1 f(RecyclerView recyclerView, int i10) {
        e1 oVar;
        q qVar = this.f18432q;
        if (i10 == 0) {
            View viewInflate = qVar.f18443q.inflate(R.layout.ba, (ViewGroup) recyclerView, false);
            oVar = new o(viewInflate);
            viewInflate.setOnClickListener(qVar.N);
        } else if (i10 == 1) {
            oVar = new g(2, qVar.f18443q, recyclerView);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return new g(qVar.f18439b);
            }
            oVar = new g(1, qVar.f18443q, recyclerView);
        }
        return oVar;
    }

    @Override // m1.g0
    public final void g(e1 e1Var) {
        p pVar = (p) e1Var;
        if (pVar instanceof o) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) pVar.f15445a;
            FrameLayout frameLayout = navigationMenuItemView.L;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.K.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void h() {
        if (this.f18431h) {
            return;
        }
        this.f18431h = true;
        ArrayList arrayList = this.f18429d;
        arrayList.clear();
        arrayList.add(new j());
        q qVar = this.f18432q;
        int size = qVar.f18440d.l().size();
        boolean z9 = false;
        int i10 = -1;
        int i11 = 0;
        boolean z10 = false;
        int size2 = 0;
        while (i11 < size) {
            k.r rVar = (k.r) qVar.f18440d.l().get(i11);
            if (rVar.isChecked()) {
                i(rVar);
            }
            if (rVar.isCheckable()) {
                rVar.g(z9);
            }
            if (rVar.hasSubMenu()) {
                j0 j0Var = rVar.f14602o;
                if (j0Var.hasVisibleItems()) {
                    if (i11 != 0) {
                        arrayList.add(new l(qVar.L, z9 ? 1 : 0));
                    }
                    arrayList.add(new m(rVar));
                    int size3 = j0Var.f14564f.size();
                    int i12 = 0;
                    boolean z11 = false;
                    while (i12 < size3) {
                        k.r rVar2 = (k.r) j0Var.getItem(i12);
                        if (rVar2.isVisible()) {
                            if (!z11 && rVar2.getIcon() != null) {
                                z11 = true;
                            }
                            if (rVar2.isCheckable()) {
                                rVar2.g(z9);
                            }
                            if (rVar.isChecked()) {
                                i(rVar);
                            }
                            arrayList.add(new m(rVar2));
                        }
                        i12++;
                        z9 = false;
                    }
                    if (z11) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((m) arrayList.get(size5)).f18436b = true;
                        }
                    }
                }
            } else {
                int i13 = rVar.f14589b;
                if (i13 != i10) {
                    size2 = arrayList.size();
                    z10 = rVar.getIcon() != null;
                    if (i11 != 0) {
                        size2++;
                        int i14 = qVar.L;
                        arrayList.add(new l(i14, i14));
                    }
                } else {
                    if (!z10 && rVar.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i15 = size2; i15 < size6; i15++) {
                            ((m) arrayList.get(i15)).f18436b = true;
                        }
                        z10 = true;
                    }
                    m mVar = new m(rVar);
                    mVar.f18436b = z10;
                    arrayList.add(mVar);
                    i10 = i13;
                }
                m mVar2 = new m(rVar);
                mVar2.f18436b = z10;
                arrayList.add(mVar2);
                i10 = i13;
            }
            i11++;
            z9 = false;
        }
        this.f18431h = false;
    }

    public final void i(k.r rVar) {
        if (this.f18430f == rVar || !rVar.isCheckable()) {
            return;
        }
        k.r rVar2 = this.f18430f;
        if (rVar2 != null) {
            rVar2.setChecked(false);
        }
        this.f18430f = rVar;
        rVar.setChecked(true);
    }
}
