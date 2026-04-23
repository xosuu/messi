package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;
import k.c0;
import k.d0;
import k.e0;
import k.f0;
import k.j0;
import k.o;
import k.r;
import k.s;
import k.y;
import l.j;
import l.l;
import l.n;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d0 {
    public int A;
    public int B;
    public int C;
    public boolean D;
    public l.h F;
    public l.h G;
    public j H;
    public l.i I;
    public int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f374b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f375d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f376f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f377h;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f0 f380t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f381u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l f382v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f384x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f385y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f386z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f378q = R.layout.d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f379s = R.layout.c;
    public final SparseBooleanArray E = new SparseBooleanArray();
    public final m2.f J = new m2.f(5, this);

    public b(Context context) {
        this.f373a = context;
        this.f376f = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(r rVar, View view, ViewGroup viewGroup) {
        View actionView = rVar.getActionView();
        if (actionView == null || rVar.e()) {
            e0 e0Var = view instanceof e0 ? (e0) view : (e0) this.f376f.inflate(this.f379s, viewGroup, false);
            e0Var.c(rVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) e0Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f380t);
            if (this.I == null) {
                this.I = new l.i(this);
            }
            actionMenuItemView.setPopupCallback(this.I);
            actionView = (View) e0Var;
        }
        actionView.setVisibility(rVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // k.d0
    public final void b(o oVar, boolean z9) {
        e();
        l.h hVar = this.G;
        if (hVar != null && hVar.b()) {
            hVar.f14498j.dismiss();
        }
        c0 c0Var = this.f377h;
        if (c0Var != null) {
            c0Var.b(oVar, z9);
        }
    }

    @Override // k.d0
    public final /* bridge */ /* synthetic */ boolean c(r rVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.d0
    public final boolean d(j0 j0Var) {
        boolean z9;
        if (!j0Var.hasVisibleItems()) {
            return false;
        }
        j0 j0Var2 = j0Var;
        while (true) {
            o oVar = j0Var2.f14545z;
            if (oVar == this.f375d) {
                break;
            }
            j0Var2 = (j0) oVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f380t;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof e0) && ((e0) childAt).getItemData() == j0Var2.A) {
                    view = childAt;
                    break;
                }
                i10++;
            }
        }
        if (view == null) {
            return false;
        }
        this.K = j0Var.A.f14588a;
        int size = j0Var.f14564f.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z9 = false;
                break;
            }
            MenuItem item = j0Var.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                z9 = true;
                break;
            }
            i11++;
        }
        l.h hVar = new l.h(this, this.f374b, j0Var, view);
        this.G = hVar;
        hVar.f14496h = z9;
        y yVar = hVar.f14498j;
        if (yVar != null) {
            yVar.r(z9);
        }
        l.h hVar2 = this.G;
        if (!hVar2.b()) {
            if (hVar2.f14494f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            hVar2.d(0, 0, false, false);
        }
        c0 c0Var = this.f377h;
        if (c0Var != null) {
            c0Var.i(j0Var);
        }
        return true;
    }

    public final boolean e() {
        Object obj;
        j jVar = this.H;
        if (jVar != null && (obj = this.f380t) != null) {
            ((View) obj).removeCallbacks(jVar);
            this.H = null;
            return true;
        }
        l.h hVar = this.F;
        if (hVar == null) {
            return false;
        }
        if (hVar.b()) {
            hVar.f14498j.dismiss();
        }
        return true;
    }

    @Override // k.d0
    public final /* bridge */ /* synthetic */ boolean f(r rVar) {
        return false;
    }

    @Override // k.d0
    public final void g(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i10 = ((ActionMenuPresenter$SavedState) parcelable).f264a) > 0 && (menuItemFindItem = this.f375d.findItem(i10)) != null) {
            d((j0) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.d0
    public final void h() {
        int size;
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f380t;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            o oVar = this.f375d;
            if (oVar != null) {
                oVar.i();
                ArrayList arrayListL = this.f375d.l();
                int size2 = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    r rVar = (r) arrayListL.get(i11);
                    if (rVar.f()) {
                        View childAt = viewGroup.getChildAt(i10);
                        r itemData = childAt instanceof e0 ? ((e0) childAt).getItemData() : null;
                        View viewA = a(rVar, childAt, viewGroup);
                        if (rVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f380t).addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f382v) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f380t).requestLayout();
        o oVar2 = this.f375d;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f14567i;
            int size3 = arrayList2.size();
            for (int i12 = 0; i12 < size3; i12++) {
                s sVar = ((r) arrayList2.get(i12)).A;
            }
        }
        o oVar3 = this.f375d;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f14568j;
        }
        if (!this.f385y || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((r) arrayList.get(0)).C))) {
            l lVar = this.f382v;
            if (lVar != null) {
                Object parent = lVar.getParent();
                Object obj = this.f380t;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f382v);
                }
            }
        } else {
            if (this.f382v == null) {
                this.f382v = new l(this, this.f373a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f382v.getParent();
            if (viewGroup3 != this.f380t) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f382v);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f380t;
                l lVar2 = this.f382v;
                actionMenuView.getClass();
                n nVarL = ActionMenuView.l();
                nVarL.f14934a = true;
                actionMenuView.addView(lVar2, nVarL);
            }
        }
        ((ActionMenuView) this.f380t).setOverflowReserved(this.f385y);
    }

    public final boolean i() {
        l.h hVar = this.F;
        return hVar != null && hVar.b();
    }

    @Override // k.d0
    public final void j(c0 c0Var) {
        this.f377h = c0Var;
    }

    @Override // k.d0
    public final int k() {
        return this.f381u;
    }

    @Override // k.d0
    public final void l(Context context, o oVar) {
        this.f374b = context;
        LayoutInflater.from(context);
        this.f375d = oVar;
        Resources resources = context.getResources();
        if (!this.f386z) {
            this.f385y = true;
        }
        int i10 = 2;
        this.A = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.C = i10;
        int measuredWidth = this.A;
        if (this.f385y) {
            if (this.f382v == null) {
                l lVar = new l(this, this.f373a);
                this.f382v = lVar;
                if (this.f384x) {
                    lVar.setImageDrawable(this.f383w);
                    this.f383w = null;
                    this.f384x = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f382v.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f382v.getMeasuredWidth();
        } else {
            this.f382v = null;
        }
        this.B = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // k.d0
    public final boolean m() {
        ArrayList arrayListL;
        int size;
        int i10;
        boolean z9;
        o oVar = this.f375d;
        if (oVar != null) {
            arrayListL = oVar.l();
            size = arrayListL.size();
        } else {
            arrayListL = null;
            size = 0;
        }
        int i11 = this.C;
        int i12 = this.B;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f380t;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z9 = true;
            if (i13 >= size) {
                break;
            }
            r rVar = (r) arrayListL.get(i13);
            int i16 = rVar.f14612y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z10 = true;
            }
            if (this.D && rVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (this.f385y && (z10 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = this.E;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            r rVar2 = (r) arrayListL.get(i18);
            int i20 = rVar2.f14612y;
            boolean z11 = (i20 & 2) == i10;
            int i21 = rVar2.f14589b;
            if (z11) {
                View viewA = a(rVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z9);
                }
                rVar2.h(z9);
            } else if ((i20 & 1) == z9) {
                boolean z12 = sparseBooleanArray.get(i21);
                boolean z13 = (i17 > 0 || z12) && i12 > 0;
                if (z13) {
                    View viewA2 = a(rVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z13 &= i12 + i19 > 0;
                }
                if (z13 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z12) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        r rVar3 = (r) arrayListL.get(i22);
                        if (rVar3.f14589b == i21) {
                            if (rVar3.f()) {
                                i17++;
                            }
                            rVar3.h(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                rVar2.h(z13);
            } else {
                rVar2.h(false);
                i18++;
                i10 = 2;
                z9 = true;
            }
            i18++;
            i10 = 2;
            z9 = true;
        }
        return true;
    }

    @Override // k.d0
    public final Parcelable n() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f264a = this.K;
        return actionMenuPresenter$SavedState;
    }

    public final boolean o() {
        o oVar;
        int i10 = 0;
        if (this.f385y && !i() && (oVar = this.f375d) != null && this.f380t != null && this.H == null) {
            oVar.i();
            if (!oVar.f14568j.isEmpty()) {
                j jVar = new j(this, i10, new l.h(this, this.f374b, this.f375d, this.f382v));
                this.H = jVar;
                ((View) this.f380t).post(jVar);
                return true;
            }
        }
        return false;
    }
}
